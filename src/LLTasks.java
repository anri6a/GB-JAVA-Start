import java.util.LinkedList;

//����� ��� LinkedList � ����������� ����������.
//�������� ����� LLTasks � ������� revert, ������� �������� �� �� ���� LinkedList � ���������� ������������� ������.

public class LLTasks {
    public  LinkedList<Object> revert(LinkedList<Object> ll) {
        LinkedList<Object> revLL = new LinkedList<Object>();
        for (int i = ll.size() - 1; i >= 0; i--) {
            revLL.add(ll.get(i));
        }
        return revLL;
    }

}




