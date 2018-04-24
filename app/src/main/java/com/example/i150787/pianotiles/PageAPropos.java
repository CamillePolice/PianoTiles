package com.example.i150787.pianotiles;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.widget.TextViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Created by i150787 on 07/11/2016.
 */
public class PageAPropos extends AppCompatActivity {

    RelativeLayout fenetreAPropos;
    RelativeLayout rl4;
    RelativeLayout rl3;
    RelativeLayout rl2;
    RelativeLayout rl1;

    TextView reglesJeu;
    TextView titreAppli;

    ImageView yoda;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_apropos);

        fenetreAPropos = (RelativeLayout) findViewById(R.id.fenetreAPropos);
        rl4 = (RelativeLayout) findViewById(R.id.rl4);
        rl3 = (RelativeLayout) findViewById(R.id.rl3);
        rl2 = (RelativeLayout) findViewById(R.id.rl2);
        rl1 = (RelativeLayout) findViewById(R.id.rl1);

        titreAppli = (TextView) findViewById(R.id.titreAppli);
        reglesJeu = (TextView) findViewById(R.id.reglesJeu);

        yoda = (ImageView) findViewById(R.id.yoda);




    }
}
