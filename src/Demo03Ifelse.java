public class Demo03Ifelse {
    public static void main(String[] args) {
        int num =13;
        if(num%2 ==0){//如果除以2能够余数为0，说明是偶数
            System.out.println("偶数");
        }else{
            System.out.println("奇数");
        }
        //多if else判断yuju
        if(num>100){
            System.out.println("1");

        }else if(num>1001){
            System.out.println("2");

        }else if(num>1000){
            System.out.println("3");

        }else{
            System.out.println("4");//以上条件都不满足  则输出else内语句

        }
        int x=-1;
        int y;
        if(x>=3){
            y=2*x+1;
        }else if(-1<x&&x<3){
            y =2*x;
        }else{          //x<=-1
            y=2*x-1;
        }
        System.out.println("结果是："+y);
    }
}
