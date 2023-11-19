package com.mustafa.Operatorler;

public class Runner_Ornek_Iliskisel_Operatorler {
    public static void main(String[] args) {

        /**
         *  İlişkisel operatörler :
         *  Değişkenler içerisindeki verilerin arasında karşılaştırma yapmaya yarar.
         *  Dönen değer boolean türündeki true veya false‘dur.
         *
         * Eşittir (==)
         * Eşit Değildir (!=)
         */
        int a=23,b=12,c=27,d=27;
        System.out.println("A ="+a+" B ="+b+" C ="+c+ " D ="+d);
        /**
         *  -Küçüktür (<)
         */
        System.out.println("A<B = "+(a<b)+"\nB<C = "+(b<c)); // \n alt satıra geçmel için kullanılmıştır.
        System.out.println();// boş bir satır bırakmak için kullanılmıştır

        /**
         *  -Büyüktür (>)
         */
        System.out.println("A>B = "+(a>b)+"\nB>C = "+(b>c));
        System.out.println();

        /**
         * -Küçük Eşittir (<=)
         */
        System.out.println("A<=B = "+(a<=b)+"\nB<=C = "+(b<=c));
        System.out.println();

        /**
         *  -Büyük Eşittir (>=)
         */
        System.out.println("A>=B = "+(a>=b)+"\nB>=C = "+(b>=c));
        System.out.println();

        /**
         *  -Eşittir (==) -->Eşit mi?
         */
        System.out.println("A==B = "+(a==b)+"\nC==D = "+(c==d));
        System.out.println();

        /**
         *  -Eşit Değildir (!=) -->Eşit değil mi?
         */
        System.out.println("A!=B = "+(a!=b)+"\nC!=D = "+(c!=d));






    }
}
