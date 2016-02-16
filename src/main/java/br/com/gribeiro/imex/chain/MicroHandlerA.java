package br.com.gribeiro.imex.chain;

import br.com.gribeiro.imex.process.Request;

public class MicroHandlerA extends MicroHandler {

	public MicroHandlerA(Integer id, String name) {
		super(id, name);
	
	}

	public Request handle(Request request) {
		System.out.println("Called MicroHandlerA ...");
		return null;
	}

}
