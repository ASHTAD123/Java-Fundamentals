package OOPS.interitance.SingleInheritance;

public class JVMImplementation {

	
		public void classLoader() {
			System.out.println("Classloader JVM");
		}
		
		public void methodArea() {
			System.out.println("Method Area JVM");
		}
		
		public void heapArea() {
			System.out.println("Heap Area JVM");
		}
		
		public static void main(String[] args) {
			
			
		}
}

class Windows extends JVMImplementation{
	
	public void classLoader() {
		System.out.println(" Windows implementation of Classloader JVM ");
	}
	
	public void methodArea() {
		System.out.println(" Windows implementation of Method Area JVM ");
	}
	
	public void heapArea() {
		System.out.println(" Windows implementation of  Heap Area JVM ");
	}
	
	public static void main(String[] args) {
		
		Windows windows = new Windows();
		windows.classLoader();
		windows.methodArea();
		windows.heapArea();
		
		JVMImplementation jvmImpl = new JVMImplementation();
		jvmImpl.classLoader();
		jvmImpl.methodArea();
		jvmImpl.heapArea();
	}
}

