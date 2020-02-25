/*
 2.Pasaulis
    duomenys:
      -zmoniu sarasas

      veiksmai/metodai:
             -auga metai
                    -zmones mirsta
                             -kai amzius < 20,mirtis tikimybe 1%
                             -kai amzius < 30, mirties tikimybe 5%;
                             -kai amzius < 50, mirties tikimybe 10%;
                             -kai amzius < 30, mirties tikimybe 20%;
                              ->=60, mirites tikimybe 30%
                    -zmones gimsta
                              -populiacija >18 iki <40, tikimybe 10%
                     -kiek yra zmoniu
*/


import java.util.ArrayList;
import java.util.List;

public class Pasaulis {

    List<Zmogus> zmones = new ArrayList<Zmogus>();


    void pridetiZmogu(Zmogus z) {
        zmones.add(z);
    }

    //sendiname zmones
    void sendinameZmones() {
        //TODO
        for (Zmogus zmogus : zmones) {
            zmogus.amzius++;

        }
    }

    //-kiek yra zmoniu
    int kiekYraZmoniu() {
        return zmones.size();
    }

//---------------------Zmones gimsta---------------------
    void gimstaZmones(){
        int counter=0;
        for (Zmogus zmogus:zmones){

            if(zmogus.amzius>20&&zmogus.amzius<40){
                int random = (int) (Math.random() * 100 + 1);
                if(random<=10){
                    counter++;
                }

                ;
            }
        }
        for(int i=0;i<counter-1;i++){
            Zmogus zmogus=new Zmogus();
            zmogus.amzius=0;
            zmones.add(zmogus);
        }
    }
    //    -----------Zmones mirsta-------------------


    void zmonesMirsta() {
        Kapines kapines = new Kapines();
        zmones = kapines.kapai((ArrayList<Zmogus>) zmones);
        List<Zmogus> tarpinisIsmetimui=new ArrayList<>();
//        int azmius=Zmogus.age;
//TODO jei zmogus mirs priskiriam amziui reiksme -1 ir paskui visus su reiksme -1 istrinam is listo.Reikia pries tai suskurti random  metoda.
        double procentai = 0;
        int i = 0;
        if (zmones.size() > 0) {
            for (Zmogus zmogus : zmones) {
//                System.out.println("zmoniu amzius " + zmogus.amzius);
                if (zmogus.amzius == -1) {
                    tarpinisIsmetimui.add(zmogus);
//                    zmones.remove(zmogus);
//                    System.out.println("tarpinis ismetimui ");
                }

            }
        }else System.out.println("Visi mire");
    zmones.removeAll(tarpinisIsmetimui);
    tarpinisIsmetimui.clear();
    }

}
