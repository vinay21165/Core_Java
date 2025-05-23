// Java Program to Reverse a Word

import java.io.*;
import java.util.Scanner;

class Reverse {
    public static void main (String[] args) {
      
        String str= "Trakin", newStr="";
        char ch;
      
      System.out.print("Original word: ");
      System.out.println("Trakin");
      
      for (int i=0; i<str.length(); i++)
      {
        ch= str.charAt(i); 
        newStr= ch+newStr; 
      }
      System.out.println("Reversed word: "+ newStr);
    }
}