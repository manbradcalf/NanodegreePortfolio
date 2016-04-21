package com.example.benmedcalf.nanodegreeportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by ben.medcalf on 4/20/16.
 */
public class MainActivity extends AppCompatActivity {

    private Button mPopularMoviesButton;
    private Button mStockHawkButton;
    private Button mBuildItBiggerButton;
    private Button mMakeYourAppMaterialButton;
    private Button mGoUbiquitousButton;
    private Button mCapstoneButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Wiring up the buttons
        mPopularMoviesButton = (Button) findViewById(R.id.popular_movies_button);
        mStockHawkButton = (Button) findViewById(R.id.stock_hawk_button);
        mBuildItBiggerButton = (Button) findViewById(R.id.build_it_bigger_button);
        mMakeYourAppMaterialButton = (Button) findViewById(R.id.make_your_app_material_button);
        mGoUbiquitousButton = (Button) findViewById(R.id.go_ubiquitous_button);
        mCapstoneButton = (Button) findViewById(R.id.capstone_button);

        // Setting on click listeners
        mPopularMoviesButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "This button will launch my Popular Movies app!", Toast.LENGTH_LONG).show();
            }
        });

        mStockHawkButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "This button will launch my Stock Hawk app!", Toast.LENGTH_LONG).show();
            }
        });

        mBuildItBiggerButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "This button will launch my Build It Bigger app!", Toast.LENGTH_LONG).show();
            }
        });

        mMakeYourAppMaterialButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "This button will launch my Make Your App Material app!", Toast.LENGTH_LONG).show();
            }
        });

        mGoUbiquitousButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "This button will launch my Go Ubiquitious app!", Toast.LENGTH_LONG).show();
            }
        });

        mCapstoneButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "This button will launch my Capstone app!", Toast.LENGTH_LONG).show();
            }
        });

    }
}
