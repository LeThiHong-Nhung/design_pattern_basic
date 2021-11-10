/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package behavioral.chain.moneyonthi;

/**
 *
 * @author HONGNHUNG
 */
public interface IMoney {
    IMoney setSuccessor(IMoney cT);
    String chiTien(int tien, String temp);
    void rutTien(int t);
}
