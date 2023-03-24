import java.util.Random;

public class Lab_09_ArrayStuff {
    public static void main(String[] args) {
        int[] dataPoints = new int[100];
        Random rand = new Random();// Populate the array with random values
        for (int i = 0; i < dataPoints.length; i++) {
            dataPoints[i] = rand.nextInt(100) + 1;
        }
        for (int i = 0; i < dataPoints.length; i++) {// Display the dataPoints values
            System.out.printf("val%d | ", i + 1);
        }
        System.out.println();

        for (int i = 0; i < dataPoints.length; i++) {
            System.out.printf("%4d | ", dataPoints[i]);
        }
        System.out.println();
        int sum = 0;
        for (int i = 0; i < dataPoints.length; i++) {// Calculate the sum and average of the values in dataPoints
            sum += dataPoints[i];
        }
        double avg = (double) sum / dataPoints.length;
        System.out.printf("The sum of the random array dataPoints is: %d\n", sum);// Display the sum
        System.out.printf("The average of the random array dataPoints is: %.2f\n", avg);// Display the average
    }
}
