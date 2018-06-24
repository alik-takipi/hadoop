package alik.war;


import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;
import org.glassfish.jersey.servlet.ServletContainer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.eclipse.jetty.servlet.ServletContextHandler.NO_SESSIONS;

public class AlikApplication {
	
	private static final Logger logger = LoggerFactory.getLogger(AlikApplication.class);
	
	public static void main(String[] args) {
		
		Server server = new Server(9090);
		
		ServletContextHandler servletContextHandler = new ServletContextHandler(NO_SESSIONS);
		
		servletContextHandler.setContextPath("/");
		server.setHandler(servletContextHandler);
		
		ServletHolder servletHolder = servletContextHandler.addServlet(ServletContainer.class, "/api/*");
		servletHolder.setInitOrder(0);
		servletHolder.setInitParameter(
				"jersey.config.server.provider.packages",
				"alik.war.resources"
		);
		
		try {
			server.start();
			server.join();
		} catch (Exception ex) {
			logger.error("Error occurred while starting Jetty", ex);
			System.exit(1);
		}
		
		finally {
			server.destroy();
		}
	}
	
}