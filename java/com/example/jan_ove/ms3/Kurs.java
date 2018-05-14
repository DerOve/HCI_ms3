package com.example.jan_ove.ms3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Kurs extends AppCompatActivity implements View.OnClickListener{

    private Button btn_kurs_video;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kurs);

        btn_kurs_video = findViewById(R.id.button);
        btn_kurs_video.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity_kurs_video();
            }
            });
        }

    private void openActivity_kurs_video() {
        Intent intent = new Intent(this, kurs_video.class );
        startActivity(intent);
    }

    @Override
    public void onClick(View view) {

    }
}
