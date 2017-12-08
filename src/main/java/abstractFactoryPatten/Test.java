package abstractFactoryPatten;

import decoratorPatten.Beverage;

/**
 * @Description: 测试类
 * @author: liubin
 * @create: 2017-12-08 14:48
 **/
public class Test {

    public static void main(String[] args) {
        HotDrinkFactory beverageFactory = new HotDrinkFactory();
        Coffee hotCoffee = beverageFactory.createCoffeeDrink("拿铁咖啡");
        MilkTea hotMilkTea = beverageFactory.createMilkTeaDrink("慕斯奶茶");
        System.out.println("===========================");
        IceDrinkFactory iceDrinkFactory = new IceDrinkFactory();
        Coffee iceCoffee = iceDrinkFactory.createCoffeeDrink("卡布奇洛");
        MilkTea iceMilkTea = iceDrinkFactory.createMilkTeaDrink("红豆布丁奶茶");
    }
}
