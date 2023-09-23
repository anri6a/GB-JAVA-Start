import java.util.Scanner;

public class HW01 {
    public static void main(String[] args) {
        //System.out.println(countNTriangle(5));
        //printPrimeNums();
        choice();

    }

    static int countNTriangle(int n) {
        int result = 0;
        for (int i = n; i >0; i--) {
            result = result + i;
        }
        return result;
    }
    static void printPrimeNums(){
//        Напишите функцию printPrimeNums, которая выведет на экран все простые числа в промежутке от 1 до 1000,
//            каждое на новой строке. Напишите свой код в методе printPrimeNums класса Answer
        System.out.println(1);
        System.out.println(2);
        for (int i = 2; i < 1000; i++) {
            int x = 1;
            for (int j = 2; j < Math.sqrt(i)+1; j++) {
                if (i % j == 0) {
                    x = 0;
                }
            }
            if (x == 1) {
                System.out.println(i);
            }
        }
    }
    static void choice(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter first number - ");
        int a = scanner.nextInt();
        System.out.println("enter second number - ");
        int b = scanner.nextInt();
        System.out.println("enter operation - ");
        String op = scanner.nextLine();
    }
    static int calculate(char op, int a, int b){

        int result = 0;

        return result;
    }
}
