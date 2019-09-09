package com.ui.mobiledataplanui.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.ui.mobiledataplanui.R;

public class ResultActivity extends AppCompatActivity {
    private TextView tvTItle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        tvTItle = findViewById(R.id.headertvButton);
        tvTItle.setText("OK");
    }
    public void clickFullButton(View view){
        startActivity(new Intent(ResultActivity.this, MainActivity.class));
        finish();
    }
}
