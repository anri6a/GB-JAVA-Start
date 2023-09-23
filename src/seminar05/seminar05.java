package seminar05;

import java.util.*;

public class seminar05 {
    public static void main(String[] args) {
        //task1();

        //System.out.println(task2("foo", "bar"));

//        System.out.println(task3("<{a}+{(d*3)}>"));
//        System.out.println(task3("{a+]}{(d*3)}"));

//        TreeMap<Integer, List<String>> treeMap = task4("Мороз и солнце день чудесный Еще ты дремлешь друг прелестный" +
//                "    Пора красавица проснись.");
//        System.out.println(treeMap);

        System.out.println(task4("Мороз и солнце день чудесный Еще ты дремлешь друг прелестный" +
                "    Пора красавица проснись."));


    }

    static void task1() {
        Passports passports = new Passports();
        passports.add("123456", "Иванов");
        passports.add("321456", "Васильев");
        passports.add("234561", "Петрова");
        passports.add("234432", "Иванов");
        passports.add("654321", "Петрова");
        passports.add("345678", "Иванов");
        System.out.println(passports.getByLastName("Иванов"));
        System.out.println(passports.getByPassNum("321456"));
        System.out.println(passports.getAll());
    }


//    Даны 2 строки, написать метод, который вернет true, если эти строки являются изоморфными и false, если нет.
//    Строки изоморфны, если одну букву в первом слове можно заменить на некоторую букву во втором слове, при этом
//    повторяющиеся буквы одного слова меняются на одну и ту же букву с сохранением порядка следования.
//        (Например, add - egg изоморфны)
//    буква может не меняться, а остаться такой же. (Например, note - code)
//    Пример 1:
//    Input: s = "foo", t = "bar"
//    Output: false
//    Пример 2:
//    Input: s = "paper", t = "title"
//    Output: true
    static boolean task2(String str1, String str2) {
        if (str1.length() != str2.length()) return false;
        Map<Character, Character> map = new HashMap<>();
        char[] c1 = str1.toCharArray();
        char[] c2 = str2.toCharArray();
        for (int i = 0; i < c1.length; i++) {
            if (map.containsKey(c1[i])) {
                if (c2[i] != map.get(c1[i])) return false;
            } else {
                map.put(c1[i], c2[i]);
            }
        }
        return true;
    }

    /*Написать программу, определяющую правильность расстановки скобок в выражении.
Пример 1: a+(d*3) - истина
Пример 2: [a+(1*3) - ложь
Пример 3: [6+(3*3)] - истина
Пример 4: {a}[+]{(d*3)} - истина
Пример 5: <{a}+{(d*3)}> - истина
Пример 6: {a+]}{(d*3)} - ложь*/

    static boolean task3(String str){
        HashMap<Character, Character> hashMap = createMap();
        Stack<Character> stack = new Stack<>();
        char[] c = str.toCharArray();
        for (int i = 0; i < c.length; i++) {
            if(hashMap.containsKey(c[i])){
                stack.add(c[i]);
            }
            if(hashMap.containsValue(c[i])){
                if (stack.isEmpty() || c[i]!=hashMap.get(stack.pop())){
                    return false;
                }
            }
        }
        if(!stack.isEmpty()) return false;
        return true;
    }
    static HashMap<Character, Character> createMap (){
        HashMap<Character, Character> hashMap = new HashMap<>();
        hashMap.put('(',')');
        hashMap.put('[',']');
        hashMap.put('{','}');
        hashMap.put('<','>');
        return hashMap;
    }

/*Взять набор строк, например,
    Мороз и солнце день чудесный
    Еще ты дремлешь друг прелестный
    Пора красавица проснись.
Написать метод, который отсортирует эти слова по длине с помощью TreeMap.
Строки с одинаковой длиной не должны “потеряться”.*/
  public   static TreeMap<Integer, List<String>> task4(String str){
        TreeMap<Integer, List<String>> treeMap = new TreeMap<>();
        String[] arr = str.split(" ");
        for (String item: arr) {
            int length = item.length();
            if(!treeMap.containsKey(length)){
                treeMap.put(length, new ArrayList<>());
                treeMap.get(length).add(item);
            } else {
                treeMap.get(length).add(item);
            }
        }
        return treeMap;
    }

}
