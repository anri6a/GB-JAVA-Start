
//В классе MyQueue реализуйте очередь с помощью LinkedList со следующими методами:
//        enqueue() - помещает элемент в конец очереди - offer()
//        dequeue() - возвращает первый элемент из очереди и удаляет его - poll()
//        first() - возвращает первый элемент из очереди, не удаляя - peek()
//        getElements() - возвращает все элементы в очереди

import java.util.LinkedList;

public class MyQueue<T> {
    LinkedList<T> linkedList = new LinkedList<>();
    public void enqueue(T element) {
        // Напишите свое решение ниже
        linkedList.offer(element);
    }

    public T dequeue() {
        // Напишите свое решение ниже
        return linkedList.poll();
    }

    public T first() {
        // Напишите свое решение ниже
        return linkedList.peek();
    }

    public LinkedList<T> getElements() {
        // Напишите свое решение ниже
        return linkedList;
    }
}
