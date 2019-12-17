import java.util.*;

class ArrayDisplay
{
	public void Marks(float arr[])
	{
		int i=0;
		float  fMark=0.0f;
		System.out.println("Marks\tClass");
		
		for(i=0;i<arr.length;i++)
		{
			fMark=arr[i];
			
			if(fMark>=70)
			{
				System.out.println(fMark+"\tFirst class with Distinction");
			}
			else if((fMark<70)&&(fMark>=60))
			{
				System.out.println(fMark+"\tFirst Class");
			}
			else if((fMark<60)&&(fMark>=50))
			{
				System.out.println(fMark+"\tSecond Class");
			}
			else if((fMark<50)&&(fMark>=35))
			{
				System.out.println(fMark+"\tPass Class");
			}
			else
			{
				System.out.println(fMark+"\tFail");
			}	
		}
	}
}

class DisplayClass
{
	public static void main(String arg[])
	{
		Scanner sobj=new Scanner(System.in);
		
		System.out.println("Enter number of students");
		int iSize=sobj.nextInt();
		
		float arr[]=new float[iSize];
		
		System.out.println("Enter marks of "+ iSize +" students");
		
		for(int i=0;i<iSize;i++)
		{
			System.out.print("Enter mark of "+ (i+1) +" student :");
			arr[i]=sobj.nextFloat();
		}
		
		System.out.println();
		
		ArrayDisplay aobj=new ArrayDisplay();
		aobj.Marks(arr);
	}
}
