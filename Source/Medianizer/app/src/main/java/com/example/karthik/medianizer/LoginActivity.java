package com.example.karthik.medianizer;

/**
 * Created by karthik on 2/17/2017.
 */


import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

public class LoginActivity extends AppCompatActivity {

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    //private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        //client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }

    public void onLogin(View v) {

        if (v.getId() == R.id.Blogin) {

            Intent i = new Intent(LoginActivity.this, MainActivity2.class);
            startActivity(i);

            EditText a = (EditText) findViewById(R.id.TFusername);
            String str = a.getText().toString();
            if(str=="")
            {
                //pop msg
                Toast pass = Toast.makeText(LoginActivity.this, "Enter a valid username", Toast.LENGTH_SHORT);
                pass.show();
            }
            else if(str=="avinash@gmail.com")
            {
                /*Intent i = new Intent(LoginActivity.this, MainActivity2.class);
                startActivity(i);*/
            }

            //  i.putExtra("Username", str);


        }

    }
    public void onSign(View v) {
        Intent i = new Intent(LoginActivity.this, RegActivity.class);
        startActivity(i);



    }


}