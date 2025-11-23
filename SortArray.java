import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {

        int[] numbers = {45, 12, 78, 23, 9, 56, 34};

        System.out.println("Original Array:");
        System.out.println(Arrays.toString(numbers));

        // Sort the array
        Arrays.sort(numbers);

        System.out.println("\nSorted Array (Ascending):");
        System.out.println(Arrays.toString(numbers));
    }
}

