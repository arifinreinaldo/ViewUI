package com.ui.mobiledataplanui.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.ui.mobiledataplanui.R;

public class ResultActivity extends BaseActivity {
    private TextView tvTItle;
    private ImageView ivBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        tvTItle = findViewById(R.id.headertvButton);
        tvTItle.setText("OK");
        setTitlePage("Payment Details");
        ivBack = findViewById(R.id.headerIvLeftIcon);
        ivBack.setVisibility(View.VISIBLE);
    }
    public void clickFullButton(View view){
        startActivity(new Intent(ResultActivity.this, MainActivity.class));
        finish();
    }
    public void backButton(View view){
        super.onBackPressed();
    }
}
