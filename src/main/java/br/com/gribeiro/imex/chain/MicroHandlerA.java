package br.com.gribeiro.imex.chain;

import br.com.gribeiro.imex.process.Request;

public class MicroHandlerA extends MicroHandler {

	@Override
	public Request handle(Request request) {
		System.out.println("Called MicroHandlerA ...");
		return null;
	}

}
