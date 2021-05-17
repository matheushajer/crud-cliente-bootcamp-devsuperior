package com.matheushajer.crudcliente.services.eceptions;

public class DataBaseExecption extends RuntimeException{
	private static final long serialVersionUID = 1L;

	public DataBaseExecption(String msg) {
		super(msg);
	}
}
