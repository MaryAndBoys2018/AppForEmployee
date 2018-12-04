package com.example.user.noqforcashier;

public class Meal {
    private String mMealName;
    private String mMealPrice;
    private String mMealQuantity;
    public static int numberOfCheckedItems;

    Meal(String mealName, String mealPrice, String mealQuantity){
        mMealName = mealName;
        mMealPrice = mealPrice;
        mMealQuantity = mealQuantity;
    }
    public String getMealName(){
        return mMealName;
    }
    public String getMealPrice(){
        return mMealPrice;
    }
    public String getMealQuantity(){
        return mMealQuantity;
    }
}

