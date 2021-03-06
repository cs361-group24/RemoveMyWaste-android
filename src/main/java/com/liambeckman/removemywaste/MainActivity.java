package com.liambeckman.removemywaste;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showMaterials(View view) {
        Intent intent = new Intent(this, search_material.class);
        startActivity(intent);
    }

    public void showCenters(View view) {
        Intent intent = new Intent(this, search_centers.class);
        startActivity(intent);
    }

    public void showAbout(View view) {
        Intent intent = new Intent(this, about.class);
        startActivity(intent);
    }

    public void showMap(View view) {
        Intent intent = new Intent(this, map.class);
        startActivity(intent);
    }
}




