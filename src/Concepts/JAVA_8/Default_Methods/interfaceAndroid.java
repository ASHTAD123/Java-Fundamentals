package Concepts.JAVA_8.Default_Methods;

public interface interfaceAndroid {
    
    void threeFingerScreenshot();

    default void screenCast(){
        System.out.println("Screen Cast ");
    }
}

class ExyNosOs implements interfaceAndroid{
     
    public void threeFingerScreenshot() { 
        System.out.println(" 3 Finger screenshot ExyNosOs");
    }

}

class Hello_UI implements interfaceAndroid{

    public void threeFingerScreenshot() { 
        System.out.println(" 3 Finger screenshot Hello_UI");
    }

    public void screenCast() {
        System.out.println("Screen cast Hello_UI");
    }
}