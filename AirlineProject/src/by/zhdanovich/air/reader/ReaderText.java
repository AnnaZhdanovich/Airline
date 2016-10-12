package by.zhdanovich.air.reader;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ReaderText {
	private static Logger log = LogManager.getLogger(ReaderText.class);	
	
public List<String> readText(String fileName){	
	List<String> list = null;
	try {
		 list = Files.readAllLines(Paths.get(fileName), StandardCharsets.UTF_8);	
	  	
	}catch (FileNotFoundException e) {	
		   log.fatal("file was not found", e); 	
		   throw new RuntimeException();
	} catch (IOException e) {	
		   log.error("IOException:", e); 
	}	
	return list;
	}
}	

