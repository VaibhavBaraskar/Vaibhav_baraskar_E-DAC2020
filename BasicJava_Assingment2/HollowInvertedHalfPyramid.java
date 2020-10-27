import java.util.Scanner;
public class HollowInvertedHalfPyramid{

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number of levels to be created");	
		int level=sc.nextInt();
	int count=1,space=1;
	for(int i=1;i<=level;i++)
		{
			for(int j=i;j<=level;j++)
			{	
				if(i==1){ while(count<=level)
						{ count++;space++;
						System.out.print("*");
						}
				}else{
					System.out.print("*");
						for(int m=2;m<(level-i-1);m++)
							System.out.print("  ");
					}	//System.out.print("*");			
			}
			System.out.println();
		}
	}

}