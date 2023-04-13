package org.third;

import java.util.ArrayList;
import java.util.List;

public class Present {
    private final List<Sweet> mSweets = new ArrayList<>();

    public void TryAddSweet(Sweet sweet){
        if (sweet == null){
            return;
        }

        mSweets.add(sweet);
    }

    public int getPrice(){
        int presentPrice = 0;

        for (Sweet sweet :
                mSweets) {
            presentPrice += sweet.getmPrice();
        }

        return presentPrice;
    }

    public int getWeight(){
        int presentWeight = 0;

        for (Sweet sweet :
                mSweets) {
            presentWeight += sweet.getmWeight();
        }

        return presentWeight;
    }
}
