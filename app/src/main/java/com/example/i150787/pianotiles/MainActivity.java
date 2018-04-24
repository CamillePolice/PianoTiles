package com.example.i150787.pianotiles;

import android.graphics.Color;
import android.net.Uri;
import android.net.wifi.p2p.WifiP2pManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

import java.util.LinkedList;
import java.util.Timer;

public class MainActivity extends AppCompatActivity {

    LinearLayout fenetre;
    LinearLayout[] lls = new LinearLayout[4];
    boolean reussi = true;
    LinkedList<LigneCases> lignesCases = new LinkedList<LigneCases>();
    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fenetre = (LinearLayout) findViewById(R.id.fenetre);
        lls[3] = (LinearLayout) findViewById(R.id.ll4);
        lls[2] = (LinearLayout) findViewById(R.id.ll3);
        lls[1] = (LinearLayout) findViewById(R.id.ll2);
        lls[0] = (LinearLayout) findViewById(R.id.ll1);

        initJeuFacile();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }


    public void initJeuFacile() {

        for (int i = 0; i < 16; i++) {
            if (i < 9)
                lignesCases.addLast(new LigneCases(this));
            if (i == 9)
                lignesCases.addLast(new LigneCases(this, "red", "slt"));
            if (i > 11)
                lignesCases.addLast(new LigneCases(this, "green"));
        }
        updateLines();
    }

    public void updateLines() {
        Timer timer = new Timer();

        for (int i = 0; i < 4; i++) {
            //Log.d("pointeur", lls[i].toString());
            lls[i].removeAllViews();
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                //Log.d("ll", lls[i].toString());
                //Log.d("ligneCases", lignesCases.get(i).toString());
                //Log.d("case", lignesCases.get(i).tabCases[j].toString());
                lls[i].addView(lignesCases.get(i).tabCases[j].getButton(), new LinearLayout.LayoutParams(
                        LinearLayout.LayoutParams.WRAP_CONTENT,
                        LinearLayout.LayoutParams.MATCH_PARENT, 1f)
                );
            }
            lignesCases.getFirst().tabCases[i].getButton().setClickable(true);
        }
    }

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    public Action getIndexApiAction() {
        Thing object = new Thing.Builder()
                .setName("Main Page") // TODO: Define a title for the content shown.
                // TODO: Make sure this auto-generated URL is correct.
                .setUrl(Uri.parse("http://[ENTER-YOUR-URL-HERE]"))
                .build();
        return new Action.Builder(Action.TYPE_VIEW)
                .setObject(object)
                .setActionStatus(Action.STATUS_TYPE_COMPLETED)
                .build();
    }

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        AppIndex.AppIndexApi.start(client, getIndexApiAction());
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        AppIndex.AppIndexApi.end(client, getIndexApiAction());
        client.disconnect();
    }
}
