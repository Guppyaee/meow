import java.util.Scanner;

public class calc2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

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

        String str = String.toString();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
}