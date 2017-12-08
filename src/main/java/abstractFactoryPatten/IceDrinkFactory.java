package abstractFactoryPatten;

/**
 * @Description: 热饮工厂类
 * @author: liubin
 * @create: 2017-12-08 14:46
 **/
public class IceDrinkFactory implements  BeverageFactory {

    public Coffee createCoffeeDrink(String name){
        return new IceCoffe(name);
    }

    public MilkTea createMilkTeaDrink(String name){
        return new IceMilkTea(name);
    }

}
