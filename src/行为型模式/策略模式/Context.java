package ��Ϊ��ģʽ.����ģʽ;
public class Context {

    Strategy stra;
    
    public Context(Strategy stra) {
        this.stra = stra;
    }
    
    public void doMethod() {
        stra.method();
    }
}
