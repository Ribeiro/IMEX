package br.com.gribeiro.imex.chain;

import br.com.gribeiro.imex.process.Request;

public abstract class AbstractHandler {
	
	public abstract Request handle(Request request);
	
}
