package HW2.locations.battlefields;

import HW2.Player;
import HW2.obstacles.Vampire;
import HW2.locations.BattleLoc;

public class Forest extends BattleLoc {

	public Forest(Player player) {
		super(player, "Orman", new Vampire(),"Firewood");
		
	}
	

}
