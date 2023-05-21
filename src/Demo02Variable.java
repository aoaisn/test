/*变量：程序运行期间，内容可以发生改变的量。
 * 创建一个变量并且使用的格式；
 * 数据类型 变量名称；//创建了一个变量
 * 变量名称 = 数据值；//赋值，将右边的数据值，赋值给了左边的变量
 */
/*
 * 一步到位的格式：
 * 数据类型 变量名称 = 数据值；//在创建一个变量的同时，立刻放入一个指定值
 */


public class Demo02Variable {
    public static void main(String[] args){
        int num1;
        num1 = 10;
        System.out.println(num1);//打印输出变量名称时，输出的是变量内容
        //改变变量当中本来的数字，变成新的数字
        num1 = 20;
        System.out.println(num1);
        //使用一步到位的格式定义变量
        int num2 = 25;
        System.out.println(num2);
        num2 = 35 ;
        System.out.println(num2);
        System.out.println("======================");
        byte num3 = 30;//注意：右侧数值的范围不能超过左侧数据类型的取值范围
        System.out.println(num3);
        // byte num4 = 400;//400超出了byte的数据范围，错误！
        short num5 = 50;
        System.out.println(num5); 
        long num6 = 3000000000L;//long数据类型要在数据值后➕L
        System.out.println(num6);
        float num7 = 2.5F;//同上
        System.out.println(num7);
        double num8 = 1.2;
        System.out.println(num8);
        char zifu1='A';
        System.out.println(zifu1);
        char zifu2='中';
        System.out.println(zifu2);
        boolean var1 = true;
        System.out.println(var1);
        var1=false;
        System.out.println(var1);
        //将一个变量的数据内容，赋值给另一个变量
        //右侧的变量名称var1已经存在，里面装的是false值
        //将右侧变量里面的false值，向左交给var2变量进行存储；
        boolean var2=var1;
        System.out.println(var2);

    }
    
}
