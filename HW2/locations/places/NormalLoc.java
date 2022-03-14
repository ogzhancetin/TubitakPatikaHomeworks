package HW2.locations.places;

import HW2.Player;
import HW2.locations.Location;

public abstract class NormalLoc extends Location {

	public NormalLoc(Player player, String name) {
		super(player);
		this.name = name;
	}

	public boolean getLocation() {
		return true;
	}
}
