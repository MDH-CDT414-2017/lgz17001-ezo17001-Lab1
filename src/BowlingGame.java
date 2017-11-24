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
	//method getScore
	public int getScore() {
		String[] numbers = resultsGame.replaceAll("\\[", "").replaceAll("\\]", ",").replaceAll("\\s", "").split(",");
		int[] results = new int[numbers.length];
		int totalResult = 0;
		int actualResult;
		
		for (int i=0; i < numbers.length; i++) {
			try {
				results[i] = Integer.parseInt(numbers[i]);
				actualResult = results[i];
				totalResult += actualResult;
			} catch (NumberFormatException nfe) {
				return (-1);
			}	
		}
		
		int bonus = calculateBonus(results);
		totalResult+=bonus;
		return totalResult;
	}
	
	public int calculateBonus (int[] arrayResults) {
		int resultBonus = 0;
		int bonusSum;
		for(int i=0 ; i < arrayResults.length ; i++) {
			if(i%2==0) {
				if(arrayResults[i] == 10) {
					if(arrayResults[i+2] == 10) {
						bonusSum = (arrayResults[i+2] + arrayResults[i+4]);
						resultBonus += bonusSum;
					}else{	
						bonusSum = (arrayResults[i+2] + arrayResults[i+3]);
						resultBonus += bonusSum;
					}
				}else if ((arrayResults[i]+arrayResults[i+1]) == 10){
					bonusSum = arrayResults[i+2];
					resultBonus += bonusSum;
				}	
			}else {
				resultBonus += 0;
			}
		}
		return resultBonus;
	}
	
}
