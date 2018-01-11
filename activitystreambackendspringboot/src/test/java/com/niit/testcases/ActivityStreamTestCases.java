package com.niit.testcases;
//package com.stackroute.activitystream.ActivityStreamBackend;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//
//import org.junit.BeforeClass;
//import org.junit.Test;
//import static org.junit.Assert.*;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import com.stackroute.activitystream.ActivityStreamBackend.DAO.UserDAO;
//import com.stackroute.activitystream.ActivityStreamBackend.Model.UserModel;
//
//public class ActivityStreamTestCases {
//	@Autowired
//	private static AnnotationConfigApplicationContext context;
//	@Autowired
//	static UserDAO userDAO;
//	@Autowired
//	static UserModel user;
//
//	@BeforeClass
//	public static void init() {
//		context = new AnnotationConfigApplicationContext();
//		context.scan("com.stackroute.*");
//		
//		context.refresh();
//		System.out.println("Hi ");
//		userDAO = (UserDAO) context.getBean("userDAO");
//		user = (UserModel) context.getBean("userModel");
//	}
//
//	@Test
//	public void testInsertUser() {
//		//user=new UserModel();
//		user.setUserName("Amar");
//		user.setPassword("Amar");
//		user.setUserId(103);
//		user.setEmail("Amar@yahoo.com");
//		assertEquals(true, userDAO.insert(user));
//	}
//
//	
//	//*********************
//	 @Test
//		 public void testDeleteUser() {
//		 UserModel user=userDAO.getuserbyEmail("Thrijita@yahoo.com");
//		 userDAO.deleteUser(user);
//		 assertNotNull(user);
//		 }
//	 
//	 @Test
//		 public void testUpdateUser() {
//		 UserModel user=userDAO.getuserbyEmail("Morushkha@yahoo.com");
//		 //user.setEmail("amar_kula@yahoo.com");
//		 user.setUserId(102);
//		 user.setUserName("MorushkhaBaby");                                                                                                                                                                                                                                                                                                                          
//		 userDAO.updateUser(user);
//		 assertNotNull(user);
//		 }
//	
//	
//		 
//	 @Test
//	 public void testValidateUser() {
//	 	//	UserDAO userDAO = (UserDAO) context.getBean("userDAO");
//	 	boolean validatedUser = userDAO.validateUser("Morushkha@yahoo.com", "Morushkha");
//	 	assertEquals(true,validatedUser);
//	 	}
//	 
//	 /* @Test
//	 public void testForGetAllUsers() {
//	List<UserModel> list=new ArrayList<UserModel>();
//	 for(UserModel listdata:list)
//	 {
//		 System.out.println(listdata.getUserName());
//	 }
//	 }*/
//	 
//	 }
