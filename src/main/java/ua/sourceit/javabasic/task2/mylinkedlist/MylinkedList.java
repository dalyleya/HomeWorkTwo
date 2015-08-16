package ua.sourceit.javabasic.task2.mylinkedlist;

/**
 * 1) Создать класс LinkedList. Ваш класс должен реализовать интерфейс List.
 * 2)Реализовать методы:
 * -add() в конец +
 * -add() по индексу +
 * -clear()
 * -contains()
 * -get() по индексу
 * -isEmpty()+
 * -remove() по индексу
 * -remove() по объекту
 * -set() по индексу
 * -size()+
 * Остальные методы, которые не указаны выше реализовать с
 * минимальной функциональностью. Т.е. если, например метод возвращает boolean-возвращайте false.
 * Created by user on 14.08.2015.
 */
public class MylinkedList<E> {

    private static final long serialVersionUID = 876323262645176354L;
    transient int size;
    transient MylinkedList.Node<E> first;
    transient MylinkedList.Node<E> last;

    public MylinkedList(int size, Node<E> first, Node<E> last) {
        this.size = size;
        this.first = first;
        this.last = last;
    }

    //метод который возвращает размер списка
    public int size() {
        return this.size;
    }

    //проверка списка на наличие элементов
    public boolean isEmpty() {

        return (this.size == 0) ? true : false;
    }

    public void set(int index, E element) {
//
//       MylinkedList.Node var3;
//        var3 = Node.item(var1);
//        E var4 = var3.item;
//        var3.item = var2;
    }

    public boolean add(E o) {
        if (isEmpty()) {
            this.linkFirst(o);
            return true;
        } else {
            this.linkLast(o);
        }
        return false;
    }

    private void linkFirst(E var1) {
        MylinkedList.Node var2 = this.first;
        MylinkedList.Node var3 = new MylinkedList.Node(null, var1, var2);

        this.first = var3;
        if (var2 == null) {
            this.last = var3;
        } else {
            var2.prev = var3;
        }
        ++this.size;
    }

    void linkLast(E var1) {
        MylinkedList.Node var2 = this.last;
        MylinkedList.Node var3 = new MylinkedList.Node(var2, var1, null);

        this.last = var3;
        if (var2 == null) {
            this.first = var3;
        } else {
            var2.next = var3;
        }

        ++this.size;
    }

    public void clear() {

    }

    public Object get(int index) {
        return null;
    }

    public void add(int var1, Node<E> var2) {
        if (this.checkPositionIndex(var1)) {
            if (var1 == this.size) {
                this.linkLast((E) var2);
            }
        } else {
            final Node<E> pred = var2.prev;
            final Node newNode = new Node(pred, var1, var2);
            var2.prev = newNode;
            if (pred == null)
                first = newNode;
            else
                pred.next = newNode;
            size++;
        }

    }

    private boolean checkPositionIndex(int var1) {
        if (!(var1 >= 0 && var1 <= this.size)) {
            return true;
        }
        return false;
    }

    private static class Node<E> {
        public E item;
        public MylinkedList.Node<E> next;
        public MylinkedList.Node<E> prev;

        Node(MylinkedList.Node<E> var1, E var2, MylinkedList.Node<E> var3) {
            this.item = var2;
            this.next = var3;
            this.prev = var1;
        }
    }
}

