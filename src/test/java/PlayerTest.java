package test.java;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import main.java.model.Player;

public class PlayerTest {
	
	Player sut;

	@Before
	public void setUp() throws Exception {
		sut = new Player();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void shouldReturnName() {
		sut.setName("Tester");
		assertEquals("Tester",sut.getName());
	}
	
	@Test
	public void shouldReturnCredits(){
		sut.setCredits(100);
		assertEquals(100, sut.getCredits());
	}
	
	@Test
	public void shouldReturnDefaultCredits(){
		int expected = 100;
		assertEquals(expected, sut.getCredits());
	}
	
	@Test
	public void shouldConstructWithName(){
		sut = new Player("Tester");
		assertEquals("Tester",sut.getName());
	}
	
	@Test 
	public void shouldConstructWithNameAndDefaultCredits(){
		sut = new Player("Tester");
		assertEquals("Tester",sut.getName());
		int expected = 100;
		assertEquals(expected, sut.getCredits());
	}

}
