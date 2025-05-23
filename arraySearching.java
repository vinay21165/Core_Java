import java.awt.im.InputContext;
import java.util.Scanner;

public class arraySearching {
 public static void main(String[] args) {
    System.out.println("Searching array ");
    Scanner input = new Scanner (System.in);
    int [] arr = {3,5,7,45,67,9,0,3};
    System.out.print("enter the number yu want to serach in array :");
    int num = input.nextInt();
    boolean isfound =isfound(arr, num);
    if(isfound){
        System.out.println("your number is found in the array ");
    }else {
        System.out.println("your number is not found in the array ");
    }
    }
    public static boolean isfound(int[] arr, int num){
       int index =0;
       while (index < arr.length){
        if (arr[index]==num){
            return true;
        }
        index++;
       }
       return false
    }
 }

