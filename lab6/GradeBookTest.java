/**
 * 
 */
package lab6;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Edward Gregg 20200223
 *
 */
public class GradeBookTest {
	
	GradeBook book1, book2;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		book1 = new GradeBook(5);
		book2 = new GradeBook(5);
		
		book1.addScore(10);
		book1.addScore(12);
		book1.addScore(30);
		book1.addScore(40);
		book1.addScore(50);
		
		book2.addScore(90);
		book2.addScore(80);
		book2.addScore(75);
		book2.addScore(90);
		book2.addScore(87);
		
		System.out.println(book2);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		book1 = book2 = null;
	}

	@Test
	public void testAddScore() {
		assertTrue(book1.toString().equals("10.0 12.0 30.0 40.0 50.0 "));
		assertTrue(book2.toString().equals("90.0 80.0 75.0 90.0 87.0 "));
	}
	
	@Test
	public void testSum() {
		assertEquals(142, book1.sum(), .0001);
		assertEquals(422, book2.sum(), .0001);
	}
	
	@Test
	public void testMinimum() {
		assertEquals(10, book1.minimum(), .0001);
		assertEquals(75, book2.minimum(), .0001);
	}
	
	@Test
	public void finalScore() {
		assertEquals(132.0, book1.finalScore(), .0001);
		assertEquals(347.0, book2.finalScore(), .0001);
	}

}
