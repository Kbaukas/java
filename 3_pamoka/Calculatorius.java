import java.sql.SQLOutput;
import java.util.Scanner;

public class Calculatorius {
    private static double NaN;

    //sukuriame funkcija kuri tikrina koki veiksma atlikti ir grazina rezultata
    public static double  calculate(char symbol, double a, double b) {
        double veiksmas = 0;
        boolean tikrinam = false;
        switch (symbol) {
            case '+':
                veiksmas = a + b;
                break;
            case '-':
                veiksmas = a - b;
                break;
            case '/':
                veiksmas = a / b;
                break;
            case '*':
                veiksmas = a * b;
                break;
            case '%':
                veiksmas = a % b;
                break;
            default:

                veiksmas = NaN;
        }
        return veiksmas;
    }
    public static void main(String[] args) {
        boolean daryti=false;
        double veiksmas=0;
        double a=0,b=0;
        char symbol=' ';
        String testi="";
        Scanner input=new Scanner(System.in);
        do {
        System.out.println("----------------------------Calculator---------------------");

//tikriname a ivedama reiksme
             do {
                System.out.print("Iveskite a: ");
                while (!input.hasNextDouble()) {
                    String inputas = input.next();
                    System.out.printf("\"%s\" Neteisinga a reiksme.\n", inputas);
                    daryti=true;
                    System.out.print("Iveskite a dar karta: ");
                }
                 a = input.nextDouble();
                 daryti=false;

            } while (daryti!=false);


//        a = input.nextDouble();

        System.out.println("a: "+a);

//ivesti matematini veiksma
         System.out.println("Iveskite matematini veiksma: ");
         symbol = (input.next()).charAt(0);

//         tikriname b ivedama reiksme
            do {
                System.out.print("Iveskite b: ");
                while (!input.hasNextDouble()) {
                    String inputas = input.next();
                    System.out.printf("\"%s\" Neteisinga b reiksme.\n", inputas);
                    daryti=true;
                    System.out.print("Iveskite b dar karta: ");
                }
                b = input.nextDouble();
                daryti=false;

            } while (daryti!=false);
            veiksmas = calculate(symbol, a, b);

//tikriname ar matematinis operatorius buvo teisingas
            if (veiksmas == NaN) {
                System.out.println("Ivedete neteisinga operatoriu!!!");
            } else {
                System.out.println("veiksmas " + veiksmas);
                System.out.println(a + " " + symbol + " " + b + " = " + veiksmas);
                System.out.print("Testi? (y/[N]) ");
                testi = input.next();
            }

//          vykdome tol kol neivedame y arba Y.

    } while (testi.toLowerCase().equals("y"));
    }
}
