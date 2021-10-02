import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int zmiennaInt = 7;
        System.out.println("zmienna int = " + zmiennaInt);
        /* ćw.2 */

        /*   zad.1 zadeklaruj i zainicjalizuj zmienne różnych typów i wyświetl w konsoli (im więcej tym lepiej ;) ) */
    byte zb=15;
    short zs=2;
    int zi=2000;
    long zl=9223372036854775806L;
    float zf=0.1234F;
    double zd=123.123456789012345;
    boolean zbo=false;
    char zc='C';
    String zst="Hello świecie";

        System.out.printf("\n%s byte = " +zb,"zmienna");
        System.out.printf("\n%s short = " +zs,"zmienna");
        System.out.printf("\n%s int = " +zi,"zmienna");
        System.out.printf("\n%s long = " +zl,"zmienna");
        System.out.printf("\n%s float = " +zf,"zmienna");
        System.out.printf("\n%s double = " +zd,"zmienna");
        System.out.printf("\n%s boolean = " +zbo,"zmienna");
        System.out.printf("\n%s char = " +zc,"zmienna");
        System.out.printf("\n%s String = " +zst,"zmienna");

        /*
        *    zad.2 Napisz kod który będzie wykonywał operacje: dodawania, odejmowania,
        *    mnożenia, dziealenia i modulo na zmiennych:
        *    a) liczbaA i liczbaB, dowolne liczby calkowite (int),
        *    b) liczbaX i liczbaY, dowolne liczby zmiennoprzecinkowe (double)
        *  */


        // a)
        int liczbaA=2; int liczbaB=3; double x;

        x=liczbaA+liczbaB;
        System.out.print("\n"+x);

        x=liczbaA-liczbaB;
        System.out.print("\n"+x);

        x=liczbaA*liczbaB;
        System.out.print("\n"+x);

        x=liczbaA/liczbaB;
        System.out.print("\n"+x);

        x=liczbaA%liczbaB;
        System.out.print("\n"+x);

        // b)
        double liczbaX=1.5; double liczbaY=3.3;

        x=liczbaX+liczbaY;
        System.out.print("\n"+x);

        x=liczbaX-liczbaY;
        System.out.print("\n"+x);

        x=liczbaX*liczbaY;
        System.out.print("\n"+x);

        x=liczbaX/liczbaY;
        System.out.print("\n"+x);

        x=liczbaX%liczbaY;
        System.out.print("\n"+x);


    }
}
