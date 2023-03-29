package org.third;

import org.firstAndSecond.UserUtils;

public class ArrayHandler {
    private final int[] mRandomArray = new int[20];

    public ArrayHandler() {
        for (int i = 0; i < mRandomArray.length; i++) {
            mRandomArray[i] = UserUtils.rand.nextInt(20) - 10;
        }
    }

    public void work(){
        showArrayElements();

        swapMaxAndMinElements();

        showArrayElements();
    }

    private void swapMaxAndMinElements(){
        int minValue = mRandomArray[0];
        int maxValue = mRandomArray[0];

        int minValueIndex = 0;
        int maxValueIndex = 0;

        for (int i = 1; i < mRandomArray.length; i++) {
            if (mRandomArray[i] > maxValue){
                maxValue = mRandomArray[i];
                maxValueIndex = i;
            } else if (mRandomArray[i] < minValue) {
                minValue = mRandomArray[i];
                minValueIndex = i;
            }
        }

        mRandomArray[minValueIndex] = maxValue;
        mRandomArray[maxValueIndex] = minValue;
    }

    private void showArrayElements(){
        for (int number :
                mRandomArray) {
            System.out.print(number + " ");
        }

        System.out.println();
    }
}
