package com.example.proyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Activitylunes extends AppCompatActivity {
    private ImageButton button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activitylunes);

    button = (ImageButton) findViewById(R.id.izquierda);
        button.setOnClickListener(new View.OnClickListener() {

        @Override
        public void onClick(View v) {
            openActivitydomingo();
        }
    });
    button = (ImageButton) findViewById(R.id.derecha);
        button.setOnClickListener(new View.OnClickListener() {

        @Override
        public void onClick(View v) {
            openActivitymartes();
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

    public void openActivitymartes() {
        Intent intent = new Intent(this, Activitymartes.class);
        startActivity(intent);

    }
    public void openActivitydomingo() {
        Intent intent = new Intent(this, Activitydomingo.class);
        startActivity(intent);

    }
    public void openMainActivity() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);

    }
}
