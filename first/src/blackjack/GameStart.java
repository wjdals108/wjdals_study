package blackjack;

import java.util.Random;

public class GameStart {

	public static void main(String[] args) {
		int[] card = new int[52];
		makeCard(card);
		
		
	}




	public static void makeCard(int[] card) {
		
		Random random = new Random();
		
		for(int i=0; i<52; i++) {
			card[i] = random.nextInt(52+1);
			for(int j=0; j<i; j++) {
				if(card[i]==card[j]) {
					i--;
				}
			}
		}
	
	}
	
}