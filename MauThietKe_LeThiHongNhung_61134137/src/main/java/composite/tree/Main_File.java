/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composite.tree;

/**
 *
 * @author HONGNHUNG
 */
public class Main_File {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        AbstractFile data = new Folder("data", "04/04");
        AbstractFile toan = new Folder("Toan", "04/04");
        AbstractFile ly = new Folder("Ly", "04/04");
        AbstractFile hoa = new Folder("Hoa", "04/04");
        AbstractFile giaiTich = new Folder("GiaiTich", "04/04");
        AbstractFile baiGiangGTB = new Folder("BaiGiangGT", "04/04");
        
        data.addItem(toan);
        data.addItem(ly);
        data.addItem(hoa);
        toan.addItem(giaiTich);
        giaiTich.addItem(baiGiangGTB);
        
        System.out.println("Cay thu muc data: ");
        System.out.println(data.getStringTreeFolder());
        System.out.println("Cay thu muc toan: ");
        System.out.println(toan.getStringTreeFolder());
        
        System.out.println("Duong dan bai giang giai tich: ");
        System.out.println(baiGiangGTB.getPath());
    }
    
}
