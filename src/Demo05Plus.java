/*
 * 四则运算当中的+有常见的三种用法：
 * 1，对于数值来说，你就说加法。
 * 2，对于字符char类型来说，在计算前，char会被提升为int，然后进行计算
 char类型字符，和int类型字符，之间的对照关系表；ASCII、UNICODE
 *3，字符串String（首字母大写并不是关键字）来说，+代表字符串连接操作。
 */
public class Demo05Plus {
    public static void main(String[] args) {
        
        String str1 = "SUCK";
        System.out.println(str1 +         20);//SUCK20
        String str2 = "YOURSELF";
        System.out.println(str1+str2);
        //优先级问题
        System.out.println(str1 +20+30);//SUCK2030
        System.out.println(str1 +(20+30));//SUCK50

    }
}
