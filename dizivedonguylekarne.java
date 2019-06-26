package com.example.hp.degiskenler1;

import java.util.Scanner;

public class dizivedonguylekarne {

    public static void main(String arg[]){

        Scanner tarayici =new Scanner (System.in);

        String dersler []=new String[3];
        int notlar [] = new int[3];

            for (int i =0;i<dersler.length;i++)
            {

                System.out.println((i+1) + ".dersi giriniz");
                String ders = tarayici.next ();

                dersler[i] = ders;

                System.out.println((i+1) + ".notu giriniz");
                int not = tarayici.nextInt ();

                notlar[i] = not; //konsoldan alınan notu notlar dizisine aktardı
            }

            int toplam = 0;

            for (int k = 0; k < notlar.length ; k++ )
            {
                System.out.println(dersler[k]+ " =" +notlar[k]);

                toplam =toplam + notlar[k];

            }

            int ort = toplam / dersler.length;
            System.out.println("Ortalama : " + ort);


            if(ort >=50)
            {
                System.out.println("Tebrikler geçtiniz");

            }

            else
            {
                System.out.println("kaldınız..");
            }
    }


}

