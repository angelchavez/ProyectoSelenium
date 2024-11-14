package com.magento.tests;


import org.testng.annotations.Test;

public class LoginTest extends BaseTest {


	@Test
	public void InicioSeExistoso() {

		loginPage.InicioSesion();
		
     }

	/*
	//@Test
	public void InicioSeIncorrecto() {

		loginPage.IncioSesionIncorrectos();
	}
	//@Test
	public void CredentialinWhite() {

		loginPage.CredencialVacio();
	}
	//@Test
	public void EmailNotRegistered() {

		loginPage.CorreoNotRegister();
	}
	//@Test
	public void ForgotthenPass()  {
		loginPage.ForgottenPassword();
	}*/

}
