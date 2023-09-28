package HW05;


/*Задание
Реализуйте структуру телефонной книги с помощью HashMap.
Программа также должна учитывать, что во входной структуре будут повторяющиеся имена с разными телефонами,
их необходимо считать, как одного человека с разными телефонами.
Вывод должен быть отсортирован по убыванию числа телефонов.*/

import com.sun.jdi.Value;

import java.util.*;
import java.util.stream.Collectors;

public class PhoneBook {
    public static void main(String[] args) {

        addItemPhoneBook("andrei", "5568654");
        addItemPhoneBook("andrei", "5667842");
        addItemPhoneBook("alex", "8303044");
        addItemPhoneBook("sergey", "7846723");
        addItemPhoneBook("masha", "57547001");
        addItemPhoneBook("sergey", "5754700");
        addItemPhoneBook("masha", "5754700");
        addItemPhoneBook("sergey", "5754700");


        add("Olga", "1234");
        System.out.println(findName("sergey"));
        System.out.println(convertHashMapToTreeMap(workHashMap));


    }

    public static HashMap<String, List<String>> workHashMap = new HashMap<>();

    public static HashMap<String, List<String>> addItemPhoneBook(String name, String phone) {
        if (!workHashMap.containsKey(name)) {
            workHashMap.put(name, new ArrayList<>());
        }
        workHashMap.get(name).add(phone);
        return workHashMap;
    }


    public static Map<String, String> convertHashMapToTreeMap(HashMap<String, List<String>> hashMap) {
        Map<String, String> convertedMap = new TreeMap<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int lengthDifference = o2.length() - o1.length();
                if (lengthDifference != 0) return lengthDifference;
                return o1.compareTo(o2);
            }
        });
        for (Map.Entry<String, List<String>> e :
                hashMap.entrySet()) {
            convertedMap.put(e.getValue().toString(), e.getKey());
        }
        return convertedMap;
    }

    static String findName(String name) {
        for (Map.Entry<String, List<String>> entry : workHashMap.entrySet()) {
            if (entry.getKey().equals(name)) {
                return name + ": " + entry.getValue();
            }
        }
        return null;
    }

    static void add(String name, String number) {
        if (workHashMap.containsKey(name)) {
            List<String> list = workHashMap.get(name);
            list.add(number);
        } else {
            List<String> list = new ArrayList<>();
            list.add(number);
            workHashMap.put(name, list);
        }
    }


//    public static Map<String, String> convertHashMapToTreeMap(HashMap<String, String> hashMap){
//        Map<String, String> convertedMap = new TreeMap<>();
//    //Map<Integer, List<String>> mapSort = new TreeMap<>(Comparator.reverseOrder());
//        for(Map.Entry<String, String> entry: hashMap.entrySet()){
//        String name = entry.getKey();
//        int count = entry.getValue();
//        if(mapSort.containsKey(count)){
//            List<String> list = mapSort.get(count);
//            list.add(name);
//        } else{
//            List<String> list = new ArrayList<>();
//            list.add(name);
//            mapSort.put(count, list);
//        }
//    }

}
