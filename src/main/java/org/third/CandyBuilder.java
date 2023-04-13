package org.third;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class CandyBuilder implements SweetBuilderable {
    private final List<String> mCandyTypes = new ArrayList<>(Arrays.asList("sugary", "salty", "sour"));

    private final Random mRandom = new Random();

    private final int MINWEIGHT = 1;
    private final int MINPRICE = 1;

    private final int MAXWEIGHT = 101;
    private final int MAXPRICE = 151;

    public Candy create(){
        int weight = generateRandomWeight();
        int price = generateRandomPrice();
        String candyType = mCandyTypes.get(generateIdForCandyType());

        return new Candy(weight,price, candyType);
    }

    private int generateIdForCandyType(){
        return mRandom.nextInt(0, mCandyTypes.size());
    }

    private int generateRandomWeight(){
        return mRandom.nextInt(MINWEIGHT, MAXWEIGHT);
    }

    private int generateRandomPrice(){
        return mRandom.nextInt(MINPRICE, MAXPRICE);
    }
}
