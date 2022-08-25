package practice;
import java.util.Scanner; //this is a import packege which is used when we get input from user

public class EVENODD {
	public static void main(String[]args) {
		
		int z;  //Declaration of variable z
		
		
		
		System.out.println("enter value");
		//seen on screen by user
		
	
		Scanner sc=new Scanner(System.in);
		//Scanner this is used we takeing runtime input from user
		//sc is a object refrance we define here,we can take any but same should be written in bellow as well
		
		z=sc.nextInt();
		//z is a variable in which sc object is stored. 
		// it is a scanner class method so we have to call by object [sc] of scanner class 
		// .nextInt() is the method which inputs the Integer Value
		
		if(z%2==0)
		{
		System.out.println("it is even no");
		}
		else
		{
	    System.out.println("it is odd no");
			
		}
		
		
		
		
		
		
	}
}

