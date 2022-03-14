package HW2.locations.places;

import HW2.Player;
import HW2.locations.places.NormalLoc;

public class SafeHouse extends NormalLoc {

	public SafeHouse(Player player) {
		super(player, "Güvenli Ev");
	}
	
	public boolean getLocation() {
		player.setHealthy(player.getrHealthy());
		System.out.println("iyileştiniz...");
		System.out.println("Şuan Güvenli Ev adlı yerdesiniz.");
		return true;
	}

}
