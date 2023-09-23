
//� ������ MyQueue ���������� ������� � ������� LinkedList �� ���������� ��������:
//        enqueue() - �������� ������� � ����� ������� - offer()
//        dequeue() - ���������� ������ ������� �� ������� � ������� ��� - poll()
//        first() - ���������� ������ ������� �� �������, �� ������ - peek()
//        getElements() - ���������� ��� �������� � �������

import java.util.LinkedList;

public class MyQueue<T> {
    LinkedList<T> linkedList = new LinkedList<>();
    public void enqueue(T element) {
        // �������� ���� ������� ����
        linkedList.offer(element);
    }

    public T dequeue() {
        // �������� ���� ������� ����
        return linkedList.poll();
    }

    public T first() {
        // �������� ���� ������� ����
        return linkedList.peek();
    }

    public LinkedList<T> getElements() {
        // �������� ���� ������� ����
        return linkedList;
    }
}
