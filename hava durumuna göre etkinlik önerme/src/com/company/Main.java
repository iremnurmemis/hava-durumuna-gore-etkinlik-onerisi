package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	 int sicaklik;
        Scanner inp=new Scanner(System.in);
        do{
            System.out.print("\nhava sıcaklığını giriniz:");
            sicaklik=inp.nextInt();

            if(sicaklik<5){
                System.out.print("-kayak");
            }else if(sicaklik>=5 && sicaklik<=25){
                if(sicaklik>=10){
                    System.out.print("-piknik");
                }
                if(sicaklik<=15){
                    System.out.print("-sinema");
                }
            }else{
                System.out.print("-yüzme");
            }
        }while(true);
    }
}
