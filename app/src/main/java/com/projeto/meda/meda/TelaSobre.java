package com.projeto.meda.meda;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class TelaSobre extends AppCompatActivity {
    Button btSair;
    private String dadosPessoa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sobre);
        btSair = (Button) findViewById(R.id.btSair);
        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            dadosPessoa = String.valueOf(bundle.get("pessoa"));
        }
        btSair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent abreTelaInicialUsuarioComum = new Intent(TelaSobre.this, TelaInicialUsuarioComum.class);
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
