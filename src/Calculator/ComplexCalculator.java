package Calculator;

import Numbers.ComplexNumber;

public class ComplexCalculator implements Summation, Subtraction, Multiplication, Division{
    private ComplexNumber number1;
    private ComplexNumber number2;
    private ComplexNumber result = new ComplexNumber();

    public ComplexNumber getNumber1() {
        return number1;
    }

    public void setNumber1(ComplexNumber number1) {
        this.number1 = number1;
    }

    public ComplexNumber getNumber2() {
        return number2;
    }

    public void setNumber2(ComplexNumber number2) {
        this.number2 = number2;
    }

    public ComplexNumber getResult() {
        return result;
    }


    @Override
    public String toString() {
        return "ComplexCalculator{" +
                "number1=" + number1 +
                ", number2=" + number2 +
                ", result=" + result +
                '}';
    }



    @Override
    public void division() {
        this.result.setReal((number1.getReal() * number2.getReal() + number1.getImaginary() * number2.getImaginary()) /
                (number2.getReal() * number2.getReal() + number2.getImaginary() * number2.getImaginary()));
        this.result.setImaginary((number1.getImaginary() * number2.getReal() - number1.getReal() * number2.getImaginary()) /
                        (number2.getReal() * number2.getReal() + number2.getImaginary() * number2.getImaginary()));
        System.out.println(result);
    }

    @Override
    public void multiplication() {
        this.result.setReal(number1.getReal()*number2.getReal() - number1.getImaginary()*number2.getImaginary());
        this.result.setImaginary(number1.getReal()*number2.getImaginary() + number1.getImaginary()*number2.getReal());
        System.out.println(result);
    }

    @Override
    public void subtraction() {
        this.result.setReal(number1.getReal() - number2.getReal());
        this.result.setImaginary(number1.getImaginary() - number2.getImaginary());
        System.out.println(result);
    }

    @Override
    public void sum() {
        this.result.setReal(number1.getReal() + number2.getReal());
        this.result.setImaginary(number1.getImaginary() + number2.getImaginary());
        System.out.println(result);
    }
}
