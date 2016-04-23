package 创建型模式.工厂方法;
public class StudentWork implements Work {
	int no = 0;
	StudentWork(int no){
		this.no = no;
	}
	
	StudentWork(){
		
	}

    public void doWork() {
        System.out.println("学生"+no+"做作业!");
    }
}
