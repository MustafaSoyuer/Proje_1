package com.mustafa.Operatorler;

public class Runner_Ornek_Aritmetik_Operatorler {
    public static void main(String[] args) {

        /**
         *  Aritmetik operatörler :
         *  Matematiksel işlemleri gerçekleştirmek için kullanılan operatör türüdür.
         */
        int sayi1=25, sayi2=18, sayi3=3;
        // " \t " tab kadar boşluk bırakır. Daha düzenli çıktı almak için kullanılmıştır.
        /**
         *  1- Ekleme (+) yani toplama işlemleri için kullanılır.
         */
        int toplam= sayi1 + sayi2;
        System.out.println("Toplama...\t:"+toplam);

        /**
         *  2- Çıkarma (-) işlemleri için kullanılır.
         */
        int fark = sayi1 - sayi2;
        System.out.println("Cıkarma...\t:"+fark);

        /**
         *  3- Çarpma (*) işlemleri için kullanılır.
         */
        int carpim = sayi1 * sayi3;
        System.out.println("Carpım...\t:"+carpim);

        /**
         *  4- Bölme (/) işlemleri için kullanılır.
         */
        int bolum = sayi2 / sayi3;
        System.out.println("Bölüm...\t:"+bolum);

        /**
         *  5- Mod Alma (%) işlem sonucunda ortaya çıkan kalan değerini verir
         */
        int mod = sayi1 % sayi3;
        System.out.println("Mod...\t\t:"+mod);

        /**
         *      Not: Ekleme operatörü stringler ile kullanılırsa, String ifadeleri birleştirir.
         */
        System.out.println("Java"+" çalışmak"+" için "+"güzel bir gün");




    }//mainn sonu
}
