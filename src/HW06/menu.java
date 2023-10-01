package HW06;

import java.util.Scanner;

public class menu {
    static Integer number;
 public static void userMenu() {
     Scanner scannerMenu = new Scanner(System.in);

     do {
         System.out.println("Select operation for filter:\n" +
                 "1 - NAME\n" +
                 "2 - RAM\n" +
                 "3 - HDD\n" +
                 "4 - OS\n" +
                 "5 - Color\n" +
                 "6 - Screen Size\n" +
                 "7 - Show all NoteBooks\n" +
                 "8 - Show my filter\n" +
                 "9 - Find NoteBooks\n" +
                 "enter your choice");
         number = scannerMenu.nextInt();
     } while (number != 1 && number != 2 && number != 3 && number != 4 && number != 5 && number != 6
             && number != 7 && number != 8 && number != 9);

    // return number;

 }

}
