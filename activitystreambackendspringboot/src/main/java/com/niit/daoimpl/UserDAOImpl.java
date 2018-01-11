package com.niit.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.dao.UserDAO;
import com.niit.model.UserModel;


@Repository(value="userDAO")
@Transactional
public class UserDAOImpl implements UserDAO{

	@Autowired
	private SessionFactory sessionFactory;
	
	public UserDAOImpl( )
	{
		
	}
	
	
	public UserDAOImpl(SessionFactory sessionFactory)
	{
		this.sessionFactory=sessionFactory;
	}
	//one line code required


	@Override
	public UserModel findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public boolean insert(UserModel user) {
		try
		{
		sessionFactory.getCurrentSession().save(user);
		return true;
		}
		catch(Exception e)
		{
		return false;
		}
	}


	@Override
	public boolean updateUser(UserModel user) {
		try
		{
			sessionFactory.getCurrentSession().update(user);
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}


	@Override
	public UserModel getuserById(int id) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public UserModel getuserbyEmail(String email) {
		UserModel user;
		user=(UserModel) sessionFactory.getCurrentSession().get(UserModel.class,email);
return user;
	}


	@Override
	public List<UserModel> getAllusers() {
		List<UserModel> list=new ArrayList<UserModel>(); 
		return list=sessionFactory.getCurrentSession().createQuery("from UserModel").list();
	}


	@Override
	public boolean deleteUser(UserModel user) {
		try
		{
		sessionFactory.getCurrentSession().delete(user);
		return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}


	@Override
	public boolean isUserExist(String name) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public boolean validateUser(String username, String password) {
		
		String sql="FROM UserModel where email='"+username+"' and password ='"+password+"'";
		Query query = sessionFactory.getCurrentSession().createQuery(sql);
		
		UserModel user = (UserModel)query.uniqueResult();
		if(user != null)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
		



}
