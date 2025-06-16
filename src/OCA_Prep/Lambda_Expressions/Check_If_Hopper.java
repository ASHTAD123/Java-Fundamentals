package OCA_Prep.Lambda_Expressions;

public class Check_If_Hopper implements CheckTrait{

    @Override
    public boolean test(Animal a) {

        return a.canHop();
    }
    
}
