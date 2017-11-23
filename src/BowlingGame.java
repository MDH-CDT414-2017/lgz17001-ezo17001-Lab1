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
		String[] numbers = resultsGame.replaceAll("\\[", "").replaceAll("\\]", ",").replaceAll("\\s", "").split(",");
		int[] results = new int[numbers.length];
		int totalResult = 0;
		int frameStrike = -1;
		
		for (int i=0; i < numbers.length; i++) {
			try {
				results[i] = Integer.parseInt(numbers[i]);
				int actualResult = results[i];
				if(i%2==0) {		
					if(isStrike(actualResult)==true) {
						frameStrike = i;
					}else{	
					}
				}
					totalResult += actualResult;
				
			} catch (NumberFormatException nfe) {
				return (-1);
			}	
		}
		if(frameStrike > -1) {
			int strikeSum = results [frameStrike+2]+results[frameStrike+3];
			totalResult += strikeSum;
			return totalResult;
		}else {
			return totalResult;
		}
		
	}
	
	public boolean isStrike(int a) {
		if(a==10) {
			return true;
		}else {
			return false;
		}
	}

}
