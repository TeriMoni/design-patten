package decoratorPatten;

/**
 * 咖啡类(被装饰对象)
 * @author bin.liu 2017年12月5日
 *
 */
public class Coffee extends Beverage{

	@Override
	public Double cost() {
		return 15.0;
	}
	
	public Coffee() {
		description = "这是咖啡";
	}

}
