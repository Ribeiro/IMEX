package br.com.gribeiro.imex.chain;

import java.util.List;

import br.com.gribeiro.imex.process.Request;

public class MacroHandler extends AbstractHandler {
	
	private List<MicroHandler> microHandlers;
	private Integer id;
	private String name;

	@Override
	public Request handle(Request request) {
		Request currentRequest = null;
		
		for (MicroHandler microHandler : microHandlers) {
			currentRequest = microHandler.handle(request);
		}
		return currentRequest;
	}
	
	public MacroHandler(Integer id, String name, List<MicroHandler> microHandlers){
		this.id = id;
		this.name = name;
		this.microHandlers = microHandlers;
	}
	
	protected void add(MicroHandler microHandler){
		this.microHandlers.add(microHandler);
	}
	
	protected void remove(MicroHandler microHandler){
		this.microHandlers.remove(microHandler);
	}
	
	public Integer getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}

}