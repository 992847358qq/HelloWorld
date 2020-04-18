package designPattern.Decorator;

/**
 * @author GaoLiang.Wang
 * @dept 上海软件研发中心
 * @description 创建接口的实体类
 * @date 2019/3/26 17:00
 **/
public class Rice implements Food{
    @Override
    public void eat() {
        System.out.println("Food : rice");
    }
}
