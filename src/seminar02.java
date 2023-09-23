import java.io.FileWriter;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class seminar02 {
    public static void main(String[] args) {
//      task1(8, 'n' , 'o');
//      task2("aaaahhddddmhhsddd");
//      System.out.println(task3("� ���� ����� �� ���� �����"));
        task4Log(myRepit(100, "TEST"));
    }

    static void task1(int n, char c1, char c2) {
//        ���� ������ ����� N (>0) � ������� c1 � c2. �������� �����,
//        ������� ������ ������ ����� N, ������� ������� �� ������������
//        �������� c1 � c2, ������� � c1.
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < n / 2; i++) {
            stringBuilder.append(c1).append(c2);
        }
        System.out.println(stringBuilder);
    }

    static void task2(String workString) {
//        �������� �����, ������� ������� ������. ������: ���� aaaabbbcdd.
//�����: ��������� - a4b3cd2 ��� �������
        StringBuilder stringBuilder = new StringBuilder();
        char[] charArray = workString.toCharArray();
        int count = 1;
        for (int i = 1; i < charArray.length; i++) {
            if (charArray[i - 1] == charArray[i]) {
                count++;
            } else {
                stringBuilder.append(charArray[i - 1]).append(count);
                count = 1;
            }
        }
        stringBuilder.append(charArray[charArray.length - 1]).append(count);
        System.out.println(stringBuilder);
    }

    static boolean task3(String dateStr) {
//        �������� �����, ������� ��������� �� ���� ������ (String) �
//        ���������� �������� �� ������ ����������� (���������� boolean ��������).
        dateStr = dateStr.replace(" ", "");
        StringBuilder stringBuilder = new StringBuilder(dateStr);
        String reverseDateString = stringBuilder.reverse().toString();
        return dateStr.equals(reverseDateString);
    }

    static void task4(String word) {
//        �������� �����, ������� �������� ������, ��������� �� 100 ���������� ����� TEST �
//        �����, ������� ������� ��� ������ � ������� ��������� ����, ����������� ����������.
//        (����������� ������ � ������� try-catch �����������. � ������ ������������� ����������,
//        ��� ������ ���������� � ���-����.)
        try {
            FileWriter fileWriter = new FileWriter("text.txt"); //  FileWriter fileWriter =
            // new FileWriter("text.txt", True); -
            // ����� ���������� � ����� �����
            fileWriter.write(word);
            fileWriter.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    static String myRepit(int n, String dateString) {
        return dateString.repeat(n);
    }

    static void task4Log(String word) {
//        �������� �����, ������� �������� ������, ��������� �� 100 ���������� ����� TEST �
//        �����, ������� ������� ��� ������ � ������� ��������� ����, ����������� ����������.
//        (����������� ������ � ������� try-catch �����������. � ������ ������������� ����������,
//        ��� ������ ���������� � ���-����.)
        Logger logger = Logger.getAnonymousLogger();
        FileHandler fileHandler = null;
        try {
            fileHandler = new FileHandler("log.txt");
        } catch (Exception e) {
            e.printStackTrace();
        }
        logger.addHandler(fileHandler);
        SimpleFormatter simpleFormatter = new SimpleFormatter();
        fileHandler.setFormatter(simpleFormatter);
        try {
            FileWriter fileWriter = new FileWriter("/t/t/t/text.txt"); //  FileWriter fileWriter =
                                                                                // new FileWriter("text.txt", True); -
                                                                                // ����� ���������� � ����� �����
            fileWriter.write(word);
            fileWriter.flush();
        } catch (Exception e) {
            logger.log(Level.INFO, e.getMessage());
            e.printStackTrace();
        }
    }
}
