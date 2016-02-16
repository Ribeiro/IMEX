package br.com.gribeiro.imex.chain;

import br.com.gribeiro.imex.process.Request;

public class MicroHandlerC extends MicroHandler {

	public MicroHandlerC(Integer id, String name) {
		super(id, name);
	}

	public Request handle(Request request) {
		System.out.println("Called MicroHandlerC ...");
		return null;
	}

}