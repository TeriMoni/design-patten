package abstractFactoryPatten;

/**
 * @Description: 冷饮工厂类
 * @author: liubin
 * @create: 2017-12-08 14:38
 **/
public class HotDrinkFactory implements BeverageFactory {

    public Coffee createCoffeeDrink(String name){
        return new HotCoffee(name);
    }

    public MilkTea createMilkTeaDrink(String name){
        return new HotMikTea(name);
    }

}
