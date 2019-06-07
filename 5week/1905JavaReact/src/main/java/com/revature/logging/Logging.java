package com.revature.logging;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Logging {
	private static Logger log = LogManager.getRootLogger();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		log.trace("This is a trace, it is granular");
		log.debug("This is a debug, not as granular as trace, but more than info");
		log.info("This is for generic Info, like Application has started");
		log.warn("This is for odd behaviour that doesn't impact UX");
		log.error("Somehing has gone wrong and users are suffering");
		log.fatal("There is no escaping your destiny, the program is dead");

	}

}
