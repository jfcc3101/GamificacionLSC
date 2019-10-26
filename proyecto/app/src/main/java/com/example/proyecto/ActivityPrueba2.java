package com.example.proyecto;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.ImageButton;
import android.widget.RadioButton;

public class ActivityPrueba2 extends AppCompatActivity {
    private ImageButton button;
    //private String correcto = "Respuesta correcta"

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prueba2);


        button = (ImageButton) findViewById(R.id.derecha);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                openActivityPruebaI1();
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

    public void openActivityPruebaI1() {
        //if ((RadioButton) findViewById(R.id.B).isActivated()){

        //}
        Intent intent = new Intent(this, ActivityPruebaI1.class);
        startActivity(intent);

    }

    public void openMainActivity() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);

    }

}


