class Plane
{
    void fly()
    {
        System.out.println("Plane is flying");
    }
}
class CargoPlane extends Plane
{
    void fly()
    {
        System.out.println("Cargoplane is flying at medium heights");
    }
}
class FighterPlane extends Plane
{
    void fly()
    {
        System.out.println("FighterPlane is flying at great heights");
    }

}
class PassengerPlane extends Plane
{
    void fly()
    {
        System.out.println("PassengerPlane is flying at low heights");
    }

}
class Polymorphism
{
    public static void main(String[] args) 
    {
        CargoPlane cp=new CargoPlane();
        FighterPlane fp=new FighterPlane();
        PassengerPlane pp=new PassengerPlane(); 

        Plane ref;

        ref=cp;
        ref.fly();

        ref=pp;
        ref.fly();

        ref=fp;
        ref.fly();

        // cp.fly();
        // pp.fly();
        // fp.fly(); this is giving us statement ratio 1:1 then this s not polymorphism
        // polymorphism ratio of statement and output is 1:Many
        //
            
    }
}