package com.niit.testcases;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import com.niit.dao.CircleDAO;
import com.niit.dao.UserCircleDAO;
import com.niit.main.SpringBoot;
import com.niit.model.Circle;
import com.niit.model.UserCircle;

@SpringBootTest(webEnvironment=WebEnvironment.RANDOM_PORT,classes=SpringBoot.class)
@RunWith(SpringRunner.class)
public class UserCircleTestCase {
	static AnnotationConfigApplicationContext context;
    @Autowired
	private static UserCircle userCircle;
    @Autowired
	private static UserCircleDAO userCircleDAO;
	//static GregorianCalendar gregorianCalendar;
	
	
	@BeforeClass
	public static void circleinit() {
		context = new AnnotationConfigApplicationContext();
		context.scan("com.stackroute.activitystream.ActivityStreamBackend");
		context.refresh();
		/*circle=(Circle) context.getBean("circle");
		circleDAO=(CircleDAO) context.getBean("circleDAO");*/
		userCircleDAO=(UserCircleDAO)context.getBean("userCircleDAO");
		
		userCircle=(UserCircle)context.getBean("userCircle");
		//gregorianCalendar=new GregorianCalendar();
		
	}
	
	@Test
	public void testSaveUserToCircle() {
		//userCircle.setUserCircleId(20);
		userCircle.setUserId("thrijita@yahoo.com");
		userCircle.setUserJoinedDate(new Date());
		assertEquals(true,userCircleDAO.addUserToCircle(userCircle));
		}
	/*
	 @Test
	 public void testDeleteUser() {
		 //boolean userCircle=userCircleDAO.deleteUserFromCircle(101);
		 
		 userCircleDAO.deleteUserFromCircle(400);
		 assertNotNull(userCircle);
	 }
	*/
	
}
