package pak1;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class Sample30 
{

	public static void main(String[] args) 
	{
		
		int star=1;
		int space=2;
		
		for (int i=1;i<=3;i++)
		{
			for (int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			for (int k=1;k<=star;k++)
			{
				System.out.print("*");
			}
			System.out.println();
			star=star+2;
			space--;
		}
				
		
		
	}
}
