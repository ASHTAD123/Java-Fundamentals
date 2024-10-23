package Concepts.JAVA_8.Lambda_Exp_and_Functional_Interface;

public class JvmImplementation {
    
    public static void main(String[] args) {
        
        jvmInter jvmInt = ()->{

                jvmInter jvmInterLinux =()->{
                     System.out.println("JVM Implementation for Linux");
                };

                jvmInter jvmInterMacOS =()->{
                    System.out.println("JVM Implementation for Mac OS");
                };

                jvmInter jvmInterWindows =()->{
                    System.out.println("JVM Implementation for Windows OS");
                };
        };
    }
}
