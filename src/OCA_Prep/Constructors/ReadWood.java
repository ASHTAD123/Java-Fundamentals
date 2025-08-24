package OCA_Prep.Constructors;

public class ReadWood extends Tree {
    
    public static void main(String[] args) {
        new ReadWood().go();
    }

    void go(){
        go2(new Tree(),new ReadWood());
         go2( (ReadWood) new Tree(), new ReadWood());
    }

    void go2(Tree t1,ReadWood r1){
        ReadWood r2 = (ReadWood) t1;
        Tree t2 = (Tree)r1;
    }
}
class Tree{

}