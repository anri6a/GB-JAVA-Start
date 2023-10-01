package HW06;

import java.util.*;

public class methods {
    static Map<String, String> filterHashMap = new HashMap<>();


    //    String input = scanner.next();
// static int input;
//    public static void showMenu() {
//        menu.userMenu();
//    }
    public static void inputFilter(){
        Scanner scanner = new Scanner(System.in);
        menu.userMenu();
        switch (menu.number) {
            case 1:
                System.out.print("NAME: ");
                String volumeNAME = scanner.next();
                sefeFiltrToMap("NAME", volumeNAME, filterHashMap);
                inputFilter();
                //break;
            case 2:
                System.out.println("RAM (4-16) >=: ");
                String volumeRAM = scanner.next();
                sefeFiltrToMap("RAM", volumeRAM, filterHashMap);
                inputFilter();
                //break;
            case 3:
                System.out.println("HDD >=: ");
                String volumeHDD = scanner.next();
                sefeFiltrToMap("HDD", volumeHDD, filterHashMap);
                inputFilter();
                //break;
            case 4:
                System.out.println("OS: ");
                String volumeOS = scanner.next();
                sefeFiltrToMap("OS", volumeOS, filterHashMap);
                inputFilter();
                //break;
            case 5:
                System.out.println("Color: ");
                String volumeColor = scanner.next();
                sefeFiltrToMap("Color", volumeColor, filterHashMap);
                inputFilter();
                //break;
            case 6:
                System.out.println("Screen Size >=: ");
                String volumeScreenSize = scanner.next();
                sefeFiltrToMap("ScreenSize", volumeScreenSize, filterHashMap);
                inputFilter();
                //break;
            case 7:
                System.out.println(NoteBook.noteBookSet);
                inputFilter();
                //break;
            case 8:
                System.out.println(filterHashMap);
                inputFilter();
                //break;
            case 9:

                break;
            default:
                break;
        }

    }
    public static Set<NoteBook> copyHashSet = new HashSet<>();

   public static Set<NoteBook> findNoteBooks(Set<NoteBook> noteBooks, Map<String,String> filterHashMap){
        copyHashSet.addAll(NoteBook.noteBookSet);

        if(filterHashMap.get("NAME") !=null){
            copyHashSet.removeIf(nb -> (!filterHashMap.containsValue("name")));
        }
        if (filterHashMap.get("operatingSystem") != null){
            copyHashSet.removeIf(laptop -> (!filterHashMap.containsValue(laptop.os)));
        }

        if (filterHashMap.get("color") != null){
            copyHashSet.removeIf(laptop -> (!filterHashMap.containsValue(laptop.color)));
        }

        if (filterHashMap.get("RAM") != null){
            copyHashSet.removeIf(laptop -> !(laptop.ram >= Integer.parseInt(filterHashMap.get("RAM"))));
        }

        if (filterHashMap.get("HDD") != null) {
            copyHashSet.removeIf(laptop -> !(laptop.hdd >= Integer.parseInt(filterHashMap.get("HDD"))));
        }
        return copyHashSet;
    }



    public static Map<String, String> sefeFiltrToMap(String field, String userChoiceData, Map filterHashMap) {
        filterHashMap.put(field, userChoiceData);
        return filterHashMap;
    }
}
