package at.kvas.tutorial.tycho.app2;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

import at.kvas.tutorial.tycho.gendest.Entity;
import at.kvas.tutorial.tycho.gendest2.Ui;

public class Activator implements BundleActivator {

	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		System.out.println("Hello World!!");
		Entity foo = new Entity();
		foo.test();
		Ui bar = new Ui();
		bar.test();
	}
	
	/*
	 * (non-Javadoc)
	 * @see org.osgi.framework.BundleActivator#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		System.out.println("Goodbye World!!");
	}

}
