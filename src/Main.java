import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* Tablice - cw_6 */

        /* zad1. stworzyć tablicę typu double 5-cio elementową,
        przypisać do niej wartości i wyświetlić */
        double[] tabs=new double[5];
        for (int i=0;i<5;i++)
        {
            tabs[i]= i*2;
            System.out.print("\tIndeks "+i+": "+tabs[i]);
        }

    }
}
