import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the length of the array:");
		int n = sc.nextInt();
		int array[] = new int[n];
		System.out.println("enter the array elements:");
		for(int i=0;i<n;i++)
		{
			array[i]=sc.nextInt();
		}
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n-i-1;j++)
			{
				if(array[j]>array[j+1])
				{
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		} 
		System.out.println("sorted list of integer");
		for(int i=0;i<n;i++)
		
			System.out.println(array[i]);
		
	}

}
