package ������ģʽ.��������;
public class TeacherWork implements Work {
	int no = 0;
	TeacherWork(){
		
	}
	TeacherWork(int no){
		this.no = no;
	}

    public void doWork() {
        System.out.println("���Ϊ"+no+"��ʦ������ҵ!");
    }
}
  
