import java.util.Iterator;
import java.util.Scanner;

public class SortingArray {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n = sc.nextInt();
		/*int arr[] = new int[n];*/
		System.out.println("Enter the array elements");
		int arr[] = new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		for (int i=0;i<=n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
			   if(arr[i]>arr[j])
			   {
				   int temp = arr[i];
				   arr[i] = arr[j];
				   arr[j] = temp;
			   }
			
		}
						
		}
		System.out.println("Ascending order");
		for(int i=0;i<n-1;i++)
		{
			System.out.println(arr[i] + " ," );
		}

	
		
		
		
		
		

	}

}
