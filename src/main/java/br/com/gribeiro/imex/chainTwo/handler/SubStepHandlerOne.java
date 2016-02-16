package br.com.gribeiro.imex.chainTwo.handler;

import br.com.gribeiro.imex.process.Request;

public class SubStepHandlerOne extends Handler {

	public SubStepHandlerOne(Integer id, String name, String description) {
		super(id, name, description);
	}

	public Request handle(Request request) {
		System.out.println("StepOne called ...");
		return request;
	}

}