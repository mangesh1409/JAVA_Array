import java.util.*;

class ArrayDisplay
{
	public void DisplayEven(int arr[], int brr[])
	{
		int i=0;
		
		System.out.println("Even elements in 1st aaray:");
		
		for(i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
				System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		System.out.println("Even elements in 2nd aaray:");
		
		for(i=0;i<brr.length;i++)
		{
			if(brr[i]%2==0)
				System.out.print(brr[i]+" ");
		}
		System.out.println();
	}
	
	public void DisplayOdd(int arr[], int brr[])
	{
		int i=0;
		
		System.out.println("Odd elements in 1st aaray:");
		
		for(i=0;i<arr.length;i++)
		{
			if(arr[i]%2!=0)
				System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		System.out.println("Odd elements in 2nd aaray:");
		
		for(i=0;i<brr.length;i++)
		{
			if(brr[i]%2!=0)
				System.out.print(brr[i]+" ");
		}
		System.out.println();
	}
}

class DispalyEvenOdd
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
		aobj.DisplayEven(arr, brr);
		aobj.DisplayOdd(arr,brr);		
	}
}
