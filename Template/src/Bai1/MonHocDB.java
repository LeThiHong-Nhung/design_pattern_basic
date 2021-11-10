/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai1;

/**
 *
 * @author toila
 */
public class MonHocDB extends EntityDB<MonHoc>{

    @Override
    public int getKey(MonHoc t) {
        return t.maMH;
    }
    
}
