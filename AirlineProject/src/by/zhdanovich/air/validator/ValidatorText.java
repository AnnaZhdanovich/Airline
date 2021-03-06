package by.zhdanovich.air.validator;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import by.zhdanovich.air.exception.WrongDataException;
import by.zhdanovich.air.type.TypePlane;

public class ValidatorText {	
private final String REGULAR_EXPRESSION= "[0-9]+";
private final int QUANTITY_DATA = 6;
private final int DEFAULT= 0;

public List<Integer> validation(String[] numbers) throws WrongDataException{
	Pattern p;
	Matcher m;
	List<Integer> list;
	if (numbers.length < QUANTITY_DATA){	
		  throw new WrongDataException("Not enough data");  
    }	   	
	list = new ArrayList<Integer>();
	TypePlane type;
	type = TypePlane.valueOf(numbers[0].toUpperCase());
	list.add(type.ordinal());				
	 for (int k = 1; k < QUANTITY_DATA; k++){  			 
	  p = Pattern.compile(REGULAR_EXPRESSION);
	  m = p.matcher(numbers[k]);		   
	 if(m.matches()) {
		 list.add(Integer.parseInt(numbers[k]));
	 }
	   else{ 
			 list.add(DEFAULT);
		 }
	}
	return list;
}
}
