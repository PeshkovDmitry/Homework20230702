import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        task1();
        task2();
    }

    /*
     Пусть дан LinkedList с несколькими элементами. Реализуйте метод,
     который вернет “перевернутый” список.
     */
    static void task1() {
        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            list.add(list.remove(list.size() - i - 1));
        }
        System.out.println(list);
    }

    /*
    Реализуйте очередь с помощью LinkedList со следующими методами:
    enqueue() - помещает элемент в конец очереди,
    dequeue() - возвращает первый элемент из очереди и удаляет его,
    first() - возвращает первый элемент из очереди, не удаляя.
     */
    static void task2() {
        MyQueue myQueue = new MyQueue();
        for (int i = 0; i < 5; i++) {
            myQueue.enqueue(i);
        }
        myQueue.print();
        System.out.println(myQueue.dequeue());
        myQueue.print();
        System.out.println(myQueue.first());
        myQueue.print();
    }
}