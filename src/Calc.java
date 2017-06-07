/**
 * Created by Jacob on 5/14/2017.
 */
import java.math.*;
import java.util.*;

public class Calc {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double income = 0;
        double wexpenses = 0;
        double mexpenses = 0;
        double savings = 0;

        System.out.println("How would you like to distribute your savings?");
        System.out.println("Press 1 for Yearly.");
        System.out.println("Press 2 for Monthly.");
        System.out.println("Press 3 for Weekly.");
        System.out.println("Press 4 for Bi-Weekly");
        int choice = s.nextInt();

        switch (choice) {
            case 1:
                Yearly opt1 = new Yearly();
                opt1.YWexpensis(income,wexpenses,mexpenses);

                break;
            case 2:
                Monthly opt2 = new Monthly();
                opt2.MWexpensis(income, wexpenses,mexpenses);
                break;
            case 3:
                Weekly opt3 = new Weekly();
                opt3.Wexpensis(income,wexpenses);
                break;
            case 4:
                BiWeekly opt4 = new BiWeekly();
                opt4.BWexpensis(income,wexpenses);
            default:
                System.out.println("That is not a valid choice.");
        }
    }
}
