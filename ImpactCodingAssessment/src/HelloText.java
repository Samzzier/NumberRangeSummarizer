import java.util.*;
import interfaceImplemetantions.NumberRangeSummarizerImplemetation;
import numberrangesummarizer.NumberRangeSummarizer;
;
public class HelloText {
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		 String input = "1,3,6,7,8,12,13,14,15,21,22,23,24,31";
		 NumberRangeSummarizer summarizerObject = new NumberRangeSummarizerImplemetation();
		 Collection<Integer> inputCollection = summarizerObject.collect(input);
		 System.out.println(summarizerObject.summarizeCollection(inputCollection));
		 
	}	
    
}
