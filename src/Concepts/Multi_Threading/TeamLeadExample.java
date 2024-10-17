package Concepts.Multi_Threading;

class TeamPlayer1{

    Runnable run = ()->{
        System.out.println("Running Team Player 1 Thread...");
        task1();
    };
    public void task1(){
        System.out.println("Team Player 1 performing Task 1");
    }
}
class TeamPlayer2{

    Runnable run = ()->{
        System.out.println("Running Team Player 2 Thread...");
        task1();
    };
    public void task1(){
        System.out.println("Team Player 2 performing Task 1");
    }
}

public class TeamLeadExample {
       public static void main(String[] args) {
        System.out.println("Main Thread");

         
    Runnable teamPlayerLeadThread = ()->{
        Thread.currentThread().setName("Team Lead Thread");
        System.out.println("Thread Name :" + Thread.currentThread().getName());
    };

        Thread teamPlayerLead = new Thread(teamPlayerLeadThread);
        teamPlayerLead.start();

        TeamPlayer1 teamPlayer1 = new TeamPlayer1();
        Thread th1 = new Thread(teamPlayer1.run);
        th1.start();

        TeamPlayer1 teamPlayer2 = new TeamPlayer1();
         Thread th2 = new Thread(teamPlayer2.run);
         th2.start();
    }
}

