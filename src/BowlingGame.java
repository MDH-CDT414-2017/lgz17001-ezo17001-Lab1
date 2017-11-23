/**
 * 
 */

/**
 * @author Enrique and Laura
 *
 */
public class BowlingGame {
	private String resultsGame;
	
	//constructor
	public BowlingGame (String game) {
		resultsGame = game;
	}
	
	public int getScore() {
		String[] numbers = resultsGame.replaceAll("\\[", "").replaceAll("\\]", "").replaceAll("\\s", "").split(",");
		int[] results = new int[numbers.length];
		int totalResult = 0;
		
		for (int i=0; i < numbers.length; i++) {
			try {
				results[i] = Integer.parseInt(numbers[i]);
				int actualResult = results[i];
				totalResult += actualResult;
			} catch (NumberFormatException nfe) {
				return (-1);
			}	
		}
		return totalResult;
		
	}

}
