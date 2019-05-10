/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;
import java.util.Scanner;

/**
 *
 * @author DESAPRIYA
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        Displaypanel display = new Displaypanel();
        Operation op;
        
        int x,y,answer=0;
        char c;
        
        display.println("Enter the first number: ");
        x = input.nextInt();
        
        display.println("Enter the second number: ");
        y = input.nextInt();
        
        display.println("Enter the Operator: ");
        c = input.next().charAt(0);
        
        switch(c)
        {
            case '+':
                op = new Addition(x,y);
                answer = op.operation();
                break;
                
            case '-':
                break;
        }
        
        display.print("Answer :" + answer);
        
    }
    
}
