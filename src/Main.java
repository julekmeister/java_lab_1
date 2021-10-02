import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw.5 */

        /* zad.1 podziel swój wiek przez modulo 3 i jeśli twój wiek zwraca 0 wyświetl napis "Podzielny przez 3",
         * w innym wypadku "Niepodzielny przez 3" użyj kontrukcji if else
         * */
    int age=37;
    if (age%3==0)
    {
        System.out.println("Podzielny przez 3");
    } else
    {
        System.out.println("Niepodzielny przez 3");
    }

        /* zad.2 użyj parametru trójargumentowego aby sprawdzić parzystośc nr. indeksu */

        int in = 599356;
        if (in%2==0)
        {
            System.out.println("Index jest parzysty");
        }
        else
        {
            System.out.println("Index jest nieparzysty");
        }



        /* zad.3 wpisz z klawiatury liczbę zmiennoprzecinkową (użyj klasy Scanner z poprzednich ćwiczeń)
         * i stwórz konstrukcję else if z dowolnymi komunikatami */

        Scanner sc=new Scanner(System.in);
        System.out.println("Podaj liczbę zmiennoprzecinkową: ");
        double lz=sc.nextDouble();

        if (lz>3&&lz<4)
        {
            System.out.println("Liczba mieści się między 3 a 4");
        }
        else if (lz>4&&lz!=5)
        {
            System.out.println("Liczba większa od 4, ale nie jest równa 5");
        }
        else
        {
            System.out.println("Twoja liczba to :"+lz);
        }
    }
}
