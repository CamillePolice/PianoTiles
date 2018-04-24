package com.example.i150787.pianotiles;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

/**
 * Created by i150787 on 04/11/2016.
 */
public class LigneCases {

    public Case tabCases[] = new Case[4];
    public int noteVraie;

    public LigneCases(MainActivity context) {
        noteVraie = (int) (Math.random() * 4);

        for(int i = 0 ; i<4 ; i++) {
            if(i == noteVraie)
                tabCases[i] = new Case(context, true, Color.BLACK);
            else
                tabCases[i] = new Case(context, false, Color.WHITE);
        }

    }

    public LigneCases(MainActivity context, String color) {
        for(int i = 0 ; i<4 ; i++) {
            tabCases[i] = new Case(context, true, Color.GREEN);
        }
    }

    public LigneCases(MainActivity context, String color, String slt) {
        noteVraie = (int) (Math.random() * 4);

        for(int i = 0 ; i<4 ; i++) {
            if(i == noteVraie)
                tabCases[i] = new Case(context, true, Color.BLACK);
            else
                tabCases[i] = new Case(context, false, Color.WHITE);
        }
    }




    public int getNoteVraie() {
        return noteVraie;
    }

    public Case getTabCases(int i) {
        return tabCases[i];
    }


}
