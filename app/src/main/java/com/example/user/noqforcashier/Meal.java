package com.example.user.noqforcashier;

public class Meal {
    private String mMealName;
    private int mMealPrice;
    private int mMealQuantity;

    Meal(String mealName, int mealPrice, int mealQuantity){
        mMealName = mealName;
        mMealPrice = mealPrice;
        mMealQuantity = mealQuantity;
    }
    public String getMealName(){
        return mMealName;
    }
    public int getMealPrice(){
        return mMealPrice;
    }
    public int getMealQuantity(){
        return mMealQuantity;
    }
    public void setMealQuantity(int quantity) { mMealQuantity = quantity; }
}

