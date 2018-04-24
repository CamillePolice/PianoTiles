package com.example.i150787.pianotiles;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

/**
 * Created by i150787 on 07/11/2016.
 */
public class PageAccueil extends AppCompatActivity {

    public Button boutonJouer;
    public Button boutonQuitter;
    public ImageButton boutonScore;
    public ImageButton boutonAPropos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_accueil);
        boutonJouer = (Button) findViewById(R.id.boutonJouer);
        boutonQuitter = (Button) findViewById(R.id.boutonQuitter);
        boutonScore = (ImageButton) findViewById(R.id.boutonScore);
        boutonAPropos = (ImageButton) findViewById(R.id.boutonAPropos);

        boutonJouer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ouvrirMainActivity();
            }
        });

        boutonQuitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        boutonScore.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch(event.getAction()) {
                    // Pressed
                    case MotionEvent.ACTION_DOWN :
                        boutonScore.getBackground().setAlpha(160);
                        return true;

                    // Released
                    case MotionEvent.ACTION_UP :
                        boutonScore.getBackground().setAlpha(255);
                        return true;
                }
                return false;
            }
        });



        boutonAPropos.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch(event.getAction()) {
                    // Pressed
                case MotionEvent.ACTION_DOWN :
                    boutonAPropos.getBackground().setAlpha(160);
                    return true;

                    // Released
                    case MotionEvent.ACTION_UP :
                        boutonAPropos.getBackground().setAlpha(255);
                        ouvrirAPropos();
                        return true;
                }
                return false;
            }
        });

        boutonAPropos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ouvrirAPropos();
            }
        });

    }

    public void ouvrirScore(){
        Intent intent = new Intent(this, PageScore.class);
        startActivity(intent);
    }

    public void ouvrirAPropos() {
        Intent intent = new Intent(this, PageAPropos.class);
        startActivity(intent);
    }

    public void ouvrirPageAccueil() {
        Intent intent = new Intent(this, PageAccueil.class);
        startActivity(intent);
    }



    public void ouvrirMainActivity(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
