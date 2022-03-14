package HW2;

import HW2.characters.Archer;
import HW2.characters.Character;
import HW2.characters.Knight;
import HW2.characters.Samurai;

import java.util.Scanner;

public class Player {
	private int damage;
	private int healthy;
	private int money;
	private int rHealthy;
	private String name;
	private String cName;
	private Inventory inv;
	Scanner scan = new Scanner(System.in);

	public Player(String name) {
		this.name = name;
		this.inv = new Inventory();
	}

	public void selectCha() {
		switch (chaMenu()) {
		case 1:
			initPlayer(new Samurai());
			break;
		case 2:
			initPlayer(new Archer());
			break;
		case 3:
			initPlayer(new Knight());
			break;
		default:
			initPlayer(new Samurai());
			break;
		}
		System.out.println("Karakter Olusturuldu ! Adı=" + getcName() + " ,Hasar=" + getDamage() + " ,Sağlık="
				+ this.getHealthy() + " ,Para=" + this.getMoney());
	}

	public int chaMenu() {
		System.out.println("Lütfen bir karakter seçiniz : ");
		System.out.println("1- Samuray \t Hasar : 5 \t Sağlık :21 \t Para :15");
		System.out.println("2- Okçu \t Hasar : 7 \t Sağlık :18 \t Para :20");
		System.out.println("3- Sovalye \t Hasar : 8 \t Sağlık :24 \t Para :5");
		System.out.print("Karater Seçiminiz : ");
		int chaID = scan.nextInt();

		while (chaID < 1 || chaID > 3) {
			System.out.print("Lütfen geçerli bir karakter seçiniz : ");
			chaID = scan.nextInt();
		}

		return chaID;
	}

	public int getTotalDamage() {
		return this.getDamage() + this.getInventory().getDamage();
	}

	public void initPlayer(Character character) {
		this.setcName(character.getName());
		this.setDamage(character.getDamage());
		this.setHealthy(character.getHealth());
		this.setMoney(character.getMoney());
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	public int getHealthy() {
		return healthy;
	}

	public void setHealthy(int healthy) {
		this.healthy = healthy;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public Inventory getInventory() {
		return inv;
	}

	public void setInventory(Inventory inv) {
		this.inv = inv;
	}

	public int getrHealthy() {
		return rHealthy;
	}

	public void setrHealthy(int rHealthy) {
		this.rHealthy = rHealthy;
	}

}
