
public class Spongebob {
	public static void main(String[] args) {
		String name = "Spongebob";
		String name2 = "Patrick";
		String name3 = "Squidward";
		SeaCreature id = new SeaCreature(name);
		SeaCreature idk = new SeaCreature(name2);
		SeaCreature ids = new SeaCreature(name3);

		id.getName();
		id.eat();
		id.laugh();
		ids.getName();
		ids.eat();
		ids.laugh();
		idk.getName();
		idk.eat();
		idk.laugh();
	}
}
