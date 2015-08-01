package ua.com.souceit.javabasic.homeworkthree;

/**
 * Created by user on 01.08.2015.
 */
public class IsSimple {

    public IsSimple(int[] arr) {
        this.arr = arr;
    }

    private int[] arr;




    private boolean isSimpleDigits(int numb) {
        if (numb == 1) {
            return false;
        }

        if (numb % 2 == 0) {
            return false;
        }

        return true;
    }
}
