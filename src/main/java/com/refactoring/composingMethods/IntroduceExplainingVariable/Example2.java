package com.refactoring.composingMethods.IntroduceExplainingVariable;

public class Example2 {
    private final double quantity;
    private final double itemPrice;

    public Example2(double quantity, double itemPrice)
    {
        this.quantity = quantity;
        this.itemPrice = itemPrice;
    }

    public double getPrice()
    {
        // price is base price - quantity discount + shipping
        return quantity * itemPrice -
                Math.max(0, quantity - 500) * itemPrice * 0.05 +
                Math.min(quantity * itemPrice * 0.1, 100.0);
    }
}
