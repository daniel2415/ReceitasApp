package br.com.olimpiodev.receitasapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button botaoBolo = findViewById(R.id.botao_bolo);
        botaoBolo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentBolo = new Intent(MainActivity.this, BoloActivity.class);
                startActivity(intentBolo);
            }
        });

        Button botaoTorta = findViewById(R.id.botao_torta);
        botaoTorta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentTorta = new Intent(MainActivity.this, TortaActivity.class);
                startActivity(intentTorta);
            }
        });

        Button botaoCookie = findViewById(R.id.botao_cookie);
        botaoCookie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentCookie = new Intent(MainActivity.this, CookieActivity.class);
                startActivity(intentCookie);
            }
        });

        Button botaoSorvete = findViewById(R.id.botao_sorvete);
        botaoSorvete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentSorvete = new Intent(MainActivity.this, SorveteActivity.class);
                startActivity(intentSorvete);
            }
        });
    }
}
