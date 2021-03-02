package servicesubscriber;

import conevolumeservice.CVServicePublish;

import java.util.Scanner;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;


public class ServiceActivator implements BundleActivator {

	ServiceReference serviceReference;
	
	@Override
	public void start(BundleContext context) throws Exception {

		System.out.println(" Subscriber Service Started");
		serviceReference = context.getServiceReference(CVServicePublish.class.getName());
		CVServicePublish servicePublish = (CVServicePublish) context.getService(serviceReference);


		int request;
		System.out.println("==============================================");
		System.out.println("  Welcome to Volume & Surface Area Calculater");
		System.out.println("==============================================");
		System.out.println("Enter 1 to Cone!");
		System.out.println("Enter 2 to Toblerone!");
		System.out.println("Enter 3 to Cylinder!");
		System.out.println("Enter 4 to Sphere!");
		System.out.println("Enter 0 to Exit!");

		Scanner in = new Scanner(System.in);
		request = in.nextInt();

		if (request == 1) {
		servicePublish.coneVolumeCalculater();

		} else if (request == 2) {
//			servicePublish.coneVolumeCalculater();

		} else if (request == 3) {
//			servicePublish.coneVolumeCalculater();

		} else if (request == 4) {
//			servicePublish.coneVolumeCalculater();
		} else {

		}
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		System.out.println("Subscriber Service Stopped!");
	}

}
