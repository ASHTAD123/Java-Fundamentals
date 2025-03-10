 public interface JVM{

        public void jvm();
    }
    
class jvm_implementation {
    
        public static void main(String agrs[]){
    
            JVM jvmImpl1 = () ->{
                System.out.println("JVM IMPL 1 ");
            } ;
            
            JVM jvmImpl2 =()->{
                System.out.println("JVM IMPL 2 ");
            };

            jvmImpl1.jvm();
            jvmImpl2.jvm();
        }
  
        
    }

