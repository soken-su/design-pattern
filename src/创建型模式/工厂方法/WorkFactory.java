package ������ģʽ.��������;

public class WorkFactory {
	public static Work getWork(String name){
		if("student".equals(name)){
			return new StudentWork();
		}else{
			return new TeacherWork();
		}
	}
}
