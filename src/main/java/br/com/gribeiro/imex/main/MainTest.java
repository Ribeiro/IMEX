package br.com.gribeiro.imex.main;

import java.util.Arrays;
import br.com.gribeiro.imex.chainTwo.handler.Handler;
import br.com.gribeiro.imex.chainTwo.handler.StepHandler;
import br.com.gribeiro.imex.chainTwo.handler.SubStepHandlerOne;
import br.com.gribeiro.imex.chainTwo.handler.SubStepHandlerTwo;
import br.com.gribeiro.imex.process.ImportRequest;
import br.com.gribeiro.imex.process.Request;


public class MainTest {
	
	public static void main(String[] args) {
		Handler firstSubStepHandler = new SubStepHandlerOne(1, "stepOneHandler", "Handler for Step One");
		Handler secondSubStepHandler = new SubStepHandlerTwo(2, "stepTwoHandler", "Handler for Step Two");
		
		Handler firstStepHandler = new StepHandler(3, "firstNodeHandler", "Handler for Node One", Arrays.asList(firstSubStepHandler));
		Handler secondStepHandler = new StepHandler(4, "secondNodeHandler", "Handler for Node Two", Arrays.asList(secondSubStepHandler));
		
		firstStepHandler.setSuccessor(secondStepHandler);
		
		Request request = new ImportRequest();
		firstStepHandler.handle(request);
		
	}

}