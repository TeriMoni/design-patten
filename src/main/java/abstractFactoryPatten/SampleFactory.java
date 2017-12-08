package abstractFactoryPatten;

/**
 * @Description: 反射工厂类
 * @author: liubin
 * @create: 2017-12-08 16:38
 **/
public class SampleFactory {

    private String drinkType;

    public String getDrinkType() {
        return drinkType;
    }

    public void setDrinkType(String drinkType) {
        this.drinkType = drinkType;
    }

    public HotDrinkFactory createHotDrinkFactory() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        String className = "abstractFactoryPatten."+drinkType+"Factory";
        return (HotDrinkFactory)Class.forName(className).newInstance();
    }

    public IceDrinkFactory createIceDrinkFactory() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        String className = "abstractFactoryPatten."+drinkType+"Factory";
        return (IceDrinkFactory)Class.forName(className).newInstance();
    }
}
