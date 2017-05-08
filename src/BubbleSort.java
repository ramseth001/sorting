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

        int temp;

        for (int i = 0; i < elements_array.length; i++) {
            for (int j = i + 1; j < elements_array.length; j++) {
                if (elements_array[i] > elements_array[j]) {
                    temp = elements_array[i];
                    elements_array[i] = elements_array[j];
                    elements_array[j] = temp;
                }
            }
        }

        return elements_array;
    }


}
