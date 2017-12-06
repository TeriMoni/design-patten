package observerPatten;

/**
 * @Description:
 * @author: liubin
 * @create: 2017-12-06 20:01
 **/
public class Test {
    public static void main(String[] args) {
        // 创建奶茶店对象
        MilkTeaShop milkTeaShop = new MilkTeaShop("斌斌奶茶店");
        // 创建订阅奶茶店信息的观察者对象
        CustomerA customerA = new CustomerA("小明");
        CustomerB customerB = new CustomerB("管理员");
        milkTeaShop.addObserver(customerA);
        milkTeaShop.addObserver(customerB);
        milkTeaShop.publishNewTea("红豆布丁奶茶");
        System.out.println("==============================");
        MilkTeaShopDrag milkTeaShopDrag = new MilkTeaShopDrag("思田奶茶店");
        CustomerC customerC = new CustomerC("小美");
        milkTeaShopDrag.addObserver(customerC);
        milkTeaShopDrag.publishNewTea("芒果奶茶");


    }
}
