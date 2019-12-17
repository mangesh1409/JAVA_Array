import java.util.*;

class ArrayDisplay
{
	public void DisplayCombine(int arr[], int iSize1, int brr[], int iSize2)
	{
		int i=0,j=0;
		
		int com[]=new int[iSize1+iSize2];
				
		for(i=0,j=0;i<arr.length;i++,j++)
		{
			com[i]=arr[i];
		}

		for(i=0;i<brr.length;i++,j++)
		{
			com[j]=brr[i];
		}
		System.out.println();
		System.out.println("Final array :");
		
		for(i=0;i<com.length;i++)
		{
			System.out.print(com[i]);
		}
		System.out.println();
	}
}

class CombineArray
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter number of elements for 1st array");
		int iSize1=sobj.nextInt();
		
		int arr[]=new int[iSize1];
		
		System.out.println("Enter "+ iSize1 +" elements");
		
		for(int i=0;i<iSize1;i++)
		{
			System.out.print("Enter "+ (i+1) +" number :");
			arr[i]=sobj.nextInt();
		}

		System.out.println();		
		
		System.out.println("Enter number of elements for 2nd array");
		int iSize2=sobj.nextInt();
		
		int brr[]=new int[iSize2];
		
		System.out.println("Enter "+ iSize2 +" elements");
		
		for(int i=0;i<iSize2;i++)
		{
			System.out.print("Enter "+ (i+1) +" number :");
			brr[i]=sobj.nextInt();
		}

		System.out.println();		
		ArrayDisplay aobj=new ArrayDisplay();
		aobj.DisplayCombine(arr, iSize1, brr, iSize2);		
	}
}
