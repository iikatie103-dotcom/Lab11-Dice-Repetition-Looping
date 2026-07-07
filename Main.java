import java.util.Random;

class Main
{
  public static void main(String[] args)
  {
    int rolled1 = 0;
    int rolled2 = 0;
    int rolled3 = 0;
    int rolled4 = 0;
    int rolled5 = 0;
    int rolled6 = 0;
    for(int i = 1; i < 101; i++){
      int numberRolled = Main.roll();
      System.out.println("Roll " + i + ": " + numberRolled);
      if (numberRolled == 1){
        rolled1++;
      }
      else if (numberRolled == 2){
        rolled2++;
        }
      else if (numberRolled == 3){
        rolled3++;
      }
      else if (numberRolled == 4){
        rolled4++;
      }
      else if (numberRolled == 5){
        rolled5++;
      }
      else if (numberRolled == 6){
        rolled6++;
      }
    }
    System.out.println("Final Roll Counts:");
    System.out.printf("[1]: %d times%n[2]: %d times%n[3]: %d times%n[4]: %d times%n[5]: %d times%n[6]: %d times", rolled1, rolled2, rolled3, rolled4, rolled5, rolled6);

  }
  
  // Random is a class we can use to generate random numbers
  // You do not need to change anything in the method below
  // Every time you invoke the roll() method, it will generate a random int
  // between 0-5, and then we add 1, so it will return a number between 1-6, just like dice
  public static int roll()
  {
    Random dice = new Random();
    return dice.nextInt(6) + 1;
  }
}