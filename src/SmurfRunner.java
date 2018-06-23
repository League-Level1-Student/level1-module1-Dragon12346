

public class SmurfRunner {
public static void main(String[] args) {
	Smurf q = new Smurf("Handy");
	q.getName();
	q.eat();

	Smurf w = new Smurf("Smurfette");
	System.out.println(w.getName() + w.getHatColor() + w.isGirlOrBoy());
	
	
	Smurf e = new Smurf("Papa");
	e.getName();
	e.getHatColor();
	e.isGirlOrBoy();
}
}