package com.example.pizza_king;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText txtuser, txtpass;
    private Button btningresar;
    private TextView txtaccount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtuser = (EditText) findViewById(R.id.usuario);
        txtpass = (EditText) findViewById(R.id.contrasena);
        btningresar = (Button) findViewById(R.id.boton);
        txtaccount = (TextView) findViewById(R.id.crearCuenta);
    }

    public void enviar(View view) {
        String user = txtuser.getText().toString();
        String pass = txtpass.getText().toString();

        if (user.equals("vidal") && pass.equals("nuñez")) {
            Toast.makeText(getApplicationContext(), "Bienvenido: " + user, Toast.LENGTH_LONG).show();
            String usuario = null;
            Intent intent = new Intent(this,PrincipalActivity.class);
            intent.putExtra("usuario",user);
            startActivity(intent);
        } else {
            Toast.makeText(getApplicationContext(), "Usuario o contraseña incorrectos...", Toast.LENGTH_LONG).show();

        }

    }

    public void cuenta(View view) {

        Intent intent = new Intent(getApplicationContext(), RegisterActivity.class);
        startActivity(intent);
    }
}

