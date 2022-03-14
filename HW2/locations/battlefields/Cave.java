package HW2.locations.battlefields;

import HW2.Player;
import HW2.obstacles.Zombie;
import HW2.locations.BattleLoc;

public class Cave extends BattleLoc {

	public Cave(Player player) {
		super(player, "Magara", new Zombie(),"Food");
	}

}
