package com.geovanedsilveira.netflixremake;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.ContextCompat;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MovieActivity extends AppCompatActivity {

    private TextView txtTitle;
    private TextView txtDesc;
    private TextView txtCast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie);

        txtTitle = findViewById(R.id.text_view_title);
        txtDesc = findViewById(R.id.text_view_desc);
        txtCast = findViewById(R.id.text_view_cast);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        if(getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_arrow_back_black_24dp);
            getSupportActionBar().setTitle(null);
        }

          LayerDrawable drawable = (LayerDrawable) ContextCompat.getDrawable(this, R.drawable.shadows);
        if (drawable != null) {
            Drawable movieCover = ContextCompat.getDrawable(this, R.drawable.movie_4);
            drawable.setDrawableByLayerId(R.id.cover_drawble, movieCover);
            ((ImageView) findViewById(R.id.image_view_cover)).setImageDrawable(drawable);
        }

        txtTitle.setText("Batman Begins");
        txtDesc.setText("O jovem Bruce Wayne cai em um poco e é atacado por morcegos.Bruce acorda de um pesadelo sobre" +
                " seu passado e descobre que é prisioneiro no Butão.Ele asdfasdfasdfasdfasdf");
        txtCast.setText(getString(R.string.cast, "Christian Bale" + ",Michael Cane" + ",Liam Neeson" +
                ",Katie Holmes" + ",Gary Oldman"));
    }
}
