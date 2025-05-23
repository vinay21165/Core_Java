import java.util.Scanner;

public class function {
    public static void main(String[] args) {
     header();
    int firstNumber = readNumber();
    int secondNumber = readNumber();
    int sum = firstNumber + secondNumber ;
    System.out.println("sum the number : "+sum);
    int sub = firstNumber - secondNumber;
    System.out.println("subtract the number :" +sub);
    }
    public static int readNumber(){
     Scanner input = new Scanner(System.in);
     System.out.print("Enter the number :");
     int number = input.nextInt();
     return number;
    }
    public static void header(){
        System.out.println("calculate the given value");
    }
}
