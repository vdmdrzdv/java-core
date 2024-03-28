package lr3;

class MyLinkedList {
    Node head;
    Node tail;

    public MyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void createHead(int[] values) {
        for (int value:values) {
            Node newNode = new Node(value, null);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                newNode.next = head;
                head = newNode;
            }
        }
    }

    public void createTail(int[] values) {
        for (int value:values) {
            Node newNode = new Node(value, null);
            if (tail == null) {
                head = newNode;
            } else {
                tail.next = newNode;
            }
            tail = newNode;
        }
    }

    public String toString() {
        String str = "";
        Node current = head;
        while (current != null) {
            str += (current.value + " ");
            current = current.next;
        }
        return str;
    }

    public void AddFirst(int value) {
        head = new Node(value, head);
    }

    public void AddLast(int value) {
        Node newTail = new Node(value, null);
        if (head == null) {
            head = newTail;
            return;
        }
        Node ref = head;
        while (ref.next != null) {
            ref = ref.next;
        }
        ref.next = newTail;
    }

    public void Insert(int value, int index) {
        if (index == 0) {
            head = new Node(value, head);
            return;
        }
        Node newNode = new Node(value, null);
        Node ref = head;
        int k = 1;
        while (ref.next != null && (k < index)) {
            ref = ref.next;
            k++;
        }
        newNode.next = ref.next;
        ref.next = newNode;
    }

    public void RemoveFirst() {
        head = head.next;
    }

    public void RemoveLast() {
        Node ref = head;
        while (ref.next.next != null) {
            ref = ref.next;
        }
        ref.next = null;
    }

    public void Remove(int index) {
        Node ref = head;
        int k = 1;
        while (ref.next != null && (k < index)) {
            ref = ref.next;
            k++;
        }
        ref.next = ref.next.next;
    }

    public void createHeadRec(int[] values, int valuesLength) {
        if (valuesLength > 1) {
            createHeadRec(values, valuesLength - 1);
        }
        AddFirst(values[valuesLength - 1]);
    }

    public void createTailRec(int[] values, int valuesLength) {
        if (valuesLength > 1) {
            createTailRec(values, valuesLength - 1);
        }
        AddLast(values[valuesLength - 1]);
    }

    public String toStringRec(Node current) {
        if (current.next == null) {
            return "" + current.value;
        } else {
            return current.value + " " + toStringRec(current.next);
        }
    }
}
public class Example12 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        MyLinkedList listHead = new MyLinkedList();
        listHead.createHead(array);
        System.out.println("Заполняем голову: " + listHead.toString());

        MyLinkedList listTail = new MyLinkedList();
        listTail.createTail(array);
        System.out.println("Заполняем хвост: " + listTail.toString());

        listTail.AddFirst(0);
        listTail.AddLast(6);
        System.out.println("Обновленный хвостовой список (добавляем 0 в начало, 6 в конец): " + listTail.toString());

        listTail.Insert(100, 3);
        System.out.println("Обновленный хвостовой список (добавляем 100 в ячейку с индексом 3): " + listTail.toString());

        listTail.RemoveFirst();
        listTail.RemoveLast();
        System.out.println("Обновленный хвостовой список (удаляем крайние элементы): " + listTail.toString());

        listTail.Remove(2);
        System.out.println("Обновленный хвостовой список (удаляем элемент с индексом 2): " + listTail.toString());

        MyLinkedList listHeadRec = new MyLinkedList();
        listHeadRec.createHeadRec(array, array.length);
        System.out.println("\nЗаполняем голову рекурсивно (выводим, кстати, тоже рекурсивно): " + listHeadRec.toStringRec(listHeadRec.head));

        MyLinkedList listTailRec = new MyLinkedList();
        listTailRec.createTailRec(array, array.length);
        System.out.println("Заполняем хвост рекурсивно (выводим, кстати, тоже рекурсивно): " + listTailRec.toStringRec(listTailRec.head));
    }
}
