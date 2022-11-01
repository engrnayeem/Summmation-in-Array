
package SummationAndAverageInArray;

import java.util.Scanner;

/**
 *
 * @author nayeem
 */
public class SummationAndAverageInArray {
    public static void main(String[]args)
    {
    Scanner input=new Scanner(System.in);
        
    double[] myArray= new double[4];
   
    
    System.out.print("Enter any Four Numbers :\n");
    myArray[0]=input.nextDouble();
    myArray[1]=input.nextDouble();
    myArray[2]=input.nextDouble();
    myArray[3]=input.nextDouble();
    
    //variable diclaration area
    
    double summation;
    
    summation=myArray[0]+myArray[1]+myArray[2]+myArray[3];
    
    
    System.out.println("Total Summation is:"+summation);
    
    
 }
    
}
