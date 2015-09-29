package com.librairieClient.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.ets.librairie.model.Service.CompteServiceRemote;
import com.ets.librairie.model.Service.UserServiceRemote;
import com.ets.librairie.model.domain.Compte;
import com.ets.librairie.model.domain.User;
import com.librairieClient.Util.Locator;

public class CompteServiceTest {

	CompteServiceRemote compteService;
	@Before
	public void setUp()
	{
		compteService=(CompteServiceRemote) Locator.lookUp("CompteService",CompteServiceRemote.class);
	}
	@Test
	public void createCompteTest()
	{
		Compte compte=new Compte();
		compte.setNumTel("51425885");
		compte.setPwd("pwd");
		
		compteService.createCompte(compte);
		
	}

}
