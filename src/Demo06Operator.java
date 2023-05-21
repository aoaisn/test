/*
 * 自增运算符：++
 * 自减运算符：--
 * 含义：让一个变量涨一个数字1，或者让一个变量降一个1
 * 使用格式：写在变量名称之前或者之后：++num、num++
 * 使用方式：
 *  1,单独使用：不和其他操作混合，自己独立成为一个步骤
 *  2,混合使用：和其他操作混合，例如与赋值混合，或者与打印操作混合等
 * 使用区别：
 *  1，在单独使用的时候，前++和后++没有任何区别。++num；和num++；一样
 *  2,混合的时候，有【重大区别】
 *      A，如果是前++，那么变量立刻马上+1，然后拿着结果使用。【先加后用】
 *      B，如果是后++，那么首先使用变量本来的数值，然后再让变量+1.【先用后加】
 * 注意事项：
 *      只要变量才可以使用自增自减运算符，常量使用不发生改变，使用不能使用。
 */
public class Demo06Operator {
    public static void main(String[] args) {
        int num1 = 10;
        System.out.println(num1);
        ++num1;//单独使用，前++
        System.out.println(num1);//11
        num1++;
        System.out.println(num1);//12
        System.out.println("=========================");
        //与打印操作混合的时候
        int num2 = 20 ;
        //混合使用，先++，变量立刻变成21，然后打印21
        System.out.println(++num2);//21
        System.out.println(num2++);//21，首先使用变量的21，然后再让变量+1得到22
        System.out.println(num2);//22
        int num3=40;
        int result1 = --num3;//先变成39了然后进行赋值
        System.out.println(num3);//39
        System.out.println(result1);//39
        System.out.println(num3++);//39num3++打印不变，不过num3已经加1
        System.out.println(++num3);//41
        int num4=50;
        int result2=num4--;
        System.out.println(result2);//50
        System.out.println(num4++);//49
        System.out.println(++num4);//51
        //哎呀洒洒水啦//
        int x=10;int y=20;
        int result3=x++ + ++y;
        System.out.println(result3);//31
        System.out.println(x);//11
        System.out.println(x++);//11
        System.out.println(x);//12
        System.out.println(y);//21
        int result4=--x - --y;
        System.out.println(result4);//-10





    }
}
