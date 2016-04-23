package 创建型模式.抽象工厂;
public class BlackAnimalFactory implements IAnimalFactory {

    public ICat createCat() {
        return new BlackCat();
    }

    public IDog createDog() {
        return new BlackDog();
    }
    
  /*  public IDog createDog(int i){
    	if(i == 1){
    		return new BlackDog();
    	}else{
    		return new WhiteDog();
    	}
    }
    
    public ICat createCat(int i){
    	if(i == 1){
    		return new BlackCat();
    	}else{
    		return new WhiteCat();
    	}
    }*/

}
