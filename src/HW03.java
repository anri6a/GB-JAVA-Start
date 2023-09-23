import java.util.*;



public class HW03 {
    public static void main(String[] args) {

//        int[] workArray = new int[]{5, 1, 6, 2, 3, 4};
//        System.out.println(Arrays.toString(mergeSort(workArray)));

//        Integer[] arr = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
//        removeEvenNumbers(arr);

        Integer[] arr = new Integer[]{4, 2, 7, 5, 1, 3, 8, 6, 9};
        analyzeNumbers(arr);

    }

    /*¬нутри класса MergeSort напишите метод mergeSort,
        который принимает массив целых чисел a и реализует алгоритм сортировки сли€нием.
        ћетод должен возвращать отсортированный массив.
         */
    public static int[] mergeSort(int[] a) {
        // Ќапишите свое решение ниже
        if (a.length <= 1) return a;
        int[] arrayB = Arrays.copyOfRange(a, 0, a.length / 2);
        int[] arrayC = Arrays.copyOfRange(a, a.length / 2, a.length);
        return merge(mergeSort(arrayB), mergeSort(arrayC));
    }

    private static int[] merge(int[] arrayB, int[] arrayC) {
        int[] arrayA = new int[arrayB.length + arrayC.length];
        int positionB = 0;
        int positionC = 0;
        int i = 0;

        while (positionB < arrayB.length && positionC < arrayC.length)
            if (arrayB[positionB] < arrayC[positionC])
                arrayA[i++] = arrayB[positionB++];
            else arrayA[i++] = arrayC[positionC++];

        while (i < arrayA.length)
            if (positionB != arrayB.length)
                arrayA[i++] = arrayB[positionB++];
            else arrayA[i++] = arrayC[positionC++];

        return arrayA;
    }
    /*Ќапишите функцию removeEvenNumbers, котора€ принимала бы произвольный список целых чисел,
    удал€ла бы из него четные числа и выводила список без четных чисел.
    Ќапишите свой код в методе removeEvenNumbers класса Answer.
    ћетод removeEvenNumbers принимает на вход один параметр:
    Integer[] arr - список целых чисел*/

    static void removeEvenNumbers(Integer[] arr) {

        List<Integer> arrayList = new ArrayList<>(Arrays.asList(arr));
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) % 2 == 0) {
                arrayList.remove(i);
                i -= 1;
            }
        }
        System.out.println(arrayList);
    }
    static void analyzeNumbers (Integer[] arr){
        List<Integer> list = new ArrayList<>(Arrays.asList(arr));
        Collections.sort(list);
        System.out.println(list);
        System.out.println("Minimum is "+Collections.min(list));
        System.out.println("Maximum is "+Collections.max(list));
        int sum = 0;
        for (int i:
             list) {
            sum+=i;
        }
        System.out.println("Average is = "+sum/list.size());
    }


}


