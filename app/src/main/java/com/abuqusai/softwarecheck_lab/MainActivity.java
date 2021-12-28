package com.abuqusai.softwarecheck_lab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        EditText email = findViewById(R.id.email_text);
        EditText password = findViewById(R.id.password_text);
        Button loginBtn = findViewById(R.id.btn_login);


        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), VActivity.class);
                i.putExtra("email", email.getText().toString());
                i.putExtra("password", password.getText().toString());
                startActivity(i);
            }
        });
        // - Add Firebase Crashlytics to your project.
        throw new RuntimeException("Test Crash");

    }
}
