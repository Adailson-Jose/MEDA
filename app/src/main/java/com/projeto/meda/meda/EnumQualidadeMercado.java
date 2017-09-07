package com.projeto.meda.meda;

/**
 * Created by oi on 07/09/2017.
 */

public enum EnumQualidadeMercado {
    Ruim("Ruim"), Medio("Médio"), Bom("Bom"), Otimo("Ótimo");
    private String descricao;

    EnumQualidadeMercado(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public static String[] listaEnumMercado() {
        EnumQualidadeMercado[] listaMercado = EnumQualidadeMercado.values();
        String[] lista = new String[listaMercado.length];
        for (int i = 0; i < listaMercado.length; i++) {
            lista[i] = listaMercado[i].getDescricao();
        }
        return lista;
    }
}

