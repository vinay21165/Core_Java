import java.util.Scanner;

public class table {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
      //  System.out.println("enter number of multiplcation :");
      //  int num = input.nextInt();
      //  System.out.println("printed multiplcation of number :" );
      System.out.print("given range :");  
      int num = input.nextInt();
        for (int j=1;j<=num;j++){
            //   int num;
           // range=num;
               int i=1;{
          while(i<=10){
            int result = j*i;
            //  System.out.print("printed multiplcation of number :" );
              System.out.println(j+ " X " +i+ " = " +result);
              i++;
          }
          System.out.println("_________");
        }
    }  
}
    
}
