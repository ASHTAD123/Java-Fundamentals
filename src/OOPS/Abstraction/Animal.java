abstract class Animal {

        public abstract void eyes();

        public abstract void legs();

        public abstract void sound();

        //Abstract classes can have concrete method
        public void body() {
            System.out.println("Animal body");
        }
}

class Dog extends Animal {

    @Override
    public void eyes() {
      System.out.println("Dog has 2 eyes");
    }

    @Override
    public void legs() {
       System.out.println("Dog has 4 legs");
    }

    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
   
    public static void main(String[] args) {
        
        Dog dog = new Dog();
        dog.eyes();
        dog.body();
        dog.legs();
    }
}
