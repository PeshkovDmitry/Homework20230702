import java.util.LinkedList;
import java.util.List;

public class MyQueue {

    private List<Integer> arr = new LinkedList<>();

    /**
     * Помещает элемент в конец очереди
     */
    public void enqueue(int item) {
        arr.add(item);
    }

    /**
     * Возвращает первый элемент из очереди и удаляет его
     */

    public int dequeue() {
        return arr.remove(0);
    }

    /**
     * Возвращает первый элемент из очереди, не удаляя.
     */

    public int first() {
        return arr.get(0);
    }

    /**
     * Вывод на экран
     */

    public void print() {
        System.out.println(arr);
    }

}
