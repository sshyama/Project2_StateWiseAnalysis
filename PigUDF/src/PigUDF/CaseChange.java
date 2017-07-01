package PigUDF;

import java.io.IOException;

import org.apache.pig.EvalFunc;
import org.apache.pig.data.Tuple;


public class CaseChange extends EvalFunc<String> {
	public String exec(Tuple input) throws IOException {
		try {
			
			int inSize = input.size();
			
			StringBuilder con = new StringBuilder("");
			
			for (int i=0 ; i< inSize ;i++)
			{
				Object val = (Object)input.get(i);
				con.append(val);
				
				
			}
			
			return con.toString();
			
			//String inputString = (String)input.get(0);
			//return inputString.toUpperCase();
			//return inputString.toUpperCase();
			/*
			if(inputString.toUpperCase().equals(inputString)) {
				return inputString;
			}
			else if(inputString.toLowerCase().equals(inputString)) {
				return inputString;
			}
			else
			{
				return inputString.toUpperCase();
			}
			*/
		}
		catch (Exception e) {
			throw new IOException(e);
		}
	}	
}
