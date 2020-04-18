package regex;

/**
 * @author GaoLiang.Wang
 * @dept 上海软件研发中心
 * @description TODO
 * @date 2019/3/7 22:00
 **/
public class Practice1 {
    public static void main(String[] args) {
       // practiceTest();
        practiceTest1();
    }

    /**
     * 对邮件地址进行校验
     */
    private static void practiceTest1() {
        String email = "992847358@qq.com";
        String regex="\\w+@\\w+(\\.+\\w+)+";
        boolean b = email.matches(regex);
        System.out.println(email+":"+b);
    }

    /**
     * 治疗口吃：我...我我我我....要要...要要....吃吃苹...果
     */
    private static void practiceTest() {
        String str = "我...我我我我....要要...要要....吃吃苹...果";
        //先把.去掉
        str = str.replaceAll("\\.+","");
        System.out.println(str);
        //去掉叠词
        str=str.replaceAll("(.)\\1+","$1");
        System.out.println(str);
    }


}
