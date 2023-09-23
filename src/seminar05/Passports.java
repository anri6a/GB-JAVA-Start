package seminar05;

import java.util.HashMap;
import java.util.Map;

public class Passports {
//    Создать структуру для хранения Номеров паспортов и Фамилий сотрудников организации.
//123456 Иванов
//321456 Васильев
//234561 Петрова
//234432 Иванов
//654321 Петрова
//345678 Иванов
//    Вывести данные по сотрудникам с фамилией Иванов.

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
