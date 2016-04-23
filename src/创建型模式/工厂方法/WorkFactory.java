package 创建型模式.工厂方法;

public class WorkFactory {
	public static Work getWork(String name){
		if("student".equals(name)){
			return new StudentWork();
		}else{
			return new TeacherWork();
		}
	}
}
