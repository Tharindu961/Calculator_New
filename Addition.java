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
public class Addition extends Operation{

    public Addition(int x, int y) {
        super(x, y);
    }
    
    
    @Override
    public int operation()
    {
        return super.getNum_1() + super.getNum_2();
    }
    
    
    
}
