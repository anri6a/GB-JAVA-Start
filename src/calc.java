import java.util.Scanner;

public class calc {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("enter first number - ");
//        int a = scanner.nextInt();
//        System.out.print("enter second number - ");
//        int b = scanner.nextInt();
//        char op = '0';
//        System.out.print("enter operation - ");
//        op = scanner.next().charAt(0);
//        scanner.close();
//        if (op != '+' && op != '-' && op != '*' && op != '/') {
//            System.out.println("Некорректный оператор: " + op);
//        } else
//        if (op == '+') System.out.print(a + b);
//        if (op == '-') System.out.print(a - b);
//        if (op == '*') System.out.print(a * b);
//        if (op == '/') System.out.print(a / b);
       // System.out.println(calculate(op,a,b));
    //}

    //static int calculate(char op, int a, int b) {
        // Введите свое решение ниже
        //Scanner scanner = new Scanner(System.in);
        //System.out.print("enter first number - ");
        //int a = scanner.nextInt();
        //System.out.print("enter second number - ");
        //int b = scanner.nextInt();
        //char op = '0';
//        int res = 0;
//        if (op != '+' && op != '-' && op != '*' && op != '/') {
//            System.out.println("Некорректный оператор: " + op);
//        } else
//
//        if (op == '+') res = a + b;
//        if (op == '-') res = a - b;
//        if (op == '*') res = a * b;
//        if (op == '/') res = a / b;
//        return res;
//    }
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter first number - ");
        int a = scanner.nextInt();
        System.out.print("enter second number - ");
        int b = scanner.nextInt();
        char op = '0';
        do {
            System.out.print("enter operation - ");
            op = scanner.next().charAt(0);
        } while (op != '+' && op != '-' && op != '*' && op != '/');
        scanner.close();

        if (op == '+') System.out.print(a + b);
        if (op == '-') System.out.print(a - b);
        if (op == '*') System.out.print(a * b);
        if (op == '/') System.out.print(a / b);
    }
}

