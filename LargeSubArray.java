import java.util.*;

class SubArray
{
	public void Display(int arr[])
	{
		int i=0, iCnt=0, iStart=0, iEnd=0, iMax=0;
		
		for(i=0;i<=arr.length-2;i++)
		{
			if(arr[i]<arr[i+1])
			{
				iStart=i;
				
				while((arr[i]<=arr[i+1])&&(i<=arr.length-2))
				{
					iCnt++;
					iEnd=i+1;					
					i++;
				}
				
				if(iCnt>iMax)
				{
					iMax=iCnt;
				}
			}
			iCnt=0;
		}
		
		
		if((iStart==0)&&(iEnd==0))
		{
			System.out.println("There is no such subarray");
			return;
		}
		
		System.out.println("Length of subarray is "+(iEnd-iStart+1));
		
		System.out.println("Elements from subarray: ");
		
		for(i=iStart;i<=iEnd;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}

class LargeSubArray
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
			//System.out.println();
		}
		
		System.out.println("Entered elements:");
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		SubArray obj=new SubArray();
		obj.Display(arr);
	}
}
