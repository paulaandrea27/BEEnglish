package com.cdcc.beenglish;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class level2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level2);

    }

    public void VolverDos(View view){


        Intent intent = new Intent(this, LevelGridActivity.class);
        startActivity(intent);
        finish();

    }
}
