abstract class Plane{
    abstract void takeoff();
    abstract void fly();
    abstract void land();
}
class CargoPlane extends Plane{
    void takeoff(){
        System.out.println("Cargoplane is takeoff at medium runway");
    }
    void fly(){
        System.out.println("Cargoplane is flying at medium heights");
    }
    void land(){
        System.out.println("Cargoplane is landing at medium runway");
    }
}
class FighterPlane extends Plane{
    void takeoff(){
        System.out.println("Fighterplane is takeoff at medium runway");
    }
    void fly(){
        System.out.println("fighterplane is flying at medium heights");
    }
    void land(){
        System.out.println("fighterplane is landing at medium runway");
    }
}
class PassengerPlane extends Plane{
    void takeoff(){
        System.out.println("PassengerPlane is flying at medium runway");
    }
    void fly(){
        System.out.println("PassengerPlane is flying at medium heights");
    }
    void land(){
        System.out.println("PassengerPlane is flying at medium runway");
    }
}
class Airport{
    void permit(Plane ref){
        ref.takeoff();
        ref.fly();
        ref.land();
    }
}
class Abstraction{
    public static void main(String[] args) {
        CargoPlane cp=new CargoPlane();
        FighterPlane fp=new FighterPlane();
        PassengerPlane pp=new PassengerPlane();
        
        Airport a=new Airport();
        a.permit(cp);
        a.permit(pp);
        a.permit(fp);
    }
}       