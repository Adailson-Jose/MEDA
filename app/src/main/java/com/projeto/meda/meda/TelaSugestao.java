package com.projeto.meda.meda;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import static com.projeto.meda.meda.EnumCultura.listaEnumCultura;
import static com.projeto.meda.meda.EnumQualidadeClima.listaEnumClima;
import static com.projeto.meda.meda.EnumQualidadeMercado.listaEnumMercado;
import static com.projeto.meda.meda.EnumRegiao.listaEnumRegiao;

public class TelaSugestao extends AppCompatActivity {
    private String dadosPessoa;
    Button btSair, btSugestao;
    EditText qtdTonelada;
    private Spinner spinner1, spinner2, spinner3, spinner4;
    private String[] listaEnumRegiao = listaEnumRegiao();
    private String[] listaEnumMercado = listaEnumMercado();
    private String[] listaEnumClima = listaEnumClima();
    private String[] listaEnumCultura = listaEnumCultura();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_sugestao);
        btSair = (Button) findViewById(R.id.btSair);
        qtdTonelada = (EditText) findViewById(R.id.qtdTonelada);
        btSugestao = (Button) findViewById(R.id.btSugestao);
        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            dadosPessoa = String.valueOf(bundle.get("pessoa"));
        }

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, listaEnumRegiao);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1 = (Spinner) findViewById(R.id.spinner1);
        spinner1.setAdapter(adapter);
        spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, listaEnumMercado);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2 = (Spinner) findViewById(R.id.spinner2);
        spinner2.setAdapter(adapter2);
        spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, listaEnumClima);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner3 = (Spinner) findViewById(R.id.spinner3);
        spinner3.setAdapter(adapter3);
        spinner3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        ArrayAdapter<String> adapter4 = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, listaEnumCultura);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner4 = (Spinner) findViewById(R.id.spinner4);
        spinner4.setAdapter(adapter4);
        spinner4.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        //String regiao = (String) spinner1.getSelectedItem();
        //String mercado = (String) spinner2.getSelectedItem();
        //String clima = (String) spinner3.getSelectedItem();
        //String cultura = (String) spinner4.getSelectedItem();
        String teste = String.valueOf(qtdTonelada);
        if (ValidarCampoVazio.isCampoVazio(teste)) {
            qtdTonelada.setError("Field invalid ton!");
            qtdTonelada.requestFocus();
        }

        btSugestao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String teste = String.valueOf(qtdTonelada.getText());
                if (ValidarCampoVazio.isCampoVazio(teste)) {
                    qtdTonelada.setError("Field invalid ton!");
                    qtdTonelada.requestFocus();
                } else {
                    Intent abreCalculoSugestao = new Intent(TelaSugestao.this, CalculoSugestao.class);
                    abreCalculoSugestao.putExtra("pessoa", dadosPessoa);
                    startActivity(abreCalculoSugestao);
                }
            }
        });
        btSair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent abreTelaInicialUsuarioComum = new Intent(TelaSugestao.this, TelaInicialUsuarioComum.class);
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
