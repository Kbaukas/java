package com.NewPackage;
import com.WriteToFile.*;

import java.io.*;
import java.lang.reflect.Array;
import java.math.BigInteger;
import java.util.Arrays;

public class PenktaMain {
    public static void main(String[] args) throws IOException {
        System.out.println("main class");
//        primityvios reiksmes kopijuojamos
        String[][] stringuMass = new String[8][8];
//        BigInteger[][] matrix = new BigInteger[8][8];
//        BigInteger[] mass = new BigInteger[64];
        long sum = 1;
//      Pradine didinimo reiksme
        BigInteger suma = BigInteger.valueOf(1);
//        WriteToFile irasomtxt = new WriteToFile();
//        sukuriame aoutput faila
        File failas = new File("c:/java_out/output.txt");
      FileWriter  filewriteris = new FileWriter(failas);
        PrintWriter outas = new PrintWriter(filewriteris);
        int i=0;
        for (String[] massyviukas : stringuMass
        ) {
            i=0;
            System.out.print("[");
            outas.print("[");
            for (String elem : massyviukas
            ) {
                if(i==7) {
                    outas.print(" " + suma + " ");
                    System.out.print(" " + suma + " ");
                }else{
                outas.print(" "+suma+", ");

                System.out.print(" " + suma + ", ");}
//                        System.out.println(elem);
                suma = suma.multiply(BigInteger.valueOf(2));
//                        System.out.print(elem+" ");
                String istringa = String.valueOf(suma);

                 i++;
                }

            outas.print("]");
            outas.println();
            outas.println();
                System.out.print("]");
                System.out.println();

            }
                 outas.close();
    }


    }


