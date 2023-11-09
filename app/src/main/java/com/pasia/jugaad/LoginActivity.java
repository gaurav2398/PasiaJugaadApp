package com.pasia.jugaad;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import es.dmoral.toasty.Toasty;

public class LoginActivity extends AppCompatActivity {

    EditText etxtName, etxtNumber;
    Button txtLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        getSupportActionBar().hide();

        etxtName = findViewById(R.id.etxt_name);
        etxtNumber = findViewById(R.id.etxt_phone);
        txtLogin = findViewById(R.id.button);


//        if (etxtName.getText().toString().length() >= 2 && etxtNumber.getText().toString().length() >= 2) {
//            login(etxtName.getText().toString(), etxtNumber.getText().toString());
//        }


        txtLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = etxtName.getText().toString().trim();
                String number = etxtNumber.getText().toString().trim();

                if (name.isEmpty()) {
                    etxtName.setError("Enter Name");
                    etxtName.requestFocus();
                } else if (number.isEmpty()) {
                    etxtNumber.setError("Enter Mobile Number");
                    etxtNumber.requestFocus();
                } else {
                    login(name, number);
                }
            }
        });


    }

    private void login(String phone, String password) {

        Intent intent = new Intent(LoginActivity.this, DoneActivity.class);
        startActivity(intent);

//        Toasty.success(this, R.string.login_successful, Toast.LENGTH_SHORT).show();

    }
}
