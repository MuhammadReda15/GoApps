package com.redha.goapps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tampilanmenu);
    }

    public void clickhospital(View view) {
        //gambar hospital di klik
        Intent i = new Intent(this,RS.class);
        startActivity(i);
    }
}