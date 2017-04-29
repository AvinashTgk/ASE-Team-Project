package com.example.sirisha.mymedianizer;

/**
 * Created by Sirisha on 3/13/17.
 */

import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ViewFlipper;
import android.content.Intent;



public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    ViewFlipper viewFlipper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewFlipper = (ViewFlipper) this.findViewById(R.id.viewFlipper);
        viewFlipper.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        viewFlipper.startFlipping();
        viewFlipper.setFlipInterval(7000);
    }
    public  void onLogin(View v)
    {
        Intent i= new Intent(MainActivity.this,LoginActivity.class);
        startActivity(i);
    }
   /* public  void onSign(View v)
    {
        Intent i= new Intent(MainActivity.this,RegActivity.class);
        startActivity(i);
    }
   public  void onMovie(View v)
    {
        Intent i= new Intent(MainActivity.this,LoginActivity.class);
        startActivity(i);
    }
    public  void onMusic(View v)
    {
        Intent i= new Intent(MainActivity.this,LoginActivity.class);
        startActivity(i);
    }
    public  void onBooks(View v)
    {
        Intent i= new Intent(MainActivity.this,LoginActivity.class);
        startActivity(i);
    }
*/


}
