import java.util.Scanner;

public class sumAverage {
    public static void main(String[] args) {
        System.out.println("calculate the sum and average of the given element :");
         Scanner scanner = new Scanner(System.in);
         System.out.print("enter the size of element:");
         int size = scanner.nextInt();

         int arr[] = new int[size];
         System.out.print("enter " +size+ " element in the array :");

         //fill the array
         for (int i = 0; i < size; i++) {
             arr[i]=scanner.nextInt();
         }

         long sum = sum(arr);
         double avg = average(arr);
         System.out.println("sum of the number is :" +sum);
         System.out.println("Average of the number is :" +avg);
    }
    public static long sum( int[] arr){
        long sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
    public static double average (int[] arr){
        double sum = sum(arr);
        return (double)(sum / arr.length);
    }
}
