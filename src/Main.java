import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Witaj w kalkulatorze");


        System.out.println("Podaj pierwsza liczbe:");
        double first = scanner.nextDouble();

        System.out.println("Podaj druga liczbe:");
        double second = scanner.nextDouble();

        System.out.println("wybierz dzialanie ");
        System.out.println("dla dodawanie: +");
        System.out.println("dla odejmowania: -");
        System.out.println("dla mnozenia: *");

        char answer = scanner.next().charAt(0);

        if (answer == '+') {
            System.out.println("dodanie " + first + " i " + second + " rowna sie " + (first + second));

        }else if (answer == '-') {
            System.out.println("odjecie " + first + " i " + second + " rowna sie " + (first - second));
        }else if (answer == '*') {
            System.out.println("mnozenie " + first + " i " + second + " rowna sie " + (first * second));
        }else {
            System.out.println("zachowuj sie");
        }
    }
}
