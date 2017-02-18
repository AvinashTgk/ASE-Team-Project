package com.example.karthik.medianizer;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ViewFlipper;




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



public class MainActivity2 extends AppCompatActivity implements View.OnClickListener {

    ViewFlipper viewFlipper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        viewFlipper = (ViewFlipper) this.findViewById(R.id.viewFlipper);
        viewFlipper.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        viewFlipper.startFlipping();
        viewFlipper.setFlipInterval(1000);
    }
    public void onLogout(View v)
    {
        Intent i = new Intent(MainActivity2.this, MainActivity.class);
        startActivity(i);
    }
    public void onMovie(View v)
    {
        Intent i = new Intent(MainActivity2.this, MovieActivity.class);
        startActivity(i);
    }
    public void onMusic(View v)
    {
        Intent i = new Intent(MainActivity2.this, MusicActivity.class);
        startActivity(i);
    }
    public void onBooks(View v)
    {
        Intent i = new Intent(MainActivity2.this, BooksActivity.class);
        startActivity(i);
    }


}