package decoratorPatten;

/**
 * 珍珠奶茶
 * @author bin.liu 2017年12月5日
 *
 */
public class PearlMilkTea extends BeverageDecorator{
	
	Beverage beverage;

	@Override
	public String getDescription() {
		return beverage.getDescription() + "加珍珠";
	}

	@Override
	public Double cost() {
		return beverage.cost()+10.0;
	}
	
	public PearlMilkTea(Beverage beverage) {
		this.beverage = beverage;
	}
	
}
