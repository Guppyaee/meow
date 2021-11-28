import java.util.Scanner;

public class circle {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
/*
        if (scanner.hasNextInt()) {
            int operand1 = scanner.nextInt(); //считывает число
        } else {
            System.out.println("Извините, но это явно не число. Перезапустите программу и попробуйте снова!");
        } */

        int operand1 = scanner.nextInt(); //считывает число

        char operation = scanner.next().charAt(0);

        int operand2 = scanner.nextInt(); //считывает число

        double result = 0;

        switch (operation) {
            case '+':
                result = operand1 + operand2;
                break;
            case '-':
                result = operand1 - operand2;
                break;
            case '*':
                result = operand1 * operand2;
                break;
            case '/':
                result = operand1 / operand2;
                break;
            default:
                System.out.println("Неизвестная операция");
        }
        System.out.println("Результат " + result);
    }
}