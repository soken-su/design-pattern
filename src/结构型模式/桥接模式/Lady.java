package �ṹ��ģʽ.�Ž�ģʽ;
public class Lady extends Person {

    public Lady() {
        setType("Ů��");
    }
    
    public void dress() {
        Clothing clothing = getClothing();
        clothing.personDressCloth(this);
    }
}
