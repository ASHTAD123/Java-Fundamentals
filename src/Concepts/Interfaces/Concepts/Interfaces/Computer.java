package Concepts.Interfaces;

public interface Computer {
    void cpu();
    void gpu();
    void motherboard();
}
class Lenovo implements Computer{

    @Override
    public void cpu() {
       System.out.println("Lenovo CPU");
    }

    @Override
    public void gpu() {
        System.out.println("Lenovo Gpu");
    }

    @Override
    public void motherboard() {
        System.out.println("Lenovo Motherboard");
    }

    public static void main(String[] args) {
        Lenovo l = new Lenovo();
        l.cpu();
        l.gpu();
        l.motherboard();

    }
}
class HP implements Computer{

    @Override
    public void cpu() {
       System.out.println("HP CPU");
    }

    @Override
    public void gpu() {
        System.out.println("HP Gpu");
    }

    @Override
    public void motherboard() {
        System.out.println("HP Motherboard");
    }
  
    public static void main(String[] args) {
        HP hp = new HP();
        hp.cpu();
        hp.gpu();
        hp.motherboard();
        
    }

}
    

    
  
