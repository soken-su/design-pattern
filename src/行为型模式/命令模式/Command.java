package 行为型模式.命令模式;
public abstract class Command {
    public Command(Receiver receiver) {
        this.receiver = receiver;
    } 
    
    protected Receiver receiver;
    
    public abstract void execute();
}
