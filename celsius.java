import java.util.Scanner;

public class celsius {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("change to farhenheit to celsius :");
        System.out.print("Enter the value of farhenheit : ");
        double f = input.nextDouble();
        double celsius =(f-32)*5/9;
        System.out.println("The value of celsius is : "+ celsius);

    }
}
