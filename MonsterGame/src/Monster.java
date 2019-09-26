import java.util.Random;

public class Monster {
	private int strength;
	private String name;
	private int defense;
	private int health;
	String[] Size = { "Tiny", "Small", "Regular", "Large", "Massive" };
	String[] Creature = { "Rat", "Goblin", "Naga", "Dragon", "Demon" };
	private int nameIndex1;
	private int nameIndex2;

	public Monster() {
		this.name = getRandName();
		this.strength = setStrength();
		this.defense = setDefense();
		this.health = ((nameIndex2 + 1) * (this.defense + 1));
		if (strength < 0)
			strength = 0;
	}

	public int getDefense() {
		return this.defense;
	}

	public int getHealth() {
		return this.health;
	}

	private int setDefense() {
		int defense = nameIndex1 + 2;
		if (nameIndex2 == 0)
			defense += 0;
		else if (nameIndex2 == 1)
			defense -= 1;
		else if (nameIndex2 == 2)
			return defense;
		else if (nameIndex2 == 3)
			defense *= 2;
		else {
			defense *= 3;
		}
		return defense;
	}

	public int getStrength() {
		return this.strength;
	}

	private int setStrength() {
		int strength = nameIndex1 + 2;
		if (nameIndex2 == 0)
			strength += 0;
		else if (nameIndex2 == 1)
			strength -= 1;
		else if (nameIndex2 == 2)
			return strength;
		else if (nameIndex2 == 3)
			strength *= 2;
		else {
			strength *= 3;
		}

		return strength;
	}

	public String getName() {
		return this.name;
	}

	private String getRandName() {
		Random rand = new Random();
		nameIndex1 = rand.nextInt(5);
		nameIndex2 = rand.nextInt(5);

		String name = Size[nameIndex1] + " " + Creature[nameIndex2];
		return name;
	}

}
