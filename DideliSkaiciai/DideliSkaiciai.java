
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//------------------------------Class constructor----------------------------------------------------------------
public class DideliSkaiciai {
    byte[] masyvas = new byte[50];
    byte[] skaiciukas = new byte[50];  // 0 0 0 0 0 0 0 0 0 ... 0 0 0

    public DideliSkaiciai(String pradiniai) { // 1 2 3
        int k = pradiniai.length() - 1;
        for (int i = 0; i < pradiniai.length(); i++) {

            skaiciukas[k] = Byte.parseByte(String.valueOf(pradiniai.charAt(i)));
            k--;
        }
    }

//-------------------------------------------------Dalyba----------------------------------------------------
    void dalintiIs(int daliklis) {
        int numinusuoti = 0;
        int kuriDalinam = 0;
        for (int i = skaiciukas.length - 1; i >= 0; i--) {
            int resultatas = (skaiciukas[i] + kuriDalinam) / daliklis;
            kuriDalinam = ((skaiciukas[i] + kuriDalinam) - (daliklis * resultatas)) * 10;

            skaiciukas[i] = (byte) resultatas;
        }
    }

//-----------------------------------------------Daugyba-------------------------------------------------------
    void daugintiIs(int skaicius) {
        int mintis = 0;
        for (int i = 0; i < skaiciukas.length; i++) {
            int resultatas = skaiciukas[i] * skaicius + mintis;
            mintis = resultatas / 10;
            skaiciukas[i] = (byte) (resultatas % 10);
        }
    }
//-------------------------------------------Sudetis----------------------------------------------------------
    void prideti(DideliSkaiciai dideliSkaiciai) {
        int mintis = 0;
        for (int i = 0; i < skaiciukas.length; i++) {
            int resultatas = skaiciukas[i] +
                    dideliSkaiciai.skaiciukas[i] +
                    mintis;
            mintis = resultatas / 10;
            skaiciukas[i] = (byte) (resultatas % 10);
        }
    }
//-------------------------------------Spausdinimas----------------------------------------------------------
    void spausdinti() {
        boolean saugiklis = false;
        for (int i = skaiciukas.length - 1; i >= 0; i--) {
            if (skaiciukas[i] > 0) {
                saugiklis = true;
            }
            if (saugiklis) {
                System.out.print(skaiciukas[i] + " ");
            }


        }
        System.out.println();
    }

    //    ----------------------------------Konvertuoti i objektu masyva-------------------------------------------
    Object[] konverteris() {
        List<Byte> konvertuotasListas = new ArrayList<>();

        int k = 0;
        boolean saugiklis = false;
        for (int i = skaiciukas.length - 1; i >= 0; i--) {
            if (skaiciukas[i] > 0) {
                saugiklis = true;
            }
            if (saugiklis) {

                konvertuotasListas.add(skaiciukas[i]);
                k++;
            }


        }
        Object[] arr = konvertuotasListas.toArray();
        return arr;
    }
}


//    ===========================================Main class=============================================

class TestuojameDideliusSkaiciuss {
    public static void main(String[] args) {
        String pradinis = "1";

        DideliSkaiciai dideliSkaiciai = new DideliSkaiciai(pradinis);
       /* dideliSkaiciai.spausdinti();
        dideliSkaiciai.daugintiIs(4);
        dideliSkaiciai.spausdinti();
        dideliSkaiciai.dalintiIs(3);
        dideliSkaiciai.spausdinti();
        dideliSkaiciai.prideti(new DideliSkaiciai("34556"));
        dideliSkaiciai.spausdinti();
*/
//        System.out.println(Arrays.toString(masyvas));
//        ---------------------su Grudais Uzduotis---------------------------------------------------
        boolean trigger = false;
        int k = 63;
        List<Byte> naujasListas = new ArrayList<>();
        byte[][] naujasMasyvas = new byte[100][dideliSkaiciai.skaiciukas.length];
        byte tarpinis = 0;
        for (int i = 0; i < k; i++) {

            dideliSkaiciai.daugintiIs(2);
            for (int j = 0; j < dideliSkaiciai.skaiciukas.length; j++) {
                if (dideliSkaiciai.skaiciukas[j] > 0) {
                    trigger = true;
                }
                if (trigger) {
                    naujasListas.add(dideliSkaiciai.skaiciukas[j]);
                }
            }
//            dideliSkaiciai.spausdinti();
        }

        String konverteris = Arrays.toString(dideliSkaiciai.konverteris());
        System.out.println();
        System.out.println((konverteris));
//        --------------------------Uzduoties Pabaiga--------------------------------------------------
    }
}