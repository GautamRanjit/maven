package pak1;

public class fibino
{
  public static void main(String[] args)
  {
	  int count=9;
	  int num1=0;
	  int num2=1;
	  
	  for (int i=1;i<=count;i++ )
	  {
		  int sum=num1+num2;
		  System.out.println(num1);
		  num1=num2;
		  num2=sum;
		  
	  }
			  
	
}
}
