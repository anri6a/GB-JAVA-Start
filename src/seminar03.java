import java.util.*;

public class seminar03 {
    public static void main(String[] args) {
        //task1();
        //task2();
        //task3();
        task4();
    }

    static void task1() {
        /*ƒаны следующие строки, cравнить их с помощью == и метода equals() класса Object*/
        String s1 = "hello";
        String s2 = "hello";
        String s3 = s1;
        String s4 = "h" + "e" + "l" + "l" + "o";
        String s5 = new String("hello");
        String s6 = new String(new char[]{'h', 'e', 'l', 'l', 'o'});
        s5 = s5.intern();
        System.out.println(s1 == s2);
        System.out.println(s2 == s3);
        System.out.println(s3 == s4);
        System.out.println(s4 == s5);
        System.out.println(s5 == s6);

        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s3));
        System.out.println(s3.equals(s4));
        System.out.println(s4.equals(s5));
        System.out.println(s5.equals(s6));
    }

    static void task2() {
        //«аполнить список дес€тью случайными числами. ќтсортировать список методом sort() и вывести его на экран.

        Random random = new Random();
        ArrayList<Integer> arrayList = new ArrayList();
        for (int i = 0; i < 10; i++) {
            arrayList.add(random.nextInt(100, 200));
        }
        Collections.sort(arrayList);
        System.out.println(arrayList);
        Collections.sort(arrayList, Comparator.reverseOrder());
        System.out.println(arrayList);
    }

    static void task3() {
        //—оздать список типа ArrayList<String>. ѕоместить в него как строки, так и целые числа.
        // ѕройти по списку, найти и удалить целые числа.

        List list = new ArrayList(List.of("nvcv", 34, "qwert", 98));

        // list.removeIf(i -> i.getClass().getSimpleName().equals("Integer")); // 1 - variant

//        for (int i = 0; i < list.size(); i++) {                               // 2 - variant
//            if(list.get(i).getClass().getSimpleName().equals("Integer")){
//                list.remove(i);
//                i--;
//            }
//        }
//        for (int i = 0; i < list.size(); i++) {                                 //3 - variant
//            if (list.get(i) instanceof Integer) {
//                list.remove(i);
//            }

          Iterator iterator = list.iterator();                                  //4 - variant
            while (iterator.hasNext()){
                if (iterator.next() instanceof Integer){
                    iterator.remove();
                }
            }


        System.out.println(list);
    }


    static void task4() {
        /* аталог товаров книжного магазина сохранен в виде двумерного списка
        List<ArrayList<String>> так, что на 0й позиции каждого внутреннего списка
        содержитс€ название жанра, а на остальных позици€х - названи€ книг.
        Ќапишите метод дл€ заполнени€ данной структуры.*/
        List<List<String>> bookShop = new ArrayList<>();
        addBook("Mult", "Birds", bookShop);
        addBook("Mult", "Zveropolis", bookShop);
        addBook("Adventure", "Gold Prisk", bookShop);
        addBook("Horror", "Candy Man", bookShop);
        addBook("Action", "Born Identity", bookShop);
        addBook("Comedy", "Mister Pitkin", bookShop);

        System.out.println(bookShop);

    }
    static void addBook(String ganre, String name, List<List<String>> bookShop){
        for (int i = 0; i < bookShop.size(); i++) {
            if(bookShop.get(i).get(0).equals(ganre)){
                bookShop.get(i).add(name);
                return;
            }
        }
        List<String> list = new ArrayList<>();
        list.add(ganre);
        list.add(name);
        bookShop.add(list);
    }
}
