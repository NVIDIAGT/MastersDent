package com.example.masterdent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class IniciarSesion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iniciar_sesion);

        Button irARegistro = findViewById(R.id.btnRegistarse);
        irARegistro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent o = new Intent(IniciarSesion.this, RegistroUsuario.class);
                startActivity(o);
            }
        });
        Button EstardentrodelAPP = findViewById(R.id.btnEntrar);
        EstardentrodelAPP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent o = new Intent(IniciarSesion.this, MainActivity.class);
                startActivity(o);
            }
        });
        //TXT Ir a recueprar contraseña
        TextView txtRecuperarContraseña = this.findViewById(R.id.txtRecuperarContraseña);
        txtRecuperarContraseña.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick (View v){
                Intent o = new Intent(IniciarSesion.this, RecuperarContrasenna.class);
                startActivity(o);
            }
        });
        //TXT Ir a recueprar contraseña
        }
    }

