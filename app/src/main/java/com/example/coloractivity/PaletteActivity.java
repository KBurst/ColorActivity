package com.example.coloractivity;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;

public class PaletteActivity extends AppCompatActivity {

    public String clickedItem;
    private ArrayList<String> colorList = new ArrayList<>();
    private ColorAdapter colorAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_color);
        final View layoutView = findViewById(R.id.b_color);
        initList();

        Spinner spinnerColors = findViewById(R.id.color_spinner);

        colorAdapter = new ColorAdapter(this, colorList);
        spinnerColors.setAdapter(colorAdapter);

        spinnerColors.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                clickedItem = (String) parent.getItemAtPosition(position);
                String clickedColorName = clickedItem;
                View canvasView;

                if (clickedColorName.equals(colorList.get(1))) {
                    canvasView = findViewById(R.id.fragment);
                    canvasView.setBackgroundColor(Color.parseColor("Red"));
                } else if (clickedColorName.equals(colorList.get(2))) {
                    canvasView = findViewById(R.id.fragment);
                    canvasView.setBackgroundColor(Color.parseColor("Black"));
                } else if (clickedColorName.equals(colorList.get(3))) {
                    canvasView = findViewById(R.id.fragment);
                    canvasView.setBackgroundColor(Color.parseColor("Blue"));
                } else if (clickedColorName.equals(colorList.get(4))) {
                    canvasView = findViewById(R.id.fragment);
                    canvasView.setBackgroundColor(Color.parseColor("Yellow"));
                } else if (clickedColorName.equals(colorList.get(5))) {
                    canvasView = findViewById(R.id.fragment);
                    canvasView.setBackgroundColor(Color.parseColor("Green"));
                } else if (clickedColorName.equals(colorList.get(6))) {
                    canvasView = findViewById(R.id.fragment);
                    canvasView.setBackgroundColor(Color.parseColor("Cyan"));
                } else if (clickedColorName.equals(colorList.get(7))) {
                    canvasView = findViewById(R.id.fragment);
                    canvasView.setBackgroundColor(Color.parseColor("Gray"));
                } else if (clickedColorName.equals(colorList.get(8))) {
                    canvasView = findViewById(R.id.fragment);
                    canvasView.setBackgroundColor(Color.parseColor("Magenta"));
                } else if (clickedColorName.equals(colorList.get(9))) {
                    canvasView = findViewById(R.id.fragment);
                    canvasView.setBackgroundColor(Color.rgb(255, 165, 0));
                }
                Toast.makeText(PaletteActivity.this, clickedColorName + " selected", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                layoutView.setBackgroundColor(Color.WHITE);
            }
        });
    }

    private void initList() {
        String [] cl = getResources().getStringArray(R.array.colors);

        for(int i = 0; i < cl.length; i++)
        {
            this.colorList.add(i, cl[i]);
        }
    }
}
