/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package behavioral.chain.xeploaidiem;

/**
 *
 * @author HONGNHUNG
 */
public class Main_XepLoai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        IXepLoai kem = new XepLoai(3, "Kem");
        IXepLoai yeu = new XepLoai(5, "Yeu");
        IXepLoai trungBinh = new XepLoai(7, "Trung binh");
        IXepLoai kha = new XepLoai(8, "Kha");
        IXepLoai gioi = new XepLoai((float) 10.00000, "Gioi");
        
        kem.setSuccessor(yeu)
            .setSuccessor(trungBinh)
            .setSuccessor(kha)
            .setSuccessor(gioi);
        System.out.println("Diem 2.7: " + kem.xepLoai((float) 2.7));
    }
    
}
