
class F3
{
	public static void main(String args[])
	{
		for(int i=1;i<=9;i++)
		{
			//for(int j=1;j<=i;j++);
			//{
			//System.out.print(" ");
		//	}
		
			//for(int m=9 ; m>=i ; m--)
			//{	
			//	System.out.print("* ");
			//	m--;
				
			//}
			for(int k=9 ; k>i ; k--)
			{
				System.out.print("* ");
				k--;
				
			}
			System.out.println();
		}
	}
}

//output
//E:\Module1\Pattern program>javac F3.java
//E:\Module1\Pattern program>java F3
// * * * * * * * * *
// * * * * * * * *
// * * * * * * *
// * * * * * *
// * * * * *
// * * * *
// * * *
// * *
// *