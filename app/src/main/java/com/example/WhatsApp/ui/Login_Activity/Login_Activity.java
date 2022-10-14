package com.example.WhatsApp.ui.Login_Activity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.WhatsApp.ui.ChatFragmint;
import com.example.WhatsApp.ui.MainActivity;
import com.example.myapplication.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class Login_Activity extends AppCompatActivity {


    private FirebaseAuth auth;
    private EditText Username, Password;
    private Button btn_login;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        auth = FirebaseAuth.getInstance();
        Username = findViewById(R.id.User_name);
        Password = findViewById(R.id.Password);
        btn_login = findViewById(R.id.btn_login);


        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                login();
            }
        });


    }


    public void login() {

        String user = Username.getText().toString().trim();
        String pass = Password.getText().toString().trim();
        if (user.isEmpty()) {

            Username.setError("Username can not be empty");

        }
        if (pass.isEmpty()) {

            Password.setError("Password can not be empty");

        } else {
            auth.signInWithEmailAndPassword(user, pass).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                @Override
                public void onComplete(@NonNull Task<AuthResult> task) {
                    if (task.isSuccessful()) {

                        Toast.makeText(Login_Activity.this, "Login Successful", Toast.LENGTH_LONG).show();
                        startActivity(new Intent(Login_Activity.this, MainActivity.class));


                    } else {
                        Toast.makeText(Login_Activity.this, "Login Failed" + task.getException().getLocalizedMessage(), Toast.LENGTH_LONG).show();


                    }
                }
            });
        }
        auth.checkActionCode(user);


    }
}


