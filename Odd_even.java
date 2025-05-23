import java.util.Scanner;

public class Odd_even {
    public static void main(String[] args) {
        System.out.println("Check the number that have even or odd");
        Scanner input = new Scanner (System.in);
        System.out.print("Enter the number :");
        int num = input.nextInt();
        if(num%2==0){
            System.out.print("this number is even: "+num);
        } else{
            System.out.println("this number is odd: "+num);
        }

    }
}
