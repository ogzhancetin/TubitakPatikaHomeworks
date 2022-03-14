package HW2.locations.battlefields;

import HW2.Player;
import HW2.locations.BattleLoc;
import HW2.obstacles.Snake;

public class Mine extends BattleLoc {
    public Mine(Player player) {
        super(player, "Maden", new Snake(), "Treasure");
    }
}