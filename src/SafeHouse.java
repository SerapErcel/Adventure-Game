
public class SafeHouse extends NormalLoc{

	SafeHouse(Player player) {
		super(player, "Guvenli Ev");
	}
	public boolean getLocation() {
		player.setHealty(player.getrHealthy());
		System.out.println("Caniniz fullendi..");
		System.out.println("Guvenli Evdesiniz..");
		return true;
	}

}
