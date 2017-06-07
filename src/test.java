/**
 * Created by Jacob on 5/18/2017.
 */
import java.util.*;


public class test {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double x = 0;

        System.out.println("press 1 to start calculating percentages.");
        int j = s.nextInt();

        do {
            System.out.println("Enter Retail Price....");
            x = s.nextDouble();

            double y = x * .15;
            double z = x - y;

            System.out.println("The price after a 15 percent reduction from an AD if you're lucky is....");
            System.out.println(z);

            if (z == 0)
            {
                System.out.println("Press 0 and enter one more time to exit the program.");
                j = s.nextInt();
            }
        }while(j != 0);

    }
}
