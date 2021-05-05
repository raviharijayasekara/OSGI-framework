package coneservice;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class ConeActivator implements BundleActivator {

	
	ServiceRegistration publishServiceRegistration;
	
	public void start(BundleContext context) throws Exception {
		System.out.println("Publisher Service Started!");
		
		ConeServicePublish cvs = new ConeServicePublishImpl();
		publishServiceRegistration = context.registerService(ConeServicePublish.class.getName(), cvs, null);
	}

	public void stop(BundleContext bundleContext) throws Exception {
		System.out.println("Publisher Service Stopped!");
		publishServiceRegistration.unregister();
	}

}
