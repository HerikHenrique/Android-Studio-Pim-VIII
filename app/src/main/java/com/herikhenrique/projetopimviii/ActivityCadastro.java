package com.herikhenrique.projetopimviii;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.herikhenrique.projetopimviii.pessoaDAO.PessoaDAO;

public class ActivityCadastro extends AppCompatActivity {

    private EditText nomePessoa;
    private EditText cpf;
    private EditText endereco;
    private EditText telefone;
    private PessoaDAO dao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        nomePessoa = findViewById(R.id.nomePessoa);
        cpf = findViewById(R.id.cpf);
        endereco = findViewById(R.id.endereco);
        telefone = findViewById(R.id.telefone);
        dao = new PessoaDAO(this);
    }
    protected void salvar(View view){
        Pessoa pessoaInserida = new Pessoa();
        pessoaInserida.setNome(nomePessoa.getText().toString());
        pessoaInserida.setCpf(cpf.getText().toString());
        pessoaInserida.setEndereco(endereco.getText().toString());
        pessoaInserida.setTelefone(telefone.getText().toString());
        long id = dao.inserir(pessoaInserida);
        Toast.makeText(this, "Aluno inserido com id: " + id, Toast.LENGTH_SHORT).show();

    }
}