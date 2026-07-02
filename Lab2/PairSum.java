import java.util.Scanner;

public class PairSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Get the number of elements
        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();

        // Step 2: Create the array and collect elements
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element at index " + i + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Step 3: Get the target sum
        System.out.print("Enter the Target Sum: ");
        int target = scanner.nextInt();

        // Step 4: Brute Force (Nested Loop) search for a matching pair
        boolean found = false;

        for (int i = 0; i < size && !found; i++) {
            for (int j = i + 1; j < size && !found; j++) {
                if (numbers[i] + numbers[j] == target) {
                    System.out.println("\n----- Result -----");
                    System.out.println("Pair found at indices " + i + " and " + j);
                    System.out.println("Values: " + numbers[i] + " and " + numbers[j]);
                    System.out.println("Equation: " + numbers[i] + " + " + numbers[j] + " = " + target);
                    found = true;
                }
            }
        }

        // Step 5: Handle the case where no pair is found
        if (!found) {
            System.out.println("\nNo pair found that sums to " + target + ".");
        }

        scanner.close();
    }
}
