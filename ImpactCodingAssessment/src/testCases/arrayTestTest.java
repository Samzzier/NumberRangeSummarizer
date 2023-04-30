package testCases;

import static org.junit.Assert.*;

import java.util.Collection;

import org.junit.Test;

import helperclasses.Helper;
import interfaceImplemetantions.NumberRangeSummarizerImplemetation;
import numberrangesummarizer.NumberRangeSummarizer;

public class arrayTestTest {

	@Test
	public void test() {
		 String input = "1,3,6,7,8,12,13,14,15,21,22,23,24,31";
		 NumberRangeSummarizer summarizerObject = new NumberRangeSummarizerImplemetation();
		 Collection<Integer> inputCollection = summarizerObject.collect(input);
		int[] expected = new int[] {1,3,6,7,8,12,13,14,15,21,22,23,24,31};
		int actualLength = Helper.toArrayMethod(inputCollection).length;
		int desiredLength = 14;
		
		 
		assertArrayEquals(expected, Helper.toArrayMethod(inputCollection));
		//Check length
		//this will fail if the array is empty or length above 14.
		assertEquals(desiredLength, actualLength);
		
	}

}
