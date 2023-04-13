package org.third;

import java.util.*;

public class PresentBuilder{
    private final List<SweetBuilderable> builders = new ArrayList<>();

    private final Random mRandom = new Random();

    private final int MINSWEETSAMOUNT = 1;
    private final int MAXSWEETSAMOUNT = 16;

    private final int SWEETTYPESAMOUNT = 2;

    private final int CANDYTYPE = 0;
    private final int JELLYBEANTYPE = 1;

    public PresentBuilder(){
        builders.add(new CandyBuilder());
        builders.add(new JellyBeanBuilder());
    }

    public Present create(){
        Present present = new Present();

        int sweetsAmount = mRandom.nextInt(MINSWEETSAMOUNT, MAXSWEETSAMOUNT);

        for (int i = 0; i < sweetsAmount; i++) {
            int typeOfSweet = mRandom.nextInt(0, SWEETTYPESAMOUNT);

            switch (typeOfSweet){
                case CANDYTYPE:
                    present.TryAddSweet(builders.get(CANDYTYPE).create());
                    break;
                case JELLYBEANTYPE:
                    present.TryAddSweet(builders.get(JELLYBEANTYPE).create());
                    break;
            }
        }

        return present;
    }
}

