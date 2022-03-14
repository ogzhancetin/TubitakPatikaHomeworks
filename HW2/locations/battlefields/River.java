package HW2.locations.battlefields;

import HW2.obstacles.Bear;
import HW2.Player;
import HW2.locations.BattleLoc;

public class River extends BattleLoc {

	public River(Player player) {
		super(player, "River", new Bear(),"Water");
	}

}
