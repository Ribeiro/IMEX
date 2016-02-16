package br.com.gribeiro.imex.main;

import java.util.Arrays;
import java.util.List;
import br.com.gribeiro.imex.chain.MacroHandler;
import br.com.gribeiro.imex.chain.MicroHandler;
import br.com.gribeiro.imex.chain.MicroHandlerA;
import br.com.gribeiro.imex.chain.MicroHandlerB;
import br.com.gribeiro.imex.chain.MicroHandlerC;
import br.com.gribeiro.imex.process.ImportRequest;
import br.com.gribeiro.imex.process.Request;

public class MainTest {
	
	public static void main(String[] args) {
		MacroHandler firstMacroHandler = new MacroHandler(1, "firstMacroHandler", Arrays.asList((MicroHandler)new MicroHandlerA()));
		MacroHandler secondMacroHandler = new MacroHandler(2, "secondMacroHandler",Arrays.asList((MicroHandler)new MicroHandlerB()));
		MacroHandler thirdMacroHandler = new MacroHandler(3, "thirdMacroHandler",Arrays.asList((MicroHandler)new MicroHandlerA() , (MicroHandler)new MicroHandlerC()));
		
		
		List<MacroHandler> macroHandlers = Arrays.asList(firstMacroHandler, secondMacroHandler, thirdMacroHandler);
		Request request = new ImportRequest();
		
		for (MacroHandler macroHandler : macroHandlers) {
			macroHandler.handle(request);
		}
		
	}

}
