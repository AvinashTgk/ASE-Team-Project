package com.example.sirisha.mymedianizer;

/**
 * Created by Sirisha on 3/13/17.
 */

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.speech.RecognizerIntent;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ViewFlipper;
import android.widget.AdapterView.OnItemSelectedListener;




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

import java.util.ArrayList;
import java.util.Locale;


public class MainActivity2 extends AppCompatActivity {

    ViewFlipper viewFlipper;
    Spinner spinner1;
    String[] SPINNERVALUES = {"Movies", "Music", "Books"};
    String SpinnerValue;
    Button btnsubmit;
    TextView voiceInput;
    TextView speakButton;
    private final int REQ_CODE_SPEECH_INPUT = 100;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        //   addListenerOnButton();
       spinner1 = (Spinner) findViewById(R.id.spinner1);
        spinner1.setOnItemSelectedListener(new OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                SpinnerValue = (String) spinner1.getSelectedItem();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        btnsubmit = (Button) findViewById(R.id.itemsearch);
        addListenerOnButton();

        voiceInput = (TextView) findViewById(R.id.voiceInput);
        speakButton = (TextView) findViewById(R.id.btnSpeak);

        speakButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                askSpeechInput();
            }
        });


    }
    private void askSpeechInput() {
        Intent intent = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
        intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL,
                RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);
        intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE, Locale.getDefault());
        intent.putExtra(RecognizerIntent.EXTRA_PROMPT,
                "Hi speak something");
        try {
            startActivityForResult(intent, REQ_CODE_SPEECH_INPUT);
        } catch (ActivityNotFoundException a) {

        }
    }

// Receiving speech input

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        switch (requestCode) {
            case REQ_CODE_SPEECH_INPUT: {
                if (resultCode == RESULT_OK && null != data) {

                    ArrayList<String> result = data
                            .getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
                    voiceInput.setText(result.get(0));
                    switch (result.get(0)) {

                        case "movie":
                            Intent intent = new Intent(MainActivity2.this, MovieMainActivity.class);
                            startActivity(intent);
                            break;

                        case "music":
                            intent = new Intent(MainActivity2.this, MusicActivity.class);
                            startActivity(intent);
                            break;

                        case "books":
                            intent = new Intent(MainActivity2.this, BooksListActivity.class);
                            startActivity(intent);
                            break;


                    }

                }
                break;
            }

        }
    }


    //@Override


    public void addListenerOnButton() {

        btnsubmit.setOnClickListener(new View.OnClickListener() {
            //@Override
            public void onClick(View v) {


                switch (SpinnerValue) {

                    case "Movies":
                        Intent intent = new Intent(MainActivity2.this, MovieMainActivity.class);
                        startActivity(intent);
                        break;

                    case "Music":
                        intent = new Intent(MainActivity2.this, MusicActivity.class);
                        startActivity(intent);
                        break;

                    case "Books":
                        intent = new Intent(MainActivity2.this, BooksListActivity.class);
                        startActivity(intent);
                        break;


                }
            }
        });
    }
public void onLogout(View v)
    {
        Intent i = new Intent(MainActivity2.this, MainActivity.class);
        startActivity(i);
    }


}

