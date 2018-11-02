/*
 *Sean Luo 25/10/2018
 *NChooseR.java
 *This is progrem calculates the NChooseR.
 */

package nchooser;

import javax.swing.JOptionPane;

/**
 *
 * @author toluo7449
 */
public class NChooseR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String number = JOptionPane.showInputDialog("The program will calculate"
                + " the number of ways\nto choose r different objects from a set of"
                + " n objects.\nHow many objects would you like to choos?");
        int r = Integer.parseInt(number);
        //r represent the people will choose how many objects are
        String number1 = JOptionPane.showInputDialog("How many objects are there"
                + "to choose from?");
        int m = Integer.parseInt(number1);
        //m represent the people will choose objects from how many a set of objects are
        int number3 = fact(m)/(fact(r)*fact(m-r));
        //number3 represent how many methods to choose
        JOptionPane.showMessageDialog(null,"There are "+number3+" ways to choose "
                + r +" objects from a set of "+m+" objects");
    }
        public static int fact(int n){
         if((n == 0) || (n == 1)) {
      return 1;
    }
    else {
      return n * fact(n - 1);
    }
    }
    
}
