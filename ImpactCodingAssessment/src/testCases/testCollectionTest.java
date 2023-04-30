package testCases;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsCollectionContaining.hasItem;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.Test;

import interfaceImplemetantions.NumberRangeSummarizerImplemetation;
import numberrangesummarizer.NumberRangeSummarizer;

import java.util.*;
public class testCollectionTest {

	@Test
	public void test() {
		String input = "1,3,6,7,8,12,13,14,15,21,22,23,24,31";
		 NumberRangeSummarizer summarizerObject = new NumberRangeSummarizerImplemetation();
		 Collection<Integer> expected = summarizerObject.collect(input);
		 assertThat(expected.size(), is(14));
		 assertThat(expected, hasItem(1));
		 assertThat(expected, hasItem(3));
		 assertThat(expected, hasItem(6));
		 assertThat(expected, hasItem(7));
		 assertThat(expected, hasItem(8));
		 assertThat(expected, hasItem(12));
		 assertThat(expected, hasItem(13));
		 assertThat(expected, hasItem(14));
		 assertThat(expected, hasItem(15));
		 assertThat(expected, hasItem(21));
		 assertThat(expected, hasItem(22));
		 assertThat(expected, hasItem(23));
		 assertThat(expected, hasItem(24));
		 assertThat(expected, hasItem(31));
		 
	     
		 
	}

}
