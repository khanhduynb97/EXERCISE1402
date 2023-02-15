package com.example.exercise1402;

import android.app.Dialog;
import android.net.Uri;
import android.os.Bundle;
import android.text.Html;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class MovieActivity extends AppCompatActivity {
    TextView tvDesc;
    Button btnPlay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie);

        tvDesc = findViewById(R.id.tvDesc);
        btnPlay = findViewById(R.id.btnPlay);
    }

}
