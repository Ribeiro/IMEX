package br.com.gribeiro.imex.chain;

import br.com.gribeiro.imex.process.Request;

public class MicroHandlerB extends MicroHandler {

	@Override
	public Request handle(Request request) {
		System.out.println("Called MicroHandlerB ...");
		return null;
	}

}
