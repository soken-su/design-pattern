package 结构型模式.装饰模式;
public class ManDecoratorB extends Decorator {
    
    public void eat() {
        super.eat();
        System.out.println("===============");
        System.out.println("ManDecoratorB类");
    }
}
