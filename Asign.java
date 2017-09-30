/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asign;

import java.util.*;

//import javax.swing.JOptionPane;



public class Asign

{

	String account;int pinc,bal;

	int check=0;

	public Asign()

	{

		try

		{ 

			Scanner src=new Scanner(System.in);

			System.out.print("\nEnter your account number:");

			account=src.nextLine();

			System.out.print("\nEnter your PIN number:");

			pinc=src.nextInt();

		}

		catch(InputMismatchException e)

		{

			System.out.print("\nEnter the valid input");

		}

		catch(NumberFormatException e)

		{

			System.out.print("\nConversion not valid");

		}

	}

	void deposit(int n)

	{

		this.bal+=n;

	}

	void withdrawl(int n)

	{

                if(n<=bal)
		this.bal-=n;
                else
                    System.out.println("Not Enough Money");

	}

	void display()

	{

		System.out.println("\nTotal Balance : "+this.bal);

	}

	public static void main(String args[])throws ClassNotFoundException

	{

		

		Map<String,Integer> mm=new HashMap<String,Integer>(); 

		mm.put("abcd", 1234);

		mm.put("efgh", 5678);

		mm.put("ijkl",9101);

		mm.put("mnop",1123);

		

		Scanner sc=new Scanner(System.in);

		Asign obj=new Asign();

		

		try{

			int am,amt;

			for(Map.Entry<String,Integer> entry : mm.entrySet())

			{

				if( obj.account.equals(entry.getKey()) && obj.pinc==entry.getValue())

				{

					obj.check++;

					while(true)

					{

						System.out.println("\nEnter Your Choice: 1.Deposit 2.Withdrawl 3.Show Balance 4.Exit");

						int n=sc.nextInt();

						switch(n)

						{

						case 1:

							System.out.print("\nAmount:");

							am=sc.nextInt();

							obj.deposit(am);

							break;

						case 2:

							System.out.print("\nAmount:");

							amt=sc.nextInt();

							obj.withdrawl(amt);

							break;

						case 3:

							obj.display();

							break;

						case 4:

							System.exit(1);

							break;

						}

					}

					

				}

			}

		}

		catch(NullPointerException e)

		{

			System.out.print("\nError"+e);

		}

		catch(InputMismatchException e)

		{

			System.out.print("\nError" +e);

		}

		catch(NoSuchElementException e)

		{

			System.out.print("\nElement not found"+e);

		}



		if(obj.check==0)

		{
                    System.out.println("\nInvalid details");

		}

	}

}