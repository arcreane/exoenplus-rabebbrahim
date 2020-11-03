import java.util.Scanner;

public class threeArrays {
    public static void Numbers(){
        try (Scanner scanner= new Scanner(System.in)){
            int[] tab1= new int[5];
            int[] tab2 =new int[5];
            int[]  tab3= new int[5];
            for (int i = 0; i < 5; i++) {
                try {

                while((tab1[i]<=10&&tab1[i]>=0) && (tab2[i]<=10 && tab2[i]>=0) && (tab3[i]<=10 && tab3[i]>=0)) {
                    for(int j=0;j<5;j++){
                        if((tab1[i]!=tab1[j]) && (tab2[i]!=tab2[j]) && (tab3[i]!=tab3[j])){
                            System.out.println("saisie correcte! entrer un autre different nombre!");
                        }
                        else{
                            System.out.println("numero erroné , réessayer svp!");
                        }

                    }
                }catch(Exception e);



            }
                System.out.println("le premier tableau est :"+tab1);
                System.out.println("le deuxieme tableau est :"+tab2);
                System.out.println("le troisieme tableau est:"+tab3);
                

        }
    }
}
