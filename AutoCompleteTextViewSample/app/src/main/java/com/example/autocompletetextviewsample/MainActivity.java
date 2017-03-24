package com.example.autocompletetextviewsample;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends Activity {

    AutoCompleteTextView autocomplete;

    String[] data = {"Saravanan", "Karthik", "Vijay", "Shiva", "Kannan", "Sam", "Neps", "Bala"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        autocomplete = (AutoCompleteTextView) findViewById(R.id.autoCompleteTextView1);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.select_dialog_item, data);

        autocomplete.setThreshold(2);
        autocomplete.setAdapter(adapter);

    }
}
