//Minimum and Maximum element of the array.
import java.util.Scanner;
class Array
{
	public static void main(String args[])
	{
		Scanner ui=new Scanner(System.in);
		System.out.print("Enter the range of the array : ");
		int range=ui.nextInt();
		int a[]=new int[range];
		int i;
		for(i=0;i<a.length;i++)
		{
			System.out.print("Enter number "+(i+1)+" = ");
			a[i]=ui.nextInt();
			
		}
		int min=a[0],max=a[0];
		for(i=1;i<a.length;i++)
		{
			if(min>a[i])
			{
				min=a[i];
			}
		}
		for(i=1;i<a.length;i++)
		{
			if(max<a[i])
			{
				max=a[i];
			}
		}
		System.out.println("Minimum value is "+min);
		System.out.println("Maximum value is "+max);
	}
}
