package com.example.exercise1402;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SignInActivity extends AppCompatActivity {
    TextView tvHere;
    TextView tvForgotPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actitivy_signin);

        tvHere = findViewById(R.id.tvHere);
        tvForgotPass = findViewById(R.id.tvForgotPass);

        tvHere.setOnClickListener(view -> this.switchToSignUpActivity(view));
        tvForgotPass.setOnClickListener(view -> this.switchToForgotPasswordActivity(view));
    }

    private void switchToSignUpActivity(View view) {
        Intent intent = new Intent(view.getContext(), SignUpActivity.class);
        startActivity(intent);
    }

    private void switchToForgotPasswordActivity(View view) {
        Intent intent = new Intent(view.getContext(), ForgotPasswordActivity.class);
        startActivity(intent);
    }
}
