import java.util.*;

class ArrayDisplay
{
	public void Replace(int arr[])
	{
		int i=0, iDigit=0, iSum=0;
		
		for(i=0;i<arr.length;i++)
		{
			int iNo=arr[i];
			iDigit=0; iRev=0;
			
			while(iNo!=0)
			{
				iDigit=iNo%10;
				iSum=iSum+0;
				iNo=iNo/10;
			}
			
			arr[i]=iSum;
		}
	
		System.out.println("Array after reverse elements:");
		
		for(i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();		
	}
}

class ReplaceElements
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
		
		System.out.println("Array before reverse elements:");
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		ArrayDisplay aobj=new ArrayDisplay();
		aobj.Replace(arr);
	}
}
