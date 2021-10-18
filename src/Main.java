import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner scan=new Scanner(System.in);

        System.out.print("Wprowadź liczbę, a ja sprawdzę czy jest parzysta: ");
        int userInput=scan.nextInt();

        //tworzę tę zmienną po to, żeby dowiedzieć się czy liczba jest podzielna przez 2 (dzielenie modulo)
        int oddOrEven = userInput%2;

        //początek konstrukcji "switch". W skrócie, w nawiasie podajemy argument wejściowy do warunku
        switch(oddOrEven){ //tutaj są dwa "case". "0" i "1". Czyli nasz switch zwróci nam wartość 0 albo 1.
            case 0: //jeśli switch zwróci 0, to wykona się kod poniżej
                System.out.println(userInput+" to parzysta liczba");
                break;
            case 1: //jeśli switch zwróci 1, to wykona się kod poniżej
                System.out.println(userInput+" to nieparzysta liczba");
        }
    }
}

