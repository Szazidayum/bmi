package bmiindex;

import java.util.Scanner;

public class bmiindex {
    public static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        double tomeg = tomegInput();
        double magassag = magassagInput();
        double bmi = calculateBMI(tomeg, magassag);
        System.out.println("Az ön BMI indexe: "+String.format("%.2f",bmi));
        bmiTartomany(bmi);
    }
    
    private static double tomegInput(){
        double tomeg;
        do{
            System.out.print("Kérem adja meg a testtömeget: ");
            tomeg = scanner.nextInt();
        }while(!(tomeg >= 40 && tomeg <= 150));   
//        System.out.println(tomeg);
        return tomeg;
    }
    
    private static double magassagInput(){
        double magassag;
        do{
            System.out.print("Kérem adja meg a magasságot: ");
            magassag = scanner.nextInt();
        }while(!(magassag >= 100 && magassag <= 200));
//        System.out.println(magassag);
        return magassag;
    }
    
    private static double calculateBMI(double tomeg, double magassag){
        double bmi;
        double mag=magassag/100;
        double negyzet=mag*mag;
        bmi=tomeg/negyzet;
        return bmi;
    }
    
    private static void bmiTartomany(double bmi){
        if (bmi<20){
            System.out.println("Ön sovány testalkatú.");
        }else if(bmi>=20 && bmi<25){
            System.out.println("Ön normál testalkatú.");
        }else if(bmi>=25 && bmi<30){
            System.out.println("Ön túlsúly testalkatú.");
        }else if(bmi>=30){
            System.out.println("Ön elhízott testalkatú.");
        }
    }
}

