package helperclasses;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Helper {

	 //Helper method to create a summarized string
	 public static String toStringArray(List<List<Integer>> listOflists) {
			
		 StringBuilder summarizedOutput = new StringBuilder();
		 for(List<Integer> list : listOflists) {
		
		 if(list.size() > 1) {
	     summarizedOutput.append(list.get(0)+"-"+list.get(list.size()-1));
						   
		 }else {
				summarizedOutput.append(list.get(0)); 
				  }	    
				 if(listOflists.indexOf(list)<listOflists.size()-1) {
					 
					 summarizedOutput.append(", ");
				 }
				  
			   }
		 
		     return  summarizedOutput.toString();
		   
		   
	   }
	 
	 //Helper method to convert the collection into an array.
	 public static int[] toArrayMethod(Collection<Integer> collect) {
	      int[] elements = new int[collect.size()];
		  Iterator<Integer> itr = collect.iterator(); int counter = 0;
		  while(itr.hasNext()) {
		  for(int i = counter; i < elements.length;) { 
		  elements[i] = itr.next();
		  break;
		  }
		  counter++;
		  }
		  
		  return elements;
		 
  }
}
