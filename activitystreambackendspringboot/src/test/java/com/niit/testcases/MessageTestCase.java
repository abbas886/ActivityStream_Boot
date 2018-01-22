package com.niit.testcases;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.validation.constraints.AssertFalse;
import javax.validation.constraints.AssertTrue;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.test.context.junit4.SpringRunner;

import com.niit.dao.CircleDAO;
import com.niit.dao.MessageDAO;
import com.niit.dao.UserCircleDAO;
import com.niit.main.SpringBoot;
import com.niit.model.Circle;
import com.niit.model.Inbox;
import com.niit.model.Message;
import com.niit.model.Outbox;
import com.niit.model.UserCircle;


@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT, classes = SpringBoot.class)
@EnableAspectJAutoProxy
public class MessageTestCase {
	
	/*@Autowired
	private static AnnotationConfigApplicationContext context;*/
	@Autowired
	private  Circle circle;
	@Autowired
	private  CircleDAO circleDAO;
	@Autowired
	private  UserCircle userCircle;
	@Autowired
	private  UserCircleDAO userCircleDAO;
	//static GregorianCalendar gregorianCalendar;
	@Autowired
	private  Message message;
	@Autowired
	private  MessageDAO messageDAO;
	@Autowired
	private  Inbox inbox;
	@Autowired
	private  Outbox outbox;
	
	
	/*@BeforeClass
	public static void messageinit() {
		context = new AnnotationConfigApplicationContext();
		context.scan("com.stackroute.activitystream.ActivityStreamBackend");
		context.refresh();
		circle=(Circle) context.getBean("circle");
		circleDAO=(CircleDAO) context.getBean("circleDAO");
		userCircleDAO=(UserCircleDAO)context.getBean("userCircleDAO");		
		userCircle=(UserCircle)context.getBean("userCircle");
		message=(Message) context.getBean("message");
		messageDAO=(MessageDAO) context.getBean("messageDAO");
		inbox=(Inbox) context.getBean("inbox");
		outbox=(Outbox) context.getBean("outbox");
		
		//gregorianCalendar=new GregorianCalendar();
		
	}*/
	
	@Test
	public void testSendMessageToCircle() {
		message.setCircleId(1);
		//message.setMessageId(4);
		//message.setUserEmailId("null");
		message.setSenderEmailId("sudhakar@yahoo.com");
		message.setMessageType("text");
		message.setMessageData("sudhakar ....!");
		message.setMessageDate(new Date());
		assertEquals(true,messageDAO.sendMessageToCircle(message));
		}
	
	@Test
	public void testSendMessageToUser() {
	 	//message.setCircleId(0);
		//message.setMessageId(5);
		message.setSenderEmailId("sudhakar@yahoo.com");
		message.setRecieverEmailId("Diwakar@gmail.com");
		message.setMessageType("text");
		message.setMessageData("sudhakar,Diwakar....");
		message.setMessageDate(new Date());
		assertEquals(true,messageDAO.sendMessageToUser(message));
		
		
		/*inbox.setSenderEmailId("Amar@yahoo.com");
		inbox.setRecieverEmailId("Sofia@gmail.com");
		inbox.setMessageType("text");
		inbox.setMessageData("erumae maadu");
		inbox.setMessageDate(new Date());
		assertEquals(true,messageDAO.sendMessageToUserInbox(inbox));
		
		
		
		outbox.setSenderEmailId("Amar@yahoo.com");
		outbox.setRecieverEmailId("Sofia@gmail.com");
		outbox.setMessageType("text");
		outbox.setMessageData("erumae maadu");
		outbox.setMessageDate(new Date());
		assertEquals(true,messageDAO.sendMessageToUserOutbox(outbox));*/
		
		
		}
	
	/*A */
	
	@Test
	public void getMessageByCircle() {
		
		List<Message> messageList = messageDAO.getMessageByCircle(50);//.getAllCircles();
		assertNotNull(messageList);
		for (Message messageData : messageList) {
			if(messageData.getCircleId()==50)
			{
				System.out.println(messageData.getMessageData());
			}
				
			//if(messageData.getCircleId()==50)
				//.getStatus().equals("ACTIVE"))
				
			//System.out.println(circleData.getCircleName()+"-------"+circleData.getCircleDate()+"----------"+circleData.getStatus());
		}
	}
	
	@Test
	public void getMessageByUser() {
		
		List<Message> messageList = messageDAO.getMessageByUser("sudhakar@yahoo.com","Diwakar@gmail.com");
		assertNotNull(messageList);
		for (Message messageData : messageList) {
			System.out.println(messageData.getMessageData());	
			
		}
	}
	
	 @Test
	 public void deleteSendMessage() {
		// Outbox outbox=messageDAO.getUserOutbox(470);
		 assertTrue(messageDAO.deleteSendMessage(470));
	 }
	 
	 @Test
	 public void deleteReceivedMessage() {
		// Inbox inbox=messageDAO.getUserInbox(340);
		 assertTrue(messageDAO.deleteReceivedMessage(390));
	 }
	 
	 
}
