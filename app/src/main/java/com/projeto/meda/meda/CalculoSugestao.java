package com.projeto.meda.meda;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

import static com.projeto.meda.meda.EnumCultura.listaEnumCultura;

public class CalculoSugestao extends AppCompatActivity {
    Button btSair;
    TextView sugestaoTxt;
    private String dadosPessoa;
    private ArrayList<String> dados;
    private String[] listaEnumCultura = listaEnumCultura();
    private String[] pernambuco = {"Cana-de-açucar", "Mandioca", "Uva"};
    private String[] saoPaulo = {"Cana-de-açucar", "Sorja", "Milho"};
    private String[] bahia = {"Cacau", "Cafezeiro", "Feijão"};
    private String[] amazonas = {"Cacau", "Castanha", "Assái"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculo_sugestao);
        btSair = (Button) findViewById(R.id.btSair);
        sugestaoTxt = (TextView) findViewById(R.id.sugestaoTxt);
        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            dadosPessoa = String.valueOf(bundle.get("pessoa"));
            dados = (ArrayList<String>) bundle.get("dados");
            sugestaoTxt.setText("Local: " + dados.get(0) + "\n" + "");
        }
        btSair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent abreTelaInicialUsuarioComum = new Intent(CalculoSugestao.this, TelaInicialUsuarioComum.class);
                abreTelaInicialUsuarioComum.putExtra("pessoa", dadosPessoa);
                startActivity(abreTelaInicialUsuarioComum);
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
