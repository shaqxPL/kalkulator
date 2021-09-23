import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Witaj w kalkulatorze");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj pierwsza liczbe:");
        double first = scanner.nextDouble();

        System.out.println("Podaj druga liczbe:");
        double second = scanner.nextDouble();



        double dodawanie = first + second;
        System.out.println("wynik dodawania to: " + dodawanie);
        double odejmowanie = first - second;
        System.out.println("wynik odejmowania to: " + odejmowanie);
        double mnozenie = first * second;
        System.out.println("wynik mnozenia to: " + mnozenie);
        double dzielenie = first / second;
        System.out.println("wynik dzielenia to: " + dzielenie);




    }




}
