package Concepts.Strings;

public class String_buffer_exmp {

	public static void main(String[] args) {
		
		StringBuffer strBuff = new StringBuffer();
	
		System.out.println("Initial capacity of Buffer : "+strBuff.capacity());
	
		//append()
		strBuff.append("data");
		System.out.println("Data in String buffer :" +strBuff);
		strBuff.append("newdata");
		
		System.out.println();
		
		System.out.println("_____Appending____");
		System.out.println("After appending :" +strBuff);
	
		
		System.out.println();
		System.out.println("____insert()___");
	
		//insert()
		strBuff.insert(0, "'inserted'");
		System.out.println("After inserting string at 0 pos:" +strBuff);
		
		System.out.println();
		
		
		System.out.println("____replace()___");
		//replace()
		System.out.println("Replacing index 1-3");
		strBuff.replace(0, 2, "abc");
		System.out.println("After replacing : " +strBuff);
	
		System.out.println();
		System.out.println("____delete()___");
		
		//delete()[till end-1]
		System.out.println("Delete method");
		StringBuffer strBuff1 = new StringBuffer("ashtad");
		System.out.println("----Before deletion----");
		System.out.println(strBuff1);
		strBuff1.delete(0, 3);
		System.out.println("After deleting from index 0-2 : "+strBuff1);
		
		System.out.println();
		System.out.println("____reverse()___");
		//reverse()
		System.out.println("-----Before reverse----");
		System.out.println(strBuff);
	
		System.out.println("-----After reverse-----");
		strBuff.reverse();
		System.out.println(strBuff);
	
	
	
	}
}
