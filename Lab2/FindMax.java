import java.util.Scanner;

public class FindMax {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Get the number of elements
        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();

        // Step 2: Create the array
        int[] numbers = new int[size];

        // Step 3: Collect array elements from the user
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element at index " + i + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Step 4: Linear search for the maximum value and its index
        int maxValue = numbers[0];
        int maxIndex = 0;

        for (int i = 1; i < size; i++) {
            if (numbers[i] > maxValue) {
                maxValue = numbers[i];
                maxIndex = i;
            }
        }

        // Step 5: Display the results in a clear, professional format
        System.out.println("\n----- Result -----");
        System.out.println("Array entered: " + arrayToString(numbers));
        System.out.println("Maximum value: " + maxValue);
        System.out.println("Found at index: " + maxIndex);

        scanner.close();
    }

    // Helper method to print the array neatly, e.g. [3, 7, 1, 9]
    private static String arrayToString(int[] arr) {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
            if (i < arr.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
