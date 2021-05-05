package coneservice;

public class ConeServicePublishImpl implements ConeServicePublish{
	
		
		public void ConeVSACalculater(int request, double radius, double height) {
			double length, vol,surfArea;
			
			switch (request) {
			case 1:
				vol = (1.0/3) * Math.PI  * radius * radius * height;
				System.out.println("RESULT \n");
				System.out.println("===============================");
				System.out.format("The Volume of a Cone = %.2f \n", vol);
				System.out.println("==============================");
				break;

			case 2:
				length = Math.sqrt(radius * radius + height * height);
				surfArea = Math.PI  * radius * (radius + length);
				System.out.println("RESULT \n");
				System.out.println("===================================");
				System.out.format("The Surface area of a Cone = %.2f \n", surfArea);
				System.out.println("===================================");
				break;
				
			}
			
			
		}
	

}
