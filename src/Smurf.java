/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 1
 */

/* 
 * 1. Watch this Smurf cartoon: https://www.youtube.com/watch?v=RqbpzEHuO2g
 * 2. In a Runner class, make a Handy Smurf. Use the methods below to make him eat, and print his name.
 * 3&4 see comments in code below
 * 5. Make a Papa Smurf and print his name, hat color and girl or boy.
 * 6. Make a Smurfette and print her name, hat color and girl or boy. 
 */

public class Smurf {

	private String name;
	private String hatColor;
	private boolean isGirl;
	
	Smurf(String name) {
		this.name = name;
		
		if (name.equals("Papa")) {
			hatColor = "Red";
		}
		else {
			hatColor = "White";
		}
		if (name.equals("Smurfette")) {
			isGirl = true;
		}
		else {
			isGirl = false;	
		}
	}

	public String getName() {
		return name + " Smurf";
	}

	public void eat() {
		System.out.println(name + " Smurf is eating Smurfberries.");
	}

	/* Papa Smurf wears a red hat, all the others are white. */
	public String getHatColor() {
		return hatColor;
		// 3. Fill in this method
	}

	/* Smurfette is the only female Smurf. */
	public boolean isGirl() {
		// 4. Fill in this method
		return isGirl;
		
	}

}



