package com.example.user.noqforcashier;

public class Meal {
    private String mMealName;
    private String mMealPrice;
    public static int numberOfCheckedItems;

    Meal(String mealName, String mealPrice){
        mMealName = mealName;
        mMealPrice = mealPrice;
    }
    public String getMealName(){
        return mMealName;
    }
    public String getMealPrice(){
        return mMealPrice;
    }
}

