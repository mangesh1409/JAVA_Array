import java.util.*;

class ArrayDemo
{
	public int Difference(int arr[])
	{
		int i=0, iEsum=0, iOsum=0;
		
		for(i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				iEsum=iEsum+arr[i];
			}
			else
			{
				iOsum=iOsum+arr[i];
			}
		}
		return iEsum-iOsum;	
	}
}

class DifferenceEvenOdd
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter number of elements");
		int iSize=sobj.nextInt();
		
		int arr[]=new int[iSize];
		
		System.out.println("Enter "+ iSize +" elements");
		
		for(int i=0;i<iSize;i++)
		{
			System.out.print("Enter "+ (i+1) +" number :");
			arr[i]=sobj.nextInt();
		}
		
		System.out.println("Entered elements:");
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		ArrayDemo aobj=new ArrayDemo();
		int iRet=aobj.Difference(arr);
		
		System.out.println("Difference between summation of even numbers & summation of odd numbers is "+iRet);
	}
}
