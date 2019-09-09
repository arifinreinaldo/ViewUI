package com.ui.mobiledataplanui.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.ui.mobiledataplanui.R;

public class ConfirmationActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmation);
        setTitlePage("Confirmation");
    }
    public void clickFullButton(View view){
        startActivity(new Intent(ConfirmationActivity.this, ResultActivity.class));
        finish();
    }
}
