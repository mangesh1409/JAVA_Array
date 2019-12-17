import java.util.*;

class ArrayDisplay
{
	public int CapCount(String str)
	{
		int i=0, iCnt=0;
		char arr[]=str.toCharArray();
		
		for(i=0;i<arr.length;i++)
		{
			if((arr[i]>='A')&&(arr[i]<='Z'))
			{
				iCnt++;
			}			
		}
	
		return iCnt;	
	}
}

class CountCapLet
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter string");
		String str=sobj.nextLine();
		
		ArrayDisplay aobj=new ArrayDisplay();
		int iRet=aobj.CapCount(str);
		System.out.println("Number of capital letters in array is "+iRet);
	}
}
