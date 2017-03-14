import java.io.Console;

public class App {
  public static void main(String[] args){
    Console console = System.console();

    boolean programRun = true;

    while (programRun){
      System.out.println("After a long rainy night you wake up we refreshed to your annoying buzzing alarm!");
      System.out.println("What do you want to do? Go back to sleep, Use bathroom, go eat breakfast?");
      String userInput = console.readLine();
      System.out.println("______________________________________");
      userInput.toLowerCase();
      if (userInput.equals("go back to sleep")) {
        System.out.println("While you fall asleep a loud noise comes from the hall. Before you are able to get out of bed a zombie attacks you and you die. GAME OVER");
        programRun = tryAgain();
      } else if (userInput.equals("use bathroom")) {
        System.out.println("You walk out of your bedroom and to the bathroom door that is slightly open. You hear the water in the shower running.");
        System.out.println("Would you like to: take a shower or go downstairs?");
        String userInputFirst = console.readLine();
        userInputFirst.toLowerCase();
        System.out.println("______________________________________");
        if (userInputFirst.equals("take a shower")){
          System.out.println("You walk into the bathroom and notice blood on the floor, you look up and a zombie eats you. GAME OVER");
          programRun = tryAgain();
        } else if (userInputFirst.equals("go downstairs")){
          System.out.println("You really didnt want to bother whoever was in the shower. You walk down the stairs and smell coffee brewing.");
          System.out.println(" Would you like to: eat breakfast or look out the window?");
          String userInputSecond = console.readLine();
          System.out.println("______________________________________");
          if (userInputSecond.equals("eat breakfast")) {
            System.out.println("You sit and enjoy your coffee and toast.");
            System.out.println("Would you like to: listen to radio or check email?");
            String userInputThird = console.readLine();
            System.out.println("______________________________________");
            if (userInputThird.equals("listen to radio")) {
              System.out.println("The radio blasts 98 degrees at 100% volume!!");
              System.out.println("You hear something running down the stairs and a zombie gets you!. GAME OVER!");
              programRun = tryAgain();
            } else if (userInputThird.equals("check email")){
              System.out.println("You learn about the Zombie apocolypse that is happening! You grab your weapons and survive! Congrats you win!");
              programRun = tryAgain();
            }
          } else if (userInputSecond.equals("look out the window")) {
            System.out.println("You look out the window and see 50 dead zombies walking toward your house.");
            System.out.println("Would you like to: hide or get a gun?");
            String userInputSixth = console.readLine();
            System.out.println("______________________________________");
              if (userInputSixth.equals("hide")){
                System.out.println("You run up the stairs and hide in your bedroom closet. There is a lot of noise so you wait it out... to bad its been 3 months. You starve and die. GAME OVER.");
                programRun = tryAgain();
              } else if (userInputSixth.equals("get a gun")) {
                System.out.println("You find your gun and are able to hold off the zombies and build a human empire! You win!");
                programRun = tryAgain();
              }
            }
          }
      } else if (userInput.equals("go eat breakfast")){
        System.out.println("While you are enjoying your fresh fruit and coffee you hear a strange noise.");
        System.out.println("Would you like to: grab a knife or hide?");
        String userInputFourth = console.readLine();
        System.out.println("______________________________________");
        if (userInputFourth.equals("grab a knife")){
          System.out.println("You hold the knife in your hand tightly and start heading toward the noise.");
          System.out.println("You see a zombie walking down the stairs toward you. Do you: fight or run?");
          String userInputFifth = console.readLine();
          System.out.println("______________________________________");
          if (userInputFifth.equals("fight")) {
            System.out.println("You remember all the episodes you watched of Walking Dead, and you kill the zombie. You know how to survive. Congrats You WIN!");
            programRun = tryAgain();
          } else if (userInputFifth.equals("run")) {
            System.out.println("You run out the front door and trip on your shoe laces. A crowd swarms around you. You are relieved for the help... until you find out they are zombies. You die. GAME OVER.");
            programRun = tryAgain();
          }
        } else if (userInputFourth.equals("hide")) {
          System.out.println("You run out to the garage to hide. The noise gets louder and seems to be a crowd of people. They start knocking on the garage door so you open it. Bad move. They are zombies! You dont survive. GAME OVER.");
           programRun = tryAgain();
        }
      }

    }
  }

  public static boolean tryAgain () {
    Console console = System.console();
    System.out.println("Would you like to try again: yes or no");
    String userTryResponse = console.readLine();
    boolean status = false;
    if (userTryResponse.equals("yes")) {
      status = true;
    } else if (userTryResponse.equals("no")) {
      status = false;
    }

    return status;
  }
}
