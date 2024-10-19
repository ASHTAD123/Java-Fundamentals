package Concepts.Multi_Threading;

/**
 * TeamLead
 */
public interface TeamWork {

    public void task1();
    public void task2();
    public void task3();
}
class player1 implements TeamWork {

    @Override
    public void task1() {
        System.out.println("Player 1 task 1");
    }

    @Override
    public void task2() {

    }

    @Override
    public void task3() {
        
    }
    
}

class player2 implements TeamWork {

    @Override
    public void task1() {
        System.out.println("Player 2 task 1");
    }

    @Override
    public void task2() {

    }

    @Override
    public void task3() {
        
    }
}

class TeamLead{
    public static void main(String[] args) {
    
        player1 player1 = new player1();
        player1.task1();

        player2 player2 = new player2();
        player2.task1();
    }
}
// class TeamPlayer1 implements Runnable {

//     String task;

//     TeamPlayer1(String task) {
//         this.task = task;
//     }

//     @Override
//     public void run() {
//         System.out.println(task);
//     }
// }

// class TeamPlayer2  implements Runnable{

//     String task;

//     TeamPlayer2(String task) {
//         this.task = task;
//     }

//     @Override
//     public void run() {
//         System.out.println(task);
//     }
// }

// class TeamPlayer3 implements Runnable {

//     String task;

//     TeamPlayer3(String task) {
//         this.task = task;
//     }

//     @Override
//     public void run() {
//         System.out.println(task);
//     }
// }

// public class TeamLead {

//     public static void main(String[] args) {

//         TeamPlayer1 teamPlayer1 = new TeamPlayer1("Player 1 Collect items");
//         TeamPlayer2 teamPlayer2 = new TeamPlayer2("Player 2 Arrage items");
//         TeamPlayer3 teamPlayer3 = new TeamPlayer3("Player 3 Do the wiring");

//         Thread player1 = new Thread(teamPlayer1);
//         player1.run();
        
//         Thread player2 = new Thread(teamPlayer2);
//         player2.start();

//         Thread player3 = new Thread(teamPlayer3);
//         player3.start();

//     }


