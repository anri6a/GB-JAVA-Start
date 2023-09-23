import java.time.LocalTime;
import java.util.Arrays;
import java.util.Scanner;


public class seminar01 {
    public static void main(String[] args) {
        task5();
    }

    static void task1() {
        // Task1
// В консоли запросить имя пользователя. В зависимости от текущего времени, вывести приветствие вида
// "Доброе утро, <Имя>!", если время от 05:00 до 11:59
// "Добрый день, <Имя>!", если время от 12:00 до 17:59;
// "Добрый вечер, <Имя>!", если время от 18:00 до 22:59;
// "Доброй ночи, <Имя>!", если время от 23:00 до 4:59
        System.out.printf("Your name - ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        LocalTime localTime = LocalTime.now();
        int hour = localTime.getHour();
        if (hour >= 5 && hour < 12) {
            System.out.println("Good morning " + name);
        } else if (hour >= 12 && hour < 18) {
            System.out.printf("Good day " + name);
        } else if (hour >= 18 && hour < 23) {
            System.out.printf("Good evening " + name);
        } else {
            System.out.printf("Good night " + name);
        }
        scanner.close();
    }

    static void task2() {
// Task2
// Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести максимальное количество подряд идущих 1.
        int[] arr = {1, 1, 0, 0, 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 1};
        int count = 0;
        int maxOnes = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                count++;
            } else {
                if (maxOnes < count) {
                    maxOnes = count;
                }
                count = 0;
            }
        }
        if (maxOnes < count) {
            maxOnes = count;
        }
        System.out.print(maxOnes);
    }

    static void task3() {
        // Task3
// Дан массив nums = [3,2,5,3] и число val = 3.
// Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
// Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного, а остальные - равны ему.
        int[] nums = {3, 2, 2, 3};
        int val = 3;
        int[] tempArr = new int[nums.length];
        Arrays.fill(tempArr, val);
        int current = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                tempArr[current++] = nums[i];
            }
        }
        System.out.print(Arrays.toString(tempArr));
    }

    static void task4() {
        // Task4
// Во фразе "Добро пожаловать на курс по Java" переставить слова в обратном порядке.
        String workString = "welcom to new java course ";
        String [] stringArr = workString.split(" ");
        String tempWord = "";
        for (int i = 0; i < stringArr.length; i++) {
            tempWord = tempWord + stringArr[stringArr.length-1-i] + " ";
        }
        System.out.println(tempWord);
    }
    static void task5(){
        // Возвести a в степень b
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number - ");
        int a = scanner.nextInt();
        System.out.print("Enter second number - ");
        int b = scanner.nextInt();
        int res = a;
        for (int i = 0; i < b-1; i++) {
            res *= a;
        }
        System.out.println(res);
        scanner.close();
    }

}


