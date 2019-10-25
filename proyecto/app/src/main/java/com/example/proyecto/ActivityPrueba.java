package com.example.proyecto;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class ActivityPrueba extends AppCompatActivity {
    private ImageButton button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pregunta1);


        button = (ImageButton) findViewById(R.id.izquierda);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                openActivitydiez();
            }
        });
        button = (ImageButton) findViewById(R.id.derecha);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                openActivitydos();
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

    public void openActivitydos() {
        Intent intent = new Intent(this, Activitydos.class);
        startActivity(intent);

    }

    public void openActivitydiez() {
        Intent intent = new Intent(this, Activitydiez.class);
        startActivity(intent);

    }

    public void openMainActivity() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);

    }
}
