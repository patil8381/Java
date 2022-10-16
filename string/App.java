import java.util.Scanner;

class human
{
    String name;
    int age;
    String gender;
    int ages;
}

class App
{ 
    public static void main(String[] args)
    {
        
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter your full name:");
        String a= scan.nextLine();
        System.out.println("age:");
        int b= scan.nextInt();
        System.out.println("Gender:");
        String c= scan.nextLine();
        System.out.println("ages:");
        int d= scan.nextInt();
        
        


        // human h=new human();
        // h.name=a;
        // h.age=b; 
        // h.gender=c;
        {
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
            System.out.println(d);
        }
    }
}