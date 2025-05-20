package ex_20_Opps_Super_Abstraction;

public class LAb_03_Private {

}
class XYZ {
    XYZ() {
    }
    protected int my_gold = 10;
}

class CAB extends XYZ {
    void display() {
        System.out.println(super.my_gold);
    }
}
