package com.projeto.meda.meda;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;

/**
 * Created by oi on 29/08/2017.
 */

public class PessoaDao {
    private SQLiteDatabase db;
    private CreatBancoDados dbHelper;

    public PessoaDao(Context context) {
        dbHelper = new CreatBancoDados(context);
    }

    public ArrayList<Pessoa> getListaPessoas() {
        db = dbHelper.getReadableDatabase();
        ArrayList<Pessoa> pessoaArray = new ArrayList<>();
        String getPessoas = "SELECT * FROM " + CreatBancoDados.getNomeTabelaPessoa();

        try {
            Cursor cursor = db.rawQuery(getPessoas, null);

            if (cursor.moveToFirst()) {
                do {
                    Pessoa pessoa = new Pessoa();
                    pessoa.setId(cursor.getInt(0));
                    pessoa.setCpf(cursor.getLong(1));
                    pessoa.setNome(cursor.getString(2));
                    pessoa.setEmail(cursor.getString(3));
                    pessoa.setSenha(cursor.getString(4));
                    pessoaArray.add(pessoa);

                } while (cursor.moveToNext());
                cursor.close();
            }

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            db.close();
        }

        return pessoaArray;
    }

    public Pessoa getPessoa(Long cpf) {
        db = dbHelper.getReadableDatabase();

        Cursor cursor = db.query(CreatBancoDados.getNomeTabelaPessoa(), new String[]{CreatBancoDados.getColunaId(), CreatBancoDados.getColunaCpf(),
                        CreatBancoDados.getColunaNome(), CreatBancoDados.getColunaEmail(), CreatBancoDados.getColunaSenha()}, CreatBancoDados.getColunaCpf() + " = ?",
                new String[]{String.valueOf(cpf)}, null, null, null, null);

        if (cursor != null && cursor.moveToFirst()) {
            Pessoa pessoa = new Pessoa(cursor.getInt(0), cursor.getLong(1), cursor.getString(2),
                    cursor.getString(3), cursor.getString(4));
            cursor.close();
            db.close();
            return pessoa;
        } else {
            db.close();
            return null;
        }

    }
    public boolean insertPessoa(Pessoa pessoa) {
        db = dbHelper.getWritableDatabase();

        ContentValues valores = new ContentValues();
        valores.put(CreatBancoDados.getColunaCpf(), pessoa.getCpf());
        valores.put(CreatBancoDados.getColunaNome(), pessoa.getNome());
        valores.put(CreatBancoDados.getColunaEmail(), pessoa.getEmail());
        valores.put(CreatBancoDados.getColunaSenha(), pessoa.getSenha());
        db.insert(CreatBancoDados.getNomeTabelaPessoa(), null, valores);
        db.close();
        return true;
    }

    public boolean updatePessoa(Pessoa pessoa) {
        db = dbHelper.getWritableDatabase();
        String where = "cpf = '" + Long.toString(pessoa.getCpf()) + "'";
        ContentValues valores = new ContentValues();
        valores.put(CreatBancoDados.getColunaCpf(), pessoa.getCpf());
        valores.put(CreatBancoDados.getColunaNome(), pessoa.getNome());
        valores.put(CreatBancoDados.getColunaEmail(), pessoa.getEmail());
        valores.put(CreatBancoDados.getColunaSenha(), pessoa.getSenha());
        db.update(CreatBancoDados.getNomeTabelaPessoa(), valores, where, null);
        db.close();
        return true;
    }
    public boolean deleteTablePessoa() {
        String deletTable = "DROP TABLE IF EXISTS " + CreatBancoDados.getNomeTabelaPessoa();
        db.execSQL(deletTable);
        db.close();
        return true;
    }

    public boolean deletePessoa(Pessoa pessoa) {
        String deletePessoa = "cpf = '" + Long.toString(pessoa.getCpf()) + "'";
        db.delete(CreatBancoDados.getNomeTabelaPessoa(), deletePessoa, null);
        db.close();
        return true;
    }
}
