public interface Android{

    void feature1();

    void feature2();

    void feature3();
}
class OnePlus implements Android{

    @Override
    public void feature1() {
      System.out.println("Implementing Feature 1 in Oneplus");
    }

    @Override
    public void feature2() {
         System.out.println("Implementing Feature 2 in Oneplus"); 
    }

    @Override
    public void feature3() {
        System.out.println("Implementing Feature 3 in Oneplus");
    }

    public static void main(String[] args) {
        
        OnePlus oneplus = new OnePlus();
        oneplus.feature1();
        oneplus.feature2();
        oneplus.feature3();
    
    }    

}
class Motorola implements Android{
    @Override
    public void feature1() {
      System.out.println("Implementing Feature 1 in Motorola");
    }

    @Override
    public void feature2() {
         System.out.println("Implementing Feature 2 in Motorola"); 
    }

    @Override
    public void feature3() {
        System.out.println("Implementing Feature 3 in Motorola");
    }

    public static void main(String[] args) {
        
        Motorola moto = new Motorola();
        moto.feature1();
        moto.feature2();
        moto.feature3();
    
    }    


}