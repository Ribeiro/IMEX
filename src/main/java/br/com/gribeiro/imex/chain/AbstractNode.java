package br.com.gribeiro.imex.chain;

import br.com.gribeiro.imex.process.Request;

public abstract class AbstractNode {
	
	protected abstract Request handle(Request request);
	
}
