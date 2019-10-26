package com.example.proyecto;
import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
    private ImageButton button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (ImageButton) findViewById(R.id.numeros);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                openActivityuno();
            }
        });
        button = (ImageButton) findViewById(R.id.abecedario);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                openActivityabecedario();
            }
        });
        button = (ImageButton) findViewById(R.id.preguntas);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                openActivityfamilia();
            }
        });
        button = (ImageButton) findViewById(R.id.dias);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                openActivitylunes();
            }
        });
        button = (ImageButton) findViewById(R.id.meses);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                openActivityenero();
            }
        });
        button = (ImageButton) findViewById(R.id.colores);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                openActivitycolores();
            }
        });
        button = (ImageButton) findViewById(R.id.preguntas);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                openActivityPrueba2();
            }
        });

    }

    public void openActivityuno() {
        Intent intent = new Intent(this, Activityuno.class);
        startActivity(intent);

    }
    public void openActivityabecedario() {
        Intent intent = new Intent(this, Activityabecedario.class);
        startActivity(intent);

    }
    public void openActivityfamilia() {
        Intent intent = new Intent(this, Activityfamilia.class);
        startActivity(intent);

    }
    public void openActivitylunes() {
        Intent intent = new Intent(this, Activitylunes.class);
        startActivity(intent);

    }
    public void openActivityenero() {
        Intent intent = new Intent(this, Activityenero.class);
        startActivity(intent);

    }
    public void openActivitycolores() {
        Intent intent = new Intent(this, Activitycolores.class);
        startActivity(intent);

    }
    public void openActivityPrueba2() {
        Intent intent = new Intent(this, ActivityPrueba2.class);
        startActivity(intent);
    }
}
