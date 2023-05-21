

public class Test01 {
    public static void main(String[] args) {
        double score = 69.9;
        if(score>100||score<1){
            System.out.println("你输入的成绩有误");
        } else if(90<=score&&score<=100){
            System.out.println("👍");
        }else if(80<=score&&score<=89){
            System.out.println("👌");
        }else if(70<=score&&score<=79){
            System.out.println("😅");
        }else if(60<=score&&score<=69){
            System.out.println("😑");
        }else{
            System.out.println("🤮");
        }
    }
}
