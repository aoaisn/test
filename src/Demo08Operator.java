/*比较运算符：
        1，==左右数据相等为true
        2，<=
        3，>=
        4，<
        5，>
        6，?=左右数据不想等
        注意事项：
        1，比较运算符的结果一定是一个boolean值，成立就是true，不成立就是false
        2，如果进行多次判断不能连写。例如1<x<3这种不允许应该借用逻辑运算符
 * 
 */
public class Demo08Operator {
    public static void main(String[] args) {
        System.out.println(10>5);//true
        int num1 =10;
        int num2 =99;
        System.out.println(num1<num2);//true
        System.out.println(num2>=100);//false
        System.out.println(++num2>=100);//true
        // System.out.println(100 == 100);//true
        System.out.println(1010 != 100);//false


    }
}
