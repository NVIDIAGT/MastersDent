package com.example.masterdent;


import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import android.widget.TextView;


public class RegistroUsuario extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro_usuario);

        //TXT Iniciar sesion
        TextView txtTerminos = this.findViewById(R.id.txtIniciarSesion);
        txtTerminos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent o = new Intent(RegistroUsuario.this, IniciarSesion.class);
                startActivity(o);
            }
        });
        //TXT Iniciar sesion
        //TXT Ir a recueprar contraseña
        TextView txtRecuperarContraseña = this.findViewById(R.id.txtRecuperarContraseña);
        txtRecuperarContraseña.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick (View v){
                Intent o = new Intent(RegistroUsuario.this, RecuperarContrasenna.class);
                startActivity(o);
            }
        });
        //TXT Ir a recueprar contraseña

    }

}



