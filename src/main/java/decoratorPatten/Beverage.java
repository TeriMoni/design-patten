package decoratorPatten;

/**
 * 饮料抽象类
 * @author bin.liu 2017年12月5日
 *
 */
public abstract class Beverage {
	
	String description = "这是饮料";
	
	public String getDescription(){
		return description;
	}
	
	public abstract Double cost();
	
}
