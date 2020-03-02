import java.io.*;
import java.util.Scanner;
class Triangles
	{
		static BufferedReader keyboard = new
			BufferedReader(new InputStreamReader(System.in));


		public static void main(String[]args) throws IOException
		{
			
		Scanner input = new Scanner(System.in);
		int a;
		int i;
		int j;
		int k=0;
		int h;
		System.out.println("Enter the height of the mountain: ");
		a=input.nextInt();
		

		for(i=0;i<a;i++)
		{
		
			for(j=1;j<=i; j++)
			{
			System.out.print("*");
			}

			System.out.print("\n");
			
			
		} // top

		/*

		for (j=0;j<a*2-1;j++ )
		{
			System.out.print("*");
		}

		System.out.print("\n"); // middle
		


		for(i=a-1;i>=1;i--)
		{
		
			
			for(j=i;j>0; j--)
			{
			System.out.print("*");
			}

			for(j=0;j<2*(a-i)-1; j++)
			{
				System.out.print(" ");
			}

			for(j=i;j>0; j--)
			{
			System.out.print("*");
			}


			System.out.print("\n");
			

		
		} // bottom
		
		*/
		
		} //end of main
	} //end class






