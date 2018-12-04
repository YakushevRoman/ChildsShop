package com.example.user301.childsshop;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Product> productList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setInit();
        RecyclerView recyclerView = findViewById(R.id.list);
        DataAdapter dataAdapter = new DataAdapter(this, productList);
        recyclerView.setAdapter(dataAdapter);
    }

    private void setInit (){
        productList.add(new Product("Парковка робокар  полли  р.к. 32/23","250",R.drawable.photo_1));
        productList.add(new Product("Парковка робокар  полли  р.к. 32/23","250",R.drawable.photo_2));
        productList.add(new Product("Парковка робокар  полли  р.к. 32/23","250",R.drawable.photo_3));
    }
}
