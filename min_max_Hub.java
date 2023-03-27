//Minimum and Maximum element of the array
import java.util.Scanner;

public class Array
{
	public static void main(String args[])
	{
		Scanner ui=new Scanner(System.in);
		System.out.print("Enter the range : ");
		int range=ui.nextInt();
		int arr[]=new int[range];
		int i;
		for(i=0;i<arr.length;i++)
		{
			System.out.print("Enter number "+(i+1)+" : ");
			arr[i]=ui.nextInt();
		}
		int max=arr[0];
		int min=arr[0];
		for(i=1;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
			else if(arr[i]<min)
			{
				min=arr[i];
			}
		}
		System.out.println("Maximum value of the array is "+max);
		System.out.println("Minimum value of the array is "+min);
	}
}
