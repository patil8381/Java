class Creditcard
{
    private int cardNo = 12345;
    private int pin = 8888;

    // public and protected are also used at private and both participate in inheritance but default also participate but it is not necessary to declare
}

class Hacker extends Creditcard
{
    void viewDetails()
    {
        System.out.println(cardNo);
        System.out.println(pin);
    }

    void changeDetails()
    {
        cardNo = 67890;
        pin =9999;
    
    }
}

class Inheritance
{
    public static void main(String[] args) {
        Hacker h=new Hacker();
        h.viewDetails();
        h.changeDetails();
        h.viewDetails();
    }
}