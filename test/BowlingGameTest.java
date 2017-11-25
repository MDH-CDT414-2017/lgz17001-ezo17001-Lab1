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
	public void testOpen() {
		BowlingGame bowlingGame = new BowlingGame("[1,5][3,6][7,2][3,6][4,4][5,3][3,3][4,5][8,1][2,6]");
		assertEquals(81, bowlingGame.getScore());
	}
	@Test
	public void testStrike() {
		BowlingGame bowlingGame = new BowlingGame("[10,0][3,6][7,2][3,6][4,4][5,3][3,3][4,5][8,1][2,6]");
		assertEquals(94, bowlingGame.getScore());
	}
	@Test
	public void testMultipleStrikes() {
		BowlingGame bowlingGame = new BowlingGame("[10,0][10,0][7,2][3,6][4,4][5,3][3,3][4,5][8,1][2,6]");
		assertEquals(112, bowlingGame.getScore());
	}
	@Test
	public void testSpare() {
		BowlingGame bowlingGame = new BowlingGame("[1,9][3,6][7,2][3,6][4,4][5,3][3,3][4,5][8,1][2,6]");
		assertEquals(88, bowlingGame.getScore());
	}
	@Test
	public void testMultipleSpares() {
		BowlingGame bowlingGame = new BowlingGame("[8,2][5,5][7,2][3,6][4,4][5,3][3,3][4,5][8,1][2,6]");
		assertEquals(98, bowlingGame.getScore());
	}
	@Test
	public void testStrikeSpare() {
		BowlingGame bowlingGame = new BowlingGame("[10,0][4,6][7,2][3,6][4,4][5,3][3,3][4,5][8,1][2,6]");
		assertEquals(103, bowlingGame.getScore());
	}
	@Test
	public void testLastSpare() {
		BowlingGame bowlingGame = new BowlingGame("[1,5][3,6][7,2][3,6][4,4][5,3][3,3][4,5][8,1][2,8][7]");
		assertEquals(90, bowlingGame.getScore());
	}
	@Test
	public void testLastStrike() {
		BowlingGame bowlingGame = new BowlingGame("[1,5][3,6][7,2][3,6][4,4][5,3][3,3][4,5][8,1][10,0][7,2]");
		assertEquals(92, bowlingGame.getScore());
	}
	@Test
	public void testPerfectGame() {
		BowlingGame bowlingGame = new BowlingGame("[10,0][10,0][10,0][10,0][10,0][10,0][10,0][10,0][10,0][10,0][10,10]");
		assertEquals(300, bowlingGame.getScore());
	}
	@Test
	public void testCheating() {
		BowlingGame bowlingGame = new BowlingGame("[10,0][10,0][10,0][10,0][10,0][10,0][10,0][10,0][10,0][9,0][7]");
		assertEquals(-1, bowlingGame.getScore());
	}
	@Test
	public void testCheating2() {
		BowlingGame bowlingGame = new BowlingGame("[10,0][10,0][10,0][10,0][10,0][10,0][10,0][10,0][10,0][9,0][7,2]");
		assertEquals(-1, bowlingGame.getScore());
	}
	@Test
	public void testUnfinishedGame() {
		BowlingGame bowlingGame = new BowlingGame("[10,0][10,0][10,0][10,0][10,0][10,0][10,0]");
		assertEquals(-1, bowlingGame.getScore());
	}
	@Test
	public void testTooManyFrames() {
		BowlingGame bowlingGame = new BowlingGame("[10,0][10,0][10,0][10,0][10,0][10,0][10,0][3,6][8,1][1,2][3,4][5,2]");
		assertEquals(-1, bowlingGame.getScore());
	}
	


}
