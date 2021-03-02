package conevolumeservice;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

public class ConeVolumeActivator implements BundleActivator {

	
	ServiceRegistration publishServiceRegistration;
	
	public void start(BundleContext context) throws Exception {
		System.out.println("Publisher Service Started!");
		
		CVServicePublish cvs = new CVServicePublishImpl();
		publishServiceRegistration = context.registerService(CVServicePublish.class.getName(), cvs, null);
	}

	public void stop(BundleContext bundleContext) throws Exception {
		System.out.println("Publisher Service Stopped!");
		publishServiceRegistration.unregister();
	}

}
