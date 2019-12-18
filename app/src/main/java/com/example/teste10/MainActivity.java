package com.example.teste10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void cadastro(View view){

        Intent intent = new Intent(this, Cadastro.class);
        startActivity(intent);
    }
    //Spinner spinner = {Spinner} findViewById
}
