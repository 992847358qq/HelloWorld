package designPattern.Decorator;

/**
 * @author GaoLiang.Wang
 * @dept 上海软件研发中心
 * @description 创建扩展了FoodDecorator类的实体装饰类
 * @date 2019/3/26 17:08
 **/
public class blackFoodDecorator extends FoodDecorator {
    public blackFoodDecorator(Food foodDecorator) {
        super(foodDecorator);
    }

    @Override
    public void eat(){
        eatBlackRice(foodDecorator);
    }
    private void eatBlackRice(Food foodDecorator){
        System.out.println("Rice color : black");
    }
}
