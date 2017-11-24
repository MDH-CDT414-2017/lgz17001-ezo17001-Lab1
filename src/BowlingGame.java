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
		String[] numbers = resultsGame.replaceAll("\\[", "").replaceAll("\\]", ",").replaceAll("\\s", "").split(",");
		int[] results = new int[numbers.length];
		int totalResult = 0;
		int[] frameStrike = new int[numbers.length];
		int actualResult;
		
		for (int i=0; i < numbers.length; i++) {
			try {
				results[i] = Integer.parseInt(numbers[i]);
				actualResult = results[i];
				if(i%2==0) {		
					if(actualResult == 10) {
						frameStrike[i] = 1;
					}else{	
						frameStrike[i] = 0;
					}
				}
				totalResult += actualResult;
			} catch (NumberFormatException nfe) {
				return (-1);
			}	
		}
		
		int resultStrike = calculateStrike(frameStrike, results);
		totalResult+=resultStrike;
		return totalResult;
	}
	
	public int calculateStrike (int[] arrayStrikes, int[] arrayResults) {
		int resultStrike = 0;
		for(int i=0 ; i < arrayResults.length ; i++) {
			if(arrayStrikes[i] == 1) {
				if(arrayStrikes[i+2] == 1) {
					int strikeSum = (arrayResults[i+2] + arrayResults[i+4]);
					resultStrike += strikeSum;
				}else{	
					int strikeSum = (arrayResults[i+2] + arrayResults[i+3]);
					resultStrike += strikeSum;
				}
			}else{
				resultStrike += 0;
			}
		}
		return resultStrike;
	}
	
}
