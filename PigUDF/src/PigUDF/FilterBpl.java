package PigUDF;

import java.io.IOException;
import org.apache.pig.FilterFunc;
import org.apache.pig.data.Tuple;


public class FilterBpl extends FilterFunc {
	
	
	public Boolean exec(Tuple input) throws IOException {
		try {
			
							
				int objective = Integer.parseInt((String) input.get(2));
				int achieve = Integer.parseInt((String)input.get(3));
				
				int percent= 0;
				
				percent = (100 * achieve )/ objective ;
				
				if (percent >= 80)
				{
					return true ;
				}
				
				return false ;		
			
		}
		catch (Exception e) {
			throw new IOException(e);
		}
	}	
}
