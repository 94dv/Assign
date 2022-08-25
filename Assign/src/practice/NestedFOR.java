package practice;

public class NestedFOR {
	public static void main(String []args) {
		
		for(int i=0;i<=5;i++) 
		{//dont cose braket bacause consol need to enter inner loop.after tha close it
			System.out.println("outer loop "+i);
			
	    		      for(int j=0;j<=3;j++)
		      {
		    	  System.out.println(+j);
		      }
			}
		}
	}

  /*      for(int p=1;p<=5;p++)
        {
        	System.out.print(+p);
        
        	for(int q=0;q<=4;q++)
        	{
        		System.out.println(+q);
        	}
        }
	}
}
 */       	
        