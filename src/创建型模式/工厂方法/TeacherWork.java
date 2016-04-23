package 创建型模式.工厂方法;
public class TeacherWork implements Work {
	int no = 0;
	TeacherWork(){
		
	}
	TeacherWork(int no){
		this.no = no;
	}

    public void doWork() {
        System.out.println("编号为"+no+"老师审批作业!");
    }
}
  
