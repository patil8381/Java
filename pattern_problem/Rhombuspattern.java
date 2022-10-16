class Rhombuspattern{
    public static void main(String[] args)
    {
        int i,j,k;
        for(i=1;i<=4;i++)
        {
           for(k=1;k<=5-i+1;k++)
           {
               System.out.print(" ");
           } 
           
           for(j=1;j<=2*i-1;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(i=1;i<=5;i++)
        {
           for(k=1;k<=i;k++)
           {
               System.out.print(" ");
           } 
           
           for(j=1;j<=11-2*i ;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        
        

   }
}