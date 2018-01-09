import java.text.DecimalFormat;
public class Computation
{
  int Wings;
  String Answer;
  boolean Sauce = false;
  double Cost;
  
  public void SetWings(int NumberWings) 
  {
    Wings = NumberWings; 
  }
  
  public void SetAnswer(String SauceAnswer) 
  {
    Answer=SauceAnswer; 
  }
  
  public void Sauce() 
  {
    if (Wings>0&&Wings<=50) 
    {
        if(Answer.equals("yes")) 
        {
         Sauce = true; 
        }
    }
    else 
      System.out.println("Number of Wings is Invalid. Please enter a number between 1 and 50"); 
  }
    
  public void Cost()
  {
    if(Wings>0&&Wings<=50) 
    {
        Cost = Wings * .5;
        if(Sauce) Cost = Wings * .5 + 2; 
        DecimalFormat money = new DecimalFormat("#0.00");
        DecimalFormat wing = new DecimalFormat("#0");
        System.out.println("Number of Wings: "+wing.format(Wings));
        System.out.println("Sauce: "+Answer);
        System.out.println("Total Cost is: $"+money.format(Cost));
    }
  else
    System.out.println("Number of Wings is Invalid. Please enter a number between 1 and 50");
  }
}

