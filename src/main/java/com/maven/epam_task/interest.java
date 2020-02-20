package com.maven.epam_task;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class interest {
	public static void calculateInterest()
	{
		Scanner sc=new Scanner(System.in);
		PrintStream p=new PrintStream(new FileOutputStream(FileDescriptor.out));
		
		p.println("Enter the amount :");
		try {
		double princpalamount=sc.nextDouble();
		p.println("Enter the time :");
		double timeperiod=sc.nextDouble();
		p.println("Enter the rate of interest per annum :");
		double rateofinterest=sc.nextDouble();
		//sc.close();
		p.println("Simple Interest :"+(princpalamount*timeperiod*rateofinterest)/100);
		p.println("Compound Interest :"+((princpalamount*Math.pow(1+(rateofinterest/100),timeperiod))-princpalamount));
		}
		catch (Exception e) {
			p.println("Enter a valid input");
		}
	}

}

