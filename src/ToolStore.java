
public class ToolStore extends NormalLoc{

	ToolStore(Player player) {
		super(player, "Maðaza");

	}

	public boolean getLocation() {
		System.out.println("Para: "+player.getMoney());
		System.out.println("1. Sliahlar");
		System.out.println("2. Zirhlar");
		System.out.println("3. Cikis");
		System.out.println("Seciminiz: ");
		int selTool=scan.nextInt();
		int selItemID;
		switch(selTool) {
		case 1:
			selItemID=weaponMenu();
			buyWeapon(selItemID);

			break;
		case 2: 
			selItemID=armorMenu();
			buyArmor(selItemID);
			break;
		default:
			break;
		}
		return true;

	}
	public int armorMenu() {
		System.out.println("1. Hafif\n <Para:15 - HAsar:1>");
		System.out.println("2. Orta\n <Para:25 - HAsar:3>");
		System.out.println("3. Agir\n <Para:40 - HAsar:5>");
		System.out.println("4. Cikis");
		System.out.println("Zirh seciniz: ");
		int selArmorID=scan.nextInt();
		return selArmorID;
		
	}
	public void buyArmor(int itemID) {
		int avoid=0,price=0;
		String aName=null;
		switch(itemID) {
		case 1:
			avoid=1;
			aName="Hafif Zirh";
			price=15;
			break;
		case 2:
			avoid=3;
			aName="Orta Zirh";
			price=25;
			break;
		case 3:
			avoid=5;
			aName="Agir Zirh";
			price=40;
			break;
		case 4:
			System.out.println("Cikis yapiliyor.");
			break;
		default:
			System.out.println("Gecersiz islem!");
			break;
		}
		if(price>=0) {
			if(player.getMoney()>price) {
				player.getInv().setArmor(avoid);
				player.getInv().setaName(aName);
				player.setMoney(player.getMoney()-price);
				System.out.println(aName+" satin aldiniz, engellenen hasar:"+player.getInv().getArmor());
						
				System.out.println("Kalan para:"+player.getMoney());
			}
			else {
				System.out.println("Para yetersiz!");
			}
		}
		
	}
	public int weaponMenu() {
		System.out.println("1. Tabanca\n <Para:25 - HAsar:2>");
		System.out.println("2. Kilic\n <Para:35 - HAsar:3>");
		System.out.println("3. Tufek\n <Para:45 - HAsar:7>");
		System.out.println("4. Cikis");
		System.out.println("Silah seciniz: ");
		int selWeaponID=scan.nextInt();
		return selWeaponID;

	}
	public void buyWeapon(int itemID) {
		int damage=0,price=0;
		String wName=null;
		switch(itemID) {
		case 1:
			damage=2;
			wName="Tabanca";
			price=25;
			break;
		case 2:
			damage=3;
			wName="Kiliç";
			price=35;
			break;
		case 3:
			damage=7;
			wName="Tufek";
			price=25;
			break;
		case 4:
			System.out.println("Cikis yapiliyor.");
			break;
		default:
			System.out.println("Gecersiz islem!");
			break;
		}
		if(price>=0) {
			if(player.getMoney()>price) {
				player.getInv().setDamage(damage);
				player.getInv().setwName(wName);
				player.setMoney(player.getMoney()-price);
				System.out.println(wName+" satin aldiniz, onceki hasar:"+player.getDamage()+
						" simdiki hasar:"+ (player.getTotalDamage()));
				System.out.println("Kalan para:"+player.getMoney());
			}
			else {
				System.out.println("Para yetersiz!");
			}
		}
	}







}






