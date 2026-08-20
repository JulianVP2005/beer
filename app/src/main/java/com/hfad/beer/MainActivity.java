package com.hfad.beer;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Se llama cuando el usuario hace clic en el botón
    public void onClickFindBeer(View view) {
        TextView brandsTextView = (TextView) findViewById(R.id.brands);
        Spinner colorSpinner = (Spinner) findViewById(R.id.color);
        String beerType = String.valueOf(colorSpinner.getSelectedItem());

        BeerExpert expert = new BeerExpert();
        List<String> brands = expert.getBrands(beerType);

        StringBuilder brandsFormatted = new StringBuilder();
        for (String brand : brands) {
            brandsFormatted.append(brand).append("\n");
        }

        brandsTextView.setText(brandsFormatted.toString());
    }
}