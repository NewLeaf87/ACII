import java.util.Scanner;
public class ASC {

    public static void main(String[] args) {

        printNumbers();
        printUpperCase();
        printLowerCase();

        String name;
        String choice;
        String car;
        String pet;
        int num;
        int petAge;
        int qb;
        int modal;
        String act;
        int ranNum;
        


        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter your name");
        name = keyboard.nextLine();
        System.out.println("Hello " + name);
        System.out.println("do you with to continue? yes / no");
        choice = keyboard.nextLine();

        if(choice.equals("no")) {
            System.out.println("Later!");
        }else {
            System.out.println("Do you have a red car? yes/no");
            car = keyboard.nextLine();
            System.out.println("Favorite pet name?");
            pet =keyboard.nextLine();
            System.out.println("Pet age");
            petAge = keyboard.nextInt();
            System.out.println("Lucky Number?");
            num = keyboard.nextInt();
            System.out.println("favorite quarterback?what is their jersey number? ");
            qb = keyboard.nextInt();
            System.out.println("two-digit model year of their car");
            modal = keyboard.nextInt();
            keyboard.nextLine();
            System.out.println("favorite actor or actress?");
            act = keyboard.nextLine();
            System.out.println("random number between 1 and 50.");
            ranNum =keyboard.nextInt();
            
        }
        
    }

    public static void printNumbers() {
        // decimal ASCII values for integers = 48-57
        for (int c = 48; c < 58; c++) {
            System.out.print((char) c);
        }
        System.out.println();
    }

    public static void printLowerCase() {
        // Decimal ASCII values for Lowercase letter = 69-90
        for (int c = 97; c < 122; c++) {
            System.out.print((char) c);
        }
        System.out.println();
    }

    public static void printUpperCase() {

        for (int c = 65; c < 90; c++) {
            System.out.print((char) c);
        }
        System.out.println();
    }
    
}