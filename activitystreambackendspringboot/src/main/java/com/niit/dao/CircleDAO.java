package com.niit.dao;

import java.util.List;

import com.niit.model.Circle;
import com.niit.model.UserCircle;

public interface  CircleDAO {
	public boolean createCircle(Circle circle);
	
	public boolean deactivateCircle(int circleId);
	
	public List<Circle> getAllCircles();
	
	
}
