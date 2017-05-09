package Sorting;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Sethu on 8/5/17.
 */
public class SelectionSort {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            arrayList.add(sc.nextInt());
        }
        sc.close();

        int elements_array[] = new int[arrayList.size()];

        for (int i = 0; i < arrayList.size(); i++) {
            elements_array[i] = arrayList.get(i);
        }

        elements_array = doSelectionSort(elements_array);

        for (int element : elements_array) {
            System.out.println(element);
        }
    }

    private static int[] doSelectionSort(int[] elements_array) {

        int min;

        for (int i = 0; i < elements_array.length; i++) {
            min = i;
            for (int j = i + 1; j < elements_array.length; j++) {
                if (elements_array[j] < elements_array[min]) {
                    min = j;
                }
            }
            doSwap(elements_array, i, min);
        }
        return elements_array;
    }

    private static void doSwap(int[] elements_array, int i, int j) {
        int temp = elements_array[i];
        elements_array[i] = elements_array[j];
        elements_array[j] = temp;
    }
}
