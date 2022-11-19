package com.herikhenrique.projetopimviii.conexao;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class Conexao extends SQLiteOpenHelper {

    private static final String name = "banco.db";
    private static final int version = 1;
    public Conexao(Context context){ //, String name, SQLiteDatabase.CursorFactory factory, int version
        super(context, name, null, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table aluno(id integer primary key autoincrement, " +
                "nome varchar(50), cpf varchar(50), endereco varchar(100), telefone varchar(50) )");
        db.execSQL("create table endereco(id integer primary key autoincrement, " +
                "logradouro varchar(100), numero int(5), cep int(10), bairro varchar(50), cidade varchar(50)," +
                "estado varchar(50) )");

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }

}
