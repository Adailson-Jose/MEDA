package com.projeto.meda.meda;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.TextView;

public class TelaInicialUsuarioComum extends Activity {
    TextView textViewBemVindo;
    Button btMinhaInformacao;
    WebView webView;
    Pessoa pessoa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_inicial_usuario_comum);
        btMinhaInformacao = (Button) findViewById(R.id.btMinhaInformacao);
        textViewBemVindo = (TextView) findViewById(R.id.textViewBemVindo);
        WebView webView = (WebView) findViewById(R.id.webView01);
        WebSettings ws = webView.getSettings();
        ws.setJavaScriptEnabled(true);
        ws.supportZoom();
        //webView.loadUrl("http://www.ecodesenvolvimento.org/dicas-e-guias/guias/2012/julho/guia-do-consumo-consciente-de-alimentos-para?tag=consumo_consciente");
        webView.loadUrl("http://g1.globo.com/economia/agronegocios/globo-rural/");
        PessoaDao busca = new PessoaDao(getApplicationContext());
        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            pessoa = busca.getPessoa(Long.parseLong(String.valueOf(bundle.get("KEY"))));
            String dadosPessoa = "You're welcome-> " + pessoa.getNome();
            textViewBemVindo.setText(dadosPessoa);
        } else {
            textViewBemVindo.setText("UM ERRO OCORREU.");
        }

        btMinhaInformacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent AbreTelaInformacaoUsuario = new Intent(TelaInicialUsuarioComum.this, TelaEditaInfoUsuario.class);
                AbreTelaInformacaoUsuario.putExtra("pessoa", String.valueOf(pessoa.getCpf()));
                startActivity(AbreTelaInformacaoUsuario);
            }
        });
    }
}
