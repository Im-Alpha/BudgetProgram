/**
 * Created by Jacob on 5/11/2017.
 */
import javax.swing.*;
import java.io.*;
import java.util.*;

public class TotalBudget {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double x = 0;
        System.out.println("How big would you like to make the list?");


        double[] myVariable = new double[(int) (x = s.nextDouble())];
        for(int i = 0; i< myVariable.length; i++) {
            myVariable[i] = i*10;
        }

        File fileName = new File("output.txt");

        try {
            FileWriter writer = new FileWriter("MyFile.txt", true);
            for (int i = 0; i < myVariable.length; i++) {
                for (int j = 0; j < myVariable.length; j++) {
                    writer.write(myVariable +" ");
                }
                //this is the code that you change, this will make a new line between each y value in the array
                writer.write("\n");   // write new line
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    }
