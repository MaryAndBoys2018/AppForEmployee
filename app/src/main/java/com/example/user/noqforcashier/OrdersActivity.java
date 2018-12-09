package com.example.user.noqforcashier;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.HashMap;

public class OrdersActivity extends AppCompatActivity {
    public Order order;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_of_orders);

        FirebaseDatabase database = FirebaseDatabase.getInstance();
        final DatabaseReference myRef = database.getReference("order");

        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                order=dataSnapshot.getValue(Order.class);
                Toast.makeText(OrdersActivity.this,"lal",Toast.LENGTH_LONG);
                MealAdapter adapter = new MealAdapter( OrdersActivity.this, order.getListOfMeals());
                ListView listView = (ListView) findViewById(R.id.orders_list);
                listView.setAdapter(adapter);

                TextView timeTextView= (TextView) findViewById(R.id.time);
                timeTextView.setText(order.getmTime());

                TextView sumTextView= (TextView) findViewById(R.id.total);
                sumTextView.setText(Integer.toString(order.getmSum()));
            }
            @Override
            public void onCancelled(DatabaseError error) {
                Toast.makeText(OrdersActivity.this,error.getMessage(),Toast.LENGTH_LONG);
            }
        });
    }
}
