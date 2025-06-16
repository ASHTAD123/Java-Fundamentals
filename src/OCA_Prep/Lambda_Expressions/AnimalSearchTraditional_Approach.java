package OCA_Prep.Lambda_Expressions;
import java.util.ArrayList;
import java.util.List;

public class AnimalSearchTraditional_Approach {
    
    public static void main(String[] args) {
        
        List<Animal> animals = new ArrayList<>();

        animals.add(new Animal("Fish", false, true));
        animals.add(new Animal("Kangaroo", true, false));
        animals.add(new Animal("Rabbits", true, false));
        animals.add(new Animal("Turtle", false, true));


        print(animals, new Check_If_Hopper());//old way
        print(animals, a-> a.canSwim());//lambda
    }


    private static void print(List<Animal> animals , CheckTrait check){

        for(Animal animal :animals){

            if(check.test(animal)){
                System.out.println(animal + "");
            }
        }
    }














}
