package com.example.user.noqforcashier;

public class Meal {
    private String mMealName;
    private int mMealPrice;
    private boolean mIsChecked;
    private int mMealQuantity;
    public static int numberOfCheckedItems;

    Meal(String mealName, int mealPrice, int mealQuantity){
        mMealName = mealName;
        mMealPrice = mealPrice;
        mMealQuantity = mealQuantity;
    }
    Meal(){}
    public String getMealName(){
        return mMealName;
    }
    public int getMealPrice(){
        return mMealPrice;
    }
    public int getMealQuantity(){
        return mMealQuantity;
    }
}

