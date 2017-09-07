package com.projeto.meda.meda;

/**
 * Created by oi on 07/09/2017.
 */


public enum EnumRegiao {
    Amazonas("Amazonas"), Roraima("Roraima"), Amapá("Amapá"),
    Pará("Pará"), Tocantins("Tocantins"), Rondônia("Rondônia"), Acre("Acre"),
    Maranhão("Maranhão "), Piauí("Piauí"), Ceará("Ceará"),
    Rio_Grande_do_Norte("Rio Grande do Norte"), Pernambuco("Pernambuco"), Paraíba("Paraíba"), Sergipe("Sergipe"),
    Alagoas("Alagoas "), Bahia("Bahia "), Mato_Grosso("Mato Grosso"),
    Mato_Grosso_do_Sul("Mato Grosso do Sul"), Goiás("Goiás "), São_Paulo("São Paulo"), Rio_de_Janeiro(" Rio de Janeiro"),
    Espírito_Santo("Espírito Santo "), Minas_Gerais("Minas Gerais"), Paraná(" Paraná"),
    Rio_Grande_do_Sul("Rio Grande do Sul"), Santa_Catarina("Santa Catarina ");
    private String descricao;

    EnumRegiao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public static String[] listaEnumRegiao() {
        EnumRegiao[] listaRegiao = EnumRegiao.values();
        String[] lista = new String[listaRegiao.length];
        for (int i = 0; i < listaRegiao.length; i++) {
            lista[i] = listaRegiao[i].getDescricao();
        }
        return lista;
    }
}
