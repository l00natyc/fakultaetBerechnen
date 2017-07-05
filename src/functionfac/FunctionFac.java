/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package functionfac;

/**
 *
 * @author stefan
 */
public class FunctionFac {

    public static void main(String[] args) {
        /**
         * Fakultät berechnen
         */

        int a = 11;
        int erg = 1;

        for (int i = 0; i < a; i++) {
            erg = erg * (a - i);
        }
        
        System.out.println(erg);  

    }

}
