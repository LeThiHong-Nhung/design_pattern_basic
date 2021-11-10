/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package structural.decorator.bieuthuc;

/**
 *
 * @author HONGNHUNG
 */
public class Main_BieuThuc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BieuThuc b = new BieuThucDonGian(6);
        b = new Cong(b, 9);
        b = new Nhan(b, -8);
        b = new Cong(b, 5);
        b = new GiaTriTuyetDoi(b, 0);
        BieuThuc b1 = new BieuThucDonGian(2);
        b1 = new Tru(b1, 10);
        b1 = new GiaTriTuyetDoi(b1, 0);
        System.out.println(b1.bieuThuc()+"="+b1.giaTri());
        //System.out.println(b.giaTri());
        //System.out.println(b1.giaTri());
    }
    
}
