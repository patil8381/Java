class Dog
{
    String name;
    String breed;  
    int cost;

}

class String3
{
    public static void main(String[] args)
    {
        Dog d = new Dog();
        d.name = "scooby";
        d.breed = "pug";
        d.cost = 12000;
        System.out.println(d.name);
        System.out.println(d.breed);
        System.out.println(d.cost);
    }
}