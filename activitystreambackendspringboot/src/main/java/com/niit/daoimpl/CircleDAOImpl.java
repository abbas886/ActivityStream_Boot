package com.niit.daoimpl;

import java.util.Date;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.niit.dao.CircleDAO;
import com.niit.model.Circle;
import com.niit.model.UserCircle;

@Repository(value = "circleDAO")
@Transactional
@EnableTransactionManagement
public class CircleDAOImpl implements CircleDAO {
	@Autowired
	private SessionFactory sessionFactory;
	public boolean createCircle(Circle circle) {
		try{
			circle.setCircleDate(new Date());
			sessionFactory.getCurrentSession().save(circle);
			return true;
		}
		catch(HibernateException e)
		{
			return false;	
		}
		
	}

	public boolean deactivateCircle(int circleId) {
		try{
			Circle circle=(Circle) sessionFactory.getCurrentSession().get(Circle.class, circleId);
			circle.setStatus("DE_ACTIVE");
		sessionFactory.getCurrentSession().update(circle);
		return true;
		}
		catch(Exception e)
		{
		return false;
		}
	}

	public List<Circle> getAllCircles() {
		List<Circle> showCircle = sessionFactory.getCurrentSession().createQuery("FROM Circle").list();
		return showCircle;
	}

}
