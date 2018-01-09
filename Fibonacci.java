class Fibonacii
{
  public static void main(String args[])
  {
    int x=1;
    int y=1;
    int z=0;
    
    System.out.printf("%d\n%d\n",x,y);
    
    for(int i=3;i<=10;i++)
    {
      z=x+y;
      x=y;
      y=z;
      
      System.out.printf("%d\n",z);
    }
  }
}