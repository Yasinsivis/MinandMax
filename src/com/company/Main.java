package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);

        System.out.print("Lütfen Girmek İstediğiniz Adet sayısını giriniz:");
        int number=inp.nextInt();
        int max=0, min=0,control=1;
        for(int i=1; i<=number; i++){

            System.out.print(i+".Sayıyı Giriniz:");
            int sayi=inp.nextInt();

            if(sayi>control){
                max=sayi;
            }
            else if(sayi<control) {
               min=sayi;
            }

            control=sayi;
        }

        System.out.println("En küçük sayı: "+min);
        System.out.println("En büyük sayı: "+max);
    }
}
