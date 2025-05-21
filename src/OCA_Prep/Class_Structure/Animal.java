public class Animal{

    String name;

    String species;

    public void sound(){
        System.out.println("This animal is a dog and it barks");
    }

    public String getName(){
        return name;
    }

    public void setName(String newName){
        name = newName;
    }
}