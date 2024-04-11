import java.util.*;

public class Calculator {
    
    public static void calculator(int x, char operator) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int y = sc.nextInt();
        int result = 0;
        switch (operator) {
            case '+':
                result = x + y;
                break;
            case '-':
                result = x - y;
                break;
            case '*':
                result = x * y;
                break;
            case '/':
                result = x / y;
                break;
        }
        System.out.println("Enter operator ");
        char op = sc.next().charAt(0);
        if (op == '=') {
            System.out.println(result);
        } else if(op =='-' || op == '+' || op == '/' || op == '*') {
            calculator(result, op);
        } else {
            System.out.println("Invalid operator");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int x = sc.nextInt();
        System.out.println("Enter Operator");
        char operator = sc.next().charAt(0);
        if (operator == '=') {
            System.out.println(x);
        } else if (operator == '+' || operator == '-' || operator == '/' || operator == '*') {
            calculator(x, operator);
        } else {
            System.out.println("Invalid operator");
        }
    }
}
