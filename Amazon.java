import java.io.*;
import java.util.Scanner;
class  Amazon
{
		static BufferedReader keyboard = new
		BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException
	{


		int x, y, i, a, j, c;
		double s, r, t;
		String category, reply, b;

		String item[]=new String[10];
		int cost[]=new int[10];
		boolean bought[]=new boolean[10];
		
		boolean on, card;
		on = true;
		card = false;
		int gift, member;
		gift = 0;
		member = 0;
		x=0;
		r=0;
		y=1;
		t=100;
		s=0;
		j=0;

		Scanner input = new Scanner(System.in);
		Scanner fileScan =new Scanner (new File("AmazonInfo.txt"));
		FileWriter file2 = new FileWriter("Reciept1.txt");
		PrintWriter outputFile = new PrintWriter(file2);



			while(fileScan.hasNext())
					{

						
						b=fileScan.next();
						c=fileScan.nextInt();
				

						item[j]=b;
						cost[j]=c;
						bought[j]=false;
							
						j = j+1;

					}

					fileScan.close();	



		while (y!=0)
		{
			System.out.println("\nWelcome to AMAZON.com @ the DARK WEB! \n\nEnter Membership Code to Access: ");
			member=input.nextInt();

			if (member==1234)
			{
			

				System.out.println("\nWelcome to AMAZON.com @ the DARK WEB!"); 

				while (on)
				{	
					System.out.println("\nChoose a Category:\nELECTRONICS \nCLOTHING \nEXOTIC FRUIT \n\nTo Leave AMAZON and obtain Receipt, type EXIT\n"); 
					category=keyboard.readLine();
					category=category.toUpperCase();


						if (category.equals("ELECTRONICS"))
						{
						System.out.println("\nChoose an Item: \n" + item[0] + ": $" + cost[0] + "\n" + item[1] + ": $" + cost[1] + "\n"+ item[2] + ": $" + cost[2]); 
						reply=keyboard.readLine();
						reply=reply.toUpperCase();

							for (i=0;i<item.length;i++)
							{
								if (reply.equals(item[i]))
								{
									System.out.println("\nThank you for purchasing " + reply + "!\n "); 
									r = r+ cost[i];
									x = x+1;
									bought[i]=true;
								}

							
							}	

								if (x==0)
								{
									System.out.println("Inalid Choice. \nPlease enter the exact name of the item you would like to purchase."); 
								}

								
						} // end of (Electronics)




						else if (category.equals("CLOTHING"))
						{
						System.out.println("\nChoose an Item: \n" + item[3] + ": $" + cost[3] + "\n" + item[4] + ": $" + cost[4] + "\n"+ item[5] + ": $" + cost[5]); 
						reply=keyboard.readLine();
						reply=reply.toUpperCase();

							for (i=0;i<item.length;i++)
							{
								if (reply.equals(item[i]))
								{
									System.out.println("\nThank you for purchasing " + reply + "!\n "); 
									r = r+ cost[i];
									x = x+1;
									bought[i]=true;
								}

							}

									if (x==0)
								{
									System.out.println("Inalid Choice. \nPlease enter the exact name of the item you would like to purchase."); 
								}

						} // end of (Clothing)
					





						else if (category.equals("EXOTIC FRUIT"))
						{
						System.out.println("\nChoose an Item: \n" + item[6] + ": $" + cost[6] + "\n" + item[7] + ": $" + cost[7] + "\n"+ item[8] + ": $" + cost[8]); 
						reply=keyboard.readLine();
						reply=reply.toUpperCase();

							for (i=0;i<item.length;i++)
							{
								if (reply.equals(item[i]))
								{
									System.out.println("\nThank you for purchasing " + reply + "!\n "); 
									r = r+ cost[i];
									x = x+1;
									bought[i]=true;
								}

							}

									if (x==0)
								{
									System.out.println("Inalid Choice. \nPlease enter the exact name of the item you would like to purchase."); 
								}

						} // end of (Electronics)


						
						else if (category.equals("EXIT"))
						{



							System.out.println("\nEnter a Gift-Card Code to get $100 Off! \nPress 0 to SKIP this step.");
							gift=input.nextInt();
							
							System.out.println("\nThank you for visiting AMAZON.com @ The Dark Web \n\nYour Reciept is: "); 
							outputFile.println("\nThank you for visiting AMAZON.com @ The Dark Web \n\nYour Reciept is: ");

							for (i=0;i<item.length;i++)
							{
								if (bought[i]==true)
								{
									System.out.println(item[i] + ": $" + cost[i]); 
									outputFile.println(item[i] + ": $" + cost[i]); 
								}
							}

								
							System.out.println("\nTotal Cost: $" + r);
							outputFile.println("\nTotal Cost: $" + r);


							if (gift==123456789)
								{
									System.out.println("- $100    (Gift Card)");
									outputFile.println("- $100    (Gift Card)");
									t=t-r;
									r = r-100;

									if (t>=0)
									{
									System.out.println("Your gift card has $" + t + " left on it.");
									outputFile.println("Your gift card has $" + t + " left on it.");
									}

								}

							s = r * 0.06;
							
							if (r>=0)
							{

							System.out.println("\nSales Tax: $" + s);
							outputFile.println("\nSales Tax: $" + s);

							r = r+s;

							System.out.println("\nTotal Cost w/ Sales Tax: $" + r);
							outputFile.println("\nTotal Cost w/ Sales Tax: $" + r);

							}
							

							if (r<0)
							{

							System.out.println("\nSales Tax: $0.00");
							outputFile.println("\nSales Tax: $0.00");

							System.out.println("\nTotal Cost w/ Sales Tax: $0.00");
							outputFile.println("\nTotal Cost w/ Sales Tax: $0.00");

							}
							
							
							on = false;
							y = 0;
				
						} // end of (EXIT)


						x=0;
						i=0;
				
				} // end of if

			
			} // end of while

			else
				{
					System.out.println("\nINVALID CODE. Please enter a valid membership code.");
				}

		} // end of while

	

	outputFile.close();


	} // end of main
} // end of class




