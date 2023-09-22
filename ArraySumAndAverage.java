package Task2;

public class ArraySumAndAverage {
    public static void main(String[] args) {
        // Initialize an integer array
        int[] myArray = {10, 20, 30, 40, 60};

        // Calculate the sum of the array
        int sum = 0;
        for (int num : myArray) {
            sum += num;
        }

        // Calculate the average of the array
        double average = 0;
        if (myArray.length > 0) {
            average = (double) sum / myArray.length;
        }

        // Print the sum and average
        System.out.println("Sum of the array: " + sum);
        System.out.println("Average of the array: " + average);
    }
}
