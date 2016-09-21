package br.com.raph.wildfly.scheduler;

import java.util.Date;

import javax.ejb.Schedule;
import javax.ejb.Singleton;
import javax.ejb.Startup;

//@Startup //Wildfly não start por default...
//@Singleton
public class SimpleScheduleImpl implements SimpleSchedule {
	
	@Override
//	@Schedule(second="*/2", minute="*", hour="*", persistent=false)
	public void scheduledMethod() {
		
		System.out.println( "Hello World " + new Date() );
	}

}
