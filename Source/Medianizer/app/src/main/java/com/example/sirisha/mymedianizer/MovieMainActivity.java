package com.example.sirisha.mymedianizer;

import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MovieMainActivity extends AppCompatActivity {

    EditText searchMovie;
    String movieName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_main);
        searchMovie = (EditText) findViewById(R.id.editText);

        setTitle("Medianizer");
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        getSupportActionBar().setIcon(R.mipmap.ic_launcher);
    }



    public void searchPressed(View v) {
        movieName = searchMovie.getText().toString().trim();

      /*  if (!isConnected1()) {
            Toast.makeText(MainActivity.this, "No Internet Connection", Toast.LENGTH_SHORT).show();
        } else {*/
        if (movieName.equals("")) {
            Toast.makeText(MovieMainActivity.this, "Please enter a movie name", Toast.LENGTH_SHORT).show();
        } else {

            Intent i = new Intent(this, MovieActivity.class);
            i.putExtra("movie_key", movieName);
            finish();
            startActivity(i);

        }
        // }
    }




    public boolean isConnected1() {
        ConnectivityManager cm = (ConnectivityManager) getSystemService(CONNECTIVITY_SERVICE);
        NetworkInfo network = cm.getActiveNetworkInfo();
        if (network != null && network.isConnected()) {
            return true;
        }
        return false;
    }


}
