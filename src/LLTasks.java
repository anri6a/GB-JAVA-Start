import java.util.LinkedList;

//Пусть дан LinkedList с несколькими элементами.
//Напишите класс LLTasks с методом revert, который принимал бы на вход LinkedList и возвращает “перевернутый” список.

public class LLTasks {
    public  LinkedList<Object> revert(LinkedList<Object> ll) {
        LinkedList<Object> revLL = new LinkedList<Object>();
        for (int i = ll.size() - 1; i >= 0; i--) {
            revLL.add(ll.get(i));
        }
        return revLL;
    }

}




