package com.example.masterdent;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.concurrent.TimeUnit;

public class Intro extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        Intent o = new Intent(this, IniciarSesion.class);
        //timer procesos que toman 5 minutos
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        startActivity(o);
        finish();
    }
}