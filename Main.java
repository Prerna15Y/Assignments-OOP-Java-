package myProject6;
import java.util.Scanner;

public class Main{
	
    public static void main(String[] args){   
        Scanner input = new Scanner(System.in) ;

        int[] arr = new int[10] ;
        for(int i = 0 ; i < 10 ; i++){   arr[i] = i+1 ;     }
        //arr[10]={1,2,3,4,5,6,7,8,9,10}   
        
        System.out.print("Enter the Index  :  ");
        int index = input.nextInt() ;

        try {
            System.out.println("Element at Index "+ index +" is: " + arr[index]+"\n");

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Not a valid Index.Index out of bounds.\n");
        }


        int a = 0 , b = 0 ; 

        try {

            System.out.print("Enter Numerator  : ");
            String s1 = input.next(); 
            a =Integer.parseInt(s1);
            
            System.out.print("Enter Denominator : ");
            String s2 = input.next(); 
            b =Integer.parseInt(s2);

            try {
                int c = a/b;  
                System.out.println ("\nResult = " + c);
            }
            catch(ArithmeticException e) { 	
                System.out.println("Can not divide by Zero.");
            }
          
            
            } 
            catch(NumberFormatException e) {
                System.out.println("Input has to be Integer.");
            }
        input.close();

    }


}

