/*
 * 数字和字符的对照关系表（编码表）
 * ASCII码表：American Standard Code for Information Interchange，美国信息交换标准代码。
 * Unicode码表：万国码。也是数字和符号的对照关系，开头0-127部分和ASCII完全一样，但是从128开始包含有更多的字符
 * 48——‘0’
 * 65——‘A'
 * 96——’a‘
 */



public class Demo03DataTypeChar {
    public static void main(String[] args) {
        char zifu1 = '1';//字符1不是数字1
        System.out.println(zifu1+0);//49.0的ASCII的值时48所以结果为49.
        // char zifu2 = 'A';
        char zifu3 = 'c';
        int num = zifu3;//范围来说是从小到大
        System.out.println(num);
        char zifu4 = '中';
        System.out.println(zifu4+0);//20013
    }
}
