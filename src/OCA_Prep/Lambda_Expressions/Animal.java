package OCA_Prep.Lambda_Expressions;

public class Animal {
    
    private String species;
    private boolean canHope;
    private boolean canSwim;

    public Animal(String species , boolean canHope,boolean canSwim){
        this.species = species;
        this.canHope = canHope;
        this.canSwim = canSwim;
    }

    public boolean canHop(){
        return canHope;
    }

    public boolean canSwim(){
        return canSwim;
    }

    public String toString(){
        return species;
    }


}
