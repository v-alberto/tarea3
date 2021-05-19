package com.example.pizza_king;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class PrincipalActivity extends AppCompatActivity {
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        tv = (TextView) findViewById(R.id.idVar);

        Bundle extras = getIntent().getExtras();
        String men = extras.getString("usuario");
        tv.setText(men);
    }
}