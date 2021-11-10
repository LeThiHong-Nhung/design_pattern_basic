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
public class Decorator implements IString{
    IString str;

    public Decorator(IString str) {
        this.str = str;
    }

    
    public void inTu(){
        for (String i : tachChuoi()){
            System.out.println(i);
        }
    }

    @Override
    public String[] tachChuoi() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
