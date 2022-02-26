import java.util.Scanner;

public class BubbleSortWord {
  public static void main(String args[])
  {
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter the number of word you want:");
	  int count = sc.nextInt();
	  String str[] = new String[count];
	  System.out.println("Enter the string elements:");
	  for(int i=0;i<count;i++)
	  {
		  str[i]=sc.nextLine();
	  }
	  for(int i=0;i<count;i++)
	  {
		  for(int j=i+1;j<count;j++)
		  {
			  if(str[j].compareTo(str[i])<0)
			  {
				 String temp = str[j];
				 str[j] = str[i];
				 str[i] = temp;
			  }
		  }
	  }
	  System.out.println("entered string elements");
	  for(int i=0;i<count;i++)
	  
		 
	  
	  System.out.println(str[i]);
	  
  }
}
