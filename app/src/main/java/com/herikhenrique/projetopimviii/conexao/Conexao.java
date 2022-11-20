package com.herikhenrique.projetopimviii.conexao;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class Conexao extends SQLiteOpenHelper {

    private static final String name = "bancoPIM.db";
    private static final int version = 1;
    public Conexao(Context context){ //, String name, SQLiteDatabase.CursorFactory factory, int version
        super(context, name, null, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table pessoa(id integer primary key autoincrement, " +
                "nome varchar(50), cpf varchar(50), endereco varchar(100), telefone varchar(50)," +
                "FOREIGN KEY(endereco) REFERENCES endereco(endereco), " +
                "FOREIGN KEY(telefone) REFERENCES telefones(telefone))");
        db.execSQL("create table endereco(id integer primary key autoincrement, " +
                "logradouro varchar(100), numero varchar(5), cep varchar(10), bairro varchar(50), cidade varchar(50)," +
                "estado varchar(50) )");
        db.execSQL("CREATE TABLE telefone(id integer PRIMARY KEY AUTOINCREMENT, " +
                "numero varchar(12), ddd varchar(2))");
        db.execSQL("CREATE TABLE tipoTelefone(id integer PRIMARY KEY AUTOINCREMENT, tipo varchar(50))");

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }

}
