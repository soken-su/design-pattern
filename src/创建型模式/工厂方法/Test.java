package ������ģʽ.��������;
public class Test {

    public static void main(String[] args) {
       IWorkFactory studentWorkFactory = new StudentWorkFactory();
      //  studentWorkFactory.getWork(2).doWork();
       studentWorkFactory.getWork().doWork();
        
        IWorkFactory teacherWorkFactory = new TeacherWorkFactory();
        teacherWorkFactory.getWork().doWork();
    	/*Work work = WorkFactory.getWork("student");
    	work.doWork();*/
    }

}
