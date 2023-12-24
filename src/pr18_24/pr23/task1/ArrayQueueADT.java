package pr18_24.pr23.task1;


import java.util.Arrays;

public class ArrayQueueADT {
    private int size;
    private Object[] elements = new Object[10];
    private int head;
    private int tail;

    public static void enqueue(ArrayQueueADT queue, Object element) {
        ensureCapacity(queue, queue.size + 1);
        queue.elements[queue.tail] = element;
        queue.tail = (queue.tail + 1) % queue.elements.length;
        queue.size++;
    }


    public static Object element( ArrayQueueADT queue) {
        if (queue.size == 0) {
            throw new IllegalStateException("Queue is empty");
        }
        return queue.elements[queue.head];
    }

    public static Object dequeue( ArrayQueueADT queue) {
        if (queue.size == 0) {
            throw new IllegalStateException("Queue is empty");
        }
        Object dequeued = queue.elements[queue.head];
        queue.elements[queue.head] = null; // помогает сборщику мусора
        queue.head = (queue.head + 1) % queue.elements.length;
        queue.size--;
        return dequeued;
    }


    public static int size(ArrayQueueADT queue) {
        return queue.size;
    }

    public static boolean isEmpty(ArrayQueueADT queue) {
        return queue.size == 0;
    }

    public static void clear(ArrayQueueADT queue) {
        Arrays.fill(queue.elements, null);
        queue.size = 0;
        queue.head = 0;
        queue.tail = 0;
    }

    private static void ensureCapacity(ArrayQueueADT queue, int capacity) {
        if (capacity > queue.elements.length) {
            int newCapacity = queue.elements.length * 2;
            queue.elements = Arrays.copyOf(queue.elements, newCapacity);
            if (queue.head > queue.tail) {
                System.arraycopy(queue.elements, 0, queue.elements, queue.elements.length / 2, queue.tail);
                queue.tail += queue.elements.length / 2;
            }
        }
    }
}
