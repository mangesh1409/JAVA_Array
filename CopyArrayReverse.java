import java.util.*;

class ArrayDisplay
{
	public int[] CpyArray(int arr[], int iSize1, int brr[], int iSize2)
	{
		int i=0,j=0;
		int iNew=iSize1+iSize2;
		
		int com[]=new int[iNew];
				
		for(i=0, j=iNew-1; i<arr.length ;i++, j--)
		{
			com[j]=arr[i];
		}

		for(i=0;i<brr.length;i++,j--)
		{
			com[j]=brr[i];
		}
		System.out.println();
		
		return com;
	}
}

class CopyArrayReverse
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
		int res[]=aobj.CpyArray(arr, iSize1, brr, iSize2);		
		
		System.out.println("Final array: ");
			
		for(int i=0;i<iSize1+iSize2;i++)
		{
			System.out.print(res[i]+" ");
		}	
	}
}
