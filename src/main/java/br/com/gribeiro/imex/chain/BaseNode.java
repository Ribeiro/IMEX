package br.com.gribeiro.imex.chain;

import java.util.List;
import br.com.gribeiro.imex.process.Request;

public class BaseNode extends AbstractNode {
	
	private List<Step> steps;

	@Override
	protected Request handle(Request request) {
		Request currentRequest = null;
		
		for (Step step : steps) {
			currentRequest = step.handle(request);
		}
		return currentRequest;
	}
	
	public BaseNode(List<Step> steps){
		this.steps = steps;
	}
	
	protected void add(Step step){
		this.steps.add(step);
	}
	
	protected void remove(Step step){
		this.steps.remove(step);
	}

}