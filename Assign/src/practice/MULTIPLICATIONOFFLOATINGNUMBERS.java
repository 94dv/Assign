package practice;

import java.util.Scanner;
public class MULTIPLICATIONOFFLOATINGNUMBERS {
public static void main(String[] args) {
	Scanner Scanner=new Scanner(System.in);
	System.out.println("enter first value1: ");
    float value1 = Scanner.nextFloat();  
	System.out.println("enter second value2: "); 
	float value2 =Scanner.nextFloat();
	Scanner.close();
	float product =value1*value2;	
	
	System.out.print("product of two value1 and value2 =   "+product);


}
}
