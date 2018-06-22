/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 1
 */

// Create a HarryRunner class with a main method that:
// 1. makes harry potter become invisible
// 2. makes harry potter spy on Professor Snape
// 3. makes harry potter become visible again
// 4. makes harry potter cast a “stupefy” spell

public class HarryPotter {

	private boolean cloakOn = true;

	HarryPotter() {
		System.out.println("making Harry Potter...");
	}

	void castSpell(String spell) {
		System.out.println("casting spell: " + spell);
	}

	void makeInvisible(boolean invisible) {
		this.cloakOn = invisible;

		if (cloakOn)
			System.out.println("Harry is invisible");
		else
			System.out.println("Harry is visible");
	}

	void spyOnSnape() {
		System.out.println("Harry sees Professor Snape doing nefarious things.");
	}

}
