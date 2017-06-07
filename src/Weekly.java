import java.util.Scanner;

/**
 * Created by Jacob on 5/20/2017.
 */
public class Weekly {
    public void Wexpensis(double income, double wexpenses){

        Scanner s = new Scanner(System.in);
        System.out.println("Please input your Weekly income");
        income = s.nextDouble();

        System.out.println("Input your weekly expenses");
        wexpenses = s.nextDouble();

        double x = income - wexpenses;
        System.out.println("After subtracting your expenses, this is what is left for savings..." + x);

        System.out.println("Would you like to cut a percentage for savings? [Yes or No}");
        String a = s.next();

        if(a.equalsIgnoreCase("yes")) {
            System.out.println("What percentage would you like to use for savings?");
            double perc = s.nextDouble();
            double savings = (x * (perc / 100));
            double d = savings;
            d = Math.round(d * 100) / 100.0d;
            System.out.println(perc + " percent of " + x + " = " + d);

            System.out.println("How many items would you like to distribute this percentage to?");
            double j = s.nextDouble();
            double e = Math.round((d/j)+(d%j));
            System.out.println("The amount given to all items is..." + e);

            System.out.println("Would you like to use the same income again for a future Weekly estimate?");
            System.out.println("Press 1 for yes, 0 for no and press 'Enter' ");
            int yes = s.nextInt();
            int i = 1;
            double sum = d;

            while (yes != 0) {
                System.out.println("What percentage would you like to use for savings?");
                double perc2 = s.nextDouble();
                savings = (x * (perc2 / 100));
                double w = savings;
                d = Math.round(d * 100) / 100.0d;
                System.out.println(perc2 + " percent of " + x + " = " + w);

                System.out.println("How many items would you like to distribute this percentage to?");
                j = s.nextDouble();
                e = Math.round((d/j)+(d%j));
                i++;
                System.out.println("The amount given to all items is..." + e);

                sum += d;
                System.out.println("Week count: " + i + "\nWeekly savings added together...." + sum);
                System.out.println("Would you like to see next Weekly savings?");
                System.out.println("Press 1 for yes, 0 for no and press 'Enter' ");
                yes = s.nextInt();
            }

        }

        if(a.equalsIgnoreCase("no")){
            System.out.println("Your income of " + x + " will be used.");
            double d = x;
            d = Math.round(d*100)/100.0d;
            System.out.println("How many items do you wish to save for?");
            double even = s.nextDouble();

            System.out.println("The program will now distribute your money evenly...");
            double savings = Math.round((x / even)+(x%even));
            d = savings;
            d = Math.round(d * 100) / 100.0d;
            System.out.println("The amount of money that went into each item is: " + d);

            System.out.println("Would you like to use the same income again for a future Weekly estimate?");
            System.out.println("Press 1 for yes, 0 for no and press 'Enter' ");
            int yes = s.nextInt();
            int i = 2;
            double sum = d;

            while(yes != 0){
                System.out.println("Your income of " + x + " will be used.");
                d = x;
                d = Math.round(d*100)/100.0d;
                System.out.println("How many items do you wish to save for?");
                even = s.nextDouble();

                System.out.println("The program will now distribute your money evenly...");
                savings = Math.round((x / even)+(x%even));
                d = savings;
                d = Math.round(d * 100) / 100.0d;
                System.out.println("The amount of money that went into each item is: " + d);

                sum += d;
                i++;
                System.out.println("Week count: " + i + "\nWeekly savings added together...." + sum);
                System.out.println("Would you like to see next Weeks savings?");
                System.out.println("Press 1 for yes, 0 for no and press 'Enter' ");
                yes = s.nextInt();
            }
        }
    }
}
