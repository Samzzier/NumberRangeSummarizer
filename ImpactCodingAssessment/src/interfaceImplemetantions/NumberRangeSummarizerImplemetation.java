package interfaceImplemetantions;

import java.util.*;
import numberrangesummarizer.NumberRangeSummarizer;
import helperclasses.Helper;

public class NumberRangeSummarizerImplemetation implements NumberRangeSummarizer{

	@Override
	public Collection<Integer> collect(String input) {
		
		//return reference
		Collection<Integer> collectionToReturn = new ArrayList<>();
		
		//split the string where there is a comma.
		String[] strs = input.split(",");
		
		// Create an integer array.
		int[] ints = new int[strs.length];
		for(int i = 0;i<ints.length;i++){
		    ints[i] = Integer.parseInt(strs[i]);
		}
		
		//Sort the array elements in an ascending order.
		Arrays.sort(ints);
		
		//Add the array elements to the Collection
		for(int i : ints) {
			collectionToReturn.add(i);
		}
		
		//Return a collection;
		return collectionToReturn;
	}

	@Override
	//Summarize the string implementation
	public String summarizeCollection(Collection<Integer> input) {	
		//Declare list to hold lists of integers
		List<List<Integer>> outerList = new ArrayList<>();
		
		//Declare list to hold integers
		List<Integer> innerList = new ArrayList<>();
		
		//Create an array from a collection
	    int[] arr = Helper.toArrayMethod(input);
	    
	    //Add elements of the array to the list of integers
	    innerList.add(arr[0]);
	    for(int i = 0; i < arr.length -1; i++) {
	    	if(arr[i+1] == arr[i]+1) {
	    		innerList.add(arr[i+1]);
	    	}else {
	    		outerList.add(innerList);
	    		innerList = new ArrayList<>();
	    		innerList.add(arr[i+1]); 
	    	}
	    	
	    }
	    
	    //Add the lists of integers to the list of lists
	    outerList.add(innerList);
		//return summarized string
		return Helper.toStringArray(outerList);
		
	}

   
}
