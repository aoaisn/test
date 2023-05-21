/*
 * 当数据不一样时，会发生数据类型转换。
 * 自动类型转换（隐式） 
 *      1特点，代码不需要进行特殊处理，自动完成。
 *      2规则，数据范围从小到大。
 * 
 *      
 * 
 * 强制类型转换（显式）
 * 
 */
public class Demo01DataType {
    public static void main(String[] args) {
        System.out.println(1024);//整数，默认int类型
        System.out.println(3.14);//浮点数，默认为double类型
        //左边是long类型，右边是默认的int类型，左右不一样。
        //一个等号代表赋值，将右边的int常量，交给左边的long变量进行存储
        //int -->long,long的数据范围大
        //这一行代码发生了自动转换
        long num1 =100;
        System.out.println(num1);
        //左边double类型，右边float类型
        double num2=2.5F;
        System.out.println(num2);
        //float的数据范围更大一些所以符合从小到大的规则发生自动数据转换
        float num3=30L;
        System.out.println(num3);
    }
}
