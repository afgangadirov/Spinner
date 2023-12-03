package com.example.spinnerkullanimi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private Spinner spinner;
    private Button buttonGoster;
    private TextView textView;

    private ArrayList<String> olkeler = new ArrayList<>();
    private ArrayAdapter<String> verilenAdapteri;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = findViewById(R.id.spinner);
        buttonGoster = findViewById(R.id.buttonGoster);
        textView = findViewById(R.id.textView);

        olkeler.add("Azerbaycan");
        olkeler.add("Ingiltere");
        olkeler.add("Almaniya");
        olkeler.add("Rusiya");
        olkeler.add("Portuqaliya");
        olkeler.add("Kuba");
        olkeler.add("Argentina");
        olkeler.add("Avstraliya");
        olkeler.add("Angola");
        olkeler.add("Islandiya");

        verilenAdapteri = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,android.R.id.text1,olkeler);
        spinner.setAdapter(verilenAdapteri);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(),"Secdiyiniz olke : "+olkeler.get(i),Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        buttonGoster.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(olkeler.get(spinner.getSelectedItemPosition()));
            }
        });



    }
}