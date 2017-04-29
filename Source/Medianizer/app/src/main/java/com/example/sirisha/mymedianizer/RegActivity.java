package com.example.sirisha.mymedianizer;

/**
 * Created by Sirisha on 3/13/17.
 */

import android.app.Activity;
import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

/**
 * Created by karthik on 2/17/2017.
 */

public class RegActivity extends Activity{
    private EditText textEmailAddress;
    private EditText textPassword;
    private FirebaseAuth firebaseAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        textEmailAddress = (EditText) findViewById(R.id.TFemail);
        textPassword = (EditText) findViewById(R.id.TFpass1);
        firebaseAuth = FirebaseAuth.getInstance();

    }

    public void onSignUp(View v)
    {
        if(v.getId() == R.id.Bsignupbutton) {
            EditText name = (EditText) findViewById(R.id.TFname);
            EditText email = (EditText) findViewById(R.id.TFemail);
            EditText uname = (EditText) findViewById(R.id.TFuname);
            EditText pass1 = (EditText) findViewById(R.id.TFpass1);
            EditText pass2 = (EditText) findViewById(R.id.TFpass2);

            String namestr = name.getText().toString();
            String emailstr = email.getText().toString();
            String unamestr = uname.getText().toString();
            String pass1str = pass1.getText().toString();
            String pass2str = pass2.getText().toString();

            if (!pass1str.endsWith(pass2str)) {
                //pop msg
                Toast pass = Toast.makeText(RegActivity.this, "Password doesn't match!", Toast.LENGTH_SHORT);
                pass.show();
            }
            else if (namestr.matches("")){
                Toast pass = Toast.makeText(RegActivity.this, "Please enter name", Toast.LENGTH_SHORT);
                pass.show();
            }
            else if (emailstr.matches("")){
                Toast pass = Toast.makeText(RegActivity.this, "Please enter email", Toast.LENGTH_SHORT);
                pass.show();
            }
            else if (unamestr.matches("")){
                Toast pass = Toast.makeText(RegActivity.this, "Please enter username", Toast.LENGTH_SHORT);
                pass.show();
            }
            else if (pass1str.matches("")){
                Toast pass = Toast.makeText(RegActivity.this, "Please enter password", Toast.LENGTH_SHORT);
                pass.show();
            }
            else if (pass2str.matches("")){
                Toast pass = Toast.makeText(RegActivity.this, "Please enter password to confirm", Toast.LENGTH_SHORT);
                pass.show();
            }
            else {


                final ProgressDialog progressDialog = ProgressDialog.show(RegActivity.this, "Please wait..", "Processing..", true);
                (firebaseAuth.createUserWithEmailAndPassword(textEmailAddress.getText().toString(), textPassword.getText().toString()))
                        .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {
                                progressDialog.dismiss();
                                if (task.isSuccessful()) {
                                    Toast.makeText(RegActivity.this, "Registration successfull", Toast.LENGTH_LONG).show();
                                    Intent i = new Intent(RegActivity.this, LoginActivity.class);
                                    startActivity(i);
                                } else {
                                    Log.e("ERROR", task.getException().toString());
                                    Toast.makeText(RegActivity.this, task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                                }
                            }
                        });
            }
        }
    }
    public void onBack(View v){
        Intent i = new Intent(RegActivity.this, MainActivity.class);

        startActivity(i);
    }

}
