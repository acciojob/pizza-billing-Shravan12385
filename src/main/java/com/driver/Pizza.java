package com.driver;

public class Pizza {

    private Boolean isVeg;
    // This is going to hold the bill
    private String bill;

    private  int price;
    private int basePrice;
    private int extraCheesePrice;
    private int extraToppingsPrice;
    private int paperBagPrice;


    private boolean isExtraCheeseAdded;
    private boolean isExtraToppingsAdded;
    private boolean isTakeAwayAdded;
    private boolean isBillGenerated;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(this.isVeg==true)
        {
            this.basePrice=300;
            this.extraToppingsPrice=70;
        }
        else
        {
            this.basePrice=400;
            this.extraToppingsPrice=120;
        }
        this.extraCheesePrice=80;
        this.paperBagPrice=20;
        this.price=this.basePrice;

    }


    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(this.isExtraCheeseAdded==false)
        {
            this.price = this.price + this.extraCheesePrice;
            this.isExtraCheeseAdded=true;
        }

    }

    public void addExtraToppings(){
        // your code goes here
        if(this.isExtraToppingsAdded==false) {
            this.price=this.price+this.extraToppingsPrice;
            this.isExtraToppingsAdded=true;
        }


    }

    public void addTakeaway(){
        // your code goes here
        if(this.isTakeAwayAdded==false) {
            this.price = this.price + this.paperBagPrice;
            this.isTakeAwayAdded=true;
        }


    }

    public String getBill(){
        // your code goes here
        if(this.isBillGenerated==false)
        {
            this.bill = "Base price of the pizza: " + this.basePrice + "\n";
            if(this.isExtraCheeseAdded==true) {
                this.bill += "Extra Cheese Added: " + this.extraCheesePrice + "\n";
            }
            if(this.isExtraToppingsAdded) {
                this.bill += "Extra Toppings Added: " + this.extraToppingsPrice + "\n";
            }
            if(this.isTakeAwayAdded==true) {
                this.bill += "Paperbag Added: " + this.paperBagPrice + "\n";
            }
            this.bill += "Total Price: " + this.price;
            this.isBillGenerated=true;
        }

        return bill;

    }
}
