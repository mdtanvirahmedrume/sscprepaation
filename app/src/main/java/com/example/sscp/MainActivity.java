package com.example.sscp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView go_mainfile;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        go_mainfile = findViewById(R.id.go_mainfile);

        go_mainfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent main_file = new Intent(MainActivity.this,MainFile.class);
                startActivity(main_file);

            }
        });
    }
}