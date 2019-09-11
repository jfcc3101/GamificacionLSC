package com.example.proyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Activityviernes extends AppCompatActivity {
    private ImageButton button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activityviernes);
        button = (ImageButton) findViewById(R.id.derecha);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                openActivitysabado();
            }
        });
        button = (ImageButton) findViewById(R.id.izquierda);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                openActivityjueves();
            }
        });
        button = (ImageButton) findViewById(R.id.inicio);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                openMainActivity();
            }
        });



    }

    public void openActivitysabado() {
        Intent intent = new Intent(this, Activitysabado.class);
        startActivity(intent);

    }
    public void openActivityjueves() {
        Intent intent = new Intent(this, Activityjueves.class);
        startActivity(intent);

    }
    public void openMainActivity() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);

    }
}