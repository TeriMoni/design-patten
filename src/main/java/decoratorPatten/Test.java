package decoratorPatten;

public class Test {

	public static void main(String[] args) {
		
		Beverage beverage = new Coffee();
		beverage = new MochaCoffee(beverage);
		System.out.println(beverage.getDescription() + " ￥ " +beverage.cost());
		beverage = new LatteCoffee(beverage);
		System.out.println(beverage.getDescription() + " ￥ " +beverage.cost());
		System.out.println("===============================");
		Beverage beverage1 = new MilkTea();
		beverage1 = new PearlMilkTea(beverage1);
		System.out.println(beverage1.getDescription() + " ￥ " +beverage1.cost());
		beverage1 = new MangoMilkTea(beverage1);
		System.out.println(beverage1.getDescription() + " ￥ " +beverage1.cost());
	}
}
