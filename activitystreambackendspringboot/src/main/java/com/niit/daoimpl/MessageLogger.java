/*package com.niit.daoimpl;
package com.stackroute.activitystream.ActivityStreamBackend.DaoImpl;

import java.util.Date;

import org.apache.log4j.Logger;
import org.junit.Before;
import org.springframework.stereotype.Component;
//import org.slf4j.LoggerFactory;
//import org.aspectj.lang.annotation.Aspect;
//@Aspect
@Component
public class MessageLogger {
	private static final Logger logger=LoggerFactory.getLogger(MessageLogger.class);
	 public MessageLogger() {
		
	}
	
	@Before("execution(* com.stackroute.activitystream.ActivityStreamBackend.DaoImpl.sendMessageToCircle())")
	 
	public void beforesendingMessageToCircle()
	{
		logger.info("before sending Message To Circle "+new Date());
	}

}

*/