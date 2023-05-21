/*
 * 使用变量的一些注意事项：
 *      1，如果创建多个变量，那么变量间的名称不可以重复。
 *      2，对于float和long类型来说，字母后缀F和L不要丢掉
 *      3，如果使用byte和short类型的变量，那么右侧的数据值不能超过左侧类型的范围
 *      4，变量一定要先赋值再使用
 *      5，变量使用不能超过作用域的范围。
 * 【作用域】：从定义变量的一行开始，一直到直接所属的大括号结束为止。例如System.out.println(num6);
 *                                                              int num6 = 20
 *                                                              以上代码会报错，顺序错误
 * 
 * 
 *                                                              {
 *                                                                  int num6=60;
 *                                                                  System.out.println(num6);
 *                                                                      }
 *                                                                  System.out.println(num6);此行代码出错超出大括号的范围，超出作用域，变量不可再用。可在括号外重新定义num6
 * 6，可以一个语句创建多个变量。例如 int a=10,b=20,c = 30;
 *
 *  
 */
public class Demo03VariableNotice {
    public static void main(String[] args) {
        int a=10,b=20,c = 30;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
