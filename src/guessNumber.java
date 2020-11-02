import java.util.Random;
import java.util.Scanner;

public class guessNumber {
    public static void main(string[] args){
try(Scanner scanner=new Scanner(system.in)){
    Random random =new Random();
    int upperbound =100;
    int i_random = random.nextInt(upperbound);

    //saisie des essais jusqua dix fois maw
    int userInput=0;
    while (nbTrying=10){

        System.out.println("entrer le premier essai:");
        userInput= scanner.nextInt();
        while(userInput!= i_random){
            if(userInput>i_random){
                System.out.println("votre essai est plus grand");
            }
            else{
                System.out.println("votre essai est plus petit:");
            }
        } nbTrying++;


    }
}
    }
}
