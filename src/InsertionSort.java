import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Sethu on 8/5/17.
 */
public class InsertionSort {

    public static void main(String[] args) {
        ArrayList<Integer> elements = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            elements.add(sc.nextInt());
        }
        sc.close();

        int elements_array[] = new int[elements.size()];

        for (int i = 0; i < elements.size(); i++) {
            elements_array[i] = elements.get(i);
        }

        elements_array = doInsertionSort(elements_array);

        for (int anElement : elements_array) {
            System.out.println(anElement);
        }
    }

    private static int[] doInsertionSort(int[] elementsArray) {

        for (int i = 1; i < elementsArray.length; i++) {
            for (int j = i; j > 0; j--) {
                if (elementsArray[j] < elementsArray[j - 1]) {
                    doSwap(elementsArray, j, j - 1);
                }
            }
        }


        return elementsArray;
    }

    private static void doSwap(int[] elements_array, int i, int j) {
        int temp = elements_array[i];
        elements_array[i] = elements_array[j];
        elements_array[j] = temp;
    }
}
