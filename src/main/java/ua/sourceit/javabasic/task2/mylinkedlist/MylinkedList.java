package ua.sourceit.javabasic.task2.mylinkedlist;

/**
 * 1) Создать класс LinkedList. Ваш класс должен реализовать интерфейс List.2)
 * Реализовать методы:
 * -add() в конец +
 * -add() по индексу
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
        if (isEmpty()) {

        }
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

    public void add(int index, Object element) {

    }

    private static class Node<E> {
        E item;
        MylinkedList.Node<E> next;
        MylinkedList.Node<E> prev;

        Node(MylinkedList.Node<E> var1, E var2, MylinkedList.Node<E> var3) {
            this.item = var2;
            this.next = var3;
            this.prev = var1;
        }
    }
}

