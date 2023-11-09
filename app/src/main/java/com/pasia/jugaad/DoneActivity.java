package com.pasia.jugaad;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class DoneActivity extends AppCompatActivity {

    EditText etxtName, etxtNumber;
    Button txtLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_done);


        getSupportActionBar().hide();


    }

}
