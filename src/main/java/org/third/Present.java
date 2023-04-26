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
        return mSweets.stream().mapToInt(Sweet::getmPrice).sum();
    }

    public int getWeight(){
        return mSweets.stream().mapToInt(Sweet::getmWeight).sum();
    }

    public void showInfo(){
        for (Sweet sweet :
                mSweets) {
            sweet.showInfo();
        }
    }
}
