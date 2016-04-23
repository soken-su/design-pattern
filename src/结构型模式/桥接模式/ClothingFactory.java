package 结构型模式.桥接模式;

@SuppressWarnings("static-access")
public class ClothingFactory {
    private static Clothing clothing;
    
	public ClothingFactory(Clothing clothing){
    	this.clothing = clothing;
    }
    
	public static Clothing getClothing() { 
		return clothing;
	}

}
