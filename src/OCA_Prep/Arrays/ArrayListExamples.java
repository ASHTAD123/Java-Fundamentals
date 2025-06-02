package OCA_Prep.Arrays;
import java.util.ArrayList;
import java.util.List;

public class ArrayListExamples {

    public static void main(String[] args) {
        
        ArrayList<Integer> list_1 = new ArrayList<Integer>();
       
        ArrayList<Integer> list_2 = new ArrayList<Integer>(10);

        ArrayList<Integer> list_3 = new ArrayList<Integer>(list_2);

        List<Integer> parent = new ArrayList<Integer>();

        list_1.add(30);
        list_1.add(40);

        boolean b = list_1.add(120);
        

        //boolean add(E element)
        //void add(element,index)

        list_1.add(0,10);
        System.out.println(list_1);

        ArrayList plainArrayList = new ArrayList<>();
        plainArrayList.add("asas");
        plainArrayList.add(23);
        plainArrayList.add(true);

        System.out.println(plainArrayList);


           System.out.println(list_1);
        //boolean remove(Object obj)
        //boolean remove(int index)

        list_1.remove(0);
        list_1.remove(1);

        System.out.println(list_1);

        list_1.remove(new Integer(40));
       // list_1.remove(40);//index out of bound

        //E set(int index , E new Element)
        list_1.set(0, 50);
        System.out.println(list_1);

        System.out.println("List size: " +list_1.size());

        System.out.println("isEmpty() : " + list_1.isEmpty());

        
        //clear()
        List<String> birds = new ArrayList<String>();
        birds.add("hawk");
        birds.add("eagle");
        System.out.println(birds);
        System.out.println("isEmpty() : "+birds.isEmpty());
        System.out.println("List size: " +birds.size());

        //contains method
        //boolean contains(Object obj)
        System.out.println(list_1.contains(50));
        System.out.println(list_1.contains(510));

        //boolean equals(Object obj)
        //compares order and elements
        List<String> one = new ArrayList<String>();
        List<String> two = new ArrayList<String>();
        System.out.println("One equals to two ? : "+ one.equals(two));
        one.add("abc");
        one.add("bca");
        System.out.println("One equals to two ? : "+ one.equals(two));
        two.add("bca");
        two.add("abc");

        System.out.println(one.equals(two));

    }
}
