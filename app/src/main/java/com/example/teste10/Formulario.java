package com.example.teste10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Formulario extends AppCompatActivity {
    public EditText nome;
    public EditText email;
    public EditText dataNasc;
    public EditText telefone;
    public EditText mensagem;
    public EditText senha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario);
    }
    public void telaResultado(View view) {
        nome = findViewById(R.id.nome);
        email = findViewById(R.id.email);
        dataNasc = findViewById(R.id.dataNascimento);
        telefone = findViewById(R.id.telefone);
        mensagem = findViewById(R.id.mensagemApresentacao);
        senha = findViewById(R.id.senha);

        String nomeTexto = nome.getText().toString();
        String emailTexto = email.getText().toString();
        String dataNascTexto = dataNasc.getText().toString();
        String telefoneTexto = telefone.getText().toString();
        String mensagemTexto = mensagem.getText().toString();
        String senhaTexto = senha.getText().toString();

        Intent intent = new Intent(this, Resultado.class);

        intent.putExtra("nome", nomeTexto);
        intent.putExtra("email", emailTexto);
        intent.putExtra("dataNasc",dataNascTexto);
        intent.putExtra("telefone",telefoneTexto);
        intent.putExtra("mensagem",mensagemTexto);
        intent.putExtra("senha", senhaTexto);

        startActivity(intent);
    }
}
