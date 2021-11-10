/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy.tinhtoan;

/**
 *
 * @author HONGNHUNG
 */
public class Main_TinhToan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ITinh cong = new Cong();
        ITinh tru = new Tru();
        ITinh nhan = new Nhan();
        ITinh chia = new Chia();
        Context ct = new Context(cong);
        ct.setTinhToan(nhan);
        System.out.println("Ket qua la: " + ct.tinh((float) 2, (float) 5));
        ct.setTinhToan(cong);
        System.out.println("Ket qua la: " + ct.tinh((float) 2, (float) 5));
        ct.setTinhToan(tru);
        System.out.println("Ket qua la: " + ct.tinh((float) 2, (float) 5));
        ct.setTinhToan(chia);
        System.out.println("Ket qua la: " + ct.tinh((float) 2, (float) 5));
    }
    
}
