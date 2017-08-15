package com.projeto.meda.meda;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by oi on 18/07/2017.
 */
public class CreatBancoDados extends SQLiteOpenHelper {
    private static final int VERSAO_BANCO = 1;
    private static final String NOME_BANCO = "db_biblioteca";
    //VARIAVES DA TABELA PESSOA
    private static final String TABELA_PESSOA = "TB_PESSOA";
    private static final String COLUNA_ID = "ID";
    private static final String COLUNA_CPF = "CPF";
    private static final String COLUNA_NOME = "NOME";
    private static final String COLUNA_EMAIL = "EMAIL";
    private static final String COLUNA_SENHA = "SENHA";
    private static final String PATH_DB = "/data/user/0/package com.projeto.bookfast.bookfast/databases/" + NOME_BANCO;

    public CreatBancoDados(Context context) {
        super(context, NOME_BANCO, null, VERSAO_BANCO);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        //CRIA A TABELA PESSOA
        db.execSQL("create table " + TABELA_PESSOA + "(" + COLUNA_ID + " integer primary key autoincrement, "
                + COLUNA_CPF + " integer, " + COLUNA_NOME + " text not null, " + COLUNA_EMAIL + " text not null, "
                + COLUNA_SENHA + " text not null)");

        //ADD USER ADMIN
        db.execSQL("INSERT INTO " + TABELA_PESSOA + "(" + COLUNA_CPF + "," + COLUNA_NOME + ","
                + COLUNA_EMAIL + "," + COLUNA_SENHA +
                ") VALUES('19928810303', 'admin', 'admin@email.com', 'admin')");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // logica pra atualiza db
        db.execSQL("DROP TABLE IF EXISTS" + TABELA_PESSOA);
        onCreate(db);
    }

    //GETS TABELA PESSOA E BANCO
    public static String getColunaId() {
        return COLUNA_ID;
    }

    public static String getColunaCpf() {
        return COLUNA_CPF;
    }

    public static String getColunaNome() {
        return COLUNA_NOME;
    }

    public static String getColunaEmail() {
        return COLUNA_EMAIL;
    }

    public static String getColunaSenha() {
        return COLUNA_SENHA;
    }

    public static String getNomeTabelaPessoa() {
        return TABELA_PESSOA;
    }

}
