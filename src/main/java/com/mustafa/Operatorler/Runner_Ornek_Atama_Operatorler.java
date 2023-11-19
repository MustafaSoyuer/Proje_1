package com.mustafa.Operatorler;

public class Runner_Ornek_Atama_Operatorler {
    public static void main(String[] args) {

        /**
         *  Atama Operatörleri :
         *  Bir değişkeni başka bir değişkene atamak veya bir değişkene bir veri atamak için kullanılır.
         *  Atama operatörleri kullanılırken, aynı zamanda aritmetik operatörler de kullanılabilir.
         */

        /**
         *  = Operatörü :
         *  Atama işlemleri her zaman sağdan sola bir şekilde gerçekleştirilir.
         */
        int sayi1 = 10; // sayi1 değişkenine 10 değeri atanmaktadır.
        System.out.println("Sayi1..: "+sayi1);

        /**
         *  += Operatörü :
         *  Solda bulunan değere, sağdaki değeri ekleyerek tekrar soldaki değere atamasını gerçekleştirir.
         */
        sayi1 += 5; // sayi1 değişkenine 5 değeri eklenip tekrar sayi1 değerine atanır.
        System.out.println("+= sonucu..: "+sayi1);

        /**
         *  -= Operatörü :
         *  Solda atanan değerden, sağdaki değeri çıkararak tekrar solda yer alan değere atama gerçekleştirir.
         */
        sayi1 -= 3;
        System.out.println("-= sonucu..: "+sayi1);

        /**
         *  *= Operatörü :
         *  Soldaki değeri, sağda yer alan değer ile çarparak tekrar soldaki değere atamasını gerçekleştirir.
         */
        sayi1 *= 2;
        System.out.println("*= sonucu..: "+sayi1);

        /**
         *  /= Operatörü :
         *  Soldaki değeri, sağdaki değere bölerek sonucu tekrar soldaki değere atar.
         */
        sayi1 /= 6;
        System.out.println("/= sonucu..: "+sayi1);




    }// main sonu
}
