package itsMotorPh;


import java.io.*;
import java.util.Scanner;

public class JavaMotorPH {
	public static void OpenFile (String myFile)throws IOException{
			File myObj= new File (myFile); 
		try {
			 
			BufferedReader myReader = new BufferedReader (new FileReader(myObj));
			String data;
			System.out.println ("<---------Motor PH ----------->");
			while ((data=myReader.readLine())!=null) {
			System.out.println (data);
		
			}
			
		}catch (FileNotFoundException e) {
				System.out.println ("Invalid Date and Employee Number!!!");
			System.exit(0);
			
			}
			
		
			
	}
	public static  void print(String word) {
		System.out.println (word);
	
	}
	
	
	
	public static void main(String[] args)throws IOException {
		Scanner sc = new Scanner (System.in);
		//Creating email and password
		String UserName,Password;
		print("Please Enter your name     :");
		UserName = sc.nextLine();
		print("Please Enter your password :");
		Password = sc.nextLine();
		
		if(UserName.equalsIgnoreCase("Admin") && (Password.equalsIgnoreCase("Admin"))) 
        {
            System.out.println("Welcome Admin!");
        }else if (UserName.equalsIgnoreCase("Employee") && (Password.equalsIgnoreCase("Employee")))
        {
            System.out.println("Welcome Employee!" );
        }else {System.out.println("Invalid Username or Password!");
        System.exit(0);
        }
		print(" ");
		//Enter your Employee Number 
		print ("Enter Employee Number  : ");
		
		int empNum = sc.nextInt();
		if (empNum <= 10025)
		{System.out.println("Welcome!");
		}else if (empNum >= 10026)
			
		{System.exit(0);}
		// The file name must consist of the month and the full employee number + .txt
		print ("Enter 09 and employee number to start + .txt  : ");
		String myFile= sc.next();
		print(" ");
		print("September");
		OpenFile(myFile);
		
		
		//calling the class compute
		Compute c = new Compute();
		
		//Validating employee number through switch statements!
		
		switch (empNum) {
		
		case 10001:
			// 	FoR September
			c.setGrossWage(62670); c.setRiceAllowance(1500); c.setPhoneAllowance(1000);
			c.setClothingAllowance(1000);
			double deduction1 = c.getGrossWage() * c.getSssRate();
			double deduction2 = c.getGrossWage() * c.getPhilhealthRate();
			double netwage1 = c.getGrossWage() - deduction1;
			double netwage2 = (netwage1 + c.getClothingAllowance() + c.getPhoneAllowance() + c.getRiceAllowance())- deduction2;
			System.out.println("The total net wage =" + netwage2 + " pesos");
			print(" ");
			//October
			System.out.println("To open October month enter the month and employee number + .txt  :");
			myFile = sc.next();
			System.out.println("October");
			OpenFile(myFile);
			c.setGrossWage2(62670);c.setRiceAllowance(1500); c.setPhoneAllowance(1000);
			c.setClothingAllowance(1000);
			deduction1 = c.getGrossWage2() * c.getSssRate();
			deduction2 = c.getGrossWage2() * c.getPhilhealthRate();
			netwage1 = c.getGrossWage2() - deduction1;
			netwage2 = (netwage1 + c.getClothingAllowance() + c.getPhoneAllowance() + c.getRiceAllowance())- deduction2;
			System.out.println("The total net wage =" + netwage2 + " pesos");
			print(" ");
			//November
			System.out.println("To open November month enter the month and employee number + .txt  :");
			myFile = sc.next();
			System.out.println("November");
			OpenFile(myFile);
			c.setGrossWage3(55955.28);c.setRiceAllowance(1500); c.setPhoneAllowance(1000);
			c.setClothingAllowance(1000);
			deduction1 = c.getGrossWage3() * c.getSssRate();
			deduction2 = c.getGrossWage3() * c.getPhilhealthRate();
			netwage1 = c.getGrossWage3() - deduction1;
			netwage2 = (netwage1 + c.getClothingAllowance() + c.getPhoneAllowance() + c.getRiceAllowance())- deduction2;
			System.out.println("The total net wage =" + netwage2 + " pesos");
			print(" ");
			//December
			System.out.println("To open December month enter the month and employee number + .txt  :");
			myFile = sc.next();
			System.out.println("December");
			OpenFile(myFile);
			c.setGrossWage4(55955.28);c.setRiceAllowance(1500); c.setPhoneAllowance(1000);
			c.setClothingAllowance(1000);
			deduction1 = c.getGrossWage4() * c.getSssRate();
			deduction2 = c.getGrossWage4() * c.getPhilhealthRate();
			netwage1 = c.getGrossWage4() - deduction1;
			netwage2 = (netwage1 + c.getClothingAllowance() + c.getPhoneAllowance() + c.getRiceAllowance())- deduction2;
			System.out.println("The total net wage =" + netwage2 + " pesos");
			print(" ");
			
			break;
		case 10002: 
			c.setGrossWage(42975); c.setRiceAllowance(1500); c.setPhoneAllowance(800);
			c.setClothingAllowance(800);
			deduction1 = c.getGrossWage() * c.getSssRate();
			deduction2 = c.getGrossWage() * c.getPhilhealthRate();
			netwage1 = c.getGrossWage() - deduction1;
			netwage2 = (netwage1 + c.getClothingAllowance() + c.getPhoneAllowance() + c.getRiceAllowance())- deduction2;
			System.out.println("The total net wage =" + netwage2 + " pesos");
			print(" ");
			//October
			System.out.println("To open October month enter the month and employee number + .txt  :");
			myFile = sc.next();
			System.out.println("October");
			OpenFile(myFile);
			c.setGrossWage2(42975);c.setRiceAllowance(1500); c.setPhoneAllowance(1000);
			c.setClothingAllowance(1000);
			deduction1 = c.getGrossWage2() * c.getSssRate();
			deduction2 = c.getGrossWage2() * c.getPhilhealthRate();
			netwage1 = c.getGrossWage2() - deduction1;
			netwage2 = (netwage1 + c.getClothingAllowance() + c.getPhoneAllowance() + c.getRiceAllowance())- deduction2;
			System.out.println("The total net wage =" + netwage2 + " pesos");
			print(" ");
			//November
			System.out.println("To open November month enter the month  and employee nummber+ .txt  :");
			myFile = sc.next();
			System.out.println("November");
			OpenFile(myFile);
			c.setGrossWage3(38370.6);c.setRiceAllowance(1500); c.setPhoneAllowance(1000);
			c.setClothingAllowance(1000);
			deduction1 = c.getGrossWage3() * c.getSssRate();
			deduction2 = c.getGrossWage3() * c.getPhilhealthRate();
			netwage1 = c.getGrossWage3() - deduction1;
			netwage2 = (netwage1 + c.getClothingAllowance() + c.getPhoneAllowance() + c.getRiceAllowance())- deduction2;
			System.out.println("The total net wage =" + netwage2 + " pesos");
			print(" ");
			//December
			System.out.println("To open December month enter the month and employee number + .txt  :");
			myFile = sc.next();
			System.out.println("December");
			OpenFile(myFile);
			c.setGrossWage4(29928.6);c.setRiceAllowance(1500); c.setPhoneAllowance(1000);
			c.setClothingAllowance(1000);
			deduction1 = c.getGrossWage4() * c.getSssRate();
			deduction2 = c.getGrossWage4() * c.getPhilhealthRate();
			netwage1 = c.getGrossWage4() - deduction1;
			netwage2 = (netwage1 + c.getClothingAllowance() + c.getPhoneAllowance() + c.getRiceAllowance())- deduction2;
			System.out.println("The total net wage =" + netwage2 + " pesos");
			print(" ");
			break;
		case 10003: 
			c.setGrossWage(40289.10); c.setRiceAllowance(1500); c.setPhoneAllowance(800);
			c.setClothingAllowance(800);
			 deduction1 = c.getGrossWage() * c.getSssRate();
			 deduction2 = c.getGrossWage() * c.getPhilhealthRate();
			 netwage1 = c.getGrossWage() - deduction1;
			 netwage2 = (netwage1 + c.getClothingAllowance() + c.getPhoneAllowance() + c.getRiceAllowance())- deduction2;
			System.out.println("The total net wage =" + netwage2 + " pesos");
			print(" ");
			//October
			System.out.println("To open October month enter the month and employee number + .txt  :");
			myFile = sc.next();
			System.out.println("October");
			OpenFile(myFile);
			c.setGrossWage2(40289.10);c.setRiceAllowance(1500); c.setPhoneAllowance(1000);
			c.setClothingAllowance(1000);
			deduction1 = c.getGrossWage2() * c.getSssRate();
			deduction2 = c.getGrossWage2() * c.getPhilhealthRate();
			netwage1 = c.getGrossWage2() - deduction1;
			netwage2 = (netwage1 + c.getClothingAllowance() + c.getPhoneAllowance() + c.getRiceAllowance())- deduction2;
			System.out.println("The total net wage =" + netwage2 + " pesos");
			print(" ");
			//November
			System.out.println("To open November month enter the month and employee number + .txt  :");
			myFile = sc.next();
			System.out.println("November");
			OpenFile(myFile);
			c.setGrossWage3(37580.3);c.setRiceAllowance(1500); c.setPhoneAllowance(1000);
			c.setClothingAllowance(1000);
			deduction1 = c.getGrossWage3() * c.getSssRate();
			deduction2 = c.getGrossWage3() * c.getPhilhealthRate();
			netwage1 = c.getGrossWage3() - deduction1;
			netwage2 = (netwage1 + c.getClothingAllowance() + c.getPhoneAllowance() + c.getRiceAllowance())- deduction2;
			System.out.println("The total net wage =" + netwage2 + " pesos");
			print(" ");
			//December
			System.out.println("To open December month enter the month and employee number + .txt  :");
			myFile = sc.next();
			System.out.println("December");
			OpenFile(myFile);
			c.setGrossWage4(13046.4);c.setRiceAllowance(1500); c.setPhoneAllowance(1000);
			c.setClothingAllowance(1000);
			deduction1 = c.getGrossWage4() * c.getSssRate();
			deduction2 = c.getGrossWage4() * c.getPhilhealthRate();
			netwage1 = c.getGrossWage4() - deduction1;
			netwage2 = (netwage1 + c.getClothingAllowance() + c.getPhoneAllowance() + c.getRiceAllowance())- deduction2;
			System.out.println("The total net wage =" + netwage2 + " pesos");
			print(" ");
			break;
		case 10004: 
			c.setGrossWage(60825.00); c.setRiceAllowance(1500); c.setPhoneAllowance(1000);
			c.setClothingAllowance(1000);
			 deduction1 = c.getGrossWage() * c.getSssRate();
			 deduction2 = c.getGrossWage() * c.getPhilhealthRate();
			 netwage1 = c.getGrossWage() - deduction1;
			 netwage2 = (netwage1 + c.getClothingAllowance() + c.getPhoneAllowance() + c.getRiceAllowance())- deduction2;
			System.out.println("The total net wage =" + netwage2 + " pesos");
			print(" ");
			//October
			System.out.println("To open October month enter the month and employee number + .txt  :");
			myFile = sc.next();
			System.out.println("October");
			OpenFile(myFile);
			c.setGrossWage2(60825.00);c.setRiceAllowance(1500); c.setPhoneAllowance(1000);
			c.setClothingAllowance(1000);
			deduction1 = c.getGrossWage2() * c.getSssRate();
			deduction2 = c.getGrossWage2() * c.getPhilhealthRate();
			netwage1 = c.getGrossWage2() - deduction1;
			netwage2 = (netwage1 + c.getClothingAllowance() + c.getPhoneAllowance() + c.getRiceAllowance())- deduction2;
			System.out.println("The total net wage =" + netwage2 + " pesos");
			print(" ");
			//November
			System.out.println("To open November month enter the month and employee number + .txt  :");
			myFile = sc.next();
			System.out.println("November");
			OpenFile(myFile);
			c.setGrossWage3(54308.1);c.setRiceAllowance(1500); c.setPhoneAllowance(1000);
			c.setClothingAllowance(1000);
			deduction1 = c.getGrossWage3() * c.getSssRate();
			deduction2 = c.getGrossWage3() * c.getPhilhealthRate();
			netwage1 = c.getGrossWage3() - deduction1;
			netwage2 = (netwage1 + c.getClothingAllowance() + c.getPhoneAllowance() + c.getRiceAllowance())- deduction2;
			System.out.println("The total net wage =" + netwage2 + " pesos");
			print(" ");
			//December
			System.out.println("To open December month enter the month and employee number + .txt  :");
			myFile = sc.next();
			System.out.println("December");
			OpenFile(myFile);
			c.setGrossWage4(18465.15);c.setRiceAllowance(1500); c.setPhoneAllowance(1000);
			c.setClothingAllowance(1000);
			deduction1 = c.getGrossWage4() * c.getSssRate();
			deduction2 = c.getGrossWage4() * c.getPhilhealthRate();
			netwage1 = c.getGrossWage4() - deduction1;
			netwage2 = (netwage1 + c.getClothingAllowance() + c.getPhoneAllowance() + c.getRiceAllowance())- deduction2;
			System.out.println("The total net wage =" + netwage2 + " pesos");
			print(" ");
			break;
		case 10005: 
				c.setGrossWage(22466.52); c.setRiceAllowance(1500); c.setPhoneAllowance(500);
			c.setClothingAllowance(500);
			 deduction1 = c.getGrossWage() * c.getSssRate();
			 deduction2 = c.getGrossWage() * c.getPhilhealthRate();
			 netwage1 = c.getGrossWage() - deduction1;
			 netwage2 = (netwage1 + c.getClothingAllowance() + c.getPhoneAllowance() + c.getRiceAllowance())- deduction2;
			System.out.println("The total net wage =" + netwage2 + " pesos");
			print(" ");
			//October
			System.out.println("To open October month enter the month and employee number + .txt  :");
			myFile = sc.next();
			System.out.println("October");
			OpenFile(myFile);
				c.setGrossWage2(22466.52);c.setRiceAllowance(1500); c.setPhoneAllowance(1000);
			c.setClothingAllowance(1000);
			deduction1 = c.getGrossWage2() * c.getSssRate();
			deduction2 = c.getGrossWage2() * c.getPhilhealthRate();
			netwage1 = c.getGrossWage2() - deduction1;
			netwage2 = (netwage1 + c.getClothingAllowance() + c.getPhoneAllowance() + c.getRiceAllowance())- deduction2;
			System.out.println("The total net wage =" + netwage2 + " pesos");
			print(" ");
			//November
			System.out.println("To open November month enter the month and employee number + .txt  :");
			myFile = sc.next();
			System.out.println("November");
			OpenFile(myFile);
				c.setGrossWage3(20055.78);c.setRiceAllowance(1500); c.setPhoneAllowance(1000);
			c.setClothingAllowance(1000);
			deduction1 = c.getGrossWage3() * c.getSssRate();
			deduction2 = c.getGrossWage3() * c.getPhilhealthRate();
			netwage1 = c.getGrossWage3() - deduction1;
			netwage2 = (netwage1 + c.getClothingAllowance() + c.getPhoneAllowance() + c.getRiceAllowance())- deduction2;
			System.out.println("The total net wage =" + netwage2 + " pesos");
			print(" ");
			//December
			System.out.println("To open December month enter the month and employee number + .txt  :");
			myFile = sc.next();
			System.out.println("December");
			OpenFile(myFile);
				c.setGrossWage4(6807.87);c.setRiceAllowance(1500); c.setPhoneAllowance(1000);
			c.setClothingAllowance(1000);
			deduction1 = c.getGrossWage4() * c.getSssRate();
			deduction2 = c.getGrossWage4() * c.getPhilhealthRate();
			netwage1 = c.getGrossWage4() - deduction1;
			netwage2 = (netwage1 + c.getClothingAllowance() + c.getPhoneAllowance() + c.getRiceAllowance())- deduction2;
			System.out.println("The total net wage =" + netwage2 + " pesos");
			print(" ");
			break;
			
		case 10006: 
				c.setGrossWage(22500.00); c.setRiceAllowance(1500); c.setPhoneAllowance(500);
			c.setClothingAllowance(500);
			 deduction1 = c.getGrossWage() * c.getSssRate();
			 deduction2 = c.getGrossWage() * c.getPhilhealthRate();
			 netwage1 = c.getGrossWage() - deduction1;
			 netwage2 = (netwage1 + c.getClothingAllowance() + c.getPhoneAllowance() + c.getRiceAllowance())- deduction2;
			System.out.println("The total net wage =" + netwage2 + " pesos");
			print(" ");
			//October
			System.out.println("To open October month enter the month and employee number + .txt  :");
			myFile = sc.next();
			System.out.println("October");
			OpenFile(myFile);
				c.setGrossWage2(22500.00);c.setRiceAllowance(1500); c.setPhoneAllowance(1000);
			c.setClothingAllowance(1000);
			deduction1 = c.getGrossWage2() * c.getSssRate();
			deduction2 = c.getGrossWage2() * c.getPhilhealthRate();
			netwage1 = c.getGrossWage2() - deduction1;
			netwage2 = (netwage1 + c.getClothingAllowance() + c.getPhoneAllowance() + c.getRiceAllowance())- deduction2;
			System.out.println("The total net wage =" + netwage2 + " pesos");
			print(" ");
			//November
			System.out.println("To open November month enter the month and employee number + .txt  :");
			myFile = sc.next();
			System.out.println("November");
			OpenFile(myFile);
				c.setGrossWage3(20089.26);c.setRiceAllowance(1500); c.setPhoneAllowance(1000);
			c.setClothingAllowance(1000);
			deduction1 = c.getGrossWage3() * c.getSssRate();
			deduction2 = c.getGrossWage3() * c.getPhilhealthRate();
			netwage1 = c.getGrossWage3() - deduction1;
			netwage2 = (netwage1 + c.getClothingAllowance() + c.getPhoneAllowance() + c.getRiceAllowance())- deduction2;
			System.out.println("The total net wage =" + netwage2 + " pesos");
			print(" ");
			//December
			System.out.println("To open December month enter the month and employee number + .txt  :");
			myFile = sc.next();
			System.out.println("December");
			OpenFile(myFile);
				c.setGrossWage4(6830.19);c.setRiceAllowance(1500); c.setPhoneAllowance(1000);
			c.setClothingAllowance(1000);
			deduction1 = c.getGrossWage4() * c.getSssRate();
			deduction2 = c.getGrossWage4() * c.getPhilhealthRate();
			netwage1 = c.getGrossWage4() - deduction1;
			netwage2 = (netwage1 + c.getClothingAllowance() + c.getPhoneAllowance() + c.getRiceAllowance())- deduction2;
			System.out.println("The total net wage =" + netwage2 + " pesos");
			print(" ");
			break;
		case 10007: 
				c.setGrossWage(23838.092); c.setRiceAllowance(1500); c.setPhoneAllowance(500);
			c.setClothingAllowance(500);
			 deduction1 = c.getGrossWage() * c.getSssRate();
			 deduction2 = c.getGrossWage() * c.getPhilhealthRate();
			 netwage1 = c.getGrossWage() - deduction1;
			 netwage2 = (netwage1 + c.getClothingAllowance() + c.getPhoneAllowance() + c.getRiceAllowance())- deduction2;
			System.out.println("The total net wage =" + netwage2 + " pesos");
			print(" ");
			//October
			System.out.println("To open October month enter the month and employee number + .txt  :");
			myFile = sc.next();
			System.out.println("October");
			OpenFile(myFile);
				c.setGrossWage2(23878.569);c.setRiceAllowance(1500); c.setPhoneAllowance(1000);
			c.setClothingAllowance(1000);
			deduction1 = c.getGrossWage2() * c.getSssRate();
			deduction2 = c.getGrossWage2() * c.getPhilhealthRate();
			netwage1 = c.getGrossWage2() - deduction1;
			netwage2 = (netwage1 + c.getClothingAllowance() + c.getPhoneAllowance() + c.getRiceAllowance())- deduction2;
			System.out.println("The total net wage =" + netwage2 + " pesos");
			print(" ");
			//November
			System.out.println("To open November month enter the month and employee number + .txt  :");
			myFile = sc.next();
			System.out.println("November");
			OpenFile(myFile);
				c.setGrossWage3(21428.52);c.setRiceAllowance(1500); c.setPhoneAllowance(1000);
			c.setClothingAllowance(1000);
			deduction1 = c.getGrossWage3() * c.getSssRate();
			deduction2 = c.getGrossWage3() * c.getPhilhealthRate();
			netwage1 = c.getGrossWage3() - deduction1;
			netwage2 = (netwage1 + c.getClothingAllowance() + c.getPhoneAllowance() + c.getRiceAllowance())- deduction2;
			System.out.println("The total net wage =" + netwage2 + " pesos");
			print(" ");
			//December
			System.out.println("To open December month enter the month and employee number + .txt  :");
			myFile = sc.next();
			System.out.println("December");
			OpenFile(myFile);
				c.setGrossWage4(21388.043);c.setRiceAllowance(1500); c.setPhoneAllowance(1000);
			c.setClothingAllowance(1000);
			deduction1 = c.getGrossWage4() * c.getSssRate();
			deduction2 = c.getGrossWage4() * c.getPhilhealthRate();
			netwage1 = c.getGrossWage4() - deduction1;
			netwage2 = (netwage1 + c.getClothingAllowance() + c.getPhoneAllowance() + c.getRiceAllowance())- deduction2;
			System.out.println("The total net wage =" + netwage2 + " pesos");
			print(" ");
			break;
		case 10008: 
				c.setGrossWage(24000.00); c.setRiceAllowance(1500); c.setPhoneAllowance(500);
			c.setClothingAllowance(500);
			 deduction1 = c.getGrossWage() * c.getSssRate();
			 deduction2 = c.getGrossWage() * c.getPhilhealthRate();
			 netwage1 = c.getGrossWage() - deduction1;
			 netwage2 = (netwage1 + c.getClothingAllowance() + c.getPhoneAllowance() + c.getRiceAllowance())- deduction2;
			System.out.println("The total net wage =" + netwage2 + " pesos");
			print(" ");
			//October
			System.out.println("To open October month enter the month and employee number + .txt  :");
			myFile = sc.next();
			System.out.println("October");
			OpenFile(myFile);
				c.setGrossWage2(24000.00);c.setRiceAllowance(1500); c.setPhoneAllowance(1000);
			c.setClothingAllowance(1000);
			deduction1 = c.getGrossWage2() * c.getSssRate();
			deduction2 = c.getGrossWage2() * c.getPhilhealthRate();
			netwage1 = c.getGrossWage2() - deduction1;
			netwage2 = (netwage1 + c.getClothingAllowance() + c.getPhoneAllowance() + c.getRiceAllowance())- deduction2;
			System.out.println("The total net wage =" + netwage2 + " pesos");
			print(" ");
			//November
			System.out.println("To open November month enter the month and employee number + .txt  :");
			myFile = sc.next();
			System.out.println("November");
			OpenFile(myFile);
				c.setGrossWage3(21428.52);c.setRiceAllowance(1500); c.setPhoneAllowance(1000);
			c.setClothingAllowance(1000);
			deduction1 = c.getGrossWage3() * c.getSssRate();
			deduction2 = c.getGrossWage3() * c.getPhilhealthRate();
			netwage1 = c.getGrossWage3() - deduction1;
			netwage2 = (netwage1 + c.getClothingAllowance() + c.getPhoneAllowance() + c.getRiceAllowance())- deduction2;
			System.out.println("The total net wage =" + netwage2 + " pesos");
			print(" ");
			//December
			System.out.println("To open December month enter the month and employee number + .txt  :");
			myFile = sc.next();
			System.out.println("December");
			OpenFile(myFile);
				c.setGrossWage4(21428.52);c.setRiceAllowance(1500); c.setPhoneAllowance(1000);
			c.setClothingAllowance(1000);
			deduction1 = c.getGrossWage4() * c.getSssRate();
			deduction2 = c.getGrossWage4() * c.getPhilhealthRate();
			netwage1 = c.getGrossWage4() - deduction1;
			netwage2 = (netwage1 + c.getClothingAllowance() + c.getPhoneAllowance() + c.getRiceAllowance())- deduction2;
			System.out.println("The total net wage =" + netwage2 + " pesos");
			print(" ");
			break;
		case 10009: 
			c.setGrossWage(16473.15); c.setRiceAllowance(1500); c.setPhoneAllowance(500);
			c.setClothingAllowance(500);
			 deduction1 = c.getGrossWage() * c.getSssRate();
			 deduction2 = c.getGrossWage() * c.getPhilhealthRate();
			 netwage1 = c.getGrossWage() - deduction1;
			 netwage2 = (netwage1 + c.getClothingAllowance() + c.getPhoneAllowance() + c.getRiceAllowance())- deduction2;
			System.out.println("The total net wage =" + netwage2 + " pesos");
			print(" ");
			//October
			System.out.println("To open October month enter the month and employee number + .txt  :");
			myFile = sc.next();
			System.out.println("October");
			OpenFile(myFile);
				c.setGrossWage2(21294.63);c.setRiceAllowance(1500); c.setPhoneAllowance(1000);
			c.setClothingAllowance(1000);
			deduction1 = c.getGrossWage2() * c.getSssRate();
			deduction2 = c.getGrossWage2() * c.getPhilhealthRate();
			netwage1 = c.getGrossWage2() - deduction1;
			netwage2 = (netwage1 + c.getClothingAllowance() + c.getPhoneAllowance() + c.getRiceAllowance())- deduction2;
			System.out.println("The total net wage =" + netwage2 + " pesos");
			print(" ");
			//November
			System.out.println("To open November month enter the month and employee number + .txt  :");
			myFile = sc.next();
			System.out.println("November");
			OpenFile(myFile);
				c.setGrossWage3(20089.26);c.setRiceAllowance(1500); c.setPhoneAllowance(1000);
			c.setClothingAllowance(1000);
			deduction1 = c.getGrossWage3() * c.getSssRate();
			deduction2 = c.getGrossWage3() * c.getPhilhealthRate();
			netwage1 = c.getGrossWage3() - deduction1;
			netwage2 = (netwage1 + c.getClothingAllowance() + c.getPhoneAllowance() + c.getRiceAllowance())- deduction2;
			System.out.println("The total net wage =" + netwage2 + " pesos");
			print(" ");
			//December
			System.out.println("To open December month enter the month and employee number + .txt  :");
			myFile = sc.next();
			System.out.println("December");
			OpenFile(myFile);
				c.setGrossWage4(20089.26);c.setRiceAllowance(1500); c.setPhoneAllowance(1000);
			c.setClothingAllowance(1000);
			deduction1 = c.getGrossWage4() * c.getSssRate();
			deduction2 = c.getGrossWage4() * c.getPhilhealthRate();
			netwage1 = c.getGrossWage4() - deduction1;
			netwage2 = (netwage1 + c.getClothingAllowance() + c.getPhoneAllowance() + c.getRiceAllowance())- deduction2;
			System.out.println("The total net wage =" + netwage2 + " pesos");
			print(" ");
			break;
		case 10010: 
				c.setGrossWage(22500.00); c.setRiceAllowance(1500); c.setPhoneAllowance(500);
			c.setClothingAllowance(500);
			 deduction1 = c.getGrossWage() * c.getSssRate();
			 deduction2 = c.getGrossWage() * c.getPhilhealthRate();
			 netwage1 = c.getGrossWage() - deduction1;
			 netwage2 = (netwage1 + c.getClothingAllowance() + c.getPhoneAllowance() + c.getRiceAllowance())- deduction2;
			System.out.println("The total net wage =" + netwage2 + " pesos");
			print(" ");
			//October
			System.out.println("To open October month enter the month and employee number + .txt  :");
			myFile = sc.next();
			System.out.println("October");
			OpenFile(myFile);
				c.setGrossWage2(20089.8);c.setRiceAllowance(1500); c.setPhoneAllowance(1000);
			c.setClothingAllowance(1000);
			deduction1 = c.getGrossWage2() * c.getSssRate();
			deduction2 = c.getGrossWage2() * c.getPhilhealthRate();
			netwage1 = c.getGrossWage2() - deduction1;
			netwage2 = (netwage1 + c.getClothingAllowance() + c.getPhoneAllowance() + c.getRiceAllowance())- deduction2;
			System.out.println("The total net wage =" + netwage2 + " pesos");
			print(" ");
			//November
			System.out.println("To open November month enter the month and employee number + .txt  :");
			myFile = sc.next();
			System.out.println("November");
			OpenFile(myFile);
				c.setGrossWage3(20089.8);c.setRiceAllowance(1500); c.setPhoneAllowance(1000);
			c.setClothingAllowance(1000);
			deduction1 = c.getGrossWage3() * c.getSssRate();
			deduction2 = c.getGrossWage3() * c.getPhilhealthRate();
			netwage1 = c.getGrossWage3() - deduction1;
			netwage2 = (netwage1 + c.getClothingAllowance() + c.getPhoneAllowance() + c.getRiceAllowance())- deduction2;
			System.out.println("The total net wage =" + netwage2 + " pesos");
			print(" ");
			//December
			System.out.println("To open December month enter the month and employee number + .txt  :");
			myFile = sc.next();
			System.out.println("December");
			OpenFile(myFile);
				c.setGrossWage4(20089.8);c.setRiceAllowance(1500); c.setPhoneAllowance(1000);
			c.setClothingAllowance(1000);
			deduction1 = c.getGrossWage4() * c.getSssRate();
			deduction2 = c.getGrossWage4() * c.getPhilhealthRate();
			netwage1 = c.getGrossWage4() - deduction1;
			netwage2 = (netwage1 + c.getClothingAllowance() + c.getPhoneAllowance() + c.getRiceAllowance())- deduction2;
			System.out.println("The total net wage =" + netwage2 + " pesos");
			print(" ");
			break;
		case 10011: 
				c.setGrossWage(36757.35); c.setRiceAllowance(1500); c.setPhoneAllowance(800);
			c.setClothingAllowance(800);
			 deduction1 = c.getGrossWage() * c.getSssRate();
			 deduction2 = c.getGrossWage() * c.getPhilhealthRate();
			 netwage1 = c.getGrossWage() - deduction1;
			 netwage2 = (netwage1 + c.getClothingAllowance() + c.getPhoneAllowance() + c.getRiceAllowance())- deduction2;
			System.out.println("The total net wage =" + netwage2 + " pesos");
			print(" ");
			//October
			System.out.println("To open October month enter the monthand employee number + .txt  :");
			myFile = sc.next();
			System.out.println("October");
			OpenFile(myFile);
				c.setGrossWage2(36757.35);c.setRiceAllowance(1500); c.setPhoneAllowance(1000);
			c.setClothingAllowance(1000);
			deduction1 = c.getGrossWage2() * c.getSssRate();
			deduction2 = c.getGrossWage2() * c.getPhilhealthRate();
			netwage1 = c.getGrossWage2() - deduction1;
			netwage2 = (netwage1 + c.getClothingAllowance() + c.getPhoneAllowance() + c.getRiceAllowance())- deduction2;
			System.out.println("The total net wage =" + netwage2 + " pesos");
			print(" ");
			//November
			System.out.println("To open November month enter the month and employee number + .txt  :");
			myFile = sc.next();
			System.out.println("November");
			OpenFile(myFile);
				c.setGrossWage3(32634.99);c.setRiceAllowance(1500); c.setPhoneAllowance(1000);
			c.setClothingAllowance(1000);
			deduction1 = c.getGrossWage3() * c.getSssRate();
			deduction2 = c.getGrossWage3() * c.getPhilhealthRate();
			netwage1 = c.getGrossWage3() - deduction1;
			netwage2 = (netwage1 + c.getClothingAllowance() + c.getPhoneAllowance() + c.getRiceAllowance())- deduction2;
			System.out.println("The total net wage =" + netwage2 + " pesos");
			print(" ");
			//December
			System.out.println("To open December month enter the month and employee number + .txt  :");
			myFile = sc.next();
			System.out.println("December");
			OpenFile(myFile);
				c.setGrossWage4(32634.99);c.setRiceAllowance(1500); c.setPhoneAllowance(1000);
			c.setClothingAllowance(1000);
			deduction1 = c.getGrossWage4() * c.getSssRate();
			deduction2 = c.getGrossWage4() * c.getPhilhealthRate();
			netwage1 = c.getGrossWage4() - deduction1;
			netwage2 = (netwage1 + c.getClothingAllowance() + c.getPhoneAllowance() + c.getRiceAllowance())- deduction2;
			System.out.println("The total net wage =" + netwage2 + " pesos");
			print(" ");
			break;
		case 10012: 
				c.setGrossWage(41850.00); c.setRiceAllowance(1500); c.setPhoneAllowance(800);
			c.setClothingAllowance(800);
			 deduction1 = c.getGrossWage() * c.getSssRate();
			 deduction2 = c.getGrossWage() * c.getPhilhealthRate();
			 netwage1 = c.getGrossWage() - deduction1;
			 netwage2 = (netwage1 + c.getClothingAllowance() + c.getPhoneAllowance() + c.getRiceAllowance())- deduction2;
			System.out.println("The total net wage =" + netwage2 + " pesos");
			print(" ");
			//October
			System.out.println("To open October month enter the monthand employee number + .txt  :");
			myFile = sc.next();
			System.out.println("October");
			OpenFile(myFile);
				c.setGrossWage2(41850.00);c.setRiceAllowance(1500); c.setPhoneAllowance(1000);
			c.setClothingAllowance(1000);
			deduction1 = c.getGrossWage2() * c.getSssRate();
			deduction2 = c.getGrossWage2() * c.getPhilhealthRate();
			netwage1 = c.getGrossWage2() - deduction1;
			netwage2 = (netwage1 + c.getClothingAllowance() + c.getPhoneAllowance() + c.getRiceAllowance())- deduction2;
			System.out.println("The total net wage =" + netwage2 + " pesos");
			print(" ");
			//November
			System.out.println("To open November month enter the month and employee number + .txt  :");
			myFile = sc.next();
			System.out.println("November");
			OpenFile(myFile);
				c.setGrossWage3(37366.02);c.setRiceAllowance(1500); c.setPhoneAllowance(1000);
			c.setClothingAllowance(1000);
			deduction1 = c.getGrossWage3() * c.getSssRate();
			deduction2 = c.getGrossWage3() * c.getPhilhealthRate();
			netwage1 = c.getGrossWage3() - deduction1;
			netwage2 = (netwage1 + c.getClothingAllowance() + c.getPhoneAllowance() + c.getRiceAllowance())- deduction2;
			System.out.println("The total net wage =" + netwage2 + " pesos");
			print(" ");
			//December
			System.out.println("To open December month enter the month and employee number + .txt  :");
			myFile = sc.next();
			System.out.println("December");
			OpenFile(myFile);
				c.setGrossWage4(37366.02);c.setRiceAllowance(1500); c.setPhoneAllowance(1000);
			c.setClothingAllowance(1000);
			deduction1 = c.getGrossWage4() * c.getSssRate();
			deduction2 = c.getGrossWage4() * c.getPhilhealthRate();
			netwage1 = c.getGrossWage4() - deduction1;
			netwage2 = (netwage1 + c.getClothingAllowance() + c.getPhoneAllowance() + c.getRiceAllowance())- deduction2;
			System.out.println("The total net wage =" + netwage2 + " pesos");
			print(" ");
			break;
		case 10013: 
				c.setGrossWage(61232.12); c.setRiceAllowance(1500); c.setPhoneAllowance(1000);
			c.setClothingAllowance(1000);
			 deduction1 = c.getGrossWage() * c.getSssRate();
			 deduction2 = c.getGrossWage() * c.getPhilhealthRate();
			 netwage1 = c.getGrossWage() - deduction1;
			 netwage2 = (netwage1 + c.getClothingAllowance() + c.getPhoneAllowance() + c.getRiceAllowance())- deduction2;
			System.out.println("The total net wage =" + netwage2 + " pesos");
			print(" ");
			//October
			System.out.println("To open October month enter the monthand employee number + .txt  :");
			myFile = sc.next();
			System.out.println("October");
			OpenFile(myFile);
				c.setGrossWage2(61232.12);c.setRiceAllowance(1500); c.setPhoneAllowance(1000);
			c.setClothingAllowance(1000);
			deduction1 = c.getGrossWage2() * c.getSssRate();
			deduction2 = c.getGrossWage2() * c.getPhilhealthRate();
			netwage1 = c.getGrossWage2() - deduction1;
			netwage2 = (netwage1 + c.getClothingAllowance() + c.getPhoneAllowance() + c.getRiceAllowance())- deduction2;
			System.out.println("The total net wage =" + netwage2 + " pesos");
			print(" ");
			//November
			System.out.println("To open November month enter the month and employee number + .txt  :");
			myFile = sc.next();
			System.out.println("November");
			OpenFile(myFile);
				c.setGrossWage3(54428.48);c.setRiceAllowance(1500); c.setPhoneAllowance(1000);
			c.setClothingAllowance(1000);
			deduction1 = c.getGrossWage3() * c.getSssRate();
			deduction2 = c.getGrossWage3() * c.getPhilhealthRate();
			netwage1 = c.getGrossWage3() - deduction1;
			netwage2 = (netwage1 + c.getClothingAllowance() + c.getPhoneAllowance() + c.getRiceAllowance())- deduction2;
			System.out.println("The total net wage =" + netwage2 + " pesos");
			print(" ");
			//December
			System.out.println("To open December month enter the month and employee number + .txt  :");
			myFile = sc.next();
			System.out.println("December");
			OpenFile(myFile);
				c.setGrossWage4(54428.48);c.setRiceAllowance(1500); c.setPhoneAllowance(1000);
			c.setClothingAllowance(1000);
			deduction1 = c.getGrossWage4() * c.getSssRate();
			deduction2 = c.getGrossWage4() * c.getPhilhealthRate();
			netwage1 = c.getGrossWage4() - deduction1;
			netwage2 = (netwage1 + c.getClothingAllowance() + c.getPhoneAllowance() + c.getRiceAllowance())- deduction2;
			System.out.println("The total net wage =" + netwage2 + " pesos");
			print(" ");
			break;
		case 10014: 
				c.setGrossWage(22212.075); c.setRiceAllowance(1500); c.setPhoneAllowance(500);
			c.setClothingAllowance(500);
			 deduction1 = c.getGrossWage() * c.getSssRate();
			 deduction2 = c.getGrossWage() * c.getPhilhealthRate();
			 netwage1 = c.getGrossWage() - deduction1;
			 netwage2 = (netwage1 + c.getClothingAllowance() + c.getPhoneAllowance() + c.getRiceAllowance())- deduction2;
			System.out.println("The total net wage =" + netwage2 + " pesos");
			print(" ");
			//October
			System.out.println("To open October month enter the monthand employee number + .txt  :");
			myFile = sc.next();
			System.out.println("October");
			OpenFile(myFile);
				c.setGrossWage2(22281.27);c.setRiceAllowance(1500); c.setPhoneAllowance(1000);
			c.setClothingAllowance(1000);
			deduction1 = c.getGrossWage2() * c.getSssRate();
			deduction2 = c.getGrossWage2() * c.getPhilhealthRate();
			netwage1 = c.getGrossWage2() - deduction1;
			netwage2 = (netwage1 + c.getClothingAllowance() + c.getPhoneAllowance() + c.getRiceAllowance())- deduction2;
			System.out.println("The total net wage =" + netwage2 + " pesos");
			print(" ");
			//November
			System.out.println("To open November month enter the month and employee number + .txt  :");
			myFile = sc.next();
			System.out.println("November");
			OpenFile(myFile);
				c.setGrossWage3(22419.66);c.setRiceAllowance(1500); c.setPhoneAllowance(1000);
			c.setClothingAllowance(1000);
			deduction1 = c.getGrossWage3() * c.getSssRate();
			deduction2 = c.getGrossWage3() * c.getPhilhealthRate();
			netwage1 = c.getGrossWage3() - deduction1;
			netwage2 = (netwage1 + c.getClothingAllowance() + c.getPhoneAllowance() + c.getRiceAllowance())- deduction2;
			System.out.println("The total net wage =" + netwage2 + " pesos");
			print(" ");
			//December
			System.out.println("To open December month enter the month and employee number + .txt  :");
			myFile = sc.next();
			System.out.println("December");
			OpenFile(myFile);
				c.setGrossWage4(21174.15);c.setRiceAllowance(1500); c.setPhoneAllowance(1000);
			c.setClothingAllowance(1000);
			deduction1 = c.getGrossWage4() * c.getSssRate();
			deduction2 = c.getGrossWage4() * c.getPhilhealthRate();
			netwage1 = c.getGrossWage4() - deduction1;
			netwage2 = (netwage1 + c.getClothingAllowance() + c.getPhoneAllowance() + c.getRiceAllowance())- deduction2;
			System.out.println("The total net wage =" + netwage2 + " pesos");
			print(" ");
			break;
		case 10015: 
				c.setGrossWage(22212.075); c.setRiceAllowance(1500); c.setPhoneAllowance(500);
			c.setClothingAllowance(500);
			 deduction1 = c.getGrossWage() * c.getSssRate();
			 deduction2 = c.getGrossWage() * c.getPhilhealthRate();
			 netwage1 = c.getGrossWage() - deduction1;
			 netwage2 = (netwage1 + c.getClothingAllowance() + c.getPhoneAllowance() + c.getRiceAllowance())- deduction2;
			System.out.println("The total net wage =" + netwage2 + " pesos");
			print(" ");
			//October
			System.out.println("To open October month enter the monthand employee number + .txt  :");
			myFile = sc.next();
			System.out.println("October");
			OpenFile(myFile);
				c.setGrossWage2(22212.075);c.setRiceAllowance(1500); c.setPhoneAllowance(1000);
			c.setClothingAllowance(1000);
			deduction1 = c.getGrossWage2() * c.getSssRate();
			deduction2 = c.getGrossWage2() * c.getPhilhealthRate();
			netwage1 = c.getGrossWage2() - deduction1;
			netwage2 = (netwage1 + c.getClothingAllowance() + c.getPhoneAllowance() + c.getRiceAllowance())- deduction2;
			System.out.println("The total net wage =" + netwage2 + " pesos");
			print(" ");
			//November
			System.out.println("To open November month enter the month and employee number + .txt  :");
			myFile = sc.next();
			System.out.println("November");
			OpenFile(myFile);
				c.setGrossWage3(19703.055);c.setRiceAllowance(1500); c.setPhoneAllowance(1000);
			c.setClothingAllowance(1000);
			deduction1 = c.getGrossWage3() * c.getSssRate();
			deduction2 = c.getGrossWage3() * c.getPhilhealthRate();
			netwage1 = c.getGrossWage3() - deduction1;
			netwage2 = (netwage1 + c.getClothingAllowance() + c.getPhoneAllowance() + c.getRiceAllowance())- deduction2;
			System.out.println("The total net wage =" + netwage2 + " pesos");
			print(" ");
			//December
			System.out.println("To open December month enter the month and employee number + .txt  :");
			myFile = sc.next();
			System.out.println("December");
			OpenFile(myFile);
				c.setGrossWage4(19703.055);c.setRiceAllowance(1500); c.setPhoneAllowance(1000);
			c.setClothingAllowance(1000);
			deduction1 = c.getGrossWage4() * c.getSssRate();
			deduction2 = c.getGrossWage4() * c.getPhilhealthRate();
			netwage1 = c.getGrossWage4() - deduction1;
			netwage2 = (netwage1 + c.getClothingAllowance() + c.getPhoneAllowance() + c.getRiceAllowance())- deduction2;
			System.out.println("The total net wage =" + netwage2 + " pesos");
			print(" ");
			break;
		case 10016: 
				c.setGrossWage(22757.568); c.setRiceAllowance(0); c.setPhoneAllowance(0);
			c.setClothingAllowance(0);
			 deduction1 = c.getGrossWage() * c.getSssRate();
			 deduction2 = c.getGrossWage() * c.getPhilhealthRate();
			 netwage1 = c.getGrossWage() - deduction1;
			 netwage2 = (netwage1 + c.getClothingAllowance() + c.getPhoneAllowance() + c.getRiceAllowance())- deduction2;
			System.out.println("The total net wage =" + netwage2 + " pesos");
			print(" ");
			//October
			System.out.println("To open October month enter the monthand employee number + .txt  :");
			myFile = sc.next();
			System.out.println("October");
			OpenFile(myFile);
				c.setGrossWage2(23086.146);c.setRiceAllowance(1500); c.setPhoneAllowance(1000);
			c.setClothingAllowance(1000);
			deduction1 = c.getGrossWage2() * c.getSssRate();
			deduction2 = c.getGrossWage2() * c.getPhilhealthRate();
			netwage1 = c.getGrossWage2() - deduction1;
			netwage2 = (netwage1 + c.getClothingAllowance() + c.getPhoneAllowance() + c.getRiceAllowance())- deduction2;
			System.out.println("The total net wage =" + netwage2 + " pesos");
			print(" ");
			//November
			System.out.println("To open November month enter the month and employee number + .txt  :");
			myFile = sc.next();
			System.out.println("November");
			OpenFile(myFile);
				c.setGrossWage3(20442.786);c.setRiceAllowance(1500); c.setPhoneAllowance(1000);
			c.setClothingAllowance(1000);
			deduction1 = c.getGrossWage3() * c.getSssRate();
			deduction2 = c.getGrossWage3() * c.getPhilhealthRate();
			netwage1 = c.getGrossWage3() - deduction1;
			netwage2 = (netwage1 + c.getClothingAllowance() + c.getPhoneAllowance() + c.getRiceAllowance())- deduction2;
			System.out.println("The total net wage =" + netwage2 + " pesos");
			print(" ");
			//December
			System.out.println("To open December month enter the month and employee number + .txt  :");
			myFile = sc.next();
			System.out.println("December");
			OpenFile(myFile);
				c.setGrossWage4(20485.644);c.setRiceAllowance(1500); c.setPhoneAllowance(1000);
			c.setClothingAllowance(1000);
			deduction1 = c.getGrossWage4() * c.getSssRate();
			deduction2 = c.getGrossWage4() * c.getPhilhealthRate();
			netwage1 = c.getGrossWage4() - deduction1;
			netwage2 = (netwage1 + c.getClothingAllowance() + c.getPhoneAllowance() + c.getRiceAllowance())- deduction2;
			System.out.println("The total net wage =" + netwage2 + " pesos");
			print(" ");		
			break;
		case 10017: 
				c.setGrossWage(18214.24); c.setRiceAllowance(0); c.setPhoneAllowance(0);
			c.setClothingAllowance(0);
			 deduction1 = c.getGrossWage() * c.getSssRate();
			 deduction2 = c.getGrossWage() * c.getPhilhealthRate();
			 netwage1 = c.getGrossWage() - deduction1;
			 netwage2 = (netwage1 + c.getClothingAllowance() + c.getPhoneAllowance() + c.getRiceAllowance())- deduction2;
			System.out.println("The total net wage =" + netwage2 + " pesos");
			print(" ");
			//October
			System.out.println("To open October month enter the monthand employee number + .txt  :");
			myFile = sc.next();
			System.out.println("October");
			OpenFile(myFile);
				c.setGrossWage2(22500.00);c.setRiceAllowance(1500); c.setPhoneAllowance(1000);
			c.setClothingAllowance(1000);
			deduction1 = c.getGrossWage2() * c.getSssRate();
			deduction2 = c.getGrossWage2() * c.getPhilhealthRate();
			netwage1 = c.getGrossWage2() - deduction1;
			netwage2 = (netwage1 + c.getClothingAllowance() + c.getPhoneAllowance() + c.getRiceAllowance())- deduction2;
			System.out.println("The total net wage =" + netwage2 + " pesos");
			print(" ");
			//November
			System.out.println("To open November month enter the month and employee number + .txt  :");
			myFile = sc.next();
			System.out.println("November");
			OpenFile(myFile);
				c.setGrossWage3(20442.786);c.setRiceAllowance(1500); c.setPhoneAllowance(1000);
			c.setClothingAllowance(1000);
			deduction1 = c.getGrossWage3() * c.getSssRate();
			deduction2 = c.getGrossWage3() * c.getPhilhealthRate();
			netwage1 = c.getGrossWage3() - deduction1;
			netwage2 = (netwage1 + c.getClothingAllowance() + c.getPhoneAllowance() + c.getRiceAllowance())- deduction2;
			System.out.println("The total net wage =" + netwage2 + " pesos");
			print(" ");
			//December
			System.out.println("To open December month enter the month and employee number + .txt  :");
			myFile = sc.next();
			System.out.println("December");
			OpenFile(myFile);
				c.setGrossWage4(19258.68);c.setRiceAllowance(1500); c.setPhoneAllowance(1000);
			c.setClothingAllowance(1000);
			deduction1 = c.getGrossWage4() * c.getSssRate();
			deduction2 = c.getGrossWage4() * c.getPhilhealthRate();
			netwage1 = c.getGrossWage4() - deduction1;
			netwage2 = (netwage1 + c.getClothingAllowance() + c.getPhoneAllowance() + c.getRiceAllowance())- deduction2;
			System.out.println("The total net wage =" + netwage2 + " pesos");
			print(" ");
			break;
		case 10018: 
				c.setGrossWage(19084.785); c.setRiceAllowance(0); c.setPhoneAllowance(0);
			c.setClothingAllowance(0);
			 deduction1 = c.getGrossWage() * c.getSssRate();
			 deduction2 = c.getGrossWage() * c.getPhilhealthRate();
			 netwage1 = c.getGrossWage() - deduction1;
			 netwage2 = (netwage1 + c.getClothingAllowance() + c.getPhoneAllowance() + c.getRiceAllowance())- deduction2;
			System.out.println("The total net wage =" + netwage2 + " pesos");
			print(" ");
			//October
			System.out.println("To open October month enter the monthand employee number + .txt  :");
			myFile = sc.next();
			System.out.println("October");
			OpenFile(myFile);
				c.setGrossWage2(19535.54);c.setRiceAllowance(1500); c.setPhoneAllowance(1000);
			c.setClothingAllowance(1000);
			deduction1 = c.getGrossWage2() * c.getSssRate();
			deduction2 = c.getGrossWage2() * c.getPhilhealthRate();
			netwage1 = c.getGrossWage2() - deduction1;
			netwage2 = (netwage1 + c.getClothingAllowance() + c.getPhoneAllowance() + c.getRiceAllowance())- deduction2;
			System.out.println("The total net wage =" + netwage2 + " pesos");
			print(" ");
			//November
			System.out.println("To open November month enter the month and employee number + .txt  :");
			myFile = sc.next();
			System.out.println("November");
			OpenFile(myFile);
				c.setGrossWage3(19267.68);c.setRiceAllowance(1500); c.setPhoneAllowance(1000);
			c.setClothingAllowance(1000);
			deduction1 = c.getGrossWage3() * c.getSssRate();
			deduction2 = c.getGrossWage3() * c.getPhilhealthRate();
			netwage1 = c.getGrossWage3() - deduction1;
			netwage2 = (netwage1 + c.getClothingAllowance() + c.getPhoneAllowance() + c.getRiceAllowance())- deduction2;
			System.out.println("The total net wage =" + netwage2 + " pesos");
			print(" ");
			//December
			System.out.println("To open December month enter the month and employee number + .txt  :");
			myFile = sc.next();
			System.out.println("December");
			OpenFile(myFile);
				c.setGrossWage4(18080.31);c.setRiceAllowance(1500); c.setPhoneAllowance(1000);
			c.setClothingAllowance(1000);
			deduction1 = c.getGrossWage4() * c.getSssRate();
			deduction2 = c.getGrossWage4() * c.getPhilhealthRate();
			netwage1 = c.getGrossWage4() - deduction1;
			netwage2 = (netwage1 + c.getClothingAllowance() + c.getPhoneAllowance() + c.getRiceAllowance())- deduction2;
			System.out.println("The total net wage =" + netwage2 + " pesos");
			print(" ");
			break;
			
		case 10019: 
				c.setGrossWage(22928.55); c.setRiceAllowance(0); c.setPhoneAllowance(0);
			c.setClothingAllowance(0);
			 deduction1 = c.getGrossWage() * c.getSssRate();
			 deduction2 = c.getGrossWage() * c.getPhilhealthRate();
			 netwage1 = c.getGrossWage() - deduction1;
			 netwage2 = (netwage1 + c.getClothingAllowance() + c.getPhoneAllowance() + c.getRiceAllowance())- deduction2;
			System.out.println("The total net wage =" + netwage2 + " pesos");
			print(" ");
			//October
			System.out.println("To open October month enter the monthand employee number + .txt  :");
			myFile = sc.next();
			System.out.println("October");
			OpenFile(myFile);
				c.setGrossWage2(23142.84);c.setRiceAllowance(1500); c.setPhoneAllowance(1000);
			c.setClothingAllowance(1000);
			deduction1 = c.getGrossWage2() * c.getSssRate();
			deduction2 = c.getGrossWage2() * c.getPhilhealthRate();
			netwage1 = c.getGrossWage2() - deduction1;
			netwage2 = (netwage1 + c.getClothingAllowance() + c.getPhoneAllowance() + c.getRiceAllowance())- deduction2;
			System.out.println("The total net wage =" + netwage2 + " pesos");
			print(" ");
			//November
			System.out.println("To open November month enter the month and employee number + .txt  :");
			myFile = sc.next();
			System.out.println("November");
			OpenFile(myFile);
				c.setGrossWage3(20571.36);c.setRiceAllowance(1500); c.setPhoneAllowance(1000);
			c.setClothingAllowance(1000);
			deduction1 = c.getGrossWage3() * c.getSssRate();
			deduction2 = c.getGrossWage3() * c.getPhilhealthRate();
			netwage1 = c.getGrossWage3() - deduction1;
			netwage2 = (netwage1 + c.getClothingAllowance() + c.getPhoneAllowance() + c.getRiceAllowance())- deduction2;
			System.out.println("The total net wage =" + netwage2 + " pesos");
			print(" ");
			//December
			System.out.println("To open December month enter the month and employee number + .txt  :");
			myFile = sc.next();
			System.out.println("December");
			OpenFile(myFile);
				c.setGrossWage4(20571.36);c.setRiceAllowance(1500); c.setPhoneAllowance(1000);
			c.setClothingAllowance(1000);
			deduction1 = c.getGrossWage4() * c.getSssRate();
			deduction2 = c.getGrossWage4() * c.getPhilhealthRate();
			netwage1 = c.getGrossWage4() - deduction1;
			netwage2 = (netwage1 + c.getClothingAllowance() + c.getPhoneAllowance() + c.getRiceAllowance())- deduction2;
			System.out.println("The total net wage =" + netwage2 + " pesos");
			print(" ");
			break;
			
		case 10020: 
				c.setGrossWage(23591.1); c.setRiceAllowance(0); c.setPhoneAllowance(0);
			c.setClothingAllowance(0);
			 deduction1 = c.getGrossWage() * c.getSssRate();
			 deduction2 = c.getGrossWage() * c.getPhilhealthRate();
			 netwage1 = c.getGrossWage() - deduction1;
			 netwage2 = (netwage1 + c.getClothingAllowance() + c.getPhoneAllowance() + c.getRiceAllowance())- deduction2;
			System.out.println("The total net wage =" + netwage2 + " pesos");
			print(" ");
			//October
			System.out.println("To open October month enter the monthand employee number + .txt  :");
			myFile = sc.next();
			System.out.println("October");
			OpenFile(myFile);
				c.setGrossWage2(24554.36);c.setRiceAllowance(1500); c.setPhoneAllowance(1000);
			c.setClothingAllowance(1000);
			deduction1 = c.getGrossWage2() * c.getSssRate();
			deduction2 = c.getGrossWage2() * c.getPhilhealthRate();
			netwage1 = c.getGrossWage2() - deduction1;
			netwage2 = (netwage1 + c.getClothingAllowance() + c.getPhoneAllowance() + c.getRiceAllowance())- deduction2;
			System.out.println("The total net wage =" + netwage2 + " pesos");
			print(" ");
			//November
			System.out.println("To open November month enter the month and employee number + .txt  :");
			myFile = sc.next();
			System.out.println("November");
			OpenFile(myFile);
				c.setGrossWage3(21214.32);c.setRiceAllowance(1500); c.setPhoneAllowance(1000);
			c.setClothingAllowance(1000);
			deduction1 = c.getGrossWage3() * c.getSssRate();
			deduction2 = c.getGrossWage3() * c.getPhilhealthRate();
			netwage1 = c.getGrossWage3() - deduction1;
			netwage2 = (netwage1 + c.getClothingAllowance() + c.getPhoneAllowance() + c.getRiceAllowance())- deduction2;
			System.out.println("The total net wage =" + netwage2 + " pesos");
			print(" ");
			//December
			System.out.println("To open December month enter the month and employee number + .txt  :");
			myFile = sc.next();
			System.out.println("December");
			OpenFile(myFile);
				c.setGrossWage4(21214.32);c.setRiceAllowance(1500); c.setPhoneAllowance(1000);
			c.setClothingAllowance(1000);
			deduction1 = c.getGrossWage4() * c.getSssRate();
			deduction2 = c.getGrossWage4() * c.getPhilhealthRate();
			netwage1 = c.getGrossWage4() - deduction1;
			netwage2 = (netwage1 + c.getClothingAllowance() + c.getPhoneAllowance() + c.getRiceAllowance())- deduction2;
			System.out.println("The total net wage =" + netwage2 + " pesos");
			print(" ");
			break;
			
		case 10021: 
				c.setGrossWage(21427.935); c.setRiceAllowance(0); c.setPhoneAllowance(0);
			c.setClothingAllowance(0);
			 deduction1 = c.getGrossWage() * c.getSssRate();
			 deduction2 = c.getGrossWage() * c.getPhilhealthRate();
			 netwage1 = c.getGrossWage() - deduction1;
			 netwage2 = (netwage1 + c.getClothingAllowance() + c.getPhoneAllowance() + c.getRiceAllowance())- deduction2;
			System.out.println("The total net wage =" + netwage2 + " pesos");
			print(" ");
			//October
			System.out.println("To open October month enter the monthand employee number + .txt  :");
			myFile = sc.next();
			System.out.println("October");
			OpenFile(myFile);
				c.setGrossWage2(23124.58);c.setRiceAllowance(1500); c.setPhoneAllowance(1000);
			c.setClothingAllowance(1000);
			deduction1 = c.getGrossWage2() * c.getSssRate();
			deduction2 = c.getGrossWage2() * c.getPhilhealthRate();
			netwage1 = c.getGrossWage2() - deduction1;
			netwage2 = (netwage1 + c.getClothingAllowance() + c.getPhoneAllowance() + c.getRiceAllowance())- deduction2;
			System.out.println("The total net wage =" + netwage2 + " pesos");
			print(" ");
			//November
			System.out.println("To open November month enter the month and employee number + .txt  :");
			myFile = sc.next();
			System.out.println("November");
			OpenFile(myFile);
				c.setGrossWage3(20472.82);c.setRiceAllowance(1500); c.setPhoneAllowance(1000);
			c.setClothingAllowance(1000);
			deduction1 = c.getGrossWage3() * c.getSssRate();
			deduction2 = c.getGrossWage3() * c.getPhilhealthRate();
			netwage1 = c.getGrossWage3() - deduction1;
			netwage2 = (netwage1 + c.getClothingAllowance() + c.getPhoneAllowance() + c.getRiceAllowance())- deduction2;
			System.out.println("The total net wage =" + netwage2 + " pesos");
			print(" ");
			//December
			System.out.println("To open December month enter the month and employee number + .txt  :");
			myFile = sc.next();
			System.out.println("December");
			OpenFile(myFile);
				c.setGrossWage4(20472.82);c.setRiceAllowance(1500); c.setPhoneAllowance(1000);
			c.setClothingAllowance(1000);
			deduction1 = c.getGrossWage4() * c.getSssRate();
			deduction2 = c.getGrossWage4() * c.getPhilhealthRate();
			netwage1 = c.getGrossWage4() - deduction1;
			netwage2 = (netwage1 + c.getClothingAllowance() + c.getPhoneAllowance() + c.getRiceAllowance())- deduction2;
			System.out.println("The total net wage =" + netwage2 + " pesos");
			print(" ");
			break;
			
		case 10022: 
				c.setGrossWage(22928.55); c.setRiceAllowance(0); c.setPhoneAllowance(0);
			c.setClothingAllowance(0);
			 deduction1 = c.getGrossWage() * c.getSssRate();
			 deduction2 = c.getGrossWage() * c.getPhilhealthRate();
			 netwage1 = c.getGrossWage() - deduction1;
			 netwage2 = (netwage1 + c.getClothingAllowance() + c.getPhoneAllowance() + c.getRiceAllowance())- deduction2;
			System.out.println("The total net wage =" + netwage2 + " pesos");
			print(" ");
			//October
			System.out.println("To open October month enter the monthand employee number + .txt  :");
			myFile = sc.next();
			System.out.println("October");
			OpenFile(myFile);
				c.setGrossWage2(22928.55);c.setRiceAllowance(1500); c.setPhoneAllowance(1000);
			c.setClothingAllowance(1000);
			deduction1 = c.getGrossWage2() * c.getSssRate();
			deduction2 = c.getGrossWage2() * c.getPhilhealthRate();
			netwage1 = c.getGrossWage2() - deduction1;
			netwage2 = (netwage1 + c.getClothingAllowance() + c.getPhoneAllowance() + c.getRiceAllowance())- deduction2;
			System.out.println("The total net wage =" + netwage2 + " pesos");
			print(" ");
			//November
			System.out.println("To open November month enter the month and employee number + .txt  :");
			myFile = sc.next();
			System.out.println("November");
			OpenFile(myFile);
				c.setGrossWage3(21076.8);c.setRiceAllowance(1500); c.setPhoneAllowance(1000);
			c.setClothingAllowance(1000);
			deduction1 = c.getGrossWage3() * c.getSssRate();
			deduction2 = c.getGrossWage3() * c.getPhilhealthRate();
			netwage1 = c.getGrossWage3() - deduction1;
			netwage2 = (netwage1 + c.getClothingAllowance() + c.getPhoneAllowance() + c.getRiceAllowance())- deduction2;
			System.out.println("The total net wage =" + netwage2 + " pesos");
			print(" ");
			//December
			System.out.println("To open December month enter the month and employee number + .txt  :");
			myFile = sc.next();
			System.out.println("December");
			OpenFile(myFile);
				c.setGrossWage4(21076.8);c.setRiceAllowance(1500); c.setPhoneAllowance(1000);
			c.setClothingAllowance(1000);
			deduction1 = c.getGrossWage4() * c.getSssRate();
			deduction2 = c.getGrossWage4() * c.getPhilhealthRate();
			netwage1 = c.getGrossWage4() - deduction1;
			netwage2 = (netwage1 + c.getClothingAllowance() + c.getPhoneAllowance() + c.getRiceAllowance())- deduction2;
			System.out.println("The total net wage =" + netwage2 + " pesos");
			print(" ");
			break;
			
		case 10023: 
				c.setGrossWage( 21093.735); c.setRiceAllowance(0); c.setPhoneAllowance(0);
			c.setClothingAllowance(0);
			 deduction1 = c.getGrossWage() * c.getSssRate();
			 deduction2 = c.getGrossWage() * c.getPhilhealthRate();
			 netwage1 = c.getGrossWage() - deduction1;
			 netwage2 = (netwage1 + c.getClothingAllowance() + c.getPhoneAllowance() + c.getRiceAllowance())- deduction2;
			System.out.println("The total net wage =" + netwage2 + " pesos");
			print(" ");
			//October
			System.out.println("To open October month enter the monthand employee number + .txt  :");
			myFile = sc.next();
			System.out.println("October");
			OpenFile(myFile);
				c.setGrossWage2( 21093.735);c.setRiceAllowance(1500); c.setPhoneAllowance(1000);
			c.setClothingAllowance(1000);
			deduction1 = c.getGrossWage2() * c.getSssRate();
			deduction2 = c.getGrossWage2() * c.getPhilhealthRate();
			netwage1 = c.getGrossWage2() - deduction1;
			netwage2 = (netwage1 + c.getClothingAllowance() + c.getPhoneAllowance() + c.getRiceAllowance())- deduction2;
			System.out.println("The total net wage =" + netwage2 + " pesos");
			print(" ");
			//November
			System.out.println("To open November month enter the month and employee number + .txt  :");
			myFile = sc.next();
			System.out.println("November");
			OpenFile(myFile);
				c.setGrossWage3(17477.625);c.setRiceAllowance(1500); c.setPhoneAllowance(1000);
			c.setClothingAllowance(1000);
			deduction1 = c.getGrossWage3() * c.getSssRate();
			deduction2 = c.getGrossWage3() * c.getPhilhealthRate();
			netwage1 = c.getGrossWage3() - deduction1;
			netwage2 = (netwage1 + c.getClothingAllowance() + c.getPhoneAllowance() + c.getRiceAllowance())- deduction2;
			System.out.println("The total net wage =" + netwage2 + " pesos");
			print(" ");
			//December
			System.out.println("To open December month enter the month and employee number + .txt  :");
			myFile = sc.next();
			System.out.println("December");
			OpenFile(myFile);
				c.setGrossWage4(18682.995);c.setRiceAllowance(1500); c.setPhoneAllowance(1000);
			c.setClothingAllowance(1000);
			deduction1 = c.getGrossWage4() * c.getSssRate();
			deduction2 = c.getGrossWage4() * c.getPhilhealthRate();
			netwage1 = c.getGrossWage4() - deduction1;
			netwage2 = (netwage1 + c.getClothingAllowance() + c.getPhoneAllowance() + c.getRiceAllowance())- deduction2;
			System.out.println("The total net wage =" + netwage2 + " pesos");
			print(" ");
			break;
			
		case 10024: 
				c.setGrossWage(20191.955); c.setRiceAllowance(0); c.setPhoneAllowance(0);
			c.setClothingAllowance(0);
			 deduction1 = c.getGrossWage() * c.getSssRate();
			 deduction2 = c.getGrossWage() * c.getPhilhealthRate();
			 netwage1 = c.getGrossWage() - deduction1;
			 netwage2 = (netwage1 + c.getClothingAllowance() + c.getPhoneAllowance() + c.getRiceAllowance())- deduction2;
			System.out.println("The total net wage =" + netwage2 + " pesos");
			print(" ");
			//October
			System.out.println("To open October month enter the monthand employee number + .txt  :");
			myFile = sc.next();
			System.out.println("October");
			OpenFile(myFile);
				c.setGrossWage2(23124.58);c.setRiceAllowance(1500); c.setPhoneAllowance(1000);
			c.setClothingAllowance(1000);
			deduction1 = c.getGrossWage2() * c.getSssRate();
			deduction2 = c.getGrossWage2() * c.getPhilhealthRate();
			netwage1 = c.getGrossWage2() - deduction1;
			netwage2 = (netwage1 + c.getClothingAllowance() + c.getPhoneAllowance() + c.getRiceAllowance())- deduction2;
			System.out.println("The total net wage =" + netwage2 + " pesos");
			print(" ");
			//November
			System.out.println("To open November month enter the month and employee number + .txt  :");
			myFile = sc.next();
			System.out.println("November");
			OpenFile(myFile);
				c.setGrossWage3(22602.645);c.setRiceAllowance(1500); c.setPhoneAllowance(1000);
			c.setClothingAllowance(1000);
			deduction1 = c.getGrossWage3() * c.getSssRate();
			deduction2 = c.getGrossWage3() * c.getPhilhealthRate();
			netwage1 = c.getGrossWage3() - deduction1;
			netwage2 = (netwage1 + c.getClothingAllowance() + c.getPhoneAllowance() + c.getRiceAllowance())- deduction2;
			System.out.println("The total net wage =" + netwage2 + " pesos");
			print(" ");
			//December
			System.out.println("To open December month enter the month and employee number + .txt  :");
			myFile = sc.next();
			System.out.println("December");
			OpenFile(myFile);
				c.setGrossWage4(20191.955);c.setRiceAllowance(1500); c.setPhoneAllowance(1000);
			c.setClothingAllowance(1000);
			deduction1 = c.getGrossWage4() * c.getSssRate();
			deduction2 = c.getGrossWage4() * c.getPhilhealthRate();
			netwage1 = c.getGrossWage4() - deduction1;
			netwage2 = (netwage1 + c.getClothingAllowance() + c.getPhoneAllowance() + c.getRiceAllowance())- deduction2;
			System.out.println("The total net wage =" + netwage2 + " pesos");
			print(" ");
			break;
			
		case 10025: 
				c.setGrossWage(21495.54); c.setRiceAllowance(0); c.setPhoneAllowance(0);
			c.setClothingAllowance(0);
			 deduction1 = c.getGrossWage() * c.getSssRate();
			 deduction2 = c.getGrossWage() * c.getPhilhealthRate();
			 netwage1 = c.getGrossWage() - deduction1;
			 netwage2 = (netwage1 + c.getClothingAllowance() + c.getPhoneAllowance() + c.getRiceAllowance())- deduction2;
			System.out.println("The total net wage =" + netwage2 + " pesos");
			print(" ");
			//October
			System.out.println("To open October month enter the monthand employee number + .txt  :");
			myFile = sc.next();
			System.out.println("October");
			OpenFile(myFile);
				c.setGrossWage2(21495.54);c.setRiceAllowance(1500); c.setPhoneAllowance(1000);
			c.setClothingAllowance(1000);
			deduction1 = c.getGrossWage2() * c.getSssRate();
			deduction2 = c.getGrossWage2() * c.getPhilhealthRate();
			netwage1 = c.getGrossWage2() - deduction1;
			netwage2 = (netwage1 + c.getClothingAllowance() + c.getPhoneAllowance() + c.getRiceAllowance())- deduction2;
			System.out.println("The total net wage =" + netwage2 + " pesos");
			print(" ");
			//November
			System.out.println("To open November month enter the month and employee number + .txt  :");
			myFile = sc.next();
			System.out.println("November");
			OpenFile(myFile);
				c.setGrossWage3(19084.8);c.setRiceAllowance(1500); c.setPhoneAllowance(1000);
			c.setClothingAllowance(1000);
			deduction1 = c.getGrossWage3() * c.getSssRate();
			deduction2 = c.getGrossWage3() * c.getPhilhealthRate();
			netwage1 = c.getGrossWage3() - deduction1;
			netwage2 = (netwage1 + c.getClothingAllowance() + c.getPhoneAllowance() + c.getRiceAllowance())- deduction2;
			System.out.println("The total net wage =" + netwage2 + " pesos");
			print(" ");
			//December
			System.out.println("To open December month enter the month and employee number + .txt  :");
			myFile = sc.next();
			System.out.println("December");
			OpenFile(myFile);
				c.setGrossWage4(19084.8);c.setRiceAllowance(1500); c.setPhoneAllowance(1000);
			c.setClothingAllowance(1000);
			deduction1 = c.getGrossWage4() * c.getSssRate();
			deduction2 = c.getGrossWage4() * c.getPhilhealthRate();
			netwage1 = c.getGrossWage4() - deduction1;
			netwage2 = (netwage1 + c.getClothingAllowance() + c.getPhoneAllowance() + c.getRiceAllowance())- deduction2;
			System.out.println("The total net wage =" + netwage2 + " pesos");
			print(" ");
			break;
			default : System.out.println("Invalid Data!");
			System.exit(0);
			
		}
		System.out.println("Thank you !");
		
		sc.close();

	}

}
