
import java.util.Scanner;

public class sec_Q2 {
    public static void main(String[] args) {
       // System.out.println("adding to number by given user: ");
        Scanner input = new Scanner(System.in);
        System.out.println("adding to number by given user: ");
        System.out.print( "enter first number ");
        int a =input.nextInt();
        System.out.print("Enter sec. number ");
        int b =input.nextInt();
        int sum = a+b;
        System.out.println(" adding two no. is " +sum);
    }

}
