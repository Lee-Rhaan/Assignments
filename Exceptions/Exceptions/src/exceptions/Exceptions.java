/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

/**
 *
 * @author Maggie
 */
public class Exceptions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArithmeticExceptionExample b = new ArithmeticExceptionExample(6);
        b.calculate();
        
        NullpointerExceptionExample c = new NullpointerExceptionExample();
        c.checkCharacter(3);
     
        NumberFormatExceptionExample d = new NumberFormatExceptionExample();
        d.calculate();
     
        ArrayIndexOutOfBoundsExceptionExample e = new ArrayIndexOutOfBoundsExceptionExample();
        e.getIndexInArray();
    
        StringIndexOutOfBoundsExample f = new StringIndexOutOfBoundsExample();
        f.getCharPosInString();
    }
    
}
