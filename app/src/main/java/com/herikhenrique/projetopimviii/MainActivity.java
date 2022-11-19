package com.herikhenrique.projetopimviii;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.herikhenrique.projetopimviii.pessoaDAO.PessoaDAO;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void cadastrar(View view){
        Intent telaCadastro = new Intent(this, ActivityCadastro.class);
        startActivity(telaCadastro);
    }
}