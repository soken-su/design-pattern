package 结构型模式.组合模式;
public class ProjectAssistant extends Employer {

    public ProjectAssistant(String name) {
        setName(name);
        employers = null;//项目助理, 表示没有下属了
    }

    public void add(Employer employer) {
        
    }

    public void delete(Employer employer) {
        
    }
}
