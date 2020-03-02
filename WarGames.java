	import java.util.Random;
	
public class WarGames {

	
			public static void main(String[] args)
			{
				String Board[][] = new String[3][3];
				String C="",D="",E="WOPR ";
				int j,T=0,P=0;
				System.out.println("\n\n\n\n\n\n\n\n");
			
				while (P<35)
				{
					j = 0;
					for (int t=0; t<3; t++)
					{
						for (int i=0; i<3; i++)
						{
							Board[t][i] = "E";
						}
					}
					while (j<9 & !Check(Board,E))
					{
						Display(Board);
						if (j%2==0)
						{
							C = "X";
						}
						else
						{
							C = "O";
						}
						MoveAI(Board,C,T);
						j++;
					}
					if (j==9)
					{
						Display(Board);
						try
						{
							Thread.sleep(530-T);
						}
						catch (InterruptedException ie)
						{
							System.out.println(ie.getMessage());
						}
						System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n				 No Winner\n\n\n\n\n\n\n\n\n\n\n\n");
						try
						{
							Thread.sleep(530-T);
						}
						catch (InterruptedException ie)
						{
							System.out.println(ie.getMessage());
						}
						
					}
					if (T<500)
					{
						T+=50;
					}
					P++;
				}
				System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n				 No Winner\n\n\n\n\n\n\n\n\n\n\n\n");
			}
			static void Display(String[][]Board)
			{
				int t,i;
				for (t=0; t<3; t++)
				{
					System.out.print("				");
					for (i=0; i<3; i++)
					{
						System.out.print(Board[t][i] + "    ");
					}
					System.out.println("\n\n\n");
				}
				System.out.println("\n\n\n\n");
			}
			static void MoveAI(String[][]Board,String C,int T)
			{
				Random randomNumbers = new Random();
				String E="";
				int M=1,c=0,A[]=new int[5];
				boolean B=true;
				if (C.equals("X"))
				{
					E = "O";
				}
				else
					E = "X";
				try
				{
					Thread.sleep(530-T);
				}
				catch (InterruptedException ie)
				{
					System.out.println(ie.getMessage());
				}

				if (((Board[2][1].equals(Board[2][2]) & Board[2][1].equals(C)) | (Board[0][0].equals(Board[1][0]) & Board[0][0].equals(C)) | (Board[0][2].equals(Board[1][1]) & Board[0][2].equals(C))) & Board[2][0].equals("E"))
				{
					M = 1;
				}
				else if (((Board[2][0].equals(Board[2][1]) & Board[2][0].equals(C)) | (Board[0][0].equals(Board[1][1]) & Board[0][0].equals(C)) | (Board[0][2].equals(Board[1][2]) & Board[0][2].equals(C))) & Board[2][2].equals("E"))
				{
					M = 3;
				}
				else if (((Board[2][0].equals(Board[1][0]) & Board[2][0].equals(C)) | (Board[2][2].equals(Board[1][1]) & Board[2][2].equals(C)) | (Board[0][1].equals(Board[0][2]) & Board[0][2].equals(C))) & Board[0][0].equals("E"))
				{
					M = 7;
				}
				else if (((Board[0][0].equals(Board[0][1]) & Board[0][0].equals(C)) | (Board[2][0].equals(Board[1][1]) & Board[2][0].equals(C)) | (Board[2][2].equals(Board[1][2]) & Board[2][2].equals(C))) & Board[0][2].equals("E"))
				{
					M = 9;
				}
				else if (((Board[2][0].equals(Board[2][2]) & Board[2][0].equals(C)) | (Board[0][1].equals(Board[1][1]) & Board[0][1].equals(C))) & Board[2][1].equals("E"))
				{
					M = 2;
				}
				else if (((Board[2][0].equals(Board[0][0]) & Board[2][0].equals(C)) | (Board[1][2].equals(Board[1][1]) & Board[1][2].equals(C))) & Board[1][0].equals("E"))
				{
					M = 4;
				}
				else if (((Board[0][2].equals(Board[2][2]) & Board[2][2].equals(C)) | (Board[1][0].equals(Board[1][1]) & Board[1][1].equals(C))) & Board[1][2].equals("E"))
				{
					M = 6;
				}
				else if (((Board[0][0].equals(Board[0][2]) & Board[0][0].equals(C)) | (Board[2][1].equals(Board[1][1]) & Board[2][1].equals(C))) & Board[0][1].equals("E"))
				{
					M = 8;
				}
				else if (((Board[0][0].equals(Board[2][2]) & Board[0][0].equals(C)) | (Board[1][0].equals(Board[1][2]) & Board[1][0].equals(C)) | (Board[0][2].equals(Board[2][0]) & Board[0][2].equals(E)) | (Board[2][1].equals(Board[0][1]) & Board[2][1].equals(C))) & Board[1][1].equals("E"))
				{
					M = 5;
				}
				else if (((Board[2][1].equals(Board[2][2]) & Board[2][1].equals(E)) | (Board[0][0].equals(Board[1][0]) & Board[0][0].equals(E)) | (Board[0][2].equals(Board[1][1]) & Board[0][2].equals(E))) & Board[2][0].equals("E"))
				{
					M = 1;
				}
				else if (((Board[2][0].equals(Board[2][1]) & Board[2][0].equals(E)) | (Board[0][0].equals(Board[1][1]) & Board[0][0].equals(E)) | (Board[0][2].equals(Board[1][2]) & Board[0][2].equals(E))) & Board[2][2].equals("E"))
				{
					M = 3;
				}
				else if (((Board[2][0].equals(Board[1][0]) & Board[2][0].equals(E)) | (Board[2][2].equals(Board[1][1]) & Board[2][2].equals(E)) | (Board[0][1].equals(Board[0][2]) & Board[0][2].equals(E))) & Board[0][0].equals("E"))
				{
					M = 7;
				}
				else if (((Board[0][0].equals(Board[0][1]) & Board[0][0].equals(E)) | (Board[2][0].equals(Board[1][1]) & Board[2][0].equals(E)) | (Board[2][2].equals(Board[1][2]) & Board[2][2].equals(E))) & Board[0][2].equals("E"))
				{
					M = 9;
				}
				else if (((Board[2][0].equals(Board[2][2]) & Board[2][0].equals(E)) | (Board[0][1].equals(Board[1][1]) & Board[0][1].equals(E))) & Board[2][1].equals("E"))
				{
					M = 2;
				}
				else if (((Board[2][0].equals(Board[0][0]) & Board[2][0].equals(E)) | (Board[1][2].equals(Board[1][1]) & Board[1][2].equals(E))) & Board[1][0].equals("E"))
				{
					M = 4;
				}
				else if (((Board[0][2].equals(Board[2][2]) & Board[2][2].equals(E)) | (Board[1][0].equals(Board[1][1]) & Board[1][1].equals(E))) & Board[1][2].equals("E"))
				{
					M = 6;
				}
				else if (((Board[0][0].equals(Board[0][2]) & Board[0][0].equals(E)) | (Board[2][1].equals(Board[1][1]) & Board[2][1].equals(E))) & Board[0][1].equals("E"))
				{
					M = 8;
				}
				else if (((Board[0][0].equals(Board[2][2]) & Board[0][0].equals(E)) | (Board[1][0].equals(Board[1][2]) & Board[1][0].equals(E)) | (Board[0][2].equals(Board[2][0]) & Board[0][2].equals(E)) | (Board[2][1].equals(Board[0][1]) & Board[2][1].equals(E))) & Board[1][1].equals("E"))
				{
					M = 5;
				}



				else if ((Board[1][1].equals(C) & Board[2][1].equals("E") & Board[0][1].equals("E")) | (Board[1][1].equals(C) & Board[1][0].equals("E") & Board[1][2].equals("E")))
				{
					if (Board[1][1].equals(C) & Board[2][1].equals("E") & Board[0][1].equals("E"))
					{
						A[c] = randomNumbers.nextInt(2)*6 + 2;
						c++;
					}
					if (Board[1][1].equals(C) & Board[1][0].equals("E") & Board[1][2].equals("E"))
					{
						A[c] = randomNumbers.nextInt(2)*2 + 4;
						c++;
					}
					M = A[randomNumbers.nextInt(c)];
				}
				else
				{
					if (Board[1][1].equals("E") & !(Board[0][0].equals("E") & Board[0][1].equals("E") & Board[0][2].equals("E") & Board[1][0].equals("E") & Board[1][2].equals("E") & Board[2][0].equals("E") & Board[2][1].equals("E") & Board[2][2].equals("E")))
					{
						M = 5;
					}
					else if ((Board[2][0].equals("E") | Board[2][2].equals("E") | Board[0][0].equals("E") | Board[0][2].equals("E")))
					{
						if (Board[1][1].equals("E"))
						{
							A[c] = 5;
							c++;
						}
						if (Board[2][0].equals("E") & !(Board[0][1].equals(E) & Board[1][2].equals(E)))
						{
							A[c] = 1;
							c++;
						}
						if (Board[2][2].equals("E") & !(Board[1][0].equals(E) & Board[0][1].equals(E)))
						{
							A[c] = 3;
							c++;
						}
						if (Board[0][0].equals("E") & !(Board[2][1].equals(E) & Board[1][2].equals(E)))
						{
							A[c] = 7;
							c++;
						}
						if (Board[0][2].equals("E") & !(Board[1][0].equals(E) & Board[2][1].equals(E)))
						{
							A[c] = 9;
							c++;
						}
						M = A[randomNumbers.nextInt(c)];
					}
					else if ((Board[2][1].equals("E") | Board[1][0].equals("E") | Board[1][2].equals("E") | Board[0][1].equals("E")))
					{
						if (Board[2][1].equals("E"))
						{
							A[c] = 2;
							c++;
						}
						if (Board[1][0].equals("E"))
						{
							A[c] = 4;
							c++;
						}
						if (Board[1][2].equals("E"))
						{
							A[c] = 6;
							c++;
						}
						if (Board[0][1].equals("E"))
						{
							A[c] = 8;
							c++;
						}
						M = A[randomNumbers.nextInt(c)];
					}
				}
				Board[math1(M)][math2(M)] = C;
				B = false;
			}
			static boolean Check(String[][]Board,String A)
			{
				boolean B;
				if ((Board[2][0].equals(Board[2][1]) & Board[2][0].equals(Board[2][2]) & !Board[2][0].equals("E")) | (Board[1][0].equals(Board[1][1]) & Board[1][0].equals(Board[1][2]) & !Board[1][0].equals("E")) | (Board[0][0].equals(Board[0][1]) & Board[0][0].equals(Board[0][2]) & !Board[0][0].equals("E")) | (Board[0][0].equals(Board[1][0]) & Board[0][0].equals(Board[2][0]) & !Board[0][0].equals("E")) | (Board[0][1].equals(Board[1][1]) & Board[0][1].equals(Board[2][1]) & (!Board[0][1].equals("E"))) | (Board[0][2].equals(Board[1][2]) & Board[0][2].equals(Board[2][2]) & !Board[0][2].equals("E")) | (Board[0][0].equals(Board[1][1]) & Board[0][0].equals(Board[2][2]) & !Board[0][0].equals("E")) | (Board[0][2].equals(Board[1][1]) & Board[0][2].equals(Board[2][0]) & !Board[0][2].equals("E")))
				{
					Display(Board);
					System.out.println(A + "wins!!");
					B=true;
				}
				else
					B=false;
				return B;
			}
			static int math1(int num)
			{
				int a;
				a = 2 - (num - 1)/3;
				return a;
			}
			static int math2(int num)
			{
				int a;
				a = (num - 1) % 3;
				return a;
			}
		
	}


