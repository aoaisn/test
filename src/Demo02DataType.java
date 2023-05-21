/*强制类型转换
    1特点，代码需要进行特殊的格式处理，不能自动完成。
    2格式，范围小的类型 范围小的变量名 =（范围小的类型）原本范围大的数据；

注意事项：
    1.强制类型转换，有可能发生精度缺失，数据溢出。
    2.byte/short/char这三种类型都可以发生数学运算，例如加法“+”
    3.byte/short/char这三种类型发生数学运算时，都会首先被提升成int类型，然后进行计算。
    4.boolean类型不能发生数据类型转换


*/
public class Demo02DataType {
    public static void main(String[] args) {
        // int num =100L;
        // System.out.println(num);
        // 不是从小到大不能发生自动类型转换；
        // 范围小的类型 范围小的变量名 =（范围小的类型）原本范围大的数据；==
        int num=(int)100L;
        System.out.println(num);


        //int num2 = (int) 600000000000L;//格式可转换，但逻辑出问题。int只能到21个亿
        //long型数据可以直接赋值给int型数据，但需要进行强制类型转换。如果long型数据的值超出了int型数据的范围，
        //那么在进行强制类型转换时会发生数据溢出，导致结果不准确。建议在进行类型转换时进行范围检查，以确保数据的准确性。
        int num3= (int) 2.9;


        System.out.println(num3);//所有的小数位都会被舍掉
        char zifu1 = 'A';
        // char zifu2 = 'B';
        System.out.println(zifu1 + 1);//+1后为66，也就是A被当作65进行处理了。
        //计算机的底层会用一个数字（二进制）来代表字符A，就是65.在计算机中，字符 "A" 的ASCII码值是65。
        //一旦char类型进行了数学运算，那么字符机会按照一定的规则翻译成一个数字
        byte num4 = 40;//右侧的数值大小不能超过左侧的类型范围-128 到 127
        byte num5 = 50;
        // byte result1 = num4 + num5 ;//byte类型数据运算时提升为int类型，变成int + int。
        //可把result1改成int类型    
        int result1 = num4 + num5;
        System.out.println(result1);
        // 虽然 num4 和 num5 是 byte 类型的变量但在运算时会被提升为 int 类型，然后结果会被强制转换回 byte 类型。
        // 将 int 类型的结果转换为 byte 类型。在这个过程中可能发生溢出，如果结果超出了 byte 类型的范围（-128 到 127），则会截断高位字节，只保留低位字节的值
        byte lizi =(byte) (num4 + num5); 
        System.out.println(lizi);
        short num6 = 60;
        int result2 = num4 + num6;//short类型+byte一样是提升为int；
        short lizi2 = (short)(num4 +num6);
        System.out.println(lizi2);
        System.out.println(result2);
    }
}
