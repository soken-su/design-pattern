package 行为型模式.迭代器模式;
public interface Iterator {

    Object next();
    
    void first();
    
    void last();
    
    boolean hasNext();
}
