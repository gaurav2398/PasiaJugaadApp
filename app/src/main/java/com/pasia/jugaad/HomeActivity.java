package com.pasia.jugaad;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import es.dmoral.toasty.Toasty;

public class HomeActivity extends AppCompatActivity {

    Button button100,button200,button500,button2000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        getSupportActionBar().hide();

        button100 = findViewById(R.id.button100);
        button200 = findViewById(R.id.button200);
        button500 = findViewById(R.id.button500);
        button2000 = findViewById(R.id.button2000);

        button100.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nextActivity("100");
            }
        });
        button200.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nextActivity("200");
            }
        });
        button500.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nextActivity("500");
            }
        });
        button2000.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nextActivity("2000");
            }
        });
    }

    private void nextActivity(String rs) {

        Intent intent = new Intent(HomeActivity.this, HomeNextActivity.class);
        intent.putExtra("rs",rs);
        startActivity(intent);

//        Toasty.success(this, "Msg", Toast.LENGTH_SHORT).show();

    }
}
