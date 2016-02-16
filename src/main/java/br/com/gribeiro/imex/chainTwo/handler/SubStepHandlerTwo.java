package br.com.gribeiro.imex.chainTwo.handler;

import br.com.gribeiro.imex.process.Request;

public class SubStepHandlerTwo extends Handler {

	public SubStepHandlerTwo(Integer id, String name, String description) {
		super(id, name, description);
	}

	public Request handle(Request request) {
		System.out.println("StepTwo called ...");
		return request;
	}

}