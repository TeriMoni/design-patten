package decoratorPatten;

/**
 * 拿铁咖啡
 * @author bin.liu 2017年12月5日
 *
 */
public class LatteCoffee extends BeverageDecorator{
	
	//用于保存饮料的引用
	Beverage beverage;

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return beverage.getDescription() + "加拿铁";
	}

	@Override
	public Double cost() {
		// TODO Auto-generated method stub
		return 15.0 + beverage.cost() ;
	}
	
	public LatteCoffee(Beverage beverage) {
		this.beverage = beverage;
	}

}
