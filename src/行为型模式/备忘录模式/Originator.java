package 行为型模式.备忘录模式;
public class Originator {

    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
    
    public Memento createMemento() {
        return new Memento(state);
    }
    
    public void setMemento(Memento memento) {
        state = memento.getState();
    }
    
    public void showState(){
        System.out.println(state);
    }
}
