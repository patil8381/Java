class Ifelsepattern3{
    public static void main(String[] args)
    {
        int i,j,k;
        for(i=1;i<=5;i++)
        {
            for(k=1;k<=i;k++)
            {
                System.out.print(" ");
            } 

            for(j=1;j<=11-2*i;j++)
            {
               if(i==1 || i==5 || j==1 || j==11-2*i)
               {
                    System.out.print("*");
               }
               else{
                    System.out.print(" ");
               }
            }
            
            System.out.println();
        }
   }
}