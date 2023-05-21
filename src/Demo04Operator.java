/*
运算符：进行特定操作的符号。例如：+
表达式：用运算符连起来的式子叫做表达式。例如：2+1.也例如a+b
四则运算：
加：+
减：-
乘：*
除：/

首先计算得到表达式的结果，然后再打印输出这个结果。
被除数 / 除数 =商....余数
取余（取模）：%;只有对于整数的除法来说，取模运算符才有余数的意义。
注意事项：一旦运算当中有不同类型的数据，那么结果将会是数据类型范围大的那种例如int + double ---->double + double---->double
 */

public class Demo04Operator {
    public static void main(String[] args) {
        System.out.println(20+30);
        //变量间进行运算
        int A=20;
        int B=10;
        System.out.println(A-B);

        //变量和常量可以混合使用
        System.out.println(A*10);
        int x = 10;
        int y = 3 ;
        int result1 = x/y;
        System.out.println(result1);
        int result2 = x%y;
        System.out.println(result2);
        double result3 = x +2.5;
        System.out.println(result3);


    }
}
