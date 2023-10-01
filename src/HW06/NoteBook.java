package HW06;


import java.util.HashSet;
import java.util.Set;

public class NoteBook {
    private String name;
    private int ram;
    private int hdd;
    private String os;
    private String color;
    private int screenSize;

    public NoteBook(String name, int ram, int hdd, String os, String color, int screenSize) {
        this.name = name;
        this.color = color;
        this.os = os;
        this.ram = ram;
        this.hdd = hdd;
        this.screenSize = screenSize;
    }

    @Override
    public String toString() {
        return "Name - " + name + "; RAM - " + ram + "; HDD - " + hdd + "; ScreenSize - "
                + screenSize + "; OS - " + os + "; Color - " + color + "\n";
    }

   public static Set<NoteBook> noteBookSet = new HashSet<>();

    public static Set createNoteBooksSet(){
        NoteBook noteBook1 = new NoteBook("HP", 16, 1024, "Linux", "black", 15);
        NoteBook noteBook2 = new NoteBook("MacBook", 24, 512, "MacOS", "silver", 14);
        NoteBook noteBook3 = new NoteBook("Lenovo", 8, 2048, "Win", "black", 15);
        NoteBook noteBook4 = new NoteBook("Dell", 4, 1024, "Win", "grey", 17);


        noteBookSet.add(noteBook1);
        noteBookSet.add(noteBook2);
        noteBookSet.add(noteBook3);
        noteBookSet.add(noteBook4);
        return noteBookSet;
    }

}
