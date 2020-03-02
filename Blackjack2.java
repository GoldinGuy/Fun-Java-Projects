import java.util.Random;
import java.util.Scanner;
import java.io.*;


class  Blackjack2
{

		static BufferedReader keyboard = new
		BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) 
	{
		boolean on=true;
		Random randomNumbers=new Random();
		Scanner input = new Scanner(System.in);

		String a, b, c, d;
		int x=0, y=0, z=0, i=0, Rnd=0, Input=0, w=0;


		int[] card = new int [52];
		Ldcard(card);

		int[] total = new int [2];
		total[0]=0;
		total[1]=0;

		String[] name = new String [52];
		Loadname(name);

		boolean[] deck = new boolean [52];
		boolean[] pldeck = new boolean [52];
		boolean[] dldeck = new boolean [52];
		Loaddecks(deck, pldeck, dldeck);

		int[] dlcard = new int [10];
		int[] plcard = new int [10];
		Ldcards(plcard, dlcard);



		System.out.println("\nWelcome to BlackJack!");



				try
				{
					Thread.sleep(1500);
				}
				catch (InterruptedException ie)
				{
					System.out.println("Loading...");
				}

	
		dlcards(dlcard, total, deck, dldeck, Rnd, i, card, name);

		plcards(plcard, total, deck, pldeck, Rnd, i, card, name);

		dlcards2(dlcard, deck, total, dldeck, Rnd, plcard, i, card, name);

		result(dlcard, deck, total, dldeck, Rnd, plcard, i, card, name);

		


	} // end of main







	static void Ldcard(int[] card)
	{

		card[0]=11;
		card[1]=2;
		card[2]=3;
		card[3]=4;
		card[4]=5;
		card[5]=6;
		card[6]=7;
		card[7]=8;
		card[8]=9;
		card[9]=10;
		card[10]=10;
		card[11]=10;
		card[12]=10;
		card[13]=10;		
		card[14]=11;
		card[15]=2;
		card[16]=3;
		card[17]=4;
		card[18]=5;
		card[19]=6;
		card[20]=7;
		card[21]=8;
		card[22]=9;
		card[23]=10;
		card[24]=10;
		card[25]=10;
		card[26]=10;
		card[27]=10;
		card[28]=11;
		card[29]=2;
		card[30]=3;
		card[31]=4;
		card[32]=5;
		card[33]=6;
		card[34]=7;
		card[35]=8;
		card[36]=9;
		card[37]=10;
		card[38]=10;
		card[39]=10;
		card[40]=10;
		card[41]=10;
		card[42]=11;
		card[43]=2;
		card[44]=3;
		card[45]=4;
		card[46]=5;
		card[47]=6;
		card[48]=7;
		card[49]=8;
		card[50]=9;
		card[51]=10;
	

	} // ends loadcard






	
	static void Loadname(String[] name)
	{

		name[0]=(" Ace ");
		name[1]=("");
		name[2]=("");
		name[3]=("");
		name[4]=("");
		name[5]=("");
		name[6]=("");
		name[7]=("");
		name[8]=("");
		name[9]=(" [10] ");
		name[10]=(" Jack ");
		name[11]=(" Queen ");
		name[12]=(" King ");
		name[13]=(" Queen ");		
		name[14]=(" Ace ");
		name[15]=("");
		name[16]=("");
		name[17]=("");
		name[18]=("");
		name[19]=("");
		name[20]=("");
		name[21]=("");
		name[22]=("");
		name[23]=(" [10] ");
		name[24]=(" Jack ");
		name[25]=(" Queen ");
		name[26]=(" King ");
		name[27]=(" King ");
		name[28]=(" Ace ");
		name[29]=(" ");
		name[30]=(" ");
		name[31]=(" ");
		name[32]=(" ");
		name[33]=(" ");
		name[34]=(" ");
		name[35]=(" ");
		name[36]=(" ");
		name[37]=(" [10] ");
		name[38]=(" Jack ");
		name[39]=(" Queen ");
		name[40]=(" King ");
		name[41]=(" Jack ");
		name[42]=(" Ace ");
		name[43]=(" ");
		name[44]=(" ");
		name[45]=(" ");
		name[46]=(" ");
		name[47]=(" ");
		name[48]=(" ");
		name[49]=(" ");
		name[50]=(" ");
		name[51]=(" [10] ");
	

	} // ends loadname







	static void Loaddecks(boolean[] pldeck,boolean[] dldeck,boolean[] deck)
	{

		int i;


		for (i=0;i<52 ;i++ )
		{
			pldeck[i]=true;
			dldeck[i]=true;
			deck[i]=true;
		}


	} // ends loaddecks







	static void Ldcards(int[] plcard, int[] dlcard)
	{

		int i;


		for (i=0;i<10 ;i++ )
		{
			plcard[i]=0;
			dlcard[i]=0;
		}

	} // ends loadcards







	static void dlcards(int[] dlcard, int[] total, boolean[] deck, boolean[]dldeck, int Rnd, int i, int[] card, String[] name)
	{

			Random randomNumbers=new Random();
			Rnd=0;

			while (total[1]==0)
			{
			
				Rnd=randomNumbers.nextInt(52); //Dealer's Cards
				
				 dlcard[i]= card[Rnd];
				 deck[Rnd]=false;
				 dldeck[Rnd]=false;

				 if (dlcard[i]>9)
				 {
					 System.out.println("\n \nDealer's Hand: ? , " + name[Rnd]);
				 }

				 if (dlcard[i]<=9)
				 {
					  System.out.println("\n \nDealer's Hand: ? , [" + dlcard[i] + "]");
				 }

				 total[1]=total[1]+dlcard[i];

					i = i+1;

			
			} // dealers cards

				try
				{
					Thread.sleep(1500);
				}
				catch (InterruptedException ie)
				{
					System.out.println("Loading...");
				}

			


	} // ends dealer's cards







	static void plcards(int[] plcard, int[] total, boolean[] deck, boolean[]pldeck, int Rnd, int i, int[] card, String[] name)
	{

			Random randomNumbers=new Random();
			Scanner input = new Scanner(System.in);

			Rnd=0;
			int y=0, x=0, h=0, Input=0;
			boolean on=true;

			System.out.print("\n \nYour Hand: "); // your hand


				while (i<2)
				{

					Rnd=randomNumbers.nextInt(52); // Find y


					if (deck[Rnd]==true)
					{

						plcard[i]=card[Rnd];
						deck[Rnd]=false;
						pldeck[Rnd]=false;
						i=i+1;

					} // end of if


				} // end of while
				
						for (y=0; y<52 ;y++ )
						{
							if (pldeck[y]==false)
							{
								if (card[y]>9)
								{
										System.out.print(name[y]);
								}

								if (card[y]<=9)
								{
										System.out.print(" [" + card[y] + "] ");
								}
							
							}
						}

					

					total[0] = plcard[0]+plcard[1]; // find total

					System.out.println("\n\nTotal: " + total[0]); // find total

						
						
				if (total[0]==21)
				{
					System.out.println("\nBLACKJACK! \nYou Won! \n ");
					on = false;
				} // end of if




				if (total[0]<21)
				{


					while (on)
					{
							System.out.println("\n To Hit, Press 1 \n \n To Stay, Press 2");
							Input=input.nextInt();


							if (Input==2)
							{
								on=false;
							} // end of if



						if (on==true)
						{
									
									try
									{
										Thread.sleep(1500);
									}
									catch (InterruptedException ie)
									{
										System.out.println("Loading...");
									}


							x=0;


							if (Input==1)
							{
								while (x<1)
								{
				
								Rnd=randomNumbers.nextInt(52); // Find y

								if (deck[Rnd]==true)
								{
									
									 if (card[Rnd]<10)
									 {
										  System.out.println("\n \n You were dealt a [" + card[Rnd] + "]"); // your hand
									 }

								 	 if (card[Rnd]>9)
									 {
										  System.out.println("\n \n You were dealt a " + name[Rnd]); // your hand
									 }


									i=i+1;
									plcard[i]=card[Rnd];
									deck[Rnd]=false;
									pldeck[Rnd]=false;
									x=x+1;

									System.out.print("\n \nYour Hand: "); // your hand

									for (y=0; y<52 ;y++ )
									{
										if (pldeck[y]==false)
										{
											if (card[y]>9)
											{
													System.out.print(name[y]);
											}

											if (card[y]<=9)
											{
													System.out.print(" [" + card[y] + "] ");
											}
										
										}
									}

								

								total[0] = plcard[0]+plcard[1]+plcard[2]+plcard[3]+plcard[4]+plcard[5]+plcard[6]+plcard[7]+plcard[8]; // find total
							

								
									for (h=0; h<10; h++)
									{
										if (total[0]>21)
										{
										
											if (plcard[h]==11)
											{
												plcard[h]=1;
												total[0] = plcard[0]+plcard[1]+plcard[2]+plcard[3]+plcard[4]+plcard[5]+plcard[6]+plcard[7]+plcard[8]; // find total
											}
										}
									}
						
						


								System.out.println("\n\nTotal: " + total[0]); // find total


								if (total[0]>21)
								{
									on=false;
								} // end of if



								} // end of if

							


								} // end of while


							} // end of if


						} // end


				try
				{
					Thread.sleep(1000);
				}
				catch (InterruptedException ie)
				{
					System.out.println("Loading...");
				}


					
					} // end of loop


					if (total[0]==21)
					{
						System.out.print("\nBLACKJACK!   \n ");
					} // end of if

					if (total[0]>21)
					{
						System.out.print("\nBUST! \nYOU LOST \n");
					} // end of if


					card[0]=11;
					card[14]=11;
					card[28]=11;
					card[42]=11;

			

	} // end loop cards


} // end plcards








	static void dlcards2(int[] dlcard, boolean[] deck, int[] total, boolean[]dldeck, int Rnd, int[] plcard, int i, int[] card, String[] name)
	{

			Random randomNumbers=new Random();
			Scanner input = new Scanner(System.in);

			Rnd=0;
			int y=0, x=0, h=0, Input=0, w=0;
			boolean on=true;



					if (total[0]<=21)
					{



							if (total[0]<=21)
							{

								i=2;

								while (i==2)
								{
								
									Rnd=randomNumbers.nextInt(52); // Dealer's Cards

									if (deck[Rnd]==true)
									{	
									 dlcard[i]=card[Rnd];
									  deck[Rnd]=false;
									  dldeck[Rnd]=false;
										i=i+1;
									}
								}

							} // end of if

											System.out.print("\n \nDealer's Hand: "); // dealers hand

											for (y=0; y<52 ;y++ )
											{
												if (dldeck[y]==false)
												{
													if (card[y]>9)
													{
															System.out.print(name[y]);
													}

													if (card[y]<=9)
													{
															System.out.print(" [" + card[y] + "] ");
													}
												
												}
											}
								

								 total[1]=dlcard[0]+dlcard[1]+dlcard[2]+dlcard[3]+dlcard[4]+dlcard[5]+dlcard[6]+dlcard[7]+dlcard[8]; // find total;
									w=total[1];


				try
				{
					Thread.sleep(1000);
				}
				catch (InterruptedException ie)
				{
					System.out.println("Loading...");
				}


								while (total[1]<17)
								{	
						
							
								Rnd=randomNumbers.nextInt(52); //Dealer's Cards

								

								 if (deck[Rnd]==true)
								 {


									 i = i+1;
								
								 deck[Rnd]=false;
								 dldeck[Rnd]=false;
								 dlcard[i]=card[Rnd];

									 if (card[Rnd]<10)
									 {
										  System.out.println("\n \n The Dealer Hit and was dealt a [" + card[Rnd] + "]"); // dealers hand
									 }

								 	 if (card[Rnd]>9)
									 {
										  System.out.println("\n \n The Dealer Hit and was dealt a " + name[Rnd]); // dealers hand
									 }

								 
									total[1]=dlcard[0]+dlcard[1]+dlcard[2]+dlcard[3]+dlcard[4]+dlcard[5]+dlcard[6]+dlcard[7]+dlcard[8]; // find total;




									try
									{
										Thread.sleep(1000);
									}
									catch (InterruptedException ie)
									{
										System.out.println("Loading...");
									}
								
								 }
												
									for (h=0; h<10; h++)
									{
										if (total[0]>21)
										{
										
											if (dlcard[h]==11)
											{
												dlcard[h]=1;
												total[0] = plcard[0]+plcard[1]+plcard[2]+plcard[3]+plcard[4]+plcard[5]+plcard[6]+plcard[7]+plcard[8]; // find total
											}
										}
									}


					
								} // dealers cards

								if (total[1]!=w)
								{


											System.out.print("\nDealer's Hand: "); // dealers hand

											for (y=0; y<52 ;y++ )
											{
												if (dldeck[y]==false)
												{
													if (card[y]>9)
													{
															System.out.print(name[y]);
													}

													if (card[y]<=9)
													{
															System.out.print(" [" + card[y] + "] ");
													}
												
												}
											}

								} // end if
					

								try
								{
									Thread.sleep(1000);
								}
								catch (InterruptedException ie)
								{
									System.out.println("Loading...");
								}
			
					}// end of if


} // end dealer



static void result(int[] dlcard, boolean[] deck, int[] total, boolean[]dldeck, int Rnd, int[] plcard, int i, int[] card, String[] name)
{


						if (total[0]<=21)
						{

								System.out.println("\n \nDealer's Total: " + total[1]);
								System.out.println("\nYour Total: " + total[0]); // find total


									if (total[0]>total[1] | total[1]>21)
									{
										System.out.println("\nCongratulations! You Won! ");
									} // end of if

									if (total[0]==total[1])
									{
										System.out.println("\nPUSH ");
									} // end of if


						} // end of if

									if (total[0]<total[1] & total[1]<22)
									{
										System.out.println("\nYou Lost ");
									} // end of if

		






} // end result






}// end class







							













