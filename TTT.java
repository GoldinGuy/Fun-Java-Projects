
import java.util.Random;
import java.util.Scanner;
import java.io.*;

public class TTT
{	
	static BufferedReader keyboard = new
	BufferedReader(new InputStreamReader(System.in));

	public static void main (String[] args) throws IOException
	{
		int i, t,a=0,b=0, Rnd;
		String board[][]=new String [3] [3];
		String player;
		
		
		Scanner input = new Scanner(System.in);
		Random randomNumbers=new Random();

		System.out.println("\nWelcome to Tic-Tac-Toe! ");
		player=("[X]");
	

		load(board); // load
		boolean on=check(board, player);
		display(board); // display
	
		while (on)
		{

			move(board, player); // move
			display(board); // display
			on=check(board, player);

			if (player==("[X]"))
			{
				player=("[O]");
			}
			else if (player==("[O]"))
			{
				player=("[X]");
			}
		}
		
		System.out.println("\nGAME OVER");



	} // ends main









	static void load(String[][] board) // loads board
	{

		int b=0, t, i, x=0;

		for (t=0;t<3;++t)
		{
			for (i=0;i<3;++i)
			{

				board[t][i]=("[ ]");
				
			}
		}
		
	
	} // end of load









	static void display(String[][] board) // displays board
	{
		int i, t, x=0;

		System.out.println();
		
		for (t=0;t<3;++t)
		{
			for (i=0;i<3;++i)
			{
				System.out.print(board[t][i] +" "); // row by row
				x=x+1;

				if (x==3)
				{
					System.out.println();
					x=0;
				}
			}
			System.out.println();
		}
		System.out.println();
	
	} // end of display	









	static void move(String[][] board, String player) // make a move
	{	
		
		Scanner input = new Scanner(System.in);

		int a=0, b=0;

			while (b<1)
			{

				System.out.println("\nPlayer " + player + ", Make a Move:");
				a=input.nextInt();


				if ((a==7) & (board[0][0].equals("[ ]")))
				{
					board[0][0]=(player);
				}			
									
				else if ((a==8) & (board[0][1].equals("[ ]")))
				{
					board[0][1]=(player);
				}
							
				else if ((a==9) & (board[0][2].equals("[ ]")))
				{
					board[0][2]=(player);
				}
							
				else if ((a==4) & (board[1][0].equals("[ ]")))
				{
					board[1][0]=(player);
				}

				else if ((a==5) & (board[1][1].equals("[ ]")))
				{
					board[1][1]=(player);
				}

				else if ((a==6) & (board[1][2].equals("[ ]")))
				{
					board[1][2]=(player);
				}

				else if ((a==1) & (board[2][0].equals("[ ]")))
				{
					board[2][0]=(player);
				}

				else if ((a==2) & (board[2][1].equals("[ ]")))
				{
					board[2][1]=(player);
				}

				else if ((a==3) & (board[2][2].equals("[ ]")))
				{
					board[2][2]=(player);
				}

				else 
				{
					System.out.println("\nThat Space is Taken. Please Choose An Open Slot ");
					b=-1;
				}
			
			b=b+1;
	
			
			} // end of loop
		

	} // end of display	









	static boolean check(String[][] board, String player) // checks board
	{
		boolean on=true;
		int a=0, b=0, c=0;

			
				if (board[0][0].equals(player) & board[0][1].equals(player) & board[0][2].equals(player))
				{
					on=false;
					c=c+1;
				}			
									
				else if (board[1][0].equals(player) & board[1][1].equals(player) & board[1][2].equals(player))
				{
					on=false;
					c=c+1;
				}	
							
				else if (board[2][0].equals(player) & board[2][1].equals(player) & board[2][2].equals(player))
				{
					on=false;
					c=c+1;
				}	
							
				else if (board[0][0].equals(player) & board[1][0].equals(player) & board[2][0].equals(player))
				{
					on=false;
					c=c+1;
				}	

				else if (board[0][1].equals(player) & board[1][1].equals(player) & board[2][1].equals(player))
				{
					on=false;
					c=c+1;
				}	

				else if (board[0][2].equals(player) & board[1][2].equals(player) & board[2][2].equals(player))
				{
					on=false;
					c=c+1;
				}	

				else if (board[0][0].equals(player) & board[1][1].equals(player) & board[2][2].equals(player))
				{
					on=false;
					c=c+1;
				}	

				else if (board[2][0].equals(player) & board[1][1].equals(player) & board[0][2].equals(player))
				{
					on=false;
					c=c+1;
				

				}	
				
				else if (!board[0][0].equals("[ ]") & !board[0][1].equals("[ ]") & !board[0][2].equals("[ ]") & !board[1][0].equals("[ ]") & !board[2][1].equals("[ ]") & !board[2][2].equals("[ ]") & !board[2][0].equals("[ ]") & !board[1][1].equals("[ ]") & !board[0][2].equals("[ ]"))
				{
					on=false;
					a=a+1;
				}

		
		if (a>0)
		{
			System.out.println("\nSTALEMATE");
			a=-6;
		}

		else if (c>0)
		{
			System.out.println("\nPlayer " + player + " Wins!");
		}

		return on;
	
	} // end of check	



} // end of class
