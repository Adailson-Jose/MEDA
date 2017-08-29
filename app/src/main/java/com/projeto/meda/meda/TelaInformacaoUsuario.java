package com.projeto.meda.meda;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class TelaInformacaoUsuario extends AppCompatActivity {
    Button btEditaMinhasInformacoes;
    TextView textViewMinhasInformacoes;
    Pessoa pessoa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informacao_usuario);
        PessoaDao busca = new PessoaDao(getApplicationContext());
        textViewMinhasInformacoes = (TextView) findViewById(R.id.textViewMinhasInformacoes);
        btEditaMinhasInformacoes = (Button) findViewById(R.id.btEditaMinhasInformacoes);

        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            pessoa = busca.getPessoa(Long.parseLong(String.valueOf(bundle.get("pessoa"))));
            textViewMinhasInformacoes.setText("Name: " + pessoa.getNome() + "\n" + "Email: " + pessoa.getEmail() + "\n" + "Senha: " + pessoa.getSenha() + "\n" + "Cpf: " + pessoa.getCpf());
        }
        btEditaMinhasInformacoes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent abreTelaEditaInfoUsuario = new Intent(TelaInformacaoUsuario.this, TelaEditaInfoUsuario.class);
                abreTelaEditaInfoUsuario.putExtra("pessoa", String.valueOf(pessoa.getCpf()));
                startActivity(abreTelaEditaInfoUsuario);
            }

        });
    }
}
