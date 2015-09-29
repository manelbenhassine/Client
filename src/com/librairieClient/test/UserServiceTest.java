package com.librairieClient.test;

import static org.junit.Assert.*;

import java.util.List;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;


import com.ets.librairie.model.Service.UserServiceRemote;
import com.ets.librairie.model.domain.User;
import com.ets.librairie.model.domain.UserAdmin;
import com.ets.librairie.model.domain.UserStudent;
import com.librairieClient.Util.Locator;

public class UserServiceTest {

	UserServiceRemote userService;
	
	@Before
	public void setUp()
	{
		userService=(UserServiceRemote) Locator.lookUp("UserService",UserServiceRemote.class);
		
	}
	@Test
	public void addUserTest()
	{
		UserAdmin userAdmin=new UserAdmin();
		userAdmin.setCode("02");
		userAdmin.setPoste("admin");
		userService.addUserAdmin(userAdmin);
		
		
		
	}
	 @Test
		public void findByCodeUserTest()
		{
			
			List<User>users=userService.findByCodeUser("01");
			
			for(User user:users)
			{
				String prenom=user.getCode();
			Assert.assertEquals(prenom, "02");	
			System.out.println(prenom);
			}
		     
			
			
			
		}
	


}
