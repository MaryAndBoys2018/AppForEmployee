package com.example.user.noqforcashier;

public class Meal {
    private String mealName;
    private String mealPrice;
    private boolean IsChecked;
    private int mQuantity;
    public static int numberOfCheckedItems;


    Meal(){}

    public String getMealName(){
        return mealName;
    }
    public String getMealPrice(){
        return mealPrice;
    }
    protected void setMealPrice(String MealPrice) {mealPrice=MealPrice;}
    public boolean getChecked() { return IsChecked; }
    public void setChecked(boolean isChecked){
        IsChecked = isChecked;
    }
    public int getQuantity() { return mQuantity; }
    public void setQuantity(int quantity) { mQuantity = quantity; }
}
