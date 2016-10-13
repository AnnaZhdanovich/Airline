package by.zhdanovich.air.test;

import org.junit.Test;

import by.zhdanovich.air.reader.ReaderText;

public class ReaderFileTest {	
@Test( expected = RuntimeException.class ) 
public void readTextTest() throws RuntimeException {
	ReaderText reader = new ReaderText();
	reader.readText("data/text.txt");
	}

}
