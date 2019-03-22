package com.example.joseph.gsonexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.gson.Gson;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Gson gson = new Gson();
        Recipe recipe = new Recipe(1,"Nutella Pie","8");
        String json = gson.toJson(recipe);


    }
}
