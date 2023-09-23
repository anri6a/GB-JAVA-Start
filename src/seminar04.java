import java.util.*;

public class seminar04 {
    public static void main(String[] args) {
        //task1();
        //task2();
        //task3();
        //task4();
        MyStack myStack = new MyStack();
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
        System.out.println(myStack.empty());
        System.out.println(myStack.pop());
        System.out.println(myStack.peek());
        System.out.println(myStack.size());
    }

    static void task1() {
//        1) Замерьте время, за которое в ArrayList добавятся 10000 элементов.
//        2) Замерьте время, за которое в LinkedList добавятся 10000 элементов. Сравните с предыдущим.
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new LinkedList<>();
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) {
            list1.add(0, i);
        }
        long midle = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) {
            list2.add(0, i);
        }
        long finish = System.currentTimeMillis();
        System.out.println("time to add in ArrayList = " + (midle - start));
        System.out.println("time to add in LinkedList = " + (finish - midle));
        System.out.println(list1);
        System.out.println(list2);
    }

    static void task2() {
//         Реализовать консольное приложение, которое:
//         Принимает от пользователя строку вида
//         text~num
//         Нужно рассплитить строку по ~, сохранить text в связный список на позицию num.
//         Если введено print~num, выводит строку из позиции num в связном списке и удаляет её из списка.
        LinkedList<String> linkedList = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        boolean work = true;
        while (work) {
            System.out.println("enter string - ");
            String line = scanner.nextLine();
            String[] arr = line.split("~");
            int num = Integer.parseInt(arr[1]);
            String text = arr[0];
            switch (text) {
                case "print":
                    System.out.println(linkedList.get(num));
                    linkedList.remove(num);
                    break;
                case "exit":
                    System.out.println("bye");
                    work = false;
                    break;
                default:
                    linkedList.add(num, text);
            }
            System.out.println(linkedList);
        }
    }

    static void task3() {
//        Реализовать консольное приложение, которое:
//        Принимает от пользователя и “запоминает” строки.
//        Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
//        Если введено revert, удаляет предыдущую введенную строку из памяти.
        LinkedList<String> linkedList = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        boolean work = true;
        while (work) {
            System.out.println("enter string - ");
            String line = scanner.nextLine();

            switch (line) {
                case "print":
                    for (int i = linkedList.size() - 1; i >= 0; i--) {
                        System.out.println(linkedList.get(i));
                    }
                    break;
                case "revert":
                    linkedList.removeLast();
                    break;
                case "exit":
                    System.out.println("bye");
                    work = false;
                    break;
                default:
                    linkedList.add(line);
            }
            System.out.println(linkedList);
        }
    }

    static void task4() {
//        1) Написать метод, который принимает массив элементов,
//                помещает их в стэк и выводит на консоль содержимое стэка.
//        2) Написать метод, который принимает массив элементов,
//                помещает их в очередь и выводит на консоль содержимое очереди
        int[] arr = {3, 5, 8, 87, 456, 987, 23, 465, 764576};
        Stack<Integer> stack = new Stack<>();
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < arr.length; i++) {
            stack.push(arr[i]);
            queue.add(arr[i]);
        }
        while (!stack.isEmpty()){
            System.out.print(stack.pop());
            System.out.print("\t");
            System.out.println(queue.poll());
        }
    }

//        Реализовать стэк с помощью массива. Нужно реализовать методы:
//        size(), empty(), push(), peek(), pop().




}

