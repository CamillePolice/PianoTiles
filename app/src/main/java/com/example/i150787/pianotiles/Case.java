package com.example.i150787.pianotiles;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Canvas;
import android.graphics.Color;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import static android.R.attr.action;

/**
 * Created by i150787 on 04/11/2016.
 */
public class Case {

    public MainActivity context;
    public Button b;
    public boolean note;
    public int color;

    public Case(MainActivity context, boolean note, int color) {
        this.context = context;
        this.note = note;
        b = new Button(context);
        b.setBackgroundColor(color);
        if(note)
            b.setOnTouchListener(new View.OnTouchListener() {
                @Override
                public boolean onTouch(View view, MotionEvent motionEvent) {
                    MainActivity main = ((MainActivity) view.getContext());
                    if(motionEvent.getAction()==MotionEvent.ACTION_UP) {
                        if(main.lignesCases.isEmpty())
                            main.finish();
                        else
                            main.lignesCases.removeFirst();
                            main.updateLines();
                    }
                    return true;
                }
            });
        else
            b.setOnTouchListener(new View.OnTouchListener() {
                @Override
                public boolean onTouch(View view, MotionEvent motionEvent) {
                    MainActivity main = ((MainActivity) view.getContext());
                    if(motionEvent.getAction()==MotionEvent.ACTION_UP) {
                        ((Button)view).setBackgroundColor(Color.RED);
                        try {
                            Thread.sleep(500);
                        }
                        catch(InterruptedException e) {}
                        ((MainActivity)view.getContext()).finish();
                    }
                    return true;
                }
            });
        b.setClickable(false);
    }

    public Case(MainActivity context, boolean note, int color, String fin) {
        this.context = context;
        this.note = note;
        b = new Button(context);
        b.setBackgroundColor(color);
        if(note)
            b.setOnTouchListener(new View.OnTouchListener() {
                @Override
                public boolean onTouch(View view, MotionEvent motionEvent) {
                    MainActivity main = ((MainActivity) view.getContext());
                    if(motionEvent.getAction()==MotionEvent.ACTION_UP) {
                        alertDialog();
                        Log.d("CC", "CC");
                    }
                    return true;
                }
            });
        else
        b.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                MainActivity main = ((MainActivity) view.getContext());
                if(motionEvent.getAction()==MotionEvent.ACTION_UP) {
                    ((Button)view).setBackgroundColor(Color.RED);
                try {
                    Thread.sleep(500);
                }
                catch(InterruptedException e) {}
                    ((MainActivity)view.getContext()).finish();
                }
                return true;
            }
        });
        b.setClickable(false);
    }

    public Button getButton() {
        return b;
    }

    public void setNote(boolean note) {
        this.note = note;
    }

    public boolean getNote() {
        return note;
    }

    public void setColor(int color) {
        this.color = color;
    }



    public void verifButton(Case c) {

        if(c.getNote() == false) {
            b.setText("False");
        }
        else {
            b.setText("True");
        }
    }

    private void alertDialog() {
        AlertDialog.Builder messageFin = new AlertDialog.Builder(context);
        messageFin.setTitle("Bien jouer, vous avez gagné !");
        messageFin.setPositiveButton("Retour au menu principal", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                PageAccueil pAccueil = new PageAccueil();
                pAccueil.ouvrirPageAccueil();
            }
        });
        messageFin.setNegativeButton("Rejouer", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                PageAccueil pAccueil = new PageAccueil();
                pAccueil.ouvrirMainActivity();
            }
        });
        Log.d("SALUT", "PQ CA MARCHE PAS");
        AlertDialog alertDialog = messageFin.create();
        alertDialog.show();
    }
}
