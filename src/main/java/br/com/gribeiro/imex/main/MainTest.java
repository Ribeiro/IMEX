package br.com.gribeiro.imex.main;

import java.util.Arrays;
import br.com.gribeiro.imex.chainTwo.handler.Handler;
import br.com.gribeiro.imex.chainTwo.handler.NodeHandler;
import br.com.gribeiro.imex.chainTwo.handler.StepHandlerOne;
import br.com.gribeiro.imex.chainTwo.handler.StepHandlerTwo;
import br.com.gribeiro.imex.process.ImportRequest;
import br.com.gribeiro.imex.process.Request;


public class MainTest {
	
	public static void main(String[] args) {
		Handler firstStepHandler = new StepHandlerOne(1, "stepOneHandler", "Handler for Step One");
		Handler secondStepHandler = new StepHandlerTwo(2, "stepTwoHandler", "Handler for Step Two");
		
		Handler firstNodeHandler = new NodeHandler(3, "firstNodeHandler", "Handler for Node One", Arrays.asList(firstStepHandler));
		Handler secondNodeHandler = new NodeHandler(4, "secondNodeHandler", "Handler for Node Two", Arrays.asList(secondStepHandler));
		
		firstNodeHandler.setSuccessor(secondNodeHandler);
		
		Request request = new ImportRequest();
		firstNodeHandler.handle(request);
		
	}

}