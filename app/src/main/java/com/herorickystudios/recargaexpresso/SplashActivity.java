package com.herorickystudios.recargaexpresso;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

//Programado por HeroRickyGames

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        //Esconde a action Bar
        getSupportActionBar().hide();

        //Esse metodo faz com que tal coisa aconteça em 5 segundos
        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {

                //Sai da tela de Splash e vai para a tela da WebView do Android exibir alguma pagina setada ou configurada pelo desenvolvedor
                Intent intent = new Intent(SplashActivity.this, ActivityWeb.class);
                startActivity(intent);

            }
        }, 5000);



    }
}