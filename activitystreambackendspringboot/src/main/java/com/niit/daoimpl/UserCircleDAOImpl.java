package com.niit.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.dao.UserCircleDAO;
import com.niit.model.Circle;
import com.niit.model.UserCircle;
import com.niit.model.UserModel;

@Repository(value="userCircleDAO")
@Transactional
public class UserCircleDAOImpl implements UserCircleDAO {
	@Autowired
	private SessionFactory sessionFactory;
	@Autowired
	private UserCircle userCircle;
	public boolean addUserToCircle(UserCircle userCircle) {
		try{
//			UserCircle userCircle=new UserCircle();
//			userCircle.setCircleId(circleId);userCircle.setUserId(emailId);
			//userCircle.set
			sessionFactory.getCurrentSession().save(userCircle);
			return true;
		}
		catch(HibernateException e)
		{
			return false;	
		}
	}

	public boolean deleteUserFromCircle(int userCircleId) {
		try
		{
			UserCircle userCircle=getuserbyCircleId(userCircleId);
		sessionFactory.getCurrentSession().delete(userCircle);
		return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}

	
	public UserCircle getuserbyCircleId(int userCircleId) {
		// TODO Auto-generated method stub
		userCircle=(UserCircle) sessionFactory.getCurrentSession().get(UserCircle.class, userCircleId);
		
		return userCircle;
	}

}
