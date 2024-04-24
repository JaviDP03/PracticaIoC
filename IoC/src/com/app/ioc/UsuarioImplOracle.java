package com.app.ioc;

public class UsuarioImplOracle implements IUsuario {
	@Override
	public void insertaUsuario() {
		System.out.println("Insertando usuario con Oracle");
	}

	@Override
	public void eliminaUsuarioByID(int id) {
		System.out.println("Eliminando usuario con Oracle: " + id);		
	}
	
}
