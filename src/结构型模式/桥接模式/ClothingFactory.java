package �ṹ��ģʽ.�Ž�ģʽ;

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
