/*
 * 赋值运算符：
 *      1,基本赋值运算符：就是一个=，代表将右侧的数据交个左侧的变量
 *      2，复合赋值运算符：
 *                  +=:      a+=1相当于 a=a+1将a本来的数据+1后交给本来的a
 *                  -=       a-=1相当于 a=a-1
 *                  *=       a*=1相当于 a=a*1
 *                  /=       a/=1相当于 a=a/1
 *                  %=       a%=1相当于 a=a%1
 * 注意事项：
 *      1，只有变量才能使用赋值运算符，常量不能进行赋值运算；
 *      2，复合赋值运算符其中隐含了一个强制类型转换。
 */
public class Demo07Operator {
    public static void main(String[] args) {
        int a=10;
         a += 5;
        System.out.println(a);//15
        int b=20;
        b%=6;
        System.out.println(b);//2，余数2
        byte num=30;
        num +=5;
        System.out.println(num);//num+=是num=num+5是一个byte+int，经过强制类型转换变成int+int。
        //num = （byte）int
        
    }
}
