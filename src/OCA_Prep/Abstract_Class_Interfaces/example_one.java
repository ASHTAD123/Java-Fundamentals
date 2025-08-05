public class example_one implements Device {
    
    public void doIt(){}
}
abstract class Phone1 extends example_one{}

abstract class Phone2 extends example_one{
    public void doIt(int x){}
}

class Phone3 extends example_one implements  Device{
    
}
interface Device{

        public void doIt();
}
