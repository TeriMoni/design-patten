package decoratorPatten;

/**
 * 奶茶类(被装饰对象)
 * @author bin.liu 2017年12月5日
 *
 */
public class MilkTea extends Beverage {

	@Override
	public Double cost() {
		return 18.0;
	}
	
	public MilkTea() {
		description = "这是奶茶";
	}
}
