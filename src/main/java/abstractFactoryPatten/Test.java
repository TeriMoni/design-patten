package abstractFactoryPatten;

import decoratorPatten.Beverage;

/**
 * @Description: 测试类
 * @author: liubin
 * @create: 2017-12-08 14:48
 **/
public class Test {

    public static void main(String[] args) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        BeverageFactory beverageFactory = new HotDrinkFactory();
        Coffee hotCoffee = beverageFactory.createCoffeeDrink("拿铁咖啡");
        MilkTea hotMilkTea = beverageFactory.createMilkTeaDrink("慕斯奶茶");
        System.out.println("===========================");
        BeverageFactory iceDrinkFactory = new IceDrinkFactory();
        Coffee iceCoffee = iceDrinkFactory.createCoffeeDrink("卡布奇洛");
        MilkTea iceMilkTea = iceDrinkFactory.createMilkTeaDrink("红豆布丁奶茶");
        System.out.println("反射创建工厂类");
        SampleFactory sampleFactory = new SampleFactory();
        sampleFactory.setDrinkType("HotDrink");
        HotDrinkFactory hotDrinkFactory = sampleFactory.createHotDrinkFactory();
        hotDrinkFactory.createMilkTeaDrink("芒果奶茶");
        System.out.println("===========================");
        sampleFactory.setDrinkType("IceDrink");
        IceDrinkFactory iceDrinkFactory2 = sampleFactory.createIceDrinkFactory();
        iceDrinkFactory2.createCoffeeDrink("香浓咖啡");
    }
}
