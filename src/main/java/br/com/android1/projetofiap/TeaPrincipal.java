package br.com.android1.projetofiap;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class TeaPrincipal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tea_principal);

        getSupportActionBar().hide();
    }
}