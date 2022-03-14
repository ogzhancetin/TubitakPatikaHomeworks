package HW2;

import HW2.locations.Location;
import HW2.locations.battlefields.Cave;
import HW2.locations.battlefields.Forest;
import HW2.locations.battlefields.Mine;
import HW2.locations.battlefields.River;
import HW2.locations.places.SafeHouse;
import HW2.locations.places.ToolStore;

import java.util.Scanner;

public class Game {
	Player player;
	Location location;
	Scanner scan = new Scanner(System.in);

	public void login() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Macera Oyununa Hoşgeldiniz !");
		System.out.println("Oyuna başlamadan önce isminizi giriniz : ");
		String playerName = scan.nextLine();
		player = new Player(playerName);
		player.selectCha();
		start();
	}

	public void start() {
		while (true) {
			System.out.println();
			System.out.println("=================================================");
			System.out.println();
			System.out.println("Eylem gerçekleştirmek için bir yer seçiniz : ");
			System.out.println("1. Güvenli Ev --> Size ait g�venli bir mekan, düşman yok !");
			System.out.println("2. Mağara --> Karşınoza belki zombi çıkabilir !");
			System.out.println("3. Orman --> Karşınoza belki zombi çıkabilir !");
			System.out.println("4. Nehir --> Karşınoza belki ayı çıkabilir !");
			System.out.println("5. Maden --> Silah, Zırh veya rastgele para alabilirsiniz!");
			System.out.println("6. Mağaza --> Silah veya Zırrh alabilirsiniz!");
			System.out.print("Gitmek istediğiniz yer : ");
			int selLoc = scan.nextInt();
			while (selLoc < 0 || selLoc > 6) {
				System.out.print("Lütfen geçerli bir yer seçiniz : ");
				selLoc = scan.nextInt();
			}

			switch (selLoc) {
			case 1:
				location = new SafeHouse(player);
				break;
			case 2:
				location = new Cave(player);
				break;
			case 3:
				location = new Forest(player);
				break;
			case 4:
				location = new River(player);
				break;
			case 5:
				location = new Mine(player);
				break;
			case 6:
				location = new ToolStore(player);
				break;
			default:
				location = new SafeHouse(player);
			}

			if (location.getClass().getName().equals("SafeHouse")) {
				if (player.getInventory().isFirewood() && player.getInventory().isFood() && player.getInventory().isWater()) {
					System.out.println("Tebrikler Oyunu Kazandınız !");
					break;
				}
			}
			if (!location.getLocation()) {
				System.out.println("Oyun Bitti !");
				break;
			}

		}
	}
}
