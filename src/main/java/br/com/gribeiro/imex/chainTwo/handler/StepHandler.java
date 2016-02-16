package br.com.gribeiro.imex.chainTwo.handler;

import java.util.List;

import br.com.gribeiro.imex.process.Request;

public class StepHandler extends Handler {
	private List<Handler> stepHandlers;

	public StepHandler(Integer id, String name, String description, List<Handler> stepHandlers) {
		super(id, name, description);
		this.stepHandlers = stepHandlers;
	}

	public Request handle(Request request) {
		Request resultRequest = null;
		for (Handler handler : stepHandlers) {
			resultRequest = handler.handle(request);
		}
		
		if (null != successor){
			return successor.handle(resultRequest);
		}else {
			return resultRequest;
		}
		
	}
	
	public void add(Handler handler){
		this.stepHandlers.add(handler);
	}
	
	public void remove(Handler handler){
		this.stepHandlers.remove(handler);
	}

}