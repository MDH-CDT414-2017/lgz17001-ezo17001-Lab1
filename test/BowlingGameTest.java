import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * 
 */

/**
 * @author Enrique and Laura
 *
 */
class BowlingGameTest {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	public void test1() {
		BowlingGame bowlingGame = new BowlingGame("");
		assertEquals(-1, bowlingGame.getScore());
	}
	
	@Test
	public void test2() {
		BowlingGame bowlingGame = new BowlingGame("[1,5][2,3]");
		assertEquals(11, bowlingGame.getScore());
	}
	@Test
	public void test3() {
		BowlingGame bowlingGame = new BowlingGame("[1,5][2,3][3,6]");
		assertEquals(20, bowlingGame.getScore());
	}
	@Test
	public void test4() {
		BowlingGame bowlingGame = new BowlingGame("[1,5][10,0][3,6]");
		assertEquals(34, bowlingGame.getScore());
	}
	@Test
	public void test5() {
		BowlingGame bowlingGame = new BowlingGame("[10,0][10,0][7,2]");
		assertEquals(55, bowlingGame.getScore());
	}
	@Test
	public void test6() {
		BowlingGame bowlingGame = new BowlingGame("[1,9][3,6]");
		assertEquals(22, bowlingGame.getScore());
	}
	@Test
	public void test7() {
		BowlingGame bowlingGame = new BowlingGame("[1,9][4,6][3,2]");
		assertEquals(32, bowlingGame.getScore());
	}
	


}
