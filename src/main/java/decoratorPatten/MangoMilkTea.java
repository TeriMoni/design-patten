package decoratorPatten;

/**
 * 芒果奶茶
 * @author bin.liu 2017年12月5日
 *
 */
public class MangoMilkTea extends BeverageDecorator {
	
	Beverage beverage;
	
	@Override
	public String getDescription() {
		return beverage.getDescription() + "加芒果";
	}

	@Override
	public Double cost() {
		return 11 + beverage.cost();
	}
	
	public MangoMilkTea(Beverage beverage) {
		this.beverage = beverage;
	}

}
