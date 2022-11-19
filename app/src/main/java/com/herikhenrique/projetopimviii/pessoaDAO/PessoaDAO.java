package com.herikhenrique.projetopimviii.pessoaDAO;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import com.herikhenrique.projetopimviii.Pessoa;
import com.herikhenrique.projetopimviii.conexao.Conexao;

public class PessoaDAO {

    private Conexao conexao;
    private SQLiteDatabase banco;

    public PessoaDAO(Context context){
        conexao = new Conexao(context);
        banco = conexao.getWritableDatabase();
    }

    public long inserir(Pessoa pessoa){
        ContentValues values = new ContentValues();
        values.put("nome", pessoa.getNome());
        values.put("cpf", pessoa.getCpf());
        values.put("endereco", pessoa.getEndereco());
        values.put("telefone", pessoa.getTelefone());
        return banco.insert("pessoa", null, values);
    }
}
