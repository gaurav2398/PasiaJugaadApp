package com.pasia.jugaad;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class TaskActivity extends AppCompatActivity {

    Button button100,button200,button500,button2000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task);

        getSupportActionBar().hide();

        button100 = findViewById(R.id.button100);

        button100.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nextActivity("100");
            }
        });
    }

    private void nextActivity(String rs) {

        Intent intent = new Intent(TaskActivity.this, LoginActivity.class);
        intent.putExtra("rs",rs);
        startActivity(intent);

//        Toasty.success(this, "Msg", Toast.LENGTH_SHORT).show();

    }
}
