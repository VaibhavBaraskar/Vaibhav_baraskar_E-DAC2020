import java.util.Scanner;
public class HalfPyramid{

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number of levels to be created");	
		int level=sc.nextInt();
	for(int i=level;i>0;i--)
		{
			for(int j=i;j<=level;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}