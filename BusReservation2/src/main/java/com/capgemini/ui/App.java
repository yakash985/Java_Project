package com.capgemini.ui;

import java.util.Scanner;

import com.capgemini.dao.UserDao;
import com.capgemini.dao.UserDaoImpl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
		Scanner input = new Scanner(System.in);
		boolean flag =true;
		
		do {
			System.out.println("*******************Bus Reservation*******************");
			System.out.println();
			System.out.println("Welcome to Bus Reservation");
			System.out.println();
			System.out.println("1. Login");
			System.out.println("2. SignUp");
			System.out.println("3. Admin login");
			System.out.println("4. Admin work for debuging");
			System.out.println("0. Exit Application");
			System.out.println("Enter your choice: ");
			
			int choice = input.nextInt();//$$$here also exception will come because if user enters input other than digit
			while(choice!=1 && choice!=2 && choice!=3 && choice!=4 && choice!=0) {
				System.out.println("Inavlid input!!!----enter either\'1\' or\'2\' or\'3\' or\'4\' or\'0\'");
				choice = input.nextInt();
			}
			System.out.println();
			
			switch (choice) {
			case 1:
				
				break;
			case 2:
				
				break;
			case 3:
				
				break;
			case 4:
				
				break;
			case 0:
				
				break;			

			}
			
			
			
			
			
			
		} while (flag);
    }
}
