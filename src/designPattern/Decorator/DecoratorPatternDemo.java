package designPattern.Decorator;

/**
 * @author GaoLiang.Wang
 * @dept 上海软件研发中心
 * @description 使用blackFoodDecorator来装饰food对象
 * @date 2019/3/26 17:21
 **/
public class DecoratorPatternDemo {
    public static void main(String[] args) {
      Rice rice = new Rice();
      Food blackRice = new blackFoodDecorator(new Rice());
      rice.eat();
      blackRice.eat();
    }
}
