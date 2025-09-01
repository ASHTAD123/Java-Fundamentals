package OCA_Prep.Type_Casting;

class example_one{

    public static void main(String[] args) {
        
        Object o = new String("a");
        StringBuffer sb = (StringBuffer)o;

    }
}

class A{

}

class B extends A{

    public static void main(String[] args) {

        //Upcasting
        B bc = new B();
        A a1 =(A) bc;

        //Downcasting
        A a = new B();
        B b = (B)a;

        //here not every A object is B so..
        A a2 = new A();
        B b2 = (B) a2; // runtime: ClassCastException
    }
}