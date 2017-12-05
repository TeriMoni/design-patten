package decoratorPatten;

/**
 * 摩卡咖啡
 * @author bin.liu 2017年12月5日
 *
 */
public class MochaCoffee extends BeverageDecorator {
	
	Beverage beverage;

	@Override
	public Double cost() {
		
		return 16.0 + beverage.cost();
		
	}
	
	@Override
	public String getDescription() {
		
		return beverage.getDescription()+"加摩卡";
	}
	
	public MochaCoffee(Beverage beverage) {
		this.beverage = beverage;
	}

}
