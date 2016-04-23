package ������ģʽ.��̬ģʽ;
public class Singleton {
    private int i=0;
    private static Singleton sing;
    private static final Singleton sing2 = new Singleton();
    private Singleton() {
        i++;
    }
   
    public int getI() {
		return i;
	}

	public static Singleton getInstance() {
        if (sing == null) {
        	synchronized (Singleton.class) {
        		if(sing == null)
        			sing = new Singleton();
        		
			}
           
        }
        return sing;
    }
    
    public static Singleton getInstance2() {
        return sing2;
    }
    
   
}
