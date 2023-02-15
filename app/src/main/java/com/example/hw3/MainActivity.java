package com.example.hw3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<String> carList;
    private CarAdapter adapter;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.rv_car);
        loadData();
        adapter = new CarAdapter(carList);
        recyclerView.setAdapter(adapter);
    }

    private void loadData() {
        carList = new ArrayList<>();
        carList.add("BMW");
        carList.add("Tesla");
        carList.add("Ferrari");
        carList.add("Ford");
        carList.add("Porsche");
        carList.add("Honda");
        carList.add("Lamborghini");
        carList.add("Toyota");
        carList.add("Bentley");
        carList.add("Audi");
        carList.add("Subaru");
        carList.add("Cadillac");
        carList.add("Rolls-Royce");
        carList.add("Kia");
        carList.add("Volvo");
        carList.add("Mazda");
        carList.add("Nissan");

    }
}