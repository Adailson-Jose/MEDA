package com.projeto.meda.meda;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class TelaEditaInfoUsuario extends AppCompatActivity {
    Button btSalvar;
    EditText editTextNome, editTextEmail;
    Pessoa pessoa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_edita_info_usuario);
        btSalvar = (Button) findViewById(R.id.btSalvar);
        editTextEmail = (EditText) findViewById(R.id.editTextEmail);
        editTextNome = (EditText) findViewById(R.id.editTextNome);
        final PessoaDao buscar = new PessoaDao(getApplicationContext());

        Bundle bundle = getIntent().getExtras();

        if (bundle != null) {
            pessoa = buscar.getPessoa(Long.parseLong(String.valueOf(bundle.get("pessoa"))));
            editTextNome.setText(pessoa.getNome());
            editTextEmail.setText(pessoa.getEmail());
        }
        btSalvar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ViewGroup group = (ViewGroup) findViewById(R.id.raizEditarinfomacaoUsuario);
                boolean resultado = false;
                String nomeString = editTextNome.getText().toString();
                String emailString = editTextEmail.getText().toString();
                if (ValidarCampoVazio.isCampoVazio(nomeString)) {
                    resultado = true;
                    editTextNome.setError("Nome inválido!");
                    editTextNome.requestFocus();
                } else if (!ValidarEmail.isEmailValido(emailString)) {
                    resultado = true;
                    editTextEmail.setError("Email inválido!");
                    editTextEmail.requestFocus();
                }
                if (!resultado) {
                    pessoa.setNome(nomeString);
                    pessoa.setEmail(emailString);
                    buscar.updatePessoa(pessoa);
                    LimparTela.clearForm(group);
                    editTextNome.requestFocus();
                    Toast.makeText(TelaEditaInfoUsuario.this, "INFORMAÇÕES ALTERADAS COM SUCESSO", Toast.LENGTH_SHORT).show();

                    Intent abreTelaInicialUsuarioComum = new Intent(TelaEditaInfoUsuario.this, TelaInicialUsuarioComum.class);
                    abreTelaInicialUsuarioComum.putExtra("pessoa", String.valueOf(pessoa.getCpf()));
                    startActivity(abreTelaInicialUsuarioComum);
                } else {
                    Toast.makeText(TelaEditaInfoUsuario.this, "CAMPO INVÁLIDO", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
