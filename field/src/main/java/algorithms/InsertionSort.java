package algorithms;

/**
 * Created by asdf2014 on 2015/9/21.
 */
public class InsertionSort {

    public int[] insertionSort(int[] unsort) {

        for (int j = 1; j < unsort.length; j++) {

            int key = unsort[j];
            int i = j - 1;
            while (i >= 0 && unsort[i] > key) {

                unsort[i + 1] = unsort[i];
                i--;
            }
            unsort[i + 1] = key;
        }
        return unsort;
    }

}