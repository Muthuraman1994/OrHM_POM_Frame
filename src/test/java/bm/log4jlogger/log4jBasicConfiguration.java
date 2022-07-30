package bm.log4jlogger;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class log4jBasicConfiguration {
	
	static Logger logger = Logger.getLogger(log4jBasicConfiguration.class);
	
	public static void main(String[] args) {
		
		BasicConfigurator.configure();
		
		logger.debug("Debug Message");
		logger.info("info Message");
		logger.warn("Warning Message");
		logger.error("This is an Error");
		logger.fatal("Fatal Error Message");
	}
}
