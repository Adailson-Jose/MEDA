package com.projeto.meda.meda;

/**
 * Created by oi on 07/09/2017.
 */

public enum EnumQualidadeClima {
    Ruim("Ruim"), Medio("Médio"), Bom("Bom"), Otimo("Ótimo");

    private String descricao;

    EnumQualidadeClima(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public static String[] listaEnumClima() {
        EnumQualidadeClima[] listaClima = EnumQualidadeClima.values();
        String[] lista = new String[listaClima.length];
        for (int i = 0; i < listaClima.length; i++) {
            lista[i] = listaClima[i].getDescricao();
        }
        return lista;
    }
}




