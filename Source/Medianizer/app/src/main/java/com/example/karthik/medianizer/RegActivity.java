package com.example.karthik.medianizer;

import android.app.Activity;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
/**
 * Created by karthik on 2/17/2017.
 */

public class RegActivity extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

    }

    public void onSignUp(View v)
    {
        if(v.getId() == R.id.Bsignupbutton)
        {
            EditText name = (EditText)findViewById(R.id.TFname);
            EditText email = (EditText)findViewById(R.id.TFemail);
            EditText uname = (EditText)findViewById(R.id.TFuname);
            EditText pass1 = (EditText)findViewById(R.id.TFpass1);
            EditText pass2 = (EditText)findViewById(R.id.TFpass2);

            String namestr =name.getText().toString();
            String emailstr =email.getText().toString();
            String unamestr =uname.getText().toString();
            String pass1str =pass1.getText().toString();
            String pass2str =pass2.getText().toString();

            if(!pass1str.endsWith(pass2str))
            {
                //pop msg
                Toast pass = Toast.makeText(RegActivity.this, "Password doen't match!", Toast.LENGTH_SHORT);
                pass.show();
            }
else
            {
                Intent i= new Intent(RegActivity.this,LoginActivity.class);
                startActivity(i);
            }
        }
    }
    public void onBack(View v){
        Intent i = new Intent(RegActivity.this, MainActivity.class);

        startActivity(i);
    }

}