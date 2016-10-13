package by.zhdanovich.air.reader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ReaderText {
private static Logger log = LogManager.getLogger(ReaderText.class);	
	
public List<String> readText(String fileName){	
	List<String> list =new ArrayList<String>();
	String line;
	Scanner scanner = null;	
	try {
		scanner = new Scanner(new FileReader(fileName));
	    while (scanner.hasNext()) {
	      line = scanner.nextLine();
	      list.add(line);
	}		
	}catch (FileNotFoundException e) {	
	log.fatal("File was not found", e);
		 throw new RuntimeException();
	}finally {
		 if (scanner != null) {
		 scanner.close();} 
	 } 	
	return list;
	}
}	

