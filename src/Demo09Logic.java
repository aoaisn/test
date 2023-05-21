/*
 * 与（并且）&&     全都是true，才是true；否则是false   
 * 或（或者）||     只要有至少一个是true就是true，全都false，才是false。
 * 非（取反) !      本来是true，变成false
 * 
 * 
 * &&和||,具有短路效果如果根据左边已经可以判断得到最终结果，那么右边的代码将不再执行，从而节省一定的性能。
 * 注意事项：
 * 1，逻辑运算符只能用于boolean值
 * 2，&&和||需要左右都有boolean值！只要一个就行
 * 3，多个条件:条件A&&条件B&&条件C
 * 对于1<x<3写成如下
 * int x=2;
 * 1<x &&x<3;
 */
public class Demo09Logic {
    public static void main(String[] args) {
        System.out.println(true && false);//false
        // System.out.println(5<7 || 3<4);
        int a=10;
        // System.out.println(3>4 && ++a<100);//根据左边已经可以判断得到最终结果，那么右边的代码将不再执行
        System.out.println(a);//10
        int x=3;
        System.out.println(1<x&&x<100);
    }
}
