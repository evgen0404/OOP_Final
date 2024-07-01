package View;

import java.util.Scanner;

import Controller.CalculatorController;
import Model.ComplexNumber;
import Service.Addition;
import Service.Division;
import Service.Multiplication;
import Service.Operation;

public class Menu {
    private final CalculatorController controller;
    private final Scanner scanner;

    public Menu(CalculatorController controller) {
        this.controller = controller;
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        while (true) {
            System.out.println("Меню:");
            System.out.println("1. Сложение");
            System.out.println("2. Умножение");
            System.out.println("3. Деление");
            System.out.println("4. Выход");
            System.out.print("Выберите операцию: ");

            int choice = scanner.nextInt();
            if (choice == 4) {
                System.out.println("Выход из программы.");
                break;
            }

            ComplexNumber a = inputComplexNumber("Введите первое комплексное число (в формате 'реальная мнимая'): ");
            ComplexNumber b = inputComplexNumber("Введите второе комплексное число (в формате 'реальная мнимая'): ");

            Operation operation;
            switch (choice) {
                case 1:
                    operation = new Addition();
                    break;
                case 2:
                    operation = new Multiplication();
                    break;
                case 3:
                    operation = new Division();
                    break;
                default:
                    System.out.println("Некорректный выбор, попробуйте снова.");
                    continue;
            }

            ComplexNumber result = controller.execute(operation, a, b);
            System.out.println("Результат: " + result);
        }
    }

    private ComplexNumber inputComplexNumber(String prompt) {
        System.out.print(prompt);
        double real = scanner.nextDouble();
        double imag = scanner.nextDouble();
        return new ComplexNumber(real, imag);
    }
}


    