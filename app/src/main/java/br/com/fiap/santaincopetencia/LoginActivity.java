package br.com.fiap.santaincopetencia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    private EditText etUsuario;
    private EditText etSenha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        etUsuario = (EditText)findViewById(R.id.etUsuario);
        etSenha = (EditText)findViewById(R.id.etSenha);
    }

    public void logar(View v){
        Intent i = new Intent(this, OrderActivity.class);
        startActivity(i);
    }
}
