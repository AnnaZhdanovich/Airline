package by.zhdanovich.air.parser;
import java.util.List;
import by.zhdanovich.air.exception.WrongDataException;
import by.zhdanovich.air.validator.ValidatorText;

public class ParserText {	
private final String DELIMETER= "\\s*;\\s*";
public List<Integer> parseText(String s) throws WrongDataException{		 
   String[] numbers = s.split(DELIMETER);	   
   ValidatorText validator = new ValidatorText();
   List<Integer> parametrs;	
   parametrs = validator.validation(numbers);	  
   return parametrs;
  }
	
}

