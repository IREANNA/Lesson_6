import Calculator.ComplexCalculator;
import Numbers.ComplexNumber;
import Start.CalculatorStart;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        CalculatorStart calculatorStart = new CalculatorStart();
//        calculatorStart.start();
//        меняет знаки???

        System.out.println("1 число:");
        Scanner scanner = new Scanner(System.in);

        ComplexNumber number1 = new ComplexNumber();
        number1.validation(scanner.nextLine());
        System.out.println("2 число:");
        ComplexNumber number2 = new ComplexNumber();
        number2.validation(scanner.nextLine());


        ComplexCalculator complexCalculator = new ComplexCalculator();
        complexCalculator.setNumber1(number1);
        complexCalculator.setNumber2(number2);
        System.out.println("сумма");
        complexCalculator.sum();
        System.out.println("разность");
        complexCalculator.subtraction();
        System.out.println("произведение");
        complexCalculator.multiplication();
        System.out.println("частное");
        complexCalculator.division();

    }}
