import java.util.Scanner;

public class EventTableCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] groupSizes = getInputData(scanner);

        int totalGuests = calculateTotalGuests(groupSizes);

        System.out.println("The total number of guests is: " + totalGuests);

        scanner.close();
    }

    public static int[] getInputData(Scanner scanner) {
        System.out.print("Enter the number of groups: ");
        int numGroups = scanner.nextInt();

        int[] groupSizes = new int[numGroups];

        for (int i = 0; i < numGroups; i++) {
            System.out.print("Enter the size of group " + (i + 1) + ": ");
            groupSizes[i] = scanner.nextInt();
        }
        return groupSizes;
    }
    public static int calculateTotalGuests(int[] groupSizes) {
        int totalGuests = 0;
        
        for (int groupSize : groupSizes) {
            totalGuests += groupSize;
        }

        return totalGuests;
    }
}