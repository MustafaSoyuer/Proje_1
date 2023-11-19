package com.mustafa.Operatorler;

public class Runner_Ornek_Tekli_Operatorler {
    public static void main(String[] args) {

        /**
         *  Tekli Operatörler :
         *  Operatörler işlemleri gerçekleştirebilmek için ihtiyaç duyduğu değişkenlere operand denilmektedir.
         *  Tek operandı bulunan operatörlere ise tekli (unary) operatör denir.
         */
        int sayi1=87, sayi2= 13;
        System.out.println("Sayı1.."+sayi1+" Sayi2.."+sayi2);
        /**
         *  Tekli eksi(-) veya artı(+) konulması, ilgili operandın değerini negatif veya pozitif yapmak için kullanılır.
         */
        System.out.println("Sayının değerini negatif yapmak için..: "+-sayi1);

        /**
         *  Arttırma Operatörü ve Azaltma Operatörü (++ / --) operandın değerini bir arttırır veya azaltır.
         *  -Sonrasında Artış veya Azaltma (a++ / a--) operand önce hesaplanır sonra arttırılır.
         */
        sayi1++; // Önce değişkeni kullanır, sonrasında değeri 1 arttırır. - //sayi1 burada 87
        System.out.println("Sonrasında artış : "+sayi1); // sayi1 burada 88
        sayi2--; // Önce değeri kullanır, sonrasında değeri 1 azaltır. - // sayi2 burada 13
        System.out.println("Sonrasında azalış : "+sayi2); // sayi2 burada 12
        /**
         *  -Ön Arttırma veya Azaltma(++a / --a) operand önce arttırılır veya azaltılır sonra hesaplaması gerçekleştirilir.
         */
        ++sayi1;//Önce değeri 1 arttırır, sonra değişkeni kullanır. - // sayi1 burada 89
        System.out.println("Öncesinde arttırma : "+sayi1); // sayi1 burada 89
        --sayi2;//Önce değeri 1 azaltır, sonra değişkeni kullanır. - // sayi2 burada 11
        System.out.println("Öncesinde azaltma : "+sayi2); // sayi2 burada 11

        /**
         *  Değil Operatörü (!) boole değerlerini ters çevirmek için kullanılır.
         */
        boolean kosul = true;
        System.out.println("Değil operatörü(!)..: " +!kosul);









    }// main sonu
}
