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

                if (clickedColorName.equals("Red")) {
                    setContentView(R.layout.activity_canvas);
                    canvasView = findViewById(R.id.canvas);
                    canvasView.setBackgroundColor(Color.RED);
                } else if (clickedColorName.equals("Black")) {
                    setContentView(R.layout.activity_canvas);
                    canvasView = findViewById(R.id.canvas);
                    canvasView.setBackgroundColor(Color.BLACK);
                } else if (clickedColorName.equals("Blue")) {
                    setContentView(R.layout.activity_canvas);
                    canvasView = findViewById(R.id.canvas);
                    canvasView.setBackgroundColor(Color.BLUE);
                } else if (clickedColorName.equals("Yellow")) {
                    setContentView(R.layout.activity_canvas);
                    canvasView = findViewById(R.id.canvas);
                    canvasView.setBackgroundColor(Color.YELLOW);
                } else if (clickedColorName.equals("Green")) {
                    setContentView(R.layout.activity_canvas);
                    canvasView = findViewById(R.id.canvas);
                    canvasView.setBackgroundColor(Color.GREEN);
                } else if (clickedColorName.equals("Cyan")) {
                    setContentView(R.layout.activity_canvas);
                    canvasView = findViewById(R.id.canvas);
                    canvasView.setBackgroundColor(Color.CYAN);
                } else if (clickedColorName.equals("Gray")) {
                    setContentView(R.layout.activity_canvas);
                    canvasView = findViewById(R.id.canvas);
                    canvasView.setBackgroundColor(Color.GRAY);
                } else if (clickedColorName.equals("Magenta")) {
                    setContentView(R.layout.activity_canvas);
                    canvasView = findViewById(R.id.canvas);
                    canvasView.setBackgroundColor(Color.MAGENTA);
                } else if (clickedColorName.equals("Orange")) {
                    setContentView(R.layout.activity_canvas);
                    canvasView = findViewById(R.id.canvas);
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
