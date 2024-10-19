package Concepts.Multi_Threading;

class TeamPlayer1 {

    String task;

    TeamPlayer1(String task){
         this.task = task;
    }

    Runnable run = ()-> System.out.println(task);
    Runnable run1 = ()-> System.out.println(task);

}
class TeamPlayer2 {

    String task;

    TeamPlayer2(String task){
         this.task = task;
    }

    Runnable run = ()-> System.out.println(task);
}

class TeamPlayer3 {

    String task;

    TeamPlayer3(String task){
         this.task = task;
    }
         Runnable run = ()-> System.out.println(task);
    }

public class TeamLead_J_8 {

public static void main(String[] args) {

TeamPlayer1 teamPlayer1 = new TeamPlayer1("Collect items");
TeamPlayer2 teamPlayer2 = new TeamPlayer2("Arrage items");
TeamPlayer3 teamPlayer3 = new TeamPlayer3("Do the wiring");

// //Thread player1 = new Thread();
// teamPlayer1.run();

// Thread player2 = new Thread(teamPlayer2.run);
// player2.start();

// Thread player3 = new Thread(teamPlayer3.run);
// player3.start();

}
}
