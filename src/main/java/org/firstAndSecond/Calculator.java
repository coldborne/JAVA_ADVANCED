package org.firstAndSecond;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * @author Coldborne
 * @see #sum()
 * @see #multiply()
 * @see #divide()
 * @see #subtract()
 */
public class Calculator {
    private double mFirstNumber;
    private double mSecondNumber;

    public void setmFirstNumber(double number) throws IllegalArgumentException {
        if (Double.isNaN(number) || Double.isInfinite(number)) {
            throw new IllegalArgumentException("Invalid number");
        }
        mFirstNumber = number;
    }

    public void setmSecondNumber(double number) throws IllegalArgumentException {
        if (Double.isNaN(number) || Double.isInfinite(number)) {
            throw new IllegalArgumentException("Invalid number");
        }
        mSecondNumber = number;
    }

    /**
     * @return the sum of firstNumber and secondNumber
     */
    public double sum(){
        return mFirstNumber + mSecondNumber;
    }

    /**
     * @return the number difference
     */
    public double subtract(){
        BigDecimal firstNumber = new BigDecimal(mFirstNumber);
        BigDecimal secondNumber = new BigDecimal(mSecondNumber);

        return firstNumber.subtract(secondNumber).setScale(2, RoundingMode.HALF_UP).doubleValue();
    }

    /**
     * @return the multiplication of firstNumber and secondNumber
     */
    public double multiply(){
        BigDecimal firstNumber = BigDecimal.valueOf(mFirstNumber);
        BigDecimal secondNumber = BigDecimal.valueOf(mSecondNumber);

        return firstNumber.multiply(secondNumber).setScale(2, RoundingMode.HALF_UP).doubleValue();
    }

    /**
     * @return the result of dividing numbers
     */
    public double divide() throws ArithmeticException {
        if (mSecondNumber == 0) {
            System.out.println("Ошибка. Деление на нуль");
            throw new ArithmeticException("Division by zero is not allowed");
        } else {
            return mFirstNumber / mSecondNumber;
        }
    }
}
