package com.qa.main;

public class Runner {

	public static void main(String[] args) {
		
		// while
		int catCount = 0;
		boolean notEnoughCats = false;
		
		while(notEnoughCats == true) {
			
			System.out.println("I don't have enough cats");
			catCount++;
			System.out.println(catCount);
			
			if (catCount == 10) {
				notEnoughCats = false;
				System.out.println("I now have too many cats, the bills are going to be insane!");
			}
			
		}
		
		// do-while
		int playCount = 0;
		boolean playing = true;
		
		do {
			
			if (playCount == 0) {
				playing = false;
			}
			
			playCount++;
			System.out.println(playCount);

			
		} while (playing == true);
		
		// for 
		for (int counter = 10; counter >= 0; counter--) {
			
			if (counter == 8) {
				continue;
			} else if (counter == 6) {
				break;
			} else {
				System.out.println(counter);
			}
			
		}

		
	}
	
}
