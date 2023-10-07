import java.util.Scanner;

public class EventTableCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Get the group sizes from the user
        int[] groupSizes = getInputData(scanner);

        // Calculate the total number of guests
        int totalGuests = calculateTotalGuests(groupSizes);

        // Display the total number of guests
        System.out.println("The total number of guests is: " + totalGuests);

        // Close the scanner to release resources
        scanner.close();
    }

    // Function to get input data from the user
    public static int[] getInputData(Scanner scanner) {
        System.out.print("Enter the number of groups: ");
        int numGroups = scanner.nextInt();

        int[] groupSizes = new int[numGroups];

        // Get the size of each group from the user
        for (int i = 0; i < numGroups; i++) {
            System.out.print("Enter the size of group " + (i + 1) + ": ");
            groupSizes[i] = scanner.nextInt();
        }

        return groupSizes;
    }

    // Function to calculate the total number of guests
    public static int calculateTotalGuests(int[] groupSizes) {
        int totalGuests = 0;

        // Sum up the sizes of all groups to calculate the total
        for (int groupSize : groupSizes) {
            totalGuests += groupSize;
        }

        return totalGuests;
    }
}
