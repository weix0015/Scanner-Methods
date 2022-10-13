import java.util.Scanner;

public class GuessTheCelebrity {
    public static void main(String[] args) {
        String navn = "KanyeWest";
        String gæt;
        boolean keepGuessing = true;
        Scanner in = new Scanner(System.in);

            System.out.println("Guess The Celebirty");
            System.out.println("The first Hint: It's a male Rapper");
            gæt = in.nextLine();


            if (gæt != navn) {
                System.out.println("Wrong");
                System.out.println("Hint 2: He is an american");
                gæt = in.nextLine();
            }
            if (gæt != navn) {
                    System.out.println("Wrong");
                    System.out.println("Hint 3: Han er lige blevet skilt");
                gæt = in.nextLine();
            }
            if (gæt == navn)
                System.out.println("You Guess Correct");
                keepGuessing = false;

                }
            }