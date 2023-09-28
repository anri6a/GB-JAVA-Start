package seminar06;

import java.util.*;

public class main {
    /*
     * Создать HashSet
     *         LinkedHashSet
     *         TreeSet
     *                       заполнить их цифрами и распечатать*/

    public static void main(String[] args) {
        //task1();
        //System.out.printf("%.2f", arraySet(createFillArray(0, 24, 999)));
        Cat cat1 = new Cat("Murka", "Oleg", "seam", 8);
        Cat cat2 = new Cat("Rijik", "Oleg", "seam", 8, "my favorit cat");
        Cat cat3 = new Cat("Rijik", "Oleg", "seam", 8, "my favorit cat");
//        System.out.println(cat1);
//        System.out.println(cat2);
        Set<Cat> set = new HashSet<>();
        set.add(cat1);
        set.add(cat2);
        set.add(cat3);
        System.out.println(set);
        System.out.println(cat2.equals(cat3));
    }

    public static void task1() {
        Integer[] arr = {1, 23, 5, 76, 90, 2, 5, 23, 9};
        Set<Integer> set1 = new HashSet<>(Arrays.asList(arr));
        Set<Integer> set2 = new LinkedHashSet<>(Arrays.asList(arr));
        Set<Integer> set3 = new TreeSet<>(Arrays.asList(arr));

        System.out.println(set1);
        System.out.println(set2);
        System.out.println(set3);
    }

    /*
     * 1. метод, который заполнит массив 1000 элементов случайно 0..24
     * 2. метод который с помощью Set вычислит процент уникальных значений и
     * вернет его в виде числа с плавающей запятой
     * по формуле = уникальные числа*100 /общее количество чисел в мессиве*/
    public static Integer[] createFillArray(int start, int stop, int size) {
        Integer[] array = new Integer[size];
        Random random = new Random();
        for (int i = 0; i<array.length; i++){
            array[i] = random.nextInt(start, stop);
            //System.out.println(array[i]);
        }
        return array;
    }
    static Double arraySet(Integer[] array){
        Set<Integer> set = new HashSet<>(Arrays.asList(array));
        double percent = ((set.size()*100.0)/array.length);
        return percent;
    }
}
