package com.app.ioc;

public class App {

	public static void main(String[] args) {
		UsuarioFactory obj = new UsuarioFactory(new UsuarioImplOracle());
		obj.getInsertaUsuario();
		obj.getEliminaUsuarioByID(1);
		
		UsuarioFactory obj2 = new UsuarioFactory(new UsuarioImplMongo());
		obj2.getInsertaUsuario();
		obj2.getEliminaUsuarioByID(1);
	}

}
