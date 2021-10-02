import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw.3 */

        /*  zad.1 napisać interfejs który bedzie słuzył do wpisania danych osobowych:
        *   a) Imię, nazwisko, wiek, nr indeksu,
        *   dane mają być wprowadzane z klawiatury w konsoli
        *   b) wyświetlić dane za pomocą println i printf
        */
            Scanner sc=new Scanner(System.in);

            System.out.print("Imię: ");
            String name=sc.next();
            System.out.print("Nazwisko: ");
            String lname=sc.next();
            System.out.print("Wiek: ");
            String age=sc.next();
            System.out.print("Nr indeksu: ");
            String ind=sc.next();

            System.out.printf("%s"+name+ "%s"+lname+"%s"+age+"%s"+ind +"\n"   ,"\tImię: ","\tNazwisko: ","\tWiek: ","\tNr Indexu: ");

        /*  zad.2 zadeklarować 2 zmienne typu int i wykonać na nich obliczenia arytmetyczn (+, -, *, /, %)
        *   wynik wyświetlić w konsoli programu
        */

            System.out.print("Podaj X: ");
            int x=sc.nextInt();
            System.out.print("Podaj Y: ");
            int y=sc.nextInt();

            double Z;
            Z=x+y;
            System.out.println("X + Y = "+Z);
            Z=x-y;
            System.out.println("X - Y = "+Z);
            Z=x*y;
            System.out.println("X * Y = "+Z);
            Z=x/y;
            System.out.println("X / Y = "+ Z);
            Z=x%y;
            System.out.println("X mod Y = "+Z);

    }
}
