package com.niit.dao;

import java.util.List;

import com.niit.model.Circle;
import com.niit.model.UserCircle;
import com.niit.model.UserModel;

public interface UserCircleDAO {
	public boolean addUserToCircle(UserCircle userCircle);
	public UserCircle getuserbyCircleId(int userCircleId);
	public boolean deleteUserFromCircle(int userCircleId);
	
}
