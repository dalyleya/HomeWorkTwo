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
    private static final int MAX_ARRAY_SIZE = 2147483639;
    private int indexOfElement;
    private Object[] data;
    private int size;


    public MyVector(int var1) {
        if (var1 < 0) {
            throw new ArrayIndexOutOfBoundsException("Отрицательный размер");
        } else {
            this.data = new Object[var1];
            this.size = data.length;
            this.indexOfElement = 0;
        }
    }

    public MyVector() {
        this(2);
    }

    public void clear() {
        this.size = 2;
        this.data = new Object[size];
    }


    public void addElement(Object var1) {

        if (indexOfElement >= 0 && indexOfElement < size) {
            data[indexOfElement] = var1;
            indexOfElement++;
        } else {
            Object[] tmp = new Object[size * 2];
            System.arraycopy(this.data, 0, tmp, 0, this.size);
            this.data = tmp;
            this.data[indexOfElement] = var1;
            indexOfElement++;
        }
    }

    public void removeElement(int var1) {
        assert (indexOfElement >= 0 && indexOfElement <= size - 1);      // проверка на диапазон индекса
        Object tmp[] = new Object[data.length - 1];             //создание нового массива
        if (indexOfElement == 0) {                                 // Удаление нулевого элемента
            System.arraycopy(data, 1, tmp, 0, size - 1);
        } else {                                                  //Удаление не нулевого элемента
            System.arraycopy(data, 0, tmp, 0, var1 + 1);
            System.arraycopy(data, var1 + 1, tmp, var1, size - var1);
        }
        size--;
        indexOfElement--;
        this.data = tmp;
    }

    public void print() {
        for (int i = 0; i < indexOfElement; i++) {
            System.out.println(data[i] + " ");

        }
        System.out.println("indexOfElement: " + indexOfElement);
        System.out.println("size: " + size);
    }


}
