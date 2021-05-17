package com.matheushajer.crudcliente.services.eceptions;

public class ResourceNotFoundExecption extends RuntimeException{
	private static final long serialVersionUID = 1L;

	public ResourceNotFoundExecption(String msg) {
		super(msg);
	}
}
