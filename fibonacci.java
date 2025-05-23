import java.util.Scanner;
public class fibonacci {
    public static void main(String[] args) {
        System.out.println("fibonacci series");
        Scanner input = new Scanner(System.in);
        System.out.print("how many fibonacci series are printed :");
        int num = input.nextInt();
        int firstNumber=0 ,secondNumber=1;
        int nextNumber;
        for (int i=1;i<=num;i++) {
            nextNumber = firstNumber + secondNumber ;
            System.out.print(nextNumber+ ",");
            firstNumber = secondNumber;
           secondNumber = nextNumber ;
        }
    }
}
