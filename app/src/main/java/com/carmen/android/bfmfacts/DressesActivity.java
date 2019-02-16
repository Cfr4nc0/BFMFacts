package com.carmen.android.bfmfacts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class DressesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dresses);

        ArrayList<CategoryItem> dresses = new ArrayList<>();
        dresses.add(new CategoryItem("Sinaloa", R.drawable.sinaloadressolivia));
        dresses.add(new CategoryItem("Guerrero", R.drawable.guerrerodress));
        dresses.add(new CategoryItem("Baja California", R.drawable.bajacalifdress));
        dresses.add(new CategoryItem("Jalisco", R.drawable.jaliscodress));
        dresses.add(new CategoryItem("Michoacan", R.drawable.michoacandress));
        dresses.add(new CategoryItem("Nayarit", R.drawable.nayartdress));

        CategoryAdapter adapter = new CategoryAdapter(this,dresses);
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(adapter);

    }
}
