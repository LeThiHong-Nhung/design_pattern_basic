/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai2BS;


import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author toila
 */
public class Main_Bai2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List<HangHoa> listHH;
        listHH = new ArrayList<>();
        listHH.add(new HangHoa("But", 5, 400000));
        listHH.add(new HangHoa("vo", 5, 500000));
        listHH.add(new HangHoa("Thuoc", 1, 10000));
        listHH.add(new HangHoa("Tay", 1, 400000));
        
        HoaDon hoaDon;
        //hoaDon = new Kh_Vang();
        //hoaDon = new Kh_ThanThiet();
        hoaDon = new Kh_KimCuong();
        hoaDon.setListHH(listHH);
        hoaDon.printHoaDon();
        
    }
    
}
