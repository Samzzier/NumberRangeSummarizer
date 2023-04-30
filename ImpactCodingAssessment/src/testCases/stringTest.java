package testCases;
import java.util.*;
import static org.junit.Assert.*;
import org.junit.Test;

import helperclasses.Helper;

public class stringTest {
	
	
   
	@Test
	public void test() {
		List<List<Integer>> outerList = new ArrayList<>();
		
		List<Integer> list1 = new ArrayList<>();
		list1.add(1);
		List<Integer> list2 = new ArrayList<>();
		list2.add(3);
		List<Integer> list3 = new ArrayList<>();
		list3.add(6);
		list3.add(7);
		list3.add(8);
		List<Integer> list4 = new ArrayList<>();
		list4.add(12);
		list4.add(13);
		list4.add(14);
		list4.add(15);
		List<Integer> list5 = new ArrayList<>();
		list5.add(21);
		list5.add(22);
		list5.add(23);
		list5.add(24);
		List<Integer> list6 = new ArrayList<>();
		list6.add(31);
		outerList.add(list1);
		outerList.add(list2);
		outerList.add(list3);
		outerList.add(list4);
		outerList.add(list5);
		outerList.add(list6);
		
		String expected = "1, 3, 6-8, 12-15, 21-24, 31";
		String actual = Helper.toStringArray(outerList);
		actual.contains("6-8");
		actual.contains("12-15");
		actual.contains("21-24");
		actual.contains(",");
		assertEquals(expected, actual);
		
		
	}

}
