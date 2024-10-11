package com.magento.tests;




public class RegisterTest extends BaseTest {


	//escenario happypazz
	//@Test
	/*
	public void registerAccount() {


		registerPage.registroUser();
		registerPage.registroCampos();


	}*/

	//@Test
	public void ComparacionCorreo() {

		registerPage.ingresarCorreovalido();
	}
	//@Test
	public void ComparacionCorreo1() {
		registerPage.correoSinArroba();
	}

	//@Test
	public void ComparacionCorreo2() {
		registerPage.correoSinDominio();
	}

	//@Test
	public void ComparacionCorreo3() {
		registerPage.correoDominioIncompleto();
	}

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
