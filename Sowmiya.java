package javabasic;

public class Sowmiya {

	public static void main(String[] args) {
		Shop shop=new Shop();
		shop.addMoney(100);
		shop.addMoney(100);
		shop.addMoney(10);
		shop.addMoney(100);
		shop.addMoney(50);
		System.out.println(shop.getMoney());
	}

}
