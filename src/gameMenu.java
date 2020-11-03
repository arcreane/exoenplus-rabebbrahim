import java.util.Scanner;

public class gameMenu {
    public static void main(String[] args) {
        boolean keepPlaying= true;
        while(keepPlaying){
            System.out.println("choisir entre les options suivantes ");
            System.out.println("1- guessNumber");
            System.out.println("2- palindrome");
            System.out.println("3-quit");
            public static int getUserInput(){
                Scanner sc = new Scanner(System.in);
                int userInput=0;
                try{
                    userInput= sc.nextInt();
                }catch (Exception e){
                    System.out.println("désolé entree erronée, essai une autre fois!");
                }sc.nextLine();
                return userInput;
            }
            int userInput = getUserInput();
            switch (userInput){
                case 1 ->{guessNumber()};
                case 2 ->{palindrome()};
                default ->{"essai un autre fois"};
            }
        }
    }
}