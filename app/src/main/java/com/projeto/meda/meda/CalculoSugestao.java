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
        }

        btSair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent abreTelaInicialUsuarioComum = new Intent(CalculoSugestao.this, TelaInicialUsuarioComum.class);
                abreTelaInicialUsuarioComum.putExtra("pessoa", dadosPessoa);
                startActivity(abreTelaInicialUsuarioComum);
            }
        });
        if (dados.get(0) == "Pernambuco") {
            if (dados.get(1) == "Ruim") {

                if (dados.get(2) == "Ruim") {
                    sugestaoTxt.setText("Local: " + dados.get(0) + "\n" + "Segundo as previsões do algoritmo o mercado não está nada FAVORÁVEL, nem o clima, portanto não é aconselhávél fazer plantações devido o clima e o mercado que trazem grandes riscos.");
                } else if (dados.get(2) == "Médio") {
                    sugestaoTxt.setText("Local: " + dados.get(0) + "\n" + "Segundo as previsões do algoritmo o mercado não está nada FAVORÁVEL, nem o clima, portanto não é aconselhávél fazer plantações devido o clima e o mercado que trazem grandes riscos.");

                } else if (dados.get(2) == "Bom") {
                    sugestaoTxt.setText("Local: " + dados.get(0) + "\n" + "Segundo as previsões do algoritmo o mercado não está nada FAVORÁVEL, mas o clima está,  portanto  é aconselhávél fazer plantações EM MÉDIA ESCALA para a cultura: " + dados.get(3) + " caso deseje estocar para vender posteriormente.");

                } else if (dados.get(2) == "Ótimo") {
                    sugestaoTxt.setText("Local: " + dados.get(0) + "\n" + "Segundo as previsões do algoritmo o mercado não está nada FAVORÁVEL, mas clima não está, portanto  é aconselhávél fazer plantações EM MÉDIA ESCALA: " + dados.get(3) + " caso deseje estocar para vender posteriormente.");
                }

            } else if (dados.get(1) == "Médio") {

                if (dados.get(2) == "Ruim") {
                    sugestaoTxt.setText("Local: " + dados.get(0) + "\n" + "Segundo as previsões do algoritmo o mercado  está pouco FAVORÁVEL e o clima não ajuda, portanto não é aconselhávél fazer plantações devido o clima e o mercado que trazem grandes riscos.");
                } else if (dados.get(2) == "Médio") {
                    sugestaoTxt.setText("Local: " + dados.get(0) + "\n" + "Segundo as previsões do algoritmo o mercado  está pouco FAVORÁVEL e o clima não ajuda, portanto não é aconselhávél fazer plantações devido o clima e o mercado que trazem grandes riscos.");

                } else if (dados.get(2) == "Bom") {
                    sugestaoTxt.setText("Local: " + dados.get(0) + "\n" + "Segundo as previsões do algoritmo o mercado  está pouco FAVORÁVEL , mas o clima está bom,  portanto  é aconselhávél fazer plantações EM MÉDIA ESCALA para a cultura: " + dados.get(3) + " caso deseje estocar para vender posteriormente.");

                } else if (dados.get(2) == "Ótimo") {
                    sugestaoTxt.setText("Local: " + dados.get(0) + "\n" + "Segundo as previsões do algoritmo o mercado  está pouco FAVORÁVEL, mas clima está ótimo, portanto  é aconselhávél fazer plantações EM MÉDIA ESCALA para a cultura: " + dados.get(3) + " caso deseje estocar para vender posteriormente.");
                }

            } else if (dados.get(1) == "Bom") {

                if (dados.get(2) == "Ruim") {
                    sugestaoTxt.setText("Local: " + dados.get(0) + "\n" + "Segundo as previsões do algoritmo o mercado  está bem FAVORÁVEL, mas o clima não ajuda, portanto não é aconselhávél fazer plantações devido o clima que traz grandes riscos.");

                } else if (dados.get(2) == "Médio") {
                    sugestaoTxt.setText("Local: " + dados.get(0) + "\n" + "Segundo as previsões do algoritmo o mercado  está bem  FAVORÁVEL, mas o clima não ajuda, portanto não é aconselhávél fazer plantações devido o clima que traz grandes riscos.");

                } else if (dados.get(2) == "Bom") {
                    sugestaoTxt.setText("Local: " + dados.get(0) + "\n" + "Segundo as previsões do algoritmo o mercado  está bem FAVORÁVEL e o clima está bom,  portanto  é aconselhávél fazer plantações EM MÉDIA ESCALA para a cultura: " + dados.get(3) + ".");

                } else if (dados.get(2) == "Ótimo") {
                    sugestaoTxt.setText("Local: " + dados.get(0) + "\n" + "Segundo as previsões do algoritmo o mercado  está bem FAVORÁVEL e oclima está ótimo, portanto  é aconselhávél fazer plantações EM GRANDE ESCALA para a cultura: " + dados.get(3) + ".");
                }

            } else if (dados.get(1) == "Ótimo") {

                if (dados.get(2) == "Ruim") {
                    sugestaoTxt.setText("Local: " + dados.get(0) + "\n" + "Segundo as previsões do algoritmo o mercado  está muito FAVORÁVEL, mas o clima não ajuda, portanto não é aconselhávél fazer plantações devido o clima que traz grandes riscos.");

                } else if (dados.get(2) == "Médio") {
                    sugestaoTxt.setText("Local: " + dados.get(0) + "\n" + "Segundo as previsões do algoritmo o mercado  está muito  FAVORÁVEL, mas o clima não ajuda, portanto não é aconselhávél fazer plantações devido o clima que traz riscos.");

                } else if (dados.get(2) == "Bom") {
                    sugestaoTxt.setText("Local: " + dados.get(0) + "\n" + "Segundo as previsões do algoritmo o mercado  está muito FAVORÁVEL e o clima está bom,  portanto  é aconselhávél fazer plantações EM MÉDIA ESCALA para a cultura: " + dados.get(3) + ".");

                } else if (dados.get(2) == "Ótimo") {
                    sugestaoTxt.setText("Local: " + dados.get(0) + "\n" + "Segundo as previsões do algoritmo o mercado  está muito FAVORÁVEL e oclima está ótimo, portanto  é aconselhávél fazer plantações EM GRANDE ESCALA para a cultura: " + dados.get(3) + ".");
                }
            }
        } else if (dados.get(0) == "São Paulo") {
            if (dados.get(1) == "Ruim") {

                if (dados.get(2) == "Ruim") {
                    sugestaoTxt.setText("Local: " + dados.get(0) + "\n" + "Segundo as previsões do algoritmo o mercado não está nada FAVORÁVEL, nem o clima, portanto não é aconselhávél fazer plantações devido o clima e o mercado que trazem grandes riscos.");
                } else if (dados.get(2) == "Médio") {
                    sugestaoTxt.setText("Local: " + dados.get(0) + "\n" + "Segundo as previsões do algoritmo o mercado não está nada FAVORÁVEL, nem o clima, portanto não é aconselhávél fazer plantações devido o clima e o mercado que trazem grandes riscos.");

                } else if (dados.get(2) == "Bom") {
                    sugestaoTxt.setText("Local: " + dados.get(0) + "\n" + "Segundo as previsões do algoritmo o mercado não está nada FAVORÁVEL, mas o clima está,  portanto  é aconselhávél fazer plantações EM MÉDIA ESCALA para a cultura: " + dados.get(3) + " caso deseje estocar para vender posteriormente.");

                } else if (dados.get(2) == "Ótimo") {
                    sugestaoTxt.setText("Local: " + dados.get(0) + "\n" + "Segundo as previsões do algoritmo o mercado não está nada FAVORÁVEL, mas clima não está, portanto  é aconselhávél fazer plantações EM MÉDIA ESCALA: " + dados.get(3) + " caso deseje estocar para vender posteriormente.");
                }

            } else if (dados.get(1) == "Médio") {

                if (dados.get(2) == "Ruim") {
                    sugestaoTxt.setText("Local: " + dados.get(0) + "\n" + "Segundo as previsões do algoritmo o mercado  está pouco FAVORÁVEL e o clima não ajuda, portanto não é aconselhávél fazer plantações devido o clima e o mercado que trazem grandes riscos.");
                } else if (dados.get(2) == "Médio") {
                    sugestaoTxt.setText("Local: " + dados.get(0) + "\n" + "Segundo as previsões do algoritmo o mercado  está pouco FAVORÁVEL e o clima não ajuda, portanto não é aconselhávél fazer plantações devido o clima e o mercado que trazem grandes riscos.");

                } else if (dados.get(2) == "Bom") {
                    sugestaoTxt.setText("Local: " + dados.get(0) + "\n" + "Segundo as previsões do algoritmo o mercado  está pouco FAVORÁVEL , mas o clima está bom,  portanto  é aconselhávél fazer plantações EM MÉDIA ESCALA para a cultura: " + dados.get(3) + " caso deseje estocar para vender posteriormente.");

                } else if (dados.get(2) == "Ótimo") {
                    sugestaoTxt.setText("Local: " + dados.get(0) + "\n" + "Segundo as previsões do algoritmo o mercado  está pouco FAVORÁVEL, mas clima está ótimo, portanto  é aconselhávél fazer plantações EM MÉDIA ESCALA para a cultura: " + dados.get(3) + " caso deseje estocar para vender posteriormente.");
                }

            } else if (dados.get(1) == "Bom") {

                if (dados.get(2) == "Ruim") {
                    sugestaoTxt.setText("Local: " + dados.get(0) + "\n" + "Segundo as previsões do algoritmo o mercado  está bem FAVORÁVEL, mas o clima não ajuda, portanto não é aconselhávél fazer plantações devido o clima que traz grandes riscos.");

                } else if (dados.get(2) == "Médio") {
                    sugestaoTxt.setText("Local: " + dados.get(0) + "\n" + "Segundo as previsões do algoritmo o mercado  está bem  FAVORÁVEL, mas o clima não ajuda, portanto não é aconselhávél fazer plantações devido o clima que traz grandes riscos.");

                } else if (dados.get(2) == "Bom") {
                    sugestaoTxt.setText("Local: " + dados.get(0) + "\n" + "Segundo as previsões do algoritmo o mercado  está bem FAVORÁVEL e o clima está bom,  portanto  é aconselhávél fazer plantações EM MÉDIA ESCALA para a cultura: " + dados.get(3) + ".");

                } else if (dados.get(2) == "Ótimo") {
                    sugestaoTxt.setText("Local: " + dados.get(0) + "\n" + "Segundo as previsões do algoritmo o mercado  está bem FAVORÁVEL e oclima está ótimo, portanto  é aconselhávél fazer plantações EM GRANDE ESCALA para a cultura: " + dados.get(3) + ".");
                }

            } else if (dados.get(1) == "Ótimo") {

                if (dados.get(2) == "Ruim") {
                    sugestaoTxt.setText("Local: " + dados.get(0) + "\n" + "Segundo as previsões do algoritmo o mercado  está muito FAVORÁVEL, mas o clima não ajuda, portanto não é aconselhávél fazer plantações devido o clima que traz grandes riscos.");

                } else if (dados.get(2) == "Médio") {
                    sugestaoTxt.setText("Local: " + dados.get(0) + "\n" + "Segundo as previsões do algoritmo o mercado  está muito  FAVORÁVEL, mas o clima não ajuda, portanto não é aconselhávél fazer plantações devido o clima que traz riscos.");

                } else if (dados.get(2) == "Bom") {
                    sugestaoTxt.setText("Local: " + dados.get(0) + "\n" + "Segundo as previsões do algoritmo o mercado  está muito FAVORÁVEL e o clima está bom,  portanto  é aconselhávél fazer plantações EM MÉDIA ESCALA para a cultura: " + dados.get(3) + ".");

                } else if (dados.get(2) == "Ótimo") {
                    sugestaoTxt.setText("Local: " + dados.get(0) + "\n" + "Segundo as previsões do algoritmo o mercado  está muito FAVORÁVEL e oclima está ótimo, portanto  é aconselhávél fazer plantações EM GRANDE ESCALA para a cultura: " + dados.get(3) + ".");
                }
            }
        } else if (dados.get(0) == "Bahia") {
            if (dados.get(1) == "Ruim") {

                if (dados.get(2) == "Ruim") {
                    sugestaoTxt.setText("Local: " + dados.get(0) + "\n" + "Segundo as previsões do algoritmo o mercado não está nada FAVORÁVEL, nem o clima, portanto não é aconselhávél fazer plantações devido o clima e o mercado que trazem grandes riscos.");
                } else if (dados.get(2) == "Médio") {
                    sugestaoTxt.setText("Local: " + dados.get(0) + "\n" + "Segundo as previsões do algoritmo o mercado não está nada FAVORÁVEL, nem o clima, portanto não é aconselhávél fazer plantações devido o clima e o mercado que trazem grandes riscos.");

                } else if (dados.get(2) == "Bom") {
                    sugestaoTxt.setText("Local: " + dados.get(0) + "\n" + "Segundo as previsões do algoritmo o mercado não está nada FAVORÁVEL, mas o clima está,  portanto  é aconselhávél fazer plantações EM MÉDIA ESCALA para a cultura: " + dados.get(3) + " caso deseje estocar para vender posteriormente.");

                } else if (dados.get(2) == "Ótimo") {
                    sugestaoTxt.setText("Local: " + dados.get(0) + "\n" + "Segundo as previsões do algoritmo o mercado não está nada FAVORÁVEL, mas clima não está, portanto  é aconselhávél fazer plantações EM MÉDIA ESCALA: " + dados.get(3) + " caso deseje estocar para vender posteriormente.");
                }

            } else if (dados.get(1) == "Médio") {

                if (dados.get(2) == "Ruim") {
                    sugestaoTxt.setText("Local: " + dados.get(0) + "\n" + "Segundo as previsões do algoritmo o mercado  está pouco FAVORÁVEL e o clima não ajuda, portanto não é aconselhávél fazer plantações devido o clima e o mercado que trazem grandes riscos.");
                } else if (dados.get(2) == "Médio") {
                    sugestaoTxt.setText("Local: " + dados.get(0) + "\n" + "Segundo as previsões do algoritmo o mercado  está pouco FAVORÁVEL e o clima não ajuda, portanto não é aconselhávél fazer plantações devido o clima e o mercado que trazem grandes riscos.");

                } else if (dados.get(2) == "Bom") {
                    sugestaoTxt.setText("Local: " + dados.get(0) + "\n" + "Segundo as previsões do algoritmo o mercado  está pouco FAVORÁVEL , mas o clima está bom,  portanto  é aconselhávél fazer plantações EM MÉDIA ESCALA para a cultura: " + dados.get(3) + " caso deseje estocar para vender posteriormente.");

                } else if (dados.get(2) == "Ótimo") {
                    sugestaoTxt.setText("Local: " + dados.get(0) + "\n" + "Segundo as previsões do algoritmo o mercado  está pouco FAVORÁVEL, mas clima está ótimo, portanto  é aconselhávél fazer plantações EM MÉDIA ESCALA para a cultura: " + dados.get(3) + " caso deseje estocar para vender posteriormente.");
                }

            } else if (dados.get(1) == "Bom") {

                if (dados.get(2) == "Ruim") {
                    sugestaoTxt.setText("Local: " + dados.get(0) + "\n" + "Segundo as previsões do algoritmo o mercado  está bem FAVORÁVEL, mas o clima não ajuda, portanto não é aconselhávél fazer plantações devido o clima que traz grandes riscos.");

                } else if (dados.get(2) == "Médio") {
                    sugestaoTxt.setText("Local: " + dados.get(0) + "\n" + "Segundo as previsões do algoritmo o mercado  está bem  FAVORÁVEL, mas o clima não ajuda, portanto não é aconselhávél fazer plantações devido o clima que traz grandes riscos.");

                } else if (dados.get(2) == "Bom") {
                    sugestaoTxt.setText("Local: " + dados.get(0) + "\n" + "Segundo as previsões do algoritmo o mercado  está bem FAVORÁVEL e o clima está bom,  portanto  é aconselhávél fazer plantações EM MÉDIA ESCALA para a cultura: " + dados.get(3) + ".");

                } else if (dados.get(2) == "Ótimo") {
                    sugestaoTxt.setText("Local: " + dados.get(0) + "\n" + "Segundo as previsões do algoritmo o mercado  está bem FAVORÁVEL e oclima está ótimo, portanto  é aconselhávél fazer plantações EM GRANDE ESCALA para a cultura: " + dados.get(3) + ".");
                }

            } else if (dados.get(1) == "Ótimo") {

                if (dados.get(2) == "Ruim") {
                    sugestaoTxt.setText("Local: " + dados.get(0) + "\n" + "Segundo as previsões do algoritmo o mercado  está muito FAVORÁVEL, mas o clima não ajuda, portanto não é aconselhávél fazer plantações devido o clima que traz grandes riscos.");

                } else if (dados.get(2) == "Médio") {
                    sugestaoTxt.setText("Local: " + dados.get(0) + "\n" + "Segundo as previsões do algoritmo o mercado  está muito  FAVORÁVEL, mas o clima não ajuda, portanto não é aconselhávél fazer plantações devido o clima que traz riscos.");

                } else if (dados.get(2) == "Bom") {
                    sugestaoTxt.setText("Local: " + dados.get(0) + "\n" + "Segundo as previsões do algoritmo o mercado  está muito FAVORÁVEL e o clima está bom,  portanto  é aconselhávél fazer plantações EM MÉDIA ESCALA para a cultura: " + dados.get(3) + ".");

                } else if (dados.get(2) == "Ótimo") {
                    sugestaoTxt.setText("Local: " + dados.get(0) + "\n" + "Segundo as previsões do algoritmo o mercado  está muito FAVORÁVEL e oclima está ótimo, portanto  é aconselhávél fazer plantações EM GRANDE ESCALA para a cultura: " + dados.get(3) + ".");
                }
            }

        } else if (dados.get(0) == "Amazonas") {
            if (dados.get(1) == "Ruim") {

                if (dados.get(2) == "Ruim") {
                    sugestaoTxt.setText("Local: " + dados.get(0) + "\n" + "Segundo as previsões do algoritmo o mercado não está nada FAVORÁVEL, nem o clima, portanto não é aconselhávél fazer plantações devido o clima e o mercado que trazem grandes riscos.");
                } else if (dados.get(2) == "Médio") {
                    sugestaoTxt.setText("Local: " + dados.get(0) + "\n" + "Segundo as previsões do algoritmo o mercado não está nada FAVORÁVEL, nem o clima, portanto não é aconselhávél fazer plantações devido o clima e o mercado que trazem grandes riscos.");

                } else if (dados.get(2) == "Bom") {
                    sugestaoTxt.setText("Local: " + dados.get(0) + "\n" + "Segundo as previsões do algoritmo o mercado não está nada FAVORÁVEL, mas o clima está,  portanto  é aconselhávél fazer plantações EM MÉDIA ESCALA para a cultura: " + dados.get(3) + " caso deseje estocar para vender posteriormente.");

                } else if (dados.get(2) == "Ótimo") {
                    sugestaoTxt.setText("Local: " + dados.get(0) + "\n" + "Segundo as previsões do algoritmo o mercado não está nada FAVORÁVEL, mas clima não está, portanto  é aconselhávél fazer plantações EM MÉDIA ESCALA: " + dados.get(3) + " caso deseje estocar para vender posteriormente.");
                }

            } else if (dados.get(1) == "Médio") {

                if (dados.get(2) == "Ruim") {
                    sugestaoTxt.setText("Local: " + dados.get(0) + "\n" + "Segundo as previsões do algoritmo o mercado  está pouco FAVORÁVEL e o clima não ajuda, portanto não é aconselhávél fazer plantações devido o clima e o mercado que trazem grandes riscos.");
                } else if (dados.get(2) == "Médio") {
                    sugestaoTxt.setText("Local: " + dados.get(0) + "\n" + "Segundo as previsões do algoritmo o mercado  está pouco FAVORÁVEL e o clima não ajuda, portanto não é aconselhávél fazer plantações devido o clima e o mercado que trazem grandes riscos.");

                } else if (dados.get(2) == "Bom") {
                    sugestaoTxt.setText("Local: " + dados.get(0) + "\n" + "Segundo as previsões do algoritmo o mercado  está pouco FAVORÁVEL , mas o clima está bom,  portanto  é aconselhávél fazer plantações EM MÉDIA ESCALA para a cultura: " + dados.get(3) + " caso deseje estocar para vender posteriormente.");

                } else if (dados.get(2) == "Ótimo") {
                    sugestaoTxt.setText("Local: " + dados.get(0) + "\n" + "Segundo as previsões do algoritmo o mercado  está pouco FAVORÁVEL, mas clima está ótimo, portanto  é aconselhávél fazer plantações EM MÉDIA ESCALA para a cultura: " + dados.get(3) + " caso deseje estocar para vender posteriormente.");
                }

            } else if (dados.get(1) == "Bom") {

                if (dados.get(2) == "Ruim") {
                    sugestaoTxt.setText("Local: " + dados.get(0) + "\n" + "Segundo as previsões do algoritmo o mercado  está bem FAVORÁVEL, mas o clima não ajuda, portanto não é aconselhávél fazer plantações devido o clima que traz grandes riscos.");

                } else if (dados.get(2) == "Médio") {
                    sugestaoTxt.setText("Local: " + dados.get(0) + "\n" + "Segundo as previsões do algoritmo o mercado  está bem  FAVORÁVEL, mas o clima não ajuda, portanto não é aconselhávél fazer plantações devido o clima que traz grandes riscos.");

                } else if (dados.get(2) == "Bom") {
                    sugestaoTxt.setText("Local: " + dados.get(0) + "\n" + "Segundo as previsões do algoritmo o mercado  está bem FAVORÁVEL e o clima está bom,  portanto  é aconselhávél fazer plantações EM MÉDIA ESCALA para a cultura: " + dados.get(3) + ".");

                } else if (dados.get(2) == "Ótimo") {
                    sugestaoTxt.setText("Local: " + dados.get(0) + "\n" + "Segundo as previsões do algoritmo o mercado  está bem FAVORÁVEL e oclima está ótimo, portanto  é aconselhávél fazer plantações EM GRANDE ESCALA para a cultura: " + dados.get(3) + ".");
                }

            } else if (dados.get(1) == "Ótimo") {

                if (dados.get(2) == "Ruim") {
                    sugestaoTxt.setText("Local: " + dados.get(0) + "\n" + "Segundo as previsões do algoritmo o mercado  está muito FAVORÁVEL, mas o clima não ajuda, portanto não é aconselhávél fazer plantações devido o clima que traz grandes riscos.");

                } else if (dados.get(2) == "Médio") {
                    sugestaoTxt.setText("Local: " + dados.get(0) + "\n" + "Segundo as previsões do algoritmo o mercado  está muito  FAVORÁVEL, mas o clima não ajuda, portanto não é aconselhávél fazer plantações devido o clima que traz riscos.");

                } else if (dados.get(2) == "Bom") {
                    sugestaoTxt.setText("Local: " + dados.get(0) + "\n" + "Segundo as previsões do algoritmo o mercado  está muito FAVORÁVEL e o clima está bom,  portanto  é aconselhávél fazer plantações EM MÉDIA ESCALA para a cultura: " + dados.get(3) + ".");

                } else if (dados.get(2) == "Ótimo") {
                    sugestaoTxt.setText("Local: " + dados.get(0) + "\n" + "Segundo as previsões do algoritmo o mercado  está muito FAVORÁVEL e oclima está ótimo, portanto  é aconselhávél fazer plantações EM GRANDE ESCALA para a cultura: " + dados.get(3) + ".");
                }
            }
        }

    }


    public void onBackPressed() {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_MAIN);
        intent.addCategory(Intent.CATEGORY_HOME);
        startActivity(intent);

        return;
    }
}
