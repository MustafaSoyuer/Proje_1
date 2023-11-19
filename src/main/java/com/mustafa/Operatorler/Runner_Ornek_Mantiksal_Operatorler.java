package com.mustafa.Operatorler;

public class Runner_Ornek_Mantiksal_Operatorler {
    public static void main(String[] args) {

        /**
         *  Mantıksal (Logical) Operatörler :
         *  İki veya daha fazla şartı mantıksal olarak sınamamız gerekirken kullanırız.
         */
        int a=4, b=5, c=6;
        System.out.println("A="+a+" B="+b+" C="+c);
        /**
         *  && Mantıksal Operatörü :
         * koşullu 've' anlamına gelir. Karşılaştırmalarda değerlerin hepsinin true olduğu sürece, true değer döndürür.
         */
        System.out.println("A Bden küçük 've' A Cden küçük mü? "+(a<b && a<c));

        /**
         *   || Mantıksal Operatörü :
         *  koşullu 'veya' anlamına gelmektedir. Karşılaştırma yapılan değerlerden en az biri
         *  true olduğu sürece true değer döndürür.
         */
        System.out.println("A Bden küçük 've' C Adan küçük mü? "+(a<b && c<a));

        /**
         *   ! Mantıksal Operatörü :
         *   'değil' anlamına gelir. Elde edilen boolean veri tipindeki verilerin tersini verir.
         */
        if((a%2)!=0)
            System.out.println("Sayı Tektir.");
        else
            System.out.println("Sayı Çiftir.");


    }
}
