package ������ģʽ.��������;
public class StudentWorkFactory implements IWorkFactory {

    public Work getWork() {
        return new StudentWork();
    }
    
    public Work getWork(int no) {
        return new StudentWork(no);
    }
}
