package br.com.gribeiro.imex.main;

import java.util.Arrays;
import java.util.List;

import br.com.gribeiro.imex.chain.ImportMacroHandlerOne;
import br.com.gribeiro.imex.chain.ImportMacroHandlerThree;
import br.com.gribeiro.imex.chain.ImportMacroHandlerTwo;
import br.com.gribeiro.imex.chain.MacroHandler;
import br.com.gribeiro.imex.chain.MicroHandler;
import br.com.gribeiro.imex.chain.MicroHandlerA;
import br.com.gribeiro.imex.chain.MicroHandlerB;
import br.com.gribeiro.imex.chain.MicroHandlerC;
import br.com.gribeiro.imex.process.ImportRequest;
import br.com.gribeiro.imex.process.Request;

public class MainTest {
	
	public static void main(String[] args) {
		MacroHandler firstMacroHandler = new ImportMacroHandlerOne(Arrays.asList((MicroHandler)new MicroHandlerA()));
		MacroHandler secondMacroHandler = new ImportMacroHandlerTwo(Arrays.asList((MicroHandler)new MicroHandlerB()));
		MacroHandler thirdMacroHandler = new ImportMacroHandlerThree(Arrays.asList((MicroHandler)new MicroHandlerA() , (MicroHandler)new MicroHandlerC()));
		
		
		List<MacroHandler> macroHandlers = Arrays.asList(firstMacroHandler, secondMacroHandler, thirdMacroHandler);
		Request request = new ImportRequest();
		
		for (MacroHandler macroHandler : macroHandlers) {
			macroHandler.handle(request);
		}
		
	}

}
