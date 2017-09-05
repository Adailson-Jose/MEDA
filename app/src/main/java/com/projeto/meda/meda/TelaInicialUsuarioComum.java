package com.projeto.meda.meda;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.TextView;

public class TelaInicialUsuarioComum extends Activity {
    TextView textViewBemVindo;
    Button btMinhaInformacao, btSugestao, btPrevisaoProducao, btInformacaoClimatica, btSobre, btSair;
    WebView webView;
    Pessoa pessoa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_inicial_usuario_comum);
        btMinhaInformacao = (Button) findViewById(R.id.btMinhaInformacao);
        btSugestao = (Button) findViewById(R.id.btSugestao);
        btPrevisaoProducao = (Button) findViewById(R.id.btPrevisaoProducao);
        btInformacaoClimatica = (Button) findViewById(R.id.btInformacaoClimatica);
        btSobre = (Button) findViewById(R.id.btSobre);
        btSair = (Button) findViewById(R.id.btSair);
        textViewBemVindo = (TextView) findViewById(R.id.textViewBemVindo);

        /*WebView webView = (WebView) findViewById(R.id.webView01);
        WebSettings ws = webView.getSettings();
        ws.setJavaScriptEnabled(true);
        ws.supportZoom();
        //webView.loadUrl("http://www.ecodesenvolvimento.org/dicas-e-guias/guias/2012/julho/guia-do-consumo-consciente-de-alimentos-para?tag=consumo_consciente");
        webView.loadUrl("http://bancodedados.cptec.inpe.br/dadosobservados/faces/synop.jsp");*/
        PessoaDao busca = new PessoaDao(getApplicationContext());
        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            pessoa = busca.getPessoa(Long.parseLong(String.valueOf(bundle.get("pessoa"))));
            String dadosPessoa = "You're welcome-> " + pessoa.getNome();
            textViewBemVindo.setText(dadosPessoa);
        } else {
            textViewBemVindo.setText("UM ERRO OCORREU.");
        }

        btMinhaInformacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent abreTelaInformacaoUsuario = new Intent(TelaInicialUsuarioComum.this, TelaInformacaoUsuario.class);
                abreTelaInformacaoUsuario.putExtra("pessoa", String.valueOf(pessoa.getCpf()));
                startActivity(abreTelaInformacaoUsuario);
            }
        });
        btSobre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent abreTelaSobre = new Intent(TelaInicialUsuarioComum.this, TelaSobre.class);
                abreTelaSobre.putExtra("pessoa", String.valueOf(pessoa.getCpf()));
                startActivity(abreTelaSobre);
            }
        });
        btSair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent abreTelaLogin = new Intent(TelaInicialUsuarioComum.this, TelaLogin.class);
                abreTelaLogin.putExtra("pessoa", String.valueOf(pessoa.getCpf()));
                startActivity(abreTelaLogin);
            }
        });
    }

    public void onBackPressed() {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_MAIN);
        intent.addCategory(Intent.CATEGORY_HOME);
        startActivity(intent);

        return;
    }
}
