package com.in28minutes.junit.helper;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class StringHelperTestComplete {

	StringHelper helper;

	@Before
	public void before(){
		helper = new StringHelper();
	}

	// AACD => CD ACD => CD CDEF=>CDEF CDAA => CDAA

	@Test
	public void testTruncateAInFirst2Positions_AinFirst2Positions() {
		assertEquals("CD", helper.truncateAInFirst2Positions("AACD"));
	}

	@Test
	public void testTruncateAInFirst2Positions_AinFirstPosition() {
		assertEquals("CD", helper.truncateAInFirst2Positions("ACD"));
	}

	@Test
	public void testTruncateAInFirst2Positions_NothingChanged() {
		assertEquals("CDEF", helper.truncateAInFirst2Positions("CDEF"));
	}

	@Test
	public void testTruncateAInFirst2Positions_AInLastTwoPositions() {
		assertEquals("CDAA", helper.truncateAInFirst2Positions("CDAA"));
	}

	// ABCD => false, ABAB => true, AB => true, A => false
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_BasicNegativeScenario() {
		assertFalse( 
				helper.areFirstAndLastTwoCharactersTheSame("ABCD"));
	}

	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_BasicPositiveScenario() {
		assertTrue( 
				helper.areFirstAndLastTwoCharactersTheSame("ABAB"));
	}

	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_TwoCharacterPositive() {
		assertTrue( 
				helper.areFirstAndLastTwoCharactersTheSame("AB"));
	}

	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_OneCharacterNegative() {
		assertFalse( 
				helper.areFirstAndLastTwoCharactersTheSame("A"));
	}


}
