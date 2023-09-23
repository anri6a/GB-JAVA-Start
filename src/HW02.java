import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Collectors;

public class HW02 {
    public static void main(String[] args) throws IOException {
//        ���� ������ sql-�������:
//        select * from students where "
//        ����������� ����� WHERE ����� �������, ��������� StringBuilder.
//        ������ ������ ��� ���������� ��������� ���� � ���� json-������.
//        ���� �������� null, �� �������� �� ������ �������� � ������.
//        ������:
//        {"name": "Ivanov", "country": "Russia", "city": "Moscow", "age": "null"}
//        �������� ���� ��� � ������ answer ������ Answer. ����� answer ��������� �� ���� ��� ���������:
//        String QUERY - ������ SQL-�������
//        String PARAMS - JSON � �����������
//
//        System.out.println(task1("select * from students where ",
//                "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"} "));
        int[] arr = new int[]{10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        bubleSort(arr);
    }

    static StringBuilder task1(String QUERY, String PARAMS) {
        System.out.println(PARAMS);
        PARAMS = PARAMS.replace('{', ' ').replace('}', ' ').
                replaceAll("\\s", "").replaceAll("\"", "");
        System.out.println(PARAMS);
        String[] pairs = PARAMS.split(",");

        Map<String, String> map = new TreeMap<>(Collections.reverseOrder());
        StringBuilder stringBuilder = new StringBuilder();
        for (String pair : pairs) {
            String[] keyVal = pair.split(":");
            map.put(keyVal[0], '\'' + keyVal[1] + '\'');
            System.out.println(map);
            stringBuilder.append(keyVal[0] + "=" + keyVal[1]);
        }

        map.values().removeIf(value -> value.contains("null"));

        String resMapToStr = map.entrySet().stream().map(Objects::toString).collect(Collectors.joining(" and "));
        stringBuilder.delete(0, stringBuilder.length());
        System.out.println(resMapToStr);
        stringBuilder.append(QUERY).append(resMapToStr);
        return stringBuilder;

        /*������� �������
        * String paramsNew = PARAMS.replace('{',' ').replace('}', ' ');
        String[] params = paramsNew.split(",");
        StringBuilder stringBuilder = new StringBuilder(QUERY);

        for (int i = 0; i < params.length; i++){
            String[] elements = params[i].replace('"', ' ').split(":");
            if(!"null".equals(elements[1].trim())){
              stringBuilder.append(elements[0].trim()).append("=").append("'").append(elements[1].trim()).append("'");
                if (i < params.length - 2) stringBuilder.append(" and ");
            }
        }
        return stringBuilder;
        * */
    }

    static void bubleSort(int[] mas) throws IOException {
//        ���������� �������� ���������� ��������� ��������� �������,
//        ��������� ����� ������ �������� �������� � ���-����.
//        �������� ���� ��� � ������ sort ������ BubbleSort. ����� sort ��������� �� ���� ���� ��������:
//        int[] arr - �������� ������
//        ����� ������ ��������, ��� ��� ������ ������ ������ � ���-���� 'log.txt'
//        � ������� ���-�����-���� ���:������ {������ �� ������ ��������}
        FileWriter fileWriter = new FileWriter("log.txt");
        LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm ");

        int temp;
        boolean unsorted = true;
        while (unsorted) {
            unsorted = false;
            for (int i = 0; i < mas.length - 1; i++) {
                if (mas[i] > mas[i + 1]) {
                    temp = mas[i];
                    mas[i] = mas[i + 1];
                    mas[i + 1] = temp;
                    unsorted = true;
                }
            }
            fileWriter.append(localDateTime.format(dateTimeFormatter) + Arrays.toString(mas) + '\n');
        }
        fileWriter.flush();
        fileWriter.close();
    }
}
