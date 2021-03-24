package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btLogin = (Button) findViewById(R.id.btLogin);
        btLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView tLogin = (TextView) findViewById(R.id.tLogin);
                TextView tSenha = (TextView) findViewById(R.id.tSenha);
                String Login = tLogin.getText().toString();
                String Senha = tSenha.getText().toString();
                    if (Login.equals("Alvino") && Senha.equals("Alvino")) {
                    alert("Login Realizado com Sucesso");
                        abreSegundaActivity(v);
                     } else {
                    alert("Login ou Senha Incorretos");
                }
            }
        });

    }

    private void alert(String s) {
        Toast.makeText(this, s, Toast.LENGTH_LONG).show();
    }
    
    public void abreSegundaActivity(View View) {
        Intent intent = new Intent(this, SegundaActivity2.class);
        startActivity(intent);
    }

}

