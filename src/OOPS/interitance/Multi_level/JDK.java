package OOPS.interitance.Multi_level;

public class JDK {

	public void jar() {
		System.out.println("Jar tool - create an archive for classes and resources, and manipulate or restore individual classes or resources from an archive");
	}
	
	public void jarSigner() {
		System.out.println("jarsigner - sign and verify Java Archive (JAR) files");
	}
	public static void main(String[] args) {
		
		System.out.println("JDK ");
	}

}
class JRE extends JDK{
	
	public void jar() {
		super.jar();
		System.out.println("Additional config");
	}
	
	public void jarSigner() {
		super.jarSigner();
		System.out.println("Additional config");
	}
	
		public static void main(String[] args) {
			
			System.out.println("JRE ");
		}
}
class JVM extends JRE{

	public static void main(String[] args) {
		
		System.out.println("JDK ");
		
		JVM jvm = new JVM();
		jvm.jar();
		jvm.jarSigner();
	}
}
