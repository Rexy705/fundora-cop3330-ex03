import java.util.Scanner;

public class ex03 {
    public static void main (String[] args){
        System.out.println("What is the quote?");
        Scanner input = new Scanner(System.in);
        String quote = input.nextLine();

        System.out.println("Who said it?");
        Scanner input2 = new Scanner(System.in);
        String who = input2.nextLine();

        System.out.println(who + " says, " + "\"" + quote + "\"");
    }
}
