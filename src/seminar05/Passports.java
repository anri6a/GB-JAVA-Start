package seminar05;

import java.util.HashMap;
import java.util.Map;

public class Passports {
//    ������� ��������� ��� �������� ������� ��������� � ������� ����������� �����������.
//123456 ������
//321456 ��������
//234561 �������
//234432 ������
//654321 �������
//345678 ������
//    ������� ������ �� ����������� � �������� ������.

    private Map<String, String> map = new HashMap<>();
    void add(String passNum, String lastName){
        map.put(passNum, lastName);
    }
    String getByPassNum(String passNum){
        return passNum + ':' + map.get(passNum);
    }
    String getByLastName(String lastName){
        StringBuilder stringBuilder = new StringBuilder();
        for (Map.Entry entry:
                map.entrySet()) {
            if (entry.getValue().equals("lastName")){
                stringBuilder.append(entry.getKey()).
                            append(" : ").
                            append(lastName).append('\n');
            }
            
        }
        return stringBuilder.toString();
    }
    String getAll(){
        return map.toString();
    }
}
