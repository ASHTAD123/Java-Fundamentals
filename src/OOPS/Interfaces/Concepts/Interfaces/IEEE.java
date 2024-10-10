package Concepts.Interfaces;

public interface IEEE {

        void standard();

        void policies();

        void logo();

        void mainAcitivites();
}

class IEEE_ComputerSociety implements IEEE{
   
    @Override
    public void standard() {
        System.out.println("Standard IEEE 802.11:2007");
    }

    @Override
    public void policies() {
      System.out.println("Policies IEEE 802.11:2007");
    }

    @Override
    public void logo() {
       System.out.println("Logo IEEE 802.11:2007");
    }

    @Override
    public void mainAcitivites() {
        System.out.println("Acitivites IEEE 802.11:2007");
    }
     
    public static void main(String[] args) {
        IEEE_ComputerSociety ieee_ComputerSociety = new IEEE_ComputerSociety();
        ieee_ComputerSociety.standard();
        ieee_ComputerSociety.policies();
        ieee_ComputerSociety.logo();
        ieee_ComputerSociety.mainAcitivites();
    }
}