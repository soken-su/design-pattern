package ������ģʽ.��������;
public class TeacherWorkFactory implements IWorkFactory {

    public Work getWork() {
        return new TeacherWork();
    }

    public Work getWork(int no) {
        return new TeacherWork(no);
    }
}
