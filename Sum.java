import java.util.*;

public class Main

{
	
	public static void main(String[] args)
	
	{
	    
		int count=0,i=0;
	   
 	    	int sum=0;
	    
		Scanner scan=new Scanner(System.in);
	    
		int[] num=new int[10];
		
		
		for(i=0;i<10;i++)
		
		{
		    
			System.out.println("enter the array elemnts=");
		    
			num[i]=scan.nextInt();
		
		}
		
		
		for(int x:num)
		
		{
		    
		    
			sum=sum+x;
		
		}
		
		System.out.println("sum of the elents in the array="+sum);
	
	}

}
