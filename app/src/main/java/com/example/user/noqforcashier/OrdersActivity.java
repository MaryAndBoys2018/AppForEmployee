package com.example.user.noqforcashier;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class OrdersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_of_orders);



        ArrayList<Meal> meals = new ArrayList<>();
        meals.add(new Meal("Гамбургер", "40грн"));
        MealAdapter adapter = new MealAdapter( this, meals);
        ListView listView = (ListView) findViewById(R.id.orders_list);
        listView.setAdapter(adapter);



    }
}
