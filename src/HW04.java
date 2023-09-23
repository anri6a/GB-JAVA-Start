import java.util.LinkedList;
import java.util.Queue;

public class HW04 {
    public static void main(String[] args) {

//        LinkedList<Object> ll = new LinkedList<Object>();
//        ll.add(1);
//        ll.add("One");
//        ll.add(2);
//        ll.add("Two");
//       LLTasks llTasks = new LLTasks();
//        System.out.println(llTasks.revert(ll));

//        MyQueue myQueue = new MyQueue();
//        myQueue.enqueue(1);
//        System.out.println(myQueue.getElements());
//        myQueue.enqueue(10);
//        System.out.println(myQueue.getElements());
//        myQueue.enqueue(5);
//        System.out.println(myQueue.getElements());
//        myQueue.enqueue(15);
//        System.out.println(myQueue.getElements());
//        System.out.println(myQueue.dequeue());
//        System.out.println(myQueue.getElements());
//        System.out.println(myQueue.first());
//        System.out.println(myQueue.getElements());
        System.out.println(calculate('+', 3, 6));
        System.out.println(calculate('-', 10, 2));
        System.out.println(calculate('*', 3, 6));
        System.out.println(calculate('<', 3, 6));

    }

    public static LinkedList<Integer> linkedList = new LinkedList<>();


    public static int calculate(char op, int a, int b) {
//        В обычный калькулятор без логирования добавьте возможность отменить последнюю операцию.
//        Отмена последней операции должна быть реализована следующим образом:
//        если передан оператор '<' калькулятор должен вывести результат предпоследней операции.
        int result = 0;
        switch (op) {
            case '+': {
                linkedList.add((a + b));
                result = a + b;
                break;
            }
            case '-': {
                linkedList.add((a - b));
                result = (a - b);
                break;

            }
            case '*': {
                linkedList.add((a * b));
                result = (a * b);
                break;
            }
            case '/': {
                linkedList.add((a / b));
                result = (a / b);
                break;
            }
            case '<': {
                linkedList.pollLast();
                result = linkedList.getLast();
                break;
            }
            default:
                return result;
        }
//        System.out.println(linkedList);
        return result;
    }


}


