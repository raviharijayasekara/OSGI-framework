package servicesubscriber;

import java.util.Scanner;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

import coneservice.ConeServicePublish;


public class ServiceActivator implements BundleActivator {

	ServiceReference serviceReference;
	private static Scanner sc;
	double radius, height, length, vol,surfArea;
	int request;
	String input;
	
	@Override
	public void start(BundleContext context) throws Exception {

		System.out.println("Subscriber Service Started \n");
		serviceReference = context.getServiceReference(ConeServicePublish.class.getName());
		ConeServicePublish servicePublish = (ConeServicePublish)context.getService(serviceReference);

		System.out.println("**************************************WELCOME TO CONE VOLUME AND SURFACE AREA CALCULATOR**************************************");
		System.out.println("Press 1 for Cone volume calcultion !");
		System.out.println("Press 2 for Cone surface area calcultion !");
		System.out.println("Enter 0 to Exit!");

		sc  = new Scanner(System.in);
		request = sc.nextInt();

		if (request == 1) {
			System.out.println("Volume Area Calculation Chosen ");
			System.out.println("------------------------------- \n");
		
			System.out.println("Please Enter the Height (cm) : ");
			sc = new Scanner(System.in);
			height = sc.nextDouble();
			
			System.out.println("Please Enter the Radius (cm) : ");
			sc = new Scanner(System.in);
			radius = sc.nextDouble();
			
			servicePublish.ConeVSACalculater(request,radius,height);
			
			System.out.format("Do you want another Cone service ? \n");
			sc  = new Scanner(System.in);
			
			input = sc.next();
			if(input.equals("y")){
				start(context);
			}else {
				stop(context);
			}
			
			
		} else if (request == 2) {
			System.out.println("Surface Area Calculation Chosen");
			System.out.println("------------------------------- \n");
		
			System.out.println("Please Enter the Height (cm) : ");
			sc = new Scanner(System.in);
			height = sc.nextDouble();
			
			System.out.println("Please Enter the Radius (cm) : ");
			sc = new Scanner(System.in);
			radius = sc.nextDouble();
			
			servicePublish.ConeVSACalculater(request,radius,height);
			
			System.out.format("Do you want another Cone service ? \n");
			sc  = new Scanner(System.in);
			
			input = sc.next();
			if(input.equals("y")){
				start(context);
			}else {
				stop(context);
			}
			

		} else {			
			stop(context);
		}
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		System.out.println("Subscriber Service Stopped! \n");
	}

}
