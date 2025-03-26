import java.util.ArrayList;
import java.util.List;

class compareTriplets {

  public static void main(String[] args) {

    List<Integer> a = new ArrayList<>();
    a.add(5);
    a.add(6);
    a.add(7);

    List<Integer> b = new ArrayList<>();
    b.add(3);
    b.add(6);
    b.add(10);
    int aliceScore=0;
    int bobScore=0;
    

    List<Integer> finalScore = new ArrayList<Integer>();

    for (int i = 0; i <= a.size()-1; i++) {

        if (a.get(i) > b.get(i)) {
            aliceScore++;
        }  if (a.get(i) < b.get(i)) {
            bobScore++;
          }
    }
    System.out.println(aliceScore);
    System.out.println(bobScore);
  }
}
