package org.third;

public abstract class Sweet {
    private String mName;
    private final int mWeight;
    private final int mPrice;

    public Sweet(int weight, int price){
        mName = this.getClass().getSimpleName();
        mWeight = weight;
        mPrice = price;
    }

    public int getmWeight(){
        return mWeight;
    }

    public int getmPrice(){
        return mPrice;
    }

    public void showInfo(){
        System.out.println("Тип конфеты: " + mName);
        System.out.println("Цена: " + mPrice);
        System.out.println("Веса: " + mWeight);
    }
}


