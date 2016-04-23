package 创建型模式.单态模式;
public class Test {
    
    public static void main(String[] args) {
        Singleton sing = Singleton.getInstance();
        Singleton sing2 = Singleton.getInstance2();
       
        
        System.out.println(sing.getI());
        System.out.println(sing2.getI());
    }
}
