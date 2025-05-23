import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
       Scanner input =new Scanner (System.in);
        System.out.println(" find area and perimeter of rectangle");
        System.out.print("Enter the length of rectangle:");
        double l = input.nextDouble();
        System.out.print(" Enter the breadth of rectangle:");
        double b = input.nextDouble();
        double p = 2*(l+b);
        System.out.println("perimeter of rectangle is : "+p +"cm");
        double A = l*b;
        System.out.println("Area of rectangle : "+A + "cm");

    }
}
