package ��Ϊ��ģʽ.����ģʽ;
public abstract class Command {
    public Command(Receiver receiver) {
        this.receiver = receiver;
    } 
    
    protected Receiver receiver;
    
    public abstract void execute();
}
