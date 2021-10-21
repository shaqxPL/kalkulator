import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner scan=new Scanner(System.in);

        System.out.print("Wprowadź liczbę, a ja sprawdzę czy jest parzysta: ");
        int userInput=scan.nextInt();

        switch(userInput%2) {
            case 0:
                System.out.println(userInput+" to parzysta liczba");
                break;
            case 1:
                System.out.println(userInput+" to nieparzysta liczba");
        }
    }
}

