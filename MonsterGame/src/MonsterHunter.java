import java.util.Scanner;

public class MonsterHunter {
	public static Monster[] monsterParty;
	public static int playerHealth;
	public static Scanner input;


	public static void main(String[] args) {
		monsterParty = new Monster[1];

		for (int i = 0; i < monsterParty.length; i++) {
			playerHealth = 20;
			input = new Scanner(System.in);
			monsterParty[i] = new Monster();
			System.out.printf("%25s%n%n", "YOU ARE FIGHTING");
			System.out.printf("Monster Name:%22s%n%n", monsterParty[i].getName());
			System.out.printf("Monster Defense:%19s%n", monsterParty[i].getDefense());
			System.out.printf("Monster Strength:%18s%n", monsterParty[i].getStrength());
			System.out.printf("Monster Health:%20s%n", monsterParty[i].getHealth());
			System.out.println();
		}
		do {
		int choice = Prompt();
		switch (choice) {
		case 1:
			fight();
		case 2:
			heal();
		case 3:
			defend();
		}
		} while(!(playerHealth==0)||!(monsterParty[0].getHealth()==0));

	}

	private static void defend() {
		// TODO Auto-generated method stub
		
	}

	private static void heal() {
		// TODO Auto-generated method stub
		
	}

	private static void fight() {
		// TODO Auto-generated method stub
		
	}

	private static int Prompt() {

		System.out.printf("%30s%n%n", "What do you choose to do?");
		System.out.printf("%20s%n", "1 - FIGHT");
		System.out.printf("%19s%n", "2 - HEAL");
		System.out.printf("%21s%n", "3 - DEFEND");
		System.out.printf("%21s%n", "Make your choice:");
		int choice = input.nextInt();

		return choice;
	}

}
