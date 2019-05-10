/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

/**
 *
 * @author DESAPRIYA
 */
public abstract class Operation {
    
    private static int num_1;
    private static int num_2;
    
    public Operation(int x, int y)
    {
        num_1 = x;
        num_2 = y;
    }

    public int getNum_1() {
        return num_1;
    }

    public void setNum_1(int num_1) {
        this.num_1 = num_1;
    }

    public int getNum_2() {
        return num_2;
    }

    public void setNum_2(int num_2) {
        this.num_2 = num_2;
    }

 
    public abstract int operation();
    
    
}
