package com.projeto.meda.meda;

/**
 * Created by oi on 07/09/2017.
 */

public enum EnumCultura {
    Arroz("Arroz"), Milho("Milho"), Sorgo("Sorgo"), Trigo("Trigo"),
    Batata("Batata"), Batata_doce("Batata-doce"), Cenoura("Cenoura"), Inhame("Inhame"),
    Mandioca("Mandioca"), Carité("Carité"), Cártamo("Cártamo"), Girassol("Girassol"),
    Sésamo("Sésamo"), Abóbora("Abóbora"), Alface("Alface"), Alho_porro("Alho-porro"),
    Amaranto("Amaranto"), Cacon("Cacon"), Colza("Colza"), Couve_repolho("Couve repolho"),
    Couve_verde("Couve verde"), Espinafre("Espinafre"), Feijão("Feijão"), Matabala("Matabala"),
    Mostarda("Mostarda"), Beringela("Beringela"), Melão("Melão"), Pepino("Pepino"),
    Quiabo("Quiabo"), Tomate("Tomate"), Alho("Alho"), Cana_de_açúcar("Cana-de-açúcar"),
    Cebolinho("Cebolinho "), Coentro("Coentro"), Açafrão_da_terra("Açafrão-da-terra"), Fenacho("Fenacho"),
    Malagueta("Malagueta"), Manjericão("Manjericão "), Tabaco("Tabaco"), Amendoim("Amendoim"),
    Ervilha("Ervilha"), Fava("Fava"), SGrão_de_bicoorgo("Grão-de-bico"), Soja("Soja"),
    Abacate("Abacate"), Abacaxi("Abacaxi"), Anona("Anona"), Banana_pão("Banana-pão"),
    Cacaueiro("Cacaueiro"), Cafézeiro("Cafézeiro"), Cajueiro("Cajueiro"), Citrinos("Citrinos"),
    Coqueiro("Coqueiro"), Fruta_pão("Fruta-pão"), Goiabeira("Goiabeira"), Jaqueira("Jaqueira"),
    Mangueira("Mangueira"), Maracujá("Maracujá"), Papaieira("Papaieira"), Tamarindeiro("Tamarindeiro"),
    Fruta_pinha("Fruta-pinha");

    private String descricao;

    EnumCultura(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public static String[] listaEnumCultura() {
        EnumCultura[] listaCultura = EnumCultura.values();
        String[] lista = new String[listaCultura.length];
        for (int i = 0; i < listaCultura.length; i++) {
            lista[i] = listaCultura[i].getDescricao();
        }
        return lista;
    }
}

