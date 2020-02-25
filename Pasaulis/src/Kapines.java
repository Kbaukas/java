import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Kapines {

    public static ArrayList<Zmogus> kapai(ArrayList<Zmogus> zmones) {
//        List<Zmogus> tarpinisIsmetimui=new ArrayList<>();
        for (Zmogus zmogus : zmones
        ) {
            int age = zmogus.amzius;

            Random  randomas=new Random();
            int random=0;

//            int random = (int) (Math.random() * 1000 + 1);
            if (age < 20) {
                random=randomas.nextInt(1000 + 1);
                if (random <= 1)

                    zmogus.amzius=-1;

            } else if (age >= 20 && age < 30) {
                random=randomas.nextInt(1000 + 1);
                if (random <= 5)
                    zmogus.amzius=-1;
            } else if (age >= 30 && age < 50) {random=randomas.nextInt(1000 + 1);
                if (random <= 10)
                    zmogus.amzius=-1;

            } else if (age >= 50 && age < 60) {
                random=randomas.nextInt(1000 + 1);
                if (random <= 20)
                    zmogus.amzius=-1;

            } else if (age >= 60) {
                random=randomas.nextInt(100 + 1);
                if (random < 30) {
                    zmogus.amzius=-1;
//                    System.out.println(random);
//                    System.out.println("mirsta "+zmogus.amzius);
                }
            }
//            System.out.println(random);
        }
        return zmones;
    }
}
