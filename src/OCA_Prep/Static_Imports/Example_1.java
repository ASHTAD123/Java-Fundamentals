package OCA_Prep.Static_Imports;
import static java.lang.System.out;
import static java.lang.Integer.*;
//This is Illegal way
// static import java.lang.Integer.*;

public class Example_1 {

    public static void main(String[] args) {
        out.println();
        out.print(toHexString(43));
        out.print(Integer.MAX_VALUE);
    }
}
