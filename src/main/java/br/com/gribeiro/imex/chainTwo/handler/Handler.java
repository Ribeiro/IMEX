package br.com.gribeiro.imex.chainTwo.handler;

import br.com.gribeiro.imex.process.Request;

public abstract class Handler {
	private Integer id;
	private String name;
	private String description;
	protected Handler successor;

	public final void setSuccessor(Handler successor) {
		this.successor = successor;
	}

	public abstract Request handle(Request request);
	
	public Handler(Integer id, String name, String description) {
		this.id = id;
		this.name = name;
		this.description = description;
	}
	
	public Integer getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public String getDescription() {
		return description;
	}

}