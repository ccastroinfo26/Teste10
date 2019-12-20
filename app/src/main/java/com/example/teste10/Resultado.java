package com.example.teste10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Resultado extends AppCompatActivity {
    public TextView nomeCampo;
    public TextView emailCampo;
    public TextView dataNascCampo;
    public TextView telefoneCampo;
    public TextView mensagemCampo;
    public TextView senhaCampo;
    public TextView vontadeCampo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        Bundle bundle = getIntent().getExtras();
        if (bundle != null)
        {
            String nome = bundle.getString("nome");
            String email = bundle.getString("email");
            String dataNasc = bundle.getString("dataNasc");
            String telefone = bundle.getString("telefone");
            String mensagem = bundle.getString("mensagem");
            String senha = bundle.getString("senha");
            String vontade = bundle.getString("vontade");

            nomeCampo = findViewById(R.id.textViewNome);
            nomeCampo.setText(nome);

            emailCampo = findViewById(R.id.textViewEmail);
            emailCampo.setText(email);

            dataNascCampo = findViewById(R.id.textViewDataNasc);
            dataNascCampo.setText(dataNasc);

            telefoneCampo = findViewById(R.id.textViewTelefone);
            telefoneCampo.setText(telefone);

            mensagemCampo = findViewById(R.id.textViewMensagem);
            mensagemCampo.setText(mensagem);

            senhaCampo = findViewById(R.id.textViewSenha);
            senhaCampo.setText(senha);

            vontadeCampo = findViewById(R.id.textViewVontade);
            vontadeCampo.setText(vontade);
        }
    }
}
