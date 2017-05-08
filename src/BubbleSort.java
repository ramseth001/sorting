import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Sethu on 8/5/17 for GitHub project.
 */
public class BubbleSort {

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

        elements_array = doBubbleSort(elements_array);

        for (int anElement : elements_array) {
            System.out.println(anElement);
        }

    }

    private static int[] doBubbleSort(int[] elements_array) {


        for (int i = 0; i < elements_array.length; i++) {
            //why - i at the condition is because after each iteration with i, the largest number gets pushed to
            // the end
            for (int j = 0; j < elements_array.length - 1 - i; j++) {
                if (elements_array[j] > elements_array[j + 1]) {
                    doSwap(elements_array, j, j + 1);
                }
            }
        }

        return elements_array;
    }

    private static void doSwap(int[] elements_array, int i, int j) {
        int temp = elements_array[i];
        elements_array[i] = elements_array[j];
        elements_array[j] = temp;
    }


}
