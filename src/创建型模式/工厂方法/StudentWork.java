package ������ģʽ.��������;
public class StudentWork implements Work {
	int no = 0;
	StudentWork(int no){
		this.no = no;
	}
	
	StudentWork(){
		
	}

    public void doWork() {
        System.out.println("ѧ��"+no+"����ҵ!");
    }
}
