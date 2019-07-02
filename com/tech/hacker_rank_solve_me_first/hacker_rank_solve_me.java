package com.tech.hacker_rank_solve_me_first;
  
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class hacker_rank_solve_me {

	public static void main(String[] args) {
        System.out.println("hacker rank in java <<<<<<<<<<!!!!!!!!!!!!>>>>>>>>>>>");
        solveMeFirst_function();
        read_input_and_write_output();
        data_types_function();
        sum_arrays_fucntion();
        Scanner scan = new Scanner(System.in); 
        String inputString = scan.nextLine(); 
   }
 
    public static int solveMeFirst(int a, int b) {
       // Hint: Type return a+b; below 
       return a + b;
   }

    static void solveMeFirst_function(){
      System.out.println("enter two number to perform addition....\n");
        Scanner in = new Scanner(System.in);
        int a;
        a = in.nextInt();
        int b;
        b = in.nextInt();
        int sum;
        sum = solveMeFirst(a, b);
        System.out.println(a + " plus " + b + " equals " + sum); 
    }
    
 static void read_input_and_write_output(){
   System.out.println("enter a string literal to see its output....\n");
   // Create a Scanner object to read input from stdin.
  Scanner scan = new Scanner(System.in); 
  
  // Read a full line of input from stdin and save it to our variable, inputString.
  String inputString = scan.nextLine(); 

  // Close the scanner object, because we've finished reading 
        // all of the input from stdin needed for this challenge.
  scan.close(); 
      
  // Print a string literal saying "Hello, World." to stdout.
  System.out.println("Hello, World.\n");
      
     // TODO: Write a line of code here that prints the contents of inputString to stdout.
  System.out.println("you entered [ " + inputString + " ]");
 }
 
 static void data_types_function(){
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
  
        Scanner scan = new Scanner(System.in);

        /* Declare second integer, double, and String variables. */
        int _int2, _sum_int;
        double _double2, _sum_double;
        String _string2, _concat_string;
        /* Read and save an integer, double, and String to your variables.*/
        System.out.println("enter one integer to perform addition with " + i + "....\n");
        _int2 = scan.nextInt();
        System.out.println("enter one double to perform addition with " + d + "....\n");
        _double2 = scan.nextDouble();
        System.out.println("enter string to perform concatenation....\n");
        _string2 = scan.nextLine();
        // Note: If you have trouble reading the entire String, please go back 
        //and review the Tutorial closely. 
        /* Print the sum of both integer variables on a new line. */
        _sum_int = i + _int2;
        System.out.println(i + " plus " + _int2 + " equals " + _sum_int);
        /* Print the sum of the double variables on a new line. */
         _sum_double = i + _double2;
         System.out.println(d + " plus " + _double2 + " equals " + _sum_double);
        /* Concatenate and print the String variables on a new line; 
         the 's' variable above should be printed first. */
         System.out.println(s + _string2);
         
        scan.close();
 }
 
 static void sum_arrays_fucntion(){
   Scanner scanner = new Scanner(System.in);
   System.out.println("enter the array size");
   //The first line contains an integer, , denoting the size of the array. 
    int arCount = Integer.parseInt(scanner.nextLine().trim());
    System.out.println("enter space-separated integers representing the array's elements");
    //The second line contains space-separated integers representing the array's elements.
    int[] ar = new int[arCount];
    String[] arItems = scanner.nextLine().split(" ");
   for (int arItr = 0; arItr < arCount; arItr++) {
       int arItem = Integer.parseInt(arItems[arItr].trim());
       ar[arItr] = arItem;
     }
    //Print the sum of the array's elements as a single integer.
         int sum = 0;
         String str_arr = "";
         int count = 0;
         for(int i = 0; i < ar.length; i++){
          sum += ar[i];
          count++;
          if(count == ar.length){
           str_arr += "[" + ar[i] + "]";
          }else{
           str_arr += "[" + ar[i] + "] + ";
          }
         }
      System.out.println(str_arr + " equals " + sum); 
 }
 
 
 
 
 
 
}

