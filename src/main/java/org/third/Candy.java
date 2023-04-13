package org.third;

public class Candy extends Sweet {
    private final String mType;

    public Candy(int weight, int price, String type) {
        super(weight, price);
        mType = type;
    }
}
