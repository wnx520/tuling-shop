/*
package start;

import com.google.common.util.concurrent.AbstractIdleService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class OrdersBootstrap extends AbstractIdleService  implements ServletContextListener{

    private ClassPathXmlApplicationContext context;
    private static final Logger LOGGER = LoggerFactory.getLogger(OrdersBootstrap.class);

    public static void main(String[] args) {
    	OrdersBootstrap bootstrap = new OrdersBootstrap();
        bootstrap.startAsync();
        try {
            Object lock = new Object();
            synchronized (lock) {
                while (true) {
                    lock.wait();
                }
            }
        } catch (InterruptedException ex) {
        	LOGGER.error("ignore interruption",ex);
        }
    }

    */
/**
     * Start the service.
     *//*

    @Override
    protected void startUp() throws Exception {
        LOGGER.info("===================shop-tarde START ....==========================");
        context = new ClassPathXmlApplicationContext(new String[]{"spring/applicationContext.xml"});
        context.start();
        context.registerShutdownHook();
        LOGGER.info("shop-goods service started successfully");
       

    }

    */
/**
     * Stop the service.
     *//*

    @Override
    protected void shutDown() throws Exception {
        context.stop();
        LOGGER.info("service stopped successfully");
    }
    */
/**
     * 
     *//*

    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        LOGGER.info("shop-trade service started ");
     try {
            startUp();
     } catch (Exception ex) {
            ex.printStackTrace();
     LOGGER.error("ignore interruption ");
     }
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        try {
            shutDown();
     } catch (Exception e) {
            e.printStackTrace();
     }
    }
}
*/
