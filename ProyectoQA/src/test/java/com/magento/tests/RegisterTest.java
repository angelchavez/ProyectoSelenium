package com.magento.tests;


import org.openqa.selenium.WebDriver;


public class RegisterTest extends BaseTest {

	WebDriver driver;
	//private String e;
	//private String p;
/*
    @Test
	public void registerAccount() {

    	
		 registerPage.registroexitoso();
		 
	
    }
    */
    
	/*
	@Test
	public void registerCampos() {
		
		registerPage.registroCampos();
	}*/
/*
	@Test (dataProvider = "dataLogin")
	public void CorreoDataProvider() {
		
		registerPage.doLoginCorreoValidoWithDataProvider( e, p);
		
	}*/
			
	//@Test
	public void ContraseñaSegura() {
		registerPage.ContrasenaSegura();
	}
	//@Test
	public void Contraseña1() {
		registerPage.ContrasenaCorta();
	}
	//@Test
	public void Contraseña2() {
		registerPage.ContrasenaSinNumeros();
	}
	//@Test
	public void Contraseña3() {
		registerPage.ContrasenaSinCaracterEspecial();
	}
	//@Test
	public void ConfContraseña() {
		registerPage.ConfirmarContraseñaCoinciden();
	}
	//@Test
	public void ConfContraseñaNoCo() {
		registerPage.ConfirmarContraseñaNoCoinciden();
	}
	//@Test
	public void CorreoUn() {
		registerPage.CorreoUnico();
	}
	//@Test
	public void CorreoDu() {

	   registerPage.CorreoDuplicado();
	}








}
