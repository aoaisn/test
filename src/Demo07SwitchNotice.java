/*
 * switch使用的注意事项：
 * 1多个case后面的数值不可重复//if else是基于条件表达式的布尔值进行条件分支。switch语句的条件表达式通常是一个整数类型
 * 2switch后面小括号里面只能是下面数据类型
 *                  基本数据类型：byte/short/char/int   
 *                  引用数据类型：String字符串、enmu枚举
 * 3switch语句格式可以灵活：前后顺序可以颠倒，而且break语句还可以省略。只case可以排序为32145对流程没影响
 * 满足匹配哪一个case就从哪一个位置向下执行，直到遇到了break或者整体结束。
 */
public class Demo07SwitchNotice {
    public static void main(String[] args) {
        int num =2;
        switch(num){
            case 3:
                System.out.println("你好");
                break;
            case 12:
                System.out.println("我好");
                break;
            case 2:
                System.out.println("他好"); 
                // break; 
            default:
            System.out.println("谁也不好");
                  
        }
        
    }
}
