import java.util.Scanner;

public class Player {
	private int damage, healty, money, rHealthy;
	private String name, cName;
	private Inventory inv;
	Scanner scan=new Scanner(System.in);
	public Player(String name) {
		this.name=name;
		this.inv=new Inventory();
	}
	public void selectCha() {
		switch(charMenu()) {
		
		case 1:
			initPlayer("Samuray",5 ,21,15);
			
			break;
		case 2:
			initPlayer("Okcu",5 ,18,20);
			break;
		case 3:
			initPlayer("Sovalye",8 ,24,5);
			break;
		default:
			initPlayer("Samuray",5 ,21,15);
			break;
		}
		
		System.out.println("Karakter:"+getName()+", Hasar:"+getDamage()+", Saglik:"+getHealty()+", Para:"+getMoney());
	}
	public int charMenu() {
		System.out.println("Lutfen karakter seciniz:");
		System.out.println("1- Samuray \tHasar:5 \tSaglik:21 \tPara:15");
		System.out.println("2- Okcu \tHasar:7 \tSaglik:18 \tPara:20");
		System.out.println("3- Sovalye \tHasar:8 \tSaglik:24 \tPara:5");
		System.out.println("Karakter seciminiz:");
		int chaID=scan.nextInt();
		while(chaID<1||chaID>3) {
			System.out.print("Lutfen gecerli bir karakter giriniz.");
			chaID=scan.nextInt();
		}
		return chaID;
		
	}
	public int getTotalDamage() {
		return this.getDamage()+ this.getInv().getDamage();
	}
	public void initPlayer(String cName, int dmg, int hlthy, int mny) {
		setcName(cName);
		setDamage(dmg);
		setHealty(hlthy);
		setMoney(mny);
		setrHealthy(hlthy);
	}
	public int getDamage() {
		return damage;
	}
	public void setDamage(int damage) {
		this.damage = damage;
	}
	public int getHealty() {
		return healty;
	}
	public void setHealty(int healty) {
		this.healty = healty;
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
	public Inventory getInv() {
		return inv;
	}
	public void setInv(Inventory inv) {
		this.inv = inv;
	}
	public int getrHealthy() {
		return rHealthy;
	}
	public void setrHealthy(int rHealthy) {
		this.rHealthy = rHealthy;
	}
	

}
