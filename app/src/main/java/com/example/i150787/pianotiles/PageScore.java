package com.example.i150787.pianotiles;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by i150787 on 07/11/2016.
 */
public class PageScore extends AppCompatActivity {

    LinearLayout llScore1;
    LinearLayout llScore2;
    LinearLayout llScore3;
    LinearLayout llScore4;
    LinearLayout llScore5;
    LinearLayout llScore6;
    LinearLayout llScore7;
    LinearLayout llScore8;
    LinearLayout llScore9;
    LinearLayout llScore10;
    LinearLayout llScore11;
    LinearLayout llScore12;
    List listeScores = new ArrayList();
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page_score);

        llScore1 = (LinearLayout) findViewById(R.id.llScore1);
        llScore2 = (LinearLayout) findViewById(R.id.llScore2);
        llScore3 = (LinearLayout) findViewById(R.id.llScore3);
        llScore4 = (LinearLayout) findViewById(R.id.llScore4);
        llScore5 = (LinearLayout) findViewById(R.id.llScore5);
        llScore6 = (LinearLayout) findViewById(R.id.llScore6);
        llScore7 = (LinearLayout) findViewById(R.id.llScore7);
        llScore8 = (LinearLayout) findViewById(R.id.llScore8);
        llScore9 = (LinearLayout) findViewById(R.id.llScore9);
        llScore10 = (LinearLayout) findViewById(R.id.llScore10);
        llScore11 = (LinearLayout) findViewById(R.id.llScore11);
        llScore12 = (LinearLayout) findViewById(R.id.llScore12);




    }
}
