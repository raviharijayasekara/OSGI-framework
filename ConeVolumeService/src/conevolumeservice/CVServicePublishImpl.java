package conevolumeservice;

import java.util.Scanner;

public class CVServicePublishImpl implements CVServicePublish{
	private static Scanner sc;
	
	@Override
	public void coneVolumeCalculater() {
		double radius, height, length, vol,surfArea;
		
		System.out.println("============================");
		System.out.println("  Welcome to Cone Calculater");
		System.out.println("============================");
		System.out.println("Enter 1 to Calculate Volume of a Cone!");
		System.out.println("Enter 2 to Calculate Surface Area of a Cone!");
		
		sc = new Scanner(System.in);
		int request = sc.nextInt();
		
		switch (request) {
		case 1:
			
			System.out.println(" Please Enter the Height and Radius: ");
			sc = new Scanner(System.in);
			radius = sc.nextDouble();
			height = sc.nextDouble();
			vol = (1.0/3) * Math.PI  * radius * radius * height;
			System.out.format("\n The Volume of a Cone = %.2f \n ", vol);
			break;

		case 2:
			
			System.out.println(" Please Enter the Height and Radius : ");
			sc = new Scanner(System.in);
			radius = sc.nextDouble();
			height = sc.nextDouble();
			length = Math.sqrt(radius * radius + height * height);
			surfArea = Math.PI  * radius * (radius + length);
			System.out.format("\n The Surface area of a Cone = %.2f \n ", surfArea);
			break;
			
		}
		
	
	}	

}
