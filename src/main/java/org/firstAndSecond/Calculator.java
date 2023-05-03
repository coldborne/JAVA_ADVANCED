package org.firstAndSecond;

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

    public void setmFirstNumber(double number){
        mFirstNumber = number;
    }

    public void setmSecondNumber(double number){
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
        return mFirstNumber - mSecondNumber;
    }

    /**
     * @return the multiplication of firstNumber and secondNumber
     */
    public double multiply(){
        return mFirstNumber * mSecondNumber;
    }

    /**
     * @return the result of dividing numbers
     */
    public double divide(){
        if (mSecondNumber == 0) {
            System.out.println("Ошибка. Деление на нуль");
            return 0.0;
        } else {
            return mFirstNumber / mSecondNumber;
        }
    }
}
