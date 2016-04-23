package 结构型模式.享元模式;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {

    private static Map<String, Flyweight> flyweights = new HashMap<String, Flyweight>();
    
    public FlyweightFactory(String arg) {
        flyweights.put(arg, new FlyweightImpl());
    }
    
    public static Flyweight getFlyweight(String key) {
        if (flyweights.get(key) == null) {
            flyweights.put(key, new FlyweightImpl());
        }
        return flyweights.get(key);
    }
    
    public static int getSize() {
        return flyweights.size();
    }
}
