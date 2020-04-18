package designPattern.Decorator;

/**
 * @author GaoLiang.Wang
 * @dept 上海软件研发中心
 * @description 创建实现了接口的抽象装饰类
 * @date 2019/3/26 17:02
 **/
public abstract class FoodDecorator implements Food{
    public Food foodDecorator;
    public FoodDecorator(Food foodDecorator){
        this.foodDecorator = foodDecorator;
    }
    public void eat(){
        foodDecorator.eat();
    }
}
