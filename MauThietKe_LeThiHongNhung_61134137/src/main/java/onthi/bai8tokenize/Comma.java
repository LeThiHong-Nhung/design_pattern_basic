/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onthi.bai8tokenize;

import java.util.Arrays;

/**
 *
 * @author HONGNHUNG
 */
public class Comma extends Decorator{
    String dau;

    public Comma(IString str, String string) {
        super(str);
        this.dau = dau;
    }

    @Override
    public String[] tachChuoi() {
        String[] nguon = str.tachChuoi();

        for(int i = 0; i < nguon.length; i++){
            if(nguon[i] == null){
                return Arrays.copyOf(nguon, i);
            }
            nguon[i] = nguon[i].replace(".","");
        }
        return nguon;
    }
}
