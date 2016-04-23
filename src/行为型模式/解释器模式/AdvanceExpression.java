package 行为型模式.解释器模式;
public class AdvanceExpression extends Expression {

    void interpret(Context ctx) {
        System.out.println("这是高级解析器!");
    }
}
