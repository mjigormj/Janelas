package br.com.etecia.teste_estilo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class JanelaDois_Activity extends AppCompatActivity {
    Button btnAbrirJanela03;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        
        super.onCreate(savedInstanceState);
        setContentView(R.layout.janela_dois_layaout);
        
        btnAbrirJanela03 = (Button) findViewById(R.id.btnAbrirJanela03);
        btnAbrirJanela03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),JanelaTres_Activity.class));
                finish();
            }
        });
    
    }
}
