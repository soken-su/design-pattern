package 行为型模式.中介者模式;
public class Test {

    public static void main(String[] args) {
        Mediator med = new ConcreteMediator();
        //老板来了
        med.notice("boss");
        
        //客户来了
        med.notice("client");
    }
}
