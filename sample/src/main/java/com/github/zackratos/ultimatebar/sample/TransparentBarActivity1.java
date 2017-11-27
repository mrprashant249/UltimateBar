package com.github.zackratos.ultimatebar.sample;


import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.github.zackratos.ultimatebar.library.UltimateBar;

public class TransparentBarActivity1 extends AppCompatActivity {

    private View toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text);
//        UltimateBar ultimateBar = new UltimateBar(this);
//        ultimateBar.setTransparentBar(Color.BLUE, 100, Color.GREEN, 100);
        UltimateBar.newTransparentBuilder()
                .statusColor(Color.BLUE)
                .statusAlpha(100)
                .applyNav(true)
                .navColor(Color.GREEN)
                .navAlpha(100)
                .build(this)
                .apply();

        toolbar = findViewById(R.id.include_toolbar);
        toolbar.setVisibility(View.GONE);
    }

}
