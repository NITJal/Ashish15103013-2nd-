/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package asign;
import java.io.BufferedReader;

	import java.io.IOException;

	import java.io.InputStreamReader;

	import java.util.InputMismatchException;

	import java.util.Scanner;

	

public class form{

		String name,email;
		long rn;
		String address,ph;

		double hsc,ug;

		

		public form() throws IOException

		{

			try{

				InputStreamReader ob=new InputStreamReader(System.in);

				BufferedReader br=new BufferedReader(ob);

				System.out.println("Roll No.:");

				rn=Long.parseLong(br.readLine());

				System.out.println("Name:");

				name=br.readLine();

				while(true)

				{

					System.out.println("Phone Number:");

					ph=br.readLine();

					if(ph.length()==10)

					{

						

						break ;

					}

					System.out.println("*Invalid*");

				}

				while(true)

				{

					System.out.println("Email id:");

					email=br.readLine();

					if(email.contains("@") && email.endsWith(".com"))

					{

						break ;

					}

					System.out.println("Invalid");

				}

				System.out.println("Enter Address:");

				address=br.readLine();

				System.out.println("Enter HSC Marks(%):");

				hsc=Double.parseDouble(br.readLine());

				System.out.println("Enter UG Marks(%):");

				ug=Double.parseDouble(br.readLine());

			}

			catch(NumberFormatException e)

			{

				System.out.println("error "+e);

			}

			catch(InputMismatchException e)

			{

				System.out.println("error "+e);

			}

			catch(NullPointerException e)

			{

				System.out.println("error "+e);

			}

		}

		void check()

		{

			if(hsc>=60 && ug>=70)

			{

				System.out.println("Eligible");

			}

			else

			{

				System.out.println("Not Eligible");

			}

		}

		public static void main(String args[])

		{

			try{

			form obj=new form();

			obj.check();

			}

			catch(IOException e)

			{

				System.out.println("Caught "+e);

			}

		}

}