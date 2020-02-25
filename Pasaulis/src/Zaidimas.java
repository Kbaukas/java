import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Zaidimas {
    public static void main(String[] args) {
        long start=System.currentTimeMillis();
        Pasaulis pasaulis = new Pasaulis();

        List<Zmogus> pradinis=new ArrayList<>();
        for(int i=0; i<500;i++){
           int random = (int) (Math.random() * 100 + 1);
            Zmogus z = new Zmogus();
            pasaulis.pridetiZmogu(z);
//           pradinis.add(z);
           z.amzius=random;
        }
        pasaulis.zmones.addAll(pradinis);

        System.out.println(pasaulis.zmones);
        for (int i = 0; i <= 500; i++) {
            if (pasaulis.zmones.size() > 0) {
                pasaulis.gimstaZmones();
                pasaulis.sendinameZmones();

                pasaulis.zmonesMirsta();

                System.out.println("zmoniu liko "+pasaulis.kiekYraZmoniu());
                System.out.println("Metai: "+i);

            } else{ System.out.println("Metai: "+i);break;}

        }
        //TODO su multibranduoliniu cpu kad greiciau skaiciuotu.
//        listas.parallelstream().forEach(i->{
//            if(i>50)
//        })
//        System.out.println(pasaulis.zmones);
long time=System.currentTimeMillis()-start;
        System.out.println("time: "+time);
    }
}
