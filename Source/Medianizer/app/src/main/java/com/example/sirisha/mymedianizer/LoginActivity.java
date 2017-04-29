package com.example.sirisha.mymedianizer;


/**
 * Created by Sirisha on 3/13/17.
 */


import android.app.ProgressDialog;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;


public class LoginActivity extends AppCompatActivity {

    private EditText textEmailLogin;
    private EditText textpwd;
    private FirebaseAuth firebaseAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        textEmailLogin = (EditText) findViewById(R.id.TFemailid);
        textpwd = (EditText) findViewById(R.id.TFpassword);
        firebaseAuth = firebaseAuth.getInstance();
    }

    public void onLogin(View v) {
        String email = textEmailLogin.getText().toString();
        String pwd = textpwd.getText().toString();
        if (email.matches("")) {
            Toast pass = Toast.makeText(LoginActivity.this, "Please enter email", Toast.LENGTH_SHORT);
            pass.show();
        } else if (pwd.matches("")) {
            Toast pass = Toast.makeText(LoginActivity.this, "Please enter password", Toast.LENGTH_SHORT);
            pass.show();
        } else {
            final ProgressDialog progressDialog = ProgressDialog.show(LoginActivity.this, "Please wait", "Processing..", true);
            (firebaseAuth.signInWithEmailAndPassword(textEmailLogin.getText().toString(), textpwd.getText().toString()))
                    .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            progressDialog.dismiss();
                            if (task.isSuccessful()) {
                                Toast.makeText(LoginActivity.this, "Login Successfull", Toast.LENGTH_LONG).show();
                                Intent i = new Intent(LoginActivity.this, MainActivity2.class);
                                i.putExtra("Email", firebaseAuth.getCurrentUser().getEmail());
                                startActivity(i);
                            } else {
                                Log.e("Error", task.getException().toString());
                                Toast.makeText(LoginActivity.this, task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                            }
                        }
                    });
        }
    }
    public void onSign(View v) {
        Intent i = new Intent(LoginActivity.this, RegActivity.class);
        startActivity(i);



    }


}

