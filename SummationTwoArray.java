import java.util.*;

class ArrayDisplay
{
	public void DisplaySum(int arr[], int brr[])
	{
		int i=0, iAns=0;
		
		for(i=0;i<arr.length;i++)
		{
			iAns=iAns+arr[i];
		}
		
		for(i=0;i<brr.length;i++)
		{
			iAns=iAns+brr[i];
		}

		System.out.println("Summation of elements of 2 array: "+iAns);
	}
}

class SummationTwoArray
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter number of elements for 1st array");
		int iSize=sobj.nextInt();
		
		int arr[]=new int[iSize];
		
		System.out.println("Enter "+ iSize +" elements");
		
		for(int i=0;i<iSize;i++)
		{
			System.out.print("Enter "+ (i+1) +" number :");
			arr[i]=sobj.nextInt();
		}

		System.out.println();		
		
		System.out.println("Enter number of elements for 2nd array");
		iSize=sobj.nextInt();
		
		int brr[]=new int[iSize];
		
		System.out.println("Enter "+ iSize +" elements");
		
		for(int i=0;i<iSize;i++)
		{
			System.out.print("Enter "+ (i+1) +" number :");
			brr[i]=sobj.nextInt();
		}

		System.out.println();		
		ArrayDisplay aobj=new ArrayDisplay();
		aobj.DisplaySum(arr, brr);		
	}
}
