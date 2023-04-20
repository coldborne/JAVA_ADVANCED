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

        swap(findMaxNegativeElementIndex(), findMinPositiveElementIndex());

        showArrayElements();
    }

    private int findMaxNegativeElementIndex(){
        int maxNegativeValueIndex = 0;
        int i = 0;

        if (mRandomArray[maxNegativeValueIndex] >= 0){
            while (maxNegativeValueIndex == 0 && i < mRandomArray.length){
                if (mRandomArray[i] < 0){
                    maxNegativeValueIndex = i;
                }

                i++;
            }
        }

        for (int j = maxNegativeValueIndex + 1; j < mRandomArray.length; j++){
            if (mRandomArray[j] < 0 && mRandomArray[j] > mRandomArray[maxNegativeValueIndex]){
                maxNegativeValueIndex = j;
            }
        }

        return maxNegativeValueIndex;
    }

    private int findMinPositiveElementIndex(){
        int minPositiveValueIndex = 0;
        int i = 0;

        if (mRandomArray[minPositiveValueIndex] < 0){
            while (minPositiveValueIndex == 0 && i < mRandomArray.length){
                if (mRandomArray[i] >= 0){
                    minPositiveValueIndex = i;
                }

                i++;
            }
        }

        for (int j = 1; j < mRandomArray.length; j++){
            if (mRandomArray[j] >= 0 && mRandomArray[j] < mRandomArray[minPositiveValueIndex]){
                minPositiveValueIndex = j;
            }
        }

        return minPositiveValueIndex;
    }

    private void swap(int firstElementIndex, int secondElementIndex){
            int tempValue = mRandomArray[firstElementIndex];

            mRandomArray[firstElementIndex] = mRandomArray[secondElementIndex];
            mRandomArray[secondElementIndex] = tempValue;
    }

    private void showArrayElements(){
        for (int number :
                mRandomArray) {
            System.out.print(number + " ");
        }

        System.out.println();
    }
}
