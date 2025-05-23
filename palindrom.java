import java.util.Scanner;

public class palindrom {
    public static void main(String[] args) {
        System.out.println("Check palindrom number or not:");
        Scanner input = new Scanner(System.in);
        System.out.println("given range :");
        int givenNum=input.nextInt();
       // System.out.println("Enter the number");
      //  int num = input.nextInt();
        for(int i=1;i<=givenNum;i++){
          int  num=i;
        int rem,reverseNumber=0,finalNum = num;
        while (finalNum>0){
             rem=finalNum%10;
             reverseNumber=(reverseNumber*10)+rem;
             finalNum=finalNum/10;
        }
        if(num==reverseNumber){
            System.out.println("it is palindrom number:"+num);
        } //else {
        //    System.out.println("it is not palindrom number ;");
       // }

    }
}
}
