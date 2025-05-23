import java.util.Scanner;
public class arrayLinear {
    public static void main(String[] args) {
        System.out.println(" Searchinmg the array :");
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter the array length :");
         int size = scanner.nextInt(); // input the arrray size
           
         // Declare and initialize the array
              int []arr = new int [size];
              System.out.println("enter the "+size+" element ");

              //fill the array
              for (int i=0; i<size;i++){
                arr[i]=scanner.nextInt();
              }
              // input the element to search 
              System.out.print("Enter the element to search : ");
              int key = scanner.nextInt();
              
              boolean found= false;
               for (int i=0;i<arr.length; i++){
                if(arr[i]==key){
                    System.out.println("element " +key+ " found at index "+i);
                    found = true;
                    break;
                }
               }
               // if not found

               if (!found){
                System.out.println("element"+key+ "not found int the array");
               }
           scanner.close();
        }
}
