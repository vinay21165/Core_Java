import java.util.Scanner;

public class Swap {
    public static void main( String[] args){
      Scanner input = new Scanner(System.in);
        System.out.println("swapping these value");
        System.out.print("enter the value A : ");
        int a = input.nextInt();
        System.out.print("Enter the value B :" );
        int b = input.nextInt();
        int c = a;
        a=b;
        b=c;
        System.out.println("Swapping done");
        System.out.println("The value of A :" +a);
        System.out.println("The value of B :"+b);
    }
}

