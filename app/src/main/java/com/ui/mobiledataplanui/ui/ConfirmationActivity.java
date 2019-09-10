package com.ui.mobiledataplanui.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.ui.mobiledataplanui.R;

public class ConfirmationActivity extends BaseActivity {
    private EditText etPassword;
    private ImageView ivBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmation);
        setTitlePage("Confirmation");
        etPassword = findViewById(R.id.etPassword);
        ivBack = findViewById(R.id.headerIvClose);
        ivBack.setVisibility(View.VISIBLE);
    }
    public void clickFullButton(View view){
        String password = etPassword.getText().toString();
        if(!TextUtils.isEmpty(password)){
            startActivity(new Intent(ConfirmationActivity.this, ResultActivity.class));
            finish();
        }else{
            Toast.makeText(getApplicationContext(),"Mohon Input Password",Toast.LENGTH_LONG).show();
        }
    }
    public void backButton(View view){
        super.onBackPressed();
    }
}
