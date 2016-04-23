package 创建型模式.工厂方法;
public class TeacherWorkFactory implements IWorkFactory {

    public Work getWork() {
        return new TeacherWork();
    }

    public Work getWork(int no) {
        return new TeacherWork(no);
    }
}
