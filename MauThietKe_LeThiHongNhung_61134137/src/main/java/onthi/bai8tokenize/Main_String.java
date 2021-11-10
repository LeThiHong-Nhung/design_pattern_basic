/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onthi.bai8tokenize;

/**
 *
 * @author HONGNHUNG
 */
public class Main_String {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        IString str = new Chuoi("Tokenize la qua trinh tach mot chuoi thanh cac tu.");
        str = new StopWord(str, "la");
        str = new Comma(str, ".");
        str.inTu();
    }
    
}
