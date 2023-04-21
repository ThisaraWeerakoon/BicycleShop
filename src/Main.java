
class BicycleShop{

}


interface Bicycle{
    String color;
    public void getQuality();


}

class MotorBicyle extends Bicycle{
    int engineNumber;
    public void getQuality(){
        System.out.println("Quality checking Motor bicyle");
    }
}

abstract class FootBicycle extends Bicycle{
    String bell;
}
class AdultFootBicycle extends FootBicycle{
    String lamp;
    pu

}

//interface IGetQuality{
//    public void getQuality();
//}
//class FootBicycle{
//    String color;
//    String bell;
//
//}
//class AdultFootBicycle extends FootBicycle{
//    String lamp;
//
//
//}
//class KidsFootBicycle extends FootBicycle implements IGetQuality{
//    String stabilizers;
//    public void getQuality(){
//        System.out.println("Quality checking Kids Bicycle");
//    }
//
//}
//class MotorBicycle implements IGetQuality{
//    String color;
//    int enginenumber;
//
//    public void getQuality(){
//        System.out.println("Quality checking Motor Bicycle");
//    }
//
//
//}

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}