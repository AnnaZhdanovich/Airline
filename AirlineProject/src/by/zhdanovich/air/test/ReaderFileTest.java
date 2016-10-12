package by.zhdanovich.air.test;


import org.junit.Test;

import by.zhdanovich.air.parser.ReaderText;


public class ReaderFileTest {
	
	@Test( expected = RuntimeException.class ) 
	public void readTextTest() throws RuntimeException {
		ReaderText r = new ReaderText();
		r.readText("data/text.txt", "Utf-8");
	}

}
