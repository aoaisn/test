/*
 * 定义一个方法的格式
 *  public static v System.out.println("播种");
        System.out.println("浇水");
        System.out.println("施肥");
        System.out.println("除虫");
        System.out.println("收割");
        System.out.println("卖给小商贩");oid 方法名称（）{
 *          方法体
 * }
 * 方法名称和变量命名规则与变量一样，小驼峰式
 * 方法体：也就是大括号当中可写任意条语句\\
 * 注意事项：
 * 1方法定义的先后顺序无所谓
 * 2方法定义不能产生嵌套包含关系
 * 3方法定义好了，不会执行。如果想要执行，一定要进行方法的调用。
 * 
 * 
 * 如何调用方法格式
 *  方法名称（）;
 */
public class Demo11Method {
    public static void main(String[] args) {
//调用chief的方法   
        cheif();
        farmer();
        customer();
        salesman();


    }
    public static void farmer(){
        System.out.println("播种");
        System.out.println("浇水");
        System.out.println("施肥");
        System.out.println("除虫");
        System.out.println("收割");
        System.out.println("卖给小商贩");
    }
    public static void salesman(){
        System.out.println("运输到农贸市场");
        System.out.println("抬高价格");
        System.out.println("吆喝");
    }
    public static void cheif(){
        System.out.println("卖给厨子");
        System.out.println("洗菜");
        System.out.println("切菜");
        System.out.println("炒菜");
        System.out.println("装盘");
    }
    public static void customer(){
        System.out.println("吃");
    }
}
