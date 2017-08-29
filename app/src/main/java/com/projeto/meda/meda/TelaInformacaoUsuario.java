package com.projeto.meda.meda;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;

public class TelaInformacaoUsuario extends AppCompatActivity {
    Button btEditaMinhasInformacoes;
    TextView textViewMinhasInformacoes;
    Pessoa pessoa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_informacao_usuario);
        PessoaDao busca = new PessoaDao(getApplicationContext());
        textViewMinhasInformacoes = (TextView) findViewById(R.id.textViewMinhasInformacoes);
        btEditaMinhasInformacoes = (Button) findViewById(R.id.btEditaMinhasInformacoes);

        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            pessoa = busca.getPessoa(Long.parseLong(String.valueOf(bundle.get("pessoa"))));

        }

    }
}
