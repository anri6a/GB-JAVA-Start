package HW06;

import java.util.*;

public class methods {
    static Map<String, String> filterHashMap = new HashMap<>();

    public static void inputFilter() {
        Scanner scanner = new Scanner(System.in);
        menu.userMenu();
        switch (menu.number) {
            case 1:
                System.out.print("NAME (HP, Lenovo, Dell, MacBook): ");
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
                System.out.println("HDD (512 - 2048) >=: ");
                String volumeHDD = scanner.next();
                sefeFiltrToMap("HDD", volumeHDD, filterHashMap);
                inputFilter();
                //break;
            case 4:
                System.out.println("OS (Linux, Win, MacOS): ");
                String volumeOS = scanner.next();
                sefeFiltrToMap("OS", volumeOS, filterHashMap);
                inputFilter();
                //break;
            case 5:
                System.out.println("Color (black, silver, grey): ");
                String volumeColor = scanner.next();
                sefeFiltrToMap("Color", volumeColor, filterHashMap);
                inputFilter();
                //break;
            case 6:
                System.out.println("Screen Size (14 - 17) >=: ");
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
                //findNoteBooks(NoteBook.noteBookSet, filterHashMap);
                System.out.println(findNoteBooks(NoteBook.noteBookSet, filterHashMap));
                break;
            default:
                break;
        }

    }


    public static Set<NoteBook> findNoteBooks(Set<NoteBook> noteBooks, Map<String, String> filterHashMap) {
        Set<NoteBook> copyHashSet = new HashSet<>();
        copyHashSet.addAll(noteBooks);
        //copyHashSet.addAll(NoteBook.noteBookSet);

        if (filterHashMap.get("NAME") != null) {
            copyHashSet.removeIf(laptop -> (!filterHashMap.containsValue(laptop.name)));
        }
        if (filterHashMap.get("OS") != null) {
            copyHashSet.removeIf(laptop -> (!filterHashMap.containsValue(laptop.os)));
        }

        if (filterHashMap.get("Color") != null) {
            copyHashSet.removeIf(laptop -> (!filterHashMap.containsValue(laptop.color)));
        }

        if (filterHashMap.get("RAM") != null) {
            copyHashSet.removeIf(laptop -> !(laptop.ram >= Integer.parseInt(filterHashMap.get("RAM"))));
        }

        if (filterHashMap.get("HDD") != null) {
            copyHashSet.removeIf(laptop -> !(laptop.hdd >= Integer.parseInt(filterHashMap.get("HDD"))));
        }
        if (filterHashMap.get("ScreenSize") != null) {
            copyHashSet.removeIf(laptop -> !(laptop.hdd >= Integer.parseInt(filterHashMap.get("ScreenSize"))));
        }
        return copyHashSet;
    }


    public static void sefeFiltrToMap(String field, String userChoiceData, Map filterHashMap) {
        filterHashMap.put(field, userChoiceData);
    }
}
