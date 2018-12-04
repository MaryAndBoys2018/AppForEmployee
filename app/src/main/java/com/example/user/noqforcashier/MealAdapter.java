package com.example.user.noqforcashier;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class MealAdapter extends ArrayAdapter<Meal> {
    MealAdapter(Activity context, ArrayList<Meal> meals) {
        super(context, 0, meals);
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.activity_order_item, parent, false);
        }
        final Meal currentMeal = getItem(position);


        TextView mealNameTextView = (TextView) listItemView.findViewById(R.id.meal_name_text_view);
        mealNameTextView.setText(currentMeal.getMealName());

        TextView priceTypeTextView = (TextView) listItemView.findViewById(R.id.price_type_text_view);
        priceTypeTextView.setText(currentMeal.getMealPrice());
        return listItemView;
    }
}