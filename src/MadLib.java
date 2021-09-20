import javax.swing.*;
import java.util.Scanner;

public class MadLib {

    /*Create your own MadLibs. (https://www.madtakes.com/) You may use a story or example from the
    website if you don't wish to make up your own. This program must run entirely in the console.
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String noun1,nounPlural,noun2,place,adjective,noun3;

        System.out.println("enter a singular noun");
        noun1 = read.nextLine();
        System.out.println("enter a plural noun");
        nounPlural = read.nextLine();
        System.out.println("enter a second singular noun");
        noun2 = read.nextLine();
        System.out.println("enter a place");
        place = read.nextLine();
        System.out.println("enter an adjective");
        adjective = read.nextLine();
        System.out.println("enter a third singular noun ");
        noun3 = read.nextLine();

        System.out.println("Be kind to your " + noun1 + "-footed " + nounPlural + "For a duck may be somebody`s " + noun2 + ", Be kind to your" + nounPlural + "in " + place + "Where the weather is always" + adjective +". You may think that this is the " + noun3 + "Well it is.");
        System.exit(0);

    }


}