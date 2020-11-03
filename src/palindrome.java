import java.util.Scanner;

public class palindrome {
    public static  void  Play(){
        try(Scanner scan = new Scanner(System.in)){
            System.out.println("écrire votre mot:");
            String userInput = scan.nextLine();
            String reverse ="";
            for (int i = userInput.length()-1; i >=0; i--) {
                reverse += userInput.charAt(i);
                if(reverse.equals(userInput)){
                    System.out.println("ceci est un palindrome !");
                }
                else{
                    System.out.println("ceci n est pas un palindrome");
                }


            }
        }
    }
}
