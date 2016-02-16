package br.com.gribeiro.imex.chain;

import br.com.gribeiro.imex.process.Request;

public abstract class AbstractHandler {
	
	protected abstract Request handle(Request request);

}
