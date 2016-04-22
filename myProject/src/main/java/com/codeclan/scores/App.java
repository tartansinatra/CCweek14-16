package com.codeclan.scores;

/**
 * Hello world!
 *
 */
public class App 
{
    public int findMax(int[] scores) {
		int maxScore = scores[0];
		for (int score : scores) {
			if (score > maxScore) {
				maxScore = score;
			}
		}	
    	return maxScore; 	
    }
    public static void main(String[] args) {
    	App a = new App();
    	int[] scores = {4,5,6,4,8,5,4,2,9,1};
    	int maxScore;
    	maxScore = a.findMax(scores);
    	System.out.println(maxScore);
    }
}
