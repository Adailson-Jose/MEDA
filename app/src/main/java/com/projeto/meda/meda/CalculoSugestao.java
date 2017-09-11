package com.projeto.meda.meda;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Objects;

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
        if (dados.get(0).equals("Pernambuco")) {
            if (Objects.equals(dados.get(1), "Ruim")) {

                if (Objects.equals(dados.get(2), "Ruim")) {
                    sugestaoTxt.setText("Local: " + dados.get(0) + "\n" + "Segundo as previsões do algoritmo o mercado não está nada FAVORÁVEL, nem o clima, portanto não é aconselhável fazer plantação devido o clima e o mercado que trazem grandes riscos.");
                } else if (Objects.equals(dados.get(2), "Médio")) {
                    sugestaoTxt.setText("Local: " + dados.get(0) + "\n" + "Segundo as previsões do algoritmo o mercado não está nada FAVORÁVEL, nem o clima, portanto não é aconselhável fazer plantação devido o clima e o mercado que trazem grandes riscos.");

                } else if (Objects.equals(dados.get(2), "Bom")) {
                    sugestaoTxt.setText("Local: " + dados.get(0) + "\n" + "Segundo as previsões do algoritmo o mercado não está nada FAVORÁVEL, mas o clima está,  portanto  é aconselhável fazer plantação EM MÉDIA ESCALA para a cultura: " + dados.get(3) + " caso deseje estocar para vender posteriormente.");

                } else if (Objects.equals(dados.get(2), "Ótimo")) {
                    sugestaoTxt.setText("Local: " + dados.get(0) + "\n" + "Segundo as previsões do algoritmo o mercado não está nada FAVORÁVEL, mas clima não está, portanto  é aconselhável fazer plantação EM MÉDIA ESCALA: " + dados.get(3) + " caso deseje estocar para vender posteriormente.");
                }

            } else if (Objects.equals(dados.get(1), "Médio")) {

                if (Objects.equals(dados.get(2), "Ruim")) {
                    sugestaoTxt.setText("Local: " + dados.get(0) + "\n" + "Segundo as previsões do algoritmo o mercado  está pouco FAVORÁVEL e o clima não ajuda, portanto não é aconselhável fazer plantação devido o clima e o mercado que trazem grandes riscos.");
                } else if (Objects.equals(dados.get(2), "Médio")) {
                    sugestaoTxt.setText("Local: " + dados.get(0) + "\n" + "Segundo as previsões do algoritmo o mercado  está pouco FAVORÁVEL e o clima não ajuda, portanto não é aconselhável fazer plantação devido o clima e o mercado que trazem grandes riscos.");

                } else if (Objects.equals(dados.get(2), "Bom")) {
                    sugestaoTxt.setText("Local: " + dados.get(0) + "\n" + "Segundo as previsões do algoritmo o mercado  está pouco FAVORÁVEL , mas o clima está bom,  portanto  é aconselhável fazer plantação EM MÉDIA ESCALA para a cultura: " + dados.get(3) + " caso deseje estocar para vender posteriormente.");

                } else if (Objects.equals(dados.get(2), "Ótimo")) {
                    sugestaoTxt.setText("Local: " + dados.get(0) + "\n" + "Segundo as previsões do algoritmo o mercado  está pouco FAVORÁVEL, mas clima está ótimo, portanto  é aconselhável fazer plantação EM MÉDIA ESCALA para a cultura: " + dados.get(3) + " caso deseje estocar para vender posteriormente.");
                }

            } else if (Objects.equals(dados.get(1), "Bom")) {

                if (Objects.equals(dados.get(2), "Ruim")) {
                    sugestaoTxt.setText("Local: " + dados.get(0) + "\n" + "Segundo as previsões do algoritmo o mercado  está bem FAVORÁVEL, mas o clima não ajuda, portanto não é aconselhável fazer plantação devido o clima que traz grandes riscos.");

                } else if (Objects.equals(dados.get(2), "Médio")) {
                    sugestaoTxt.setText("Local: " + dados.get(0) + "\n" + "Segundo as previsões do algoritmo o mercado  está bem  FAVORÁVEL, mas o clima não ajuda, portanto não é aconselhável fazer plantação devido o clima que traz grandes riscos.");

                } else if (Objects.equals(dados.get(2), "Bom")) {
                    sugestaoTxt.setText("Local: " + dados.get(0) + "\n" + "Segundo as previsões do algoritmo o mercado  está bem FAVORÁVEL e o clima está bom,  portanto  é aconselhável fazer plantação EM MÉDIA ESCALA para a cultura: " + dados.get(3) + ".");

                } else if (Objects.equals(dados.get(2), "Ótimo")) {
                    sugestaoTxt.setText("Local: " + dados.get(0) + "\n" + "Segundo as previsões do algoritmo o mercado  está bem FAVORÁVEL e oclima está ótimo, portanto  é aconselhável fazer plantação EM GRANDE ESCALA para a cultura: " + dados.get(3) + ".");
                }

            } else if (Objects.equals(dados.get(1), "Ótimo")) {

                if (Objects.equals(dados.get(2), "Ruim")) {
                    sugestaoTxt.setText("Local: " + dados.get(0) + "\n" + "Segundo as previsões do algoritmo o mercado  está muito FAVORÁVEL, mas o clima não ajuda, portanto não é aconselhável fazer plantação devido o clima que traz grandes riscos.");

                } else if (Objects.equals(dados.get(2), "Médio")) {
                    sugestaoTxt.setText("Local: " + dados.get(0) + "\n" + "Segundo as previsões do algoritmo o mercado  está muito  FAVORÁVEL, mas o clima não ajuda, portanto não é aconselhável fazer plantação devido o clima que traz riscos.");

                } else if (Objects.equals(dados.get(2), "Bom")) {
                    sugestaoTxt.setText("Local: " + dados.get(0) + "\n" + "Segundo as previsões do algoritmo o mercado  está muito FAVORÁVEL e o clima está bom,  portanto  é aconselhável fazer plantação EM MÉDIA ESCALA para a cultura: " + dados.get(3) + ".");

                } else if (Objects.equals(dados.get(2), "Ótimo")) {
                    sugestaoTxt.setText("Local: " + dados.get(0) + "\n" + "Segundo as previsões do algoritmo o mercado  está muito FAVORÁVEL e oclima está ótimo, portanto  é aconselhável fazer plantação EM GRANDE ESCALA para a cultura: " + dados.get(3) + ".");
                }
            }
        } else if (dados.get(0).equals("São Paulo")) {
            if (Objects.equals(dados.get(1), "Ruim")) {

                if (Objects.equals(dados.get(2), "Ruim")) {
                    sugestaoTxt.setText("Local: " + dados.get(0) + "\n" + "Segundo as previsões do algoritmo o mercado não está nada FAVORÁVEL, nem o clima, portanto não é aconselhável fazer plantação devido o clima e o mercado que trazem grandes riscos.");
                } else if (Objects.equals(dados.get(2), "Médio")) {
                    sugestaoTxt.setText("Local: " + dados.get(0) + "\n" + "Segundo as previsões do algoritmo o mercado não está nada FAVORÁVEL, nem o clima, portanto não é aconselhável fazer plantação devido o clima e o mercado que trazem grandes riscos.");

                } else if (Objects.equals(dados.get(2), "Bom")) {
                    sugestaoTxt.setText("Local: " + dados.get(0) + "\n" + "Segundo as previsões do algoritmo o mercado não está nada FAVORÁVEL, mas o clima está,  portanto  é aconselhável fazer plantação EM MÉDIA ESCALA para a cultura: " + dados.get(3) + " caso deseje estocar para vender posteriormente.");

                } else if (Objects.equals(dados.get(2), "Ótimo")) {
                    sugestaoTxt.setText("Local: " + dados.get(0) + "\n" + "Segundo as previsões do algoritmo o mercado não está nada FAVORÁVEL, mas clima não está, portanto  é aconselhável fazer plantação EM MÉDIA ESCALA: " + dados.get(3) + " caso deseje estocar para vender posteriormente.");
                }

            } else if (Objects.equals(dados.get(1), "Médio")) {

                if (Objects.equals(dados.get(2), "Ruim")) {
                    sugestaoTxt.setText("Local: " + dados.get(0) + "\n" + "Segundo as previsões do algoritmo o mercado  está pouco FAVORÁVEL e o clima não ajuda, portanto não é aconselhável fazer plantação devido o clima e o mercado que trazem grandes riscos.");
                } else if (Objects.equals(dados.get(2), "Médio")) {
                    sugestaoTxt.setText("Local: " + dados.get(0) + "\n" + "Segundo as previsões do algoritmo o mercado  está pouco FAVORÁVEL e o clima não ajuda, portanto não é aconselhável fazer plantação devido o clima e o mercado que trazem grandes riscos.");

                } else if (Objects.equals(dados.get(2), "Bom")) {
                    sugestaoTxt.setText("Local: " + dados.get(0) + "\n" + "Segundo as previsões do algoritmo o mercado  está pouco FAVORÁVEL , mas o clima está bom,  portanto  é aconselhável fazer plantação EM MÉDIA ESCALA para a cultura: " + dados.get(3) + " caso deseje estocar para vender posteriormente.");

                } else if (Objects.equals(dados.get(2), "Ótimo")) {
                    sugestaoTxt.setText("Local: " + dados.get(0) + "\n" + "Segundo as previsões do algoritmo o mercado  está pouco FAVORÁVEL, mas clima está ótimo, portanto  é aconselhável fazer plantação EM MÉDIA ESCALA para a cultura: " + dados.get(3) + " caso deseje estocar para vender posteriormente.");
                }

            } else if (Objects.equals(dados.get(1), "Bom")) {

                if (Objects.equals(dados.get(2), "Ruim")) {
                    sugestaoTxt.setText("Local: " + dados.get(0) + "\n" + "Segundo as previsões do algoritmo o mercado  está bem FAVORÁVEL, mas o clima não ajuda, portanto não é aconselhável fazer plantação devido o clima que traz grandes riscos.");

                } else if (Objects.equals(dados.get(2), "Médio")) {
                    sugestaoTxt.setText("Local: " + dados.get(0) + "\n" + "Segundo as previsões do algoritmo o mercado  está bem  FAVORÁVEL, mas o clima não ajuda, portanto não é aconselhável fazer plantação devido o clima que traz grandes riscos.");

                } else if (Objects.equals(dados.get(2), "Bom")) {
                    sugestaoTxt.setText("Local: " + dados.get(0) + "\n" + "Segundo as previsões do algoritmo o mercado  está bem FAVORÁVEL e o clima está bom,  portanto  é aconselhável fazer plantação EM MÉDIA ESCALA para a cultura: " + dados.get(3) + ".");

                } else if (Objects.equals(dados.get(2), "Ótimo")) {
                    sugestaoTxt.setText("Local: " + dados.get(0) + "\n" + "Segundo as previsões do algoritmo o mercado  está bem FAVORÁVEL e oclima está ótimo, portanto  é aconselhável fazer plantação EM GRANDE ESCALA para a cultura: " + dados.get(3) + ".");
                }

            } else if (Objects.equals(dados.get(1), "Ótimo")) {

                if (Objects.equals(dados.get(2), "Ruim")) {
                    sugestaoTxt.setText("Local: " + dados.get(0) + "\n" + "Segundo as previsões do algoritmo o mercado  está muito FAVORÁVEL, mas o clima não ajuda, portanto não é aconselhável fazer plantação devido o clima que traz grandes riscos.");

                } else if (Objects.equals(dados.get(2), "Médio")) {
                    sugestaoTxt.setText("Local: " + dados.get(0) + "\n" + "Segundo as previsões do algoritmo o mercado  está muito  FAVORÁVEL, mas o clima não ajuda, portanto não é aconselhável fazer plantação devido o clima que traz riscos.");

                } else if (Objects.equals(dados.get(2), "Bom")) {
                    sugestaoTxt.setText("Local: " + dados.get(0) + "\n" + "Segundo as previsões do algoritmo o mercado  está muito FAVORÁVEL e o clima está bom,  portanto  é aconselhável fazer plantação EM MÉDIA ESCALA para a cultura: " + dados.get(3) + ".");

                } else if (Objects.equals(dados.get(2), "Ótimo")) {
                    sugestaoTxt.setText("Local: " + dados.get(0) + "\n" + "Segundo as previsões do algoritmo o mercado  está muito FAVORÁVEL e oclima está ótimo, portanto  é aconselhável fazer plantação EM GRANDE ESCALA para a cultura: " + dados.get(3) + ".");
                }
            }
        } else if (dados.get(0).equals("Bahia")) {
            if (Objects.equals(dados.get(1), "Ruim")) {

                if (Objects.equals(dados.get(2), "Ruim")) {
                    sugestaoTxt.setText("Local: " + dados.get(0) + "\n" + "Segundo as previsões do algoritmo o mercado não está nada FAVORÁVEL, nem o clima, portanto não é aconselhável fazer plantação devido o clima e o mercado que trazem grandes riscos.");
                } else if (Objects.equals(dados.get(2), "Médio")) {
                    sugestaoTxt.setText("Local: " + dados.get(0) + "\n" + "Segundo as previsões do algoritmo o mercado não está nada FAVORÁVEL, nem o clima, portanto não é aconselhável fazer plantação devido o clima e o mercado que trazem grandes riscos.");

                } else if (Objects.equals(dados.get(2), "Bom")) {
                    sugestaoTxt.setText("Local: " + dados.get(0) + "\n" + "Segundo as previsões do algoritmo o mercado não está nada FAVORÁVEL, mas o clima está,  portanto  é aconselhável fazer plantação EM MÉDIA ESCALA para a cultura: " + dados.get(3) + " caso deseje estocar para vender posteriormente.");

                } else if (Objects.equals(dados.get(2), "Ótimo")) {
                    sugestaoTxt.setText("Local: " + dados.get(0) + "\n" + "Segundo as previsões do algoritmo o mercado não está nada FAVORÁVEL, mas clima não está, portanto  é aconselhável fazer plantação EM MÉDIA ESCALA: " + dados.get(3) + " caso deseje estocar para vender posteriormente.");
                }

            } else if (Objects.equals(dados.get(1), "Médio")) {

                if (Objects.equals(dados.get(2), "Ruim")) {
                    sugestaoTxt.setText("Local: " + dados.get(0) + "\n" + "Segundo as previsões do algoritmo o mercado  está pouco FAVORÁVEL e o clima não ajuda, portanto não é aconselhável fazer plantação devido o clima e o mercado que trazem grandes riscos.");
                } else if (Objects.equals(dados.get(2), "Médio")) {
                    sugestaoTxt.setText("Local: " + dados.get(0) + "\n" + "Segundo as previsões do algoritmo o mercado  está pouco FAVORÁVEL e o clima não ajuda, portanto não é aconselhável fazer plantação devido o clima e o mercado que trazem grandes riscos.");

                } else if (Objects.equals(dados.get(2), "Bom")) {
                    sugestaoTxt.setText("Local: " + dados.get(0) + "\n" + "Segundo as previsões do algoritmo o mercado  está pouco FAVORÁVEL , mas o clima está bom,  portanto  é aconselhável fazer plantação EM MÉDIA ESCALA para a cultura: " + dados.get(3) + " caso deseje estocar para vender posteriormente.");

                } else if (Objects.equals(dados.get(2), "Ótimo")) {
                    sugestaoTxt.setText("Local: " + dados.get(0) + "\n" + "Segundo as previsões do algoritmo o mercado  está pouco FAVORÁVEL, mas clima está ótimo, portanto  é aconselhável fazer plantação EM MÉDIA ESCALA para a cultura: " + dados.get(3) + " caso deseje estocar para vender posteriormente.");
                }

            } else if (Objects.equals(dados.get(1), "Bom")) {

                if (Objects.equals(dados.get(2), "Ruim")) {
                    sugestaoTxt.setText("Local: " + dados.get(0) + "\n" + "Segundo as previsões do algoritmo o mercado  está bem FAVORÁVEL, mas o clima não ajuda, portanto não é aconselhável fazer plantação devido o clima que traz grandes riscos.");

                } else if (Objects.equals(dados.get(2), "Médio")) {
                    sugestaoTxt.setText("Local: " + dados.get(0) + "\n" + "Segundo as previsões do algoritmo o mercado  está bem  FAVORÁVEL, mas o clima não ajuda, portanto não é aconselhável fazer plantação devido o clima que traz grandes riscos.");

                } else if (Objects.equals(dados.get(2), "Bom")) {
                    sugestaoTxt.setText("Local: " + dados.get(0) + "\n" + "Segundo as previsões do algoritmo o mercado  está bem FAVORÁVEL e o clima está bom,  portanto  é aconselhável fazer plantação EM MÉDIA ESCALA para a cultura: " + dados.get(3) + ".");

                } else if (Objects.equals(dados.get(2), "Ótimo")) {
                    sugestaoTxt.setText("Local: " + dados.get(0) + "\n" + "Segundo as previsões do algoritmo o mercado  está bem FAVORÁVEL e oclima está ótimo, portanto  é aconselhável fazer plantação EM GRANDE ESCALA para a cultura: " + dados.get(3) + ".");
                }

            } else if (Objects.equals(dados.get(1), "Ótimo")) {

                if (Objects.equals(dados.get(2), "Ruim")) {
                    sugestaoTxt.setText("Local: " + dados.get(0) + "\n" + "Segundo as previsões do algoritmo o mercado  está muito FAVORÁVEL, mas o clima não ajuda, portanto não é aconselhável fazer plantação devido o clima que traz grandes riscos.");

                } else if (Objects.equals(dados.get(2), "Médio")) {
                    sugestaoTxt.setText("Local: " + dados.get(0) + "\n" + "Segundo as previsões do algoritmo o mercado  está muito  FAVORÁVEL, mas o clima não ajuda, portanto não é aconselhável fazer plantação devido o clima que traz riscos.");

                } else if (Objects.equals(dados.get(2), "Bom")) {
                    sugestaoTxt.setText("Local: " + dados.get(0) + "\n" + "Segundo as previsões do algoritmo o mercado  está muito FAVORÁVEL e o clima está bom,  portanto  é aconselhável fazer plantação EM MÉDIA ESCALA para a cultura: " + dados.get(3) + ".");

                } else if (Objects.equals(dados.get(2), "Ótimo")) {
                    sugestaoTxt.setText("Local: " + dados.get(0) + "\n" + "Segundo as previsões do algoritmo o mercado  está muito FAVORÁVEL e oclima está ótimo, portanto  é aconselhável fazer plantação EM GRANDE ESCALA para a cultura: " + dados.get(3) + ".");
                }
            }
        } else if (dados.get(0).equals("Amazonas")) {
            if (Objects.equals(dados.get(1), "Ruim")) {

                if (Objects.equals(dados.get(2), "Ruim")) {
                    sugestaoTxt.setText("Local: " + dados.get(0) + "\n" + "Segundo as previsões do algoritmo o mercado não está nada FAVORÁVEL, nem o clima, portanto não é aconselhável fazer plantação devido o clima e o mercado que trazem grandes riscos.");
                } else if (Objects.equals(dados.get(2), "Médio")) {
                    sugestaoTxt.setText("Local: " + dados.get(0) + "\n" + "Segundo as previsões do algoritmo o mercado não está nada FAVORÁVEL, nem o clima, portanto não é aconselhável fazer plantação devido o clima e o mercado que trazem grandes riscos.");

                } else if (Objects.equals(dados.get(2), "Bom")) {
                    sugestaoTxt.setText("Local: " + dados.get(0) + "\n" + "Segundo as previsões do algoritmo o mercado não está nada FAVORÁVEL, mas o clima está,  portanto  é aconselhável fazer plantação EM MÉDIA ESCALA para a cultura: " + dados.get(3) + " caso deseje estocar para vender posteriormente.");

                } else if (Objects.equals(dados.get(2), "Ótimo")) {
                    sugestaoTxt.setText("Local: " + dados.get(0) + "\n" + "Segundo as previsões do algoritmo o mercado não está nada FAVORÁVEL, mas clima não está, portanto  é aconselhável fazer plantação EM MÉDIA ESCALA: " + dados.get(3) + " caso deseje estocar para vender posteriormente.");
                }

            } else if (Objects.equals(dados.get(1), "Médio")) {

                if (Objects.equals(dados.get(2), "Ruim")) {
                    sugestaoTxt.setText("Local: " + dados.get(0) + "\n" + "Segundo as previsões do algoritmo o mercado  está pouco FAVORÁVEL e o clima não ajuda, portanto não é aconselhável fazer plantação devido o clima e o mercado que trazem grandes riscos.");
                } else if (Objects.equals(dados.get(2), "Médio")) {
                    sugestaoTxt.setText("Local: " + dados.get(0) + "\n" + "Segundo as previsões do algoritmo o mercado  está pouco FAVORÁVEL e o clima não ajuda, portanto não é aconselhável fazer plantação devido o clima e o mercado que trazem grandes riscos.");

                } else if (Objects.equals(dados.get(2), "Bom")) {
                    sugestaoTxt.setText("Local: " + dados.get(0) + "\n" + "Segundo as previsões do algoritmo o mercado  está pouco FAVORÁVEL , mas o clima está bom,  portanto  é aconselhável fazer plantação EM MÉDIA ESCALA para a cultura: " + dados.get(3) + " caso deseje estocar para vender posteriormente.");

                } else if (Objects.equals(dados.get(2), "Ótimo")) {
                    sugestaoTxt.setText("Local: " + dados.get(0) + "\n" + "Segundo as previsões do algoritmo o mercado  está pouco FAVORÁVEL, mas clima está ótimo, portanto  é aconselhável fazer plantação EM MÉDIA ESCALA para a cultura: " + dados.get(3) + " caso deseje estocar para vender posteriormente.");
                }

            } else if (Objects.equals(dados.get(1), "Bom")) {

                if (Objects.equals(dados.get(2), "Ruim")) {
                    sugestaoTxt.setText("Local: " + dados.get(0) + "\n" + "Segundo as previsões do algoritmo o mercado  está bem FAVORÁVEL, mas o clima não ajuda, portanto não é aconselhável fazer plantação devido o clima que traz grandes riscos.");

                } else if (Objects.equals(dados.get(2), "Médio")) {
                    sugestaoTxt.setText("Local: " + dados.get(0) + "\n" + "Segundo as previsões do algoritmo o mercado  está bem  FAVORÁVEL, mas o clima não ajuda, portanto não é aconselhável fazer plantação devido o clima que traz grandes riscos.");

                } else if (Objects.equals(dados.get(2), "Bom")) {
                    sugestaoTxt.setText("Local: " + dados.get(0) + "\n" + "Segundo as previsões do algoritmo o mercado  está bem FAVORÁVEL e o clima está bom,  portanto  é aconselhável fazer plantação EM MÉDIA ESCALA para a cultura: " + dados.get(3) + ".");

                } else if (Objects.equals(dados.get(2), "Ótimo")) {
                    sugestaoTxt.setText("Local: " + dados.get(0) + "\n" + "Segundo as previsões do algoritmo o mercado  está bem FAVORÁVEL e oclima está ótimo, portanto  é aconselhável fazer plantação EM GRANDE ESCALA para a cultura: " + dados.get(3) + ".");
                }

            } else if (Objects.equals(dados.get(1), "Ótimo")) {

                if (Objects.equals(dados.get(2), "Ruim")) {
                    sugestaoTxt.setText("Local: " + dados.get(0) + "\n" + "Segundo as previsões do algoritmo o mercado  está muito FAVORÁVEL, mas o clima não ajuda, portanto não é aconselhável fazer plantação devido o clima que traz grandes riscos.");

                } else if (Objects.equals(dados.get(2), "Médio")) {
                    sugestaoTxt.setText("Local: " + dados.get(0) + "\n" + "Segundo as previsões do algoritmo o mercado  está muito  FAVORÁVEL, mas o clima não ajuda, portanto não é aconselhável fazer plantação devido o clima que traz riscos.");

                } else if (Objects.equals(dados.get(2), "Bom")) {
                    sugestaoTxt.setText("Local: " + dados.get(0) + "\n" + "Segundo as previsões do algoritmo o mercado  está muito FAVORÁVEL e o clima está bom,  portanto  é aconselhável fazer plantação EM MÉDIA ESCALA para a cultura: " + dados.get(3) + ".");

                } else if (Objects.equals(dados.get(2), "Ótimo")) {
                    sugestaoTxt.setText("Local: " + dados.get(0) + "\n" + "Segundo as previsões do algoritmo o mercado  está muito FAVORÁVEL e oclima está ótimo, portanto  é aconselhável fazer plantação EM GRANDE ESCALA para a cultura: " + dados.get(3) + ".");
                }
            }
        } else {
            sugestaoTxt.setText("Previsão ainda não calculada para: " + dados.get(0));
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
