package Start;

import Calculator.ComplexCalculator;
import Numbers.ComplexNumber;

import java.util.Scanner;

public class CalculatorStart implements ProgramStart {

    @Override
    public void start() {
        ComplexCalculator complexCalculator = new ComplexCalculator();
        Scanner scanner = new Scanner(System.in);
        ComplexNumber number = new ComplexNumber();
        System.out.println("ВВедите первое число: ");
        number.validation(scanner.nextLine());
        System.out.println(number);
        complexCalculator.setNumber1(number);
        System.out.println("Введите второе число: ");
        number.validation(scanner.nextLine());
        System.out.println(number);
        complexCalculator.setNumber2(number);
        System.out.println("Выберите действие (+, -, *, /): ");
        String operand = scanner.next();
        switch (operand){
            case "+": {complexCalculator.sum();
                break;}
            case "-": {complexCalculator.subtraction();
                break;}
            case "*": {complexCalculator.multiplication();
                break;}
            case "/": {complexCalculator.division();
                break;}
            default:
                System.out.println("Неверное действие");

        }
    }
}
