package com.fdgroup.test;

import static org.mockito.Mockito.mock;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;


import org.junit.Test;

import com.fdmgroup.patient.dao.LoginDao;
import com.fdmgroup.patient.model.LoginBean;


public class LoginTestClass {
	@Test
	public void LoginControllerDoget() {
		LoginDao login = new LoginDao();
		LoginBean mockBean = mock(LoginBean.class);
		Boolean actualValue =false;
		try {
			actualValue = login.validate(mockBean);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertEquals(false, actualValue);

	}
	
	
	
	
}
