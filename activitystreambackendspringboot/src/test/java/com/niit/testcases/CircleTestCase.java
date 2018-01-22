package com.niit.testcases;

import static org.junit.Assert.*;

import java.util.Date;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.test.context.junit4.SpringRunner;
import com.niit.model.Circle;
import com.niit.model.UserCircle;
import com.niit.dao.CircleDAO;
import com.niit.main.SpringBoot;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT, classes = SpringBoot.class)
@EnableAspectJAutoProxy
public class CircleTestCase {

	/*@Autowired
	private static AnnotationConfigApplicationContext context;*/
	@Autowired
	private Circle circle;
	@Autowired
	private CircleDAO circleDAO;
	/*@Autowired
	private static UserCircle userCircle;*/
	//static GregorianCalendar gregorianCalendar;
	
	
	/*@BeforeClass
	public static void circleinit() {
		context = new AnnotationConfigApplicationContext();
		context.scan("com.stackroute.activitystream.ActivityStreamBackend");
		context.refresh();
		circle=(Circle) context.getBean("circle");
		circleDAO=(CircleDAO) context.getBean("circleDAO");
		userCircle=(UserCircle)context.getBean("userCircle");
		//gregorianCalendar=new GregorianCalendar();
		
	}*/
	
	
	@Test
	public void testSaveCircle() {
		
	circle.setAdminId("Sunil@yahoo.com");
	//circle.setCircleId(7);
	circle.setCircleName("sunil");
	circle.setStatus("ACTIVE");
	circle.setCircleDate(new Date());
	assertEquals(true,circleDAO.createCircle(circle));
	}
	
	
	@Test
	public void testForGetAllCircles() {
		
		List<Circle> circleList = circleDAO.getAllCircles();
		assertEquals(4, circleList.size());
		//assertNotNull(circleList);
		for (Circle circleData : circleList) {
			//if(circleData.getStatus().equals("ACTIVE"))
			System.out.println(circleData.getCircleName()+"-------"+circleData.getCircleDate()+"----------"+circleData.getStatus());
		}
	}
	
	
	
	@Test
	public void deactivateCircle()
	{
		assertEquals(true,circleDAO.deactivateCircle(370));
	}
}
