package com.maven.epam_task;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;


public class construction {

	public static void costEvaluator() {
		Scanner sc2= new Scanner(System.in);
		PrintStream p=new PrintStream(new FileOutputStream(FileDescriptor.out));
		p.println();
		p.println("CONSTRUCTION COST ESTIMATION");
		p.println();
		p.println("Variants Available");
		p.println("1. Construction with standard materials");
		p.println("2. Construction with above standard materials");
		p.println("3. Construction with high standard materials");
		p.println("4. Construction with high standard materials and fully automated");
		p.println("Enter your choice");
		try {
		int ch=sc2.nextInt();
		switch(ch)
		{
		case 1:
			p.println("Enter the area of the house: ");
			p.println("Cost ="+sc2.nextDouble()*1200 );
			break;
		case 2:
			p.println("Enter the area of the house: ");
			p.println("Cost ="+sc2.nextDouble()*1500 );
			break;
		case 3:
			p.println("Enter the area of the house: ");
			p.println("Cost ="+sc2.nextDouble()*1800 );
			break;
		case 4:
			p.println("Enter the area of the house: ");
			p.println("Cost ="+sc2.nextDouble()*2500 );
			break;
		default:
			p.println("Enter a valid input");
			
		
			
		}}
		
		catch (Exception e) {
		
			p.println("Enter a valid input");
			
		}
		sc2.close();
	}
}

