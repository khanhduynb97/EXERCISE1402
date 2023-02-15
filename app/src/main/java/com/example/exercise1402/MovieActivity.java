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
        btnPlay.setOnClickListener(view -> openDialog());
    }

    private void openDialog() {
        Dialog dialog = new Dialog(MovieActivity.this);
        dialog.setCancelable(true);
        dialog.setContentView(R.layout.trailer_movie);
        dialog.show();

        WindowManager.LayoutParams lp = new WindowManager.LayoutParams(WindowManager.LayoutParams.WRAP_CONTENT, WindowManager.LayoutParams.WRAP_CONTENT);
        lp.copyFrom(dialog.getWindow().getAttributes());
        dialog.getWindow().setAttributes(lp);
        final VideoView videoview = (VideoView) dialog.findViewById(R.id.vvTrailer);
        Uri uri = Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.movie_trailer);
        videoview.setVideoURI(uri);
        videoview.start();
    }
}
