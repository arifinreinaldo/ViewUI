package com.ui.mobiledataplanui.ui;

import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.ui.mobiledataplanui.R;

public class BaseActivity extends AppCompatActivity {
    protected void setTitlePage(String title){
        TextView tvTitle = findViewById(R.id.headerTvTItle);
        tvTitle.setText(title);
    }
}
