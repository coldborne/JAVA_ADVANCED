package org.third;

import java.util.Random;

public class JellyBeanBuilder implements SweetBuilderable {
    private final int[] mJellyBeanSizes = new int[]{1,2,3};

    private final Random mRandom = new Random();

    private final int MINWEIGHT = 1;
    private final int MINPRICE = 1;

    private final int MAXWEIGHT = 51;
    private final int MAXPRICE = 101;

    public JellyBean create(){
        int weight = generateRandomWeight();
        int price = generateRandomPrice();
        int JellyBeanSize = mJellyBeanSizes[generateIdForJellyBeanSize()];

        return new JellyBean(weight,price, JellyBeanSize);
    }

    private int generateIdForJellyBeanSize(){
        return mRandom.nextInt(0, mJellyBeanSizes.length);
    }

    private int generateRandomWeight(){
        return mRandom.nextInt(MINWEIGHT, MAXWEIGHT);
    }

    private int generateRandomPrice(){
        return mRandom.nextInt(MINPRICE, MAXPRICE);
    }
}
