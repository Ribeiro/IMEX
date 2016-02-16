package br.com.gribeiro.imex.chain;


public abstract class MicroHandler extends AbstractHandler {

	private Integer id;
	private String name;

	public MicroHandler(Integer id, String name){
		this.id = id;
		this.name = name;
	}
	
	public Integer getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}

}