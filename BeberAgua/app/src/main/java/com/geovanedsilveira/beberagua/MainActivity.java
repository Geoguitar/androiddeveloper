package com.geovanedsilveira.beberagua;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.i("TESTE","Hello world!");

        TextView txtTitle = findViewById(R.id.text_view_title);
        TextView txtSubtitle = findViewById(R.id.texte_view_subtitle);

        txtTitle.setText("Novo titulo do App");
        txtSubtitle.setText("Novo Subtitulo");

    }
}
