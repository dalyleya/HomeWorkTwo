package ua.sourceit.javabasic.task2.vector;

/**
 * Класс должен иметь следующие поля:
 * 1) массив ссылок, который может расти;
 * 2) количество ссылок в массиве.
 * Класс должен иметь следующие методы:
 * 1) очистить весь массив;+
 * 2) добавить ссылку в массив;
 * 3) Получить j-й элемент;
 * 4) Удалить j-й элемент;
 * 5) вывести значения массива на экран.
 * Created by user on 06.08.2015.
 */
public class MyVector {

    private int indexOfElement;
    private Object[] data;
    private int size = 10;


    public MyVector(int var1) {
        if (var1 < 0) {
            throw new ArrayIndexOutOfBoundsException("Error size");
        } else {
            this.data = new Object[var1];
            this.size = data.length;
            this.indexOfElement = 0;
        }
    }

    public MyVector() {
        this.data = new Object[size];
    }

    public void clear() {
        this.size = 0;
        this.data = new Object[size];
    }


    public void addElement(Object val) {


        if (size > indexOfElement) {
            data[indexOfElement] = val;
            indexOfElement++;
        } else {
            Object[] tmp;
            int capacity = size * 2;
            tmp = new Object[capacity];
            System.arraycopy(this.data, 0, tmp, 0, this.size);
            this.size = capacity;
            tmp[indexOfElement] = val;
            indexOfElement++;

            this.data = tmp;
        }
    }


    public void removeElement(int var1) {
        assert (indexOfElement >= 0 && indexOfElement <= size - 1);      // проверка на диапазон индекса
        Object tmp[] = new Object[data.length - 1];                      // создание нового массива
        if (indexOfElement == 0) {                                       // Удаление нулевого элемента
            System.arraycopy(data, 1, tmp, 0, size - 1);
        } else {                                                         // Удаление не нулевого элемента
            System.arraycopy(data, 0, tmp, 0, var1);
            System.arraycopy(data, var1 + 1, tmp, var1, (size - 1) - var1);
        }
        size--;
        indexOfElement--;
        this.data = tmp;
    }

    public void print() {
        if (size == 0) {
            System.out.println("It's Empty");
        } else {
            for (int i = 0; i < indexOfElement; i++) {
                System.out.println("Object[" + i + "] = " + data[i] + " ");

            }
            System.out.println("indexOfElement: " + indexOfElement);
            System.out.println("size: " + size);
        }
    }


}
