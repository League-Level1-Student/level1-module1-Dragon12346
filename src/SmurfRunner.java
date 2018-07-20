

public class SmurfRunner {
public static void main(String[] args) {
	String girl = "";
	Smurf q = new Smurf("Handy");
	q.getName();
	q.eat();

	Smurf e = new Smurf("Papa");
	if (e.isGirl()) {
		girl = "girl";
	}
	else {
		girl = "boy";
	}
	System.out.println("My name is " + e.getName() + ". I have a " + e.getHatColor() + " hat and I am a " + girl + ".");
	
	Smurf w = new Smurf("Smurfette");
	if (w.isGirl()) {
		girl = "girl";
	}
	else {
		girl = "boy";
	}
	System.out.println("My name is " + w.getName() + ". I have a " + w.getHatColor() + " hat and I am a " + girl + ".");
	
	

}
}