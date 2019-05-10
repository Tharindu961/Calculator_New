package com.company;

import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;

import java.io.FileInputStream;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // calculate(args[0]);
        

        calculate(args[0]);

    }
    static void calculate(String st){

        try{
            FileInputStream file = new FileInputStream("C:\\Users\\acer\\Desktop\\Calculater\\src\\com\\company\\numbers.txt");
            Scanner scan = new Scanner(file);
            int i = scan.nextInt();
            int k = scan.nextInt();
            double answer=0;

            if(st.equals("ADD")){
                answer =(double) (i+k);
                System.out.println("Add is:"+ answer);
            }else if(st.equals("SUB")){
                answer =(double)i - k;
                System.out.println("Sub is:"+ answer);
            }else if(st.equals("DIV")){
                answer =(double)i/k;
                System.out.println("Div is:"+ answer);
            }else if(st.equals("MUL")){
                answer =(double)i*k;
                System.out.println("Multiply is:"+ answer);
            }else {
                System.out.println("Invalid method");
            }
        }catch(Exception e){
            System.out.println("error");
        }
    }

}
