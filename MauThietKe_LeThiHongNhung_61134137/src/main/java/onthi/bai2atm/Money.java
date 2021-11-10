/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onthi.bai2atm;

/**
 *
 * @author HONGNHUNG
 */
public class Money implements IMoney{
    int max;
    String cT;
    IMoney successor;

    public Money(int max, String cT) {
        this.max = max;
        this.cT = cT;
    }

//    public Money(int max, String cT) {
//        this.max = max;
//        this.cT = cT;
//    }
    @Override
    public IMoney setSuccessor(IMoney cT) {
        this.successor = cT;
        return cT;
    }

    @Override
    public String chiTien(int tien, String temp) {
        while(tien>=max)
        {
            tien=tien-max;
//            System.out.println(tien);
            temp = temp + " " +max;
//            System.out.println("\n");
//            System.out.println(temp);
        }
        if(tien==0)
            return temp;
        if(successor!=null)
            return successor.chiTien(tien,temp);
        return "Khong the chi tra";
    }
    
    
    public void rutTien(int t)
    {
        int st = t/max;
        int du = t%max;
        if(st!=0)
        {
        //in "menh gia: "+mg+":"+st
            System.out.println("Menh gia "+max+":"+st);
        }
        if(du>0 && successor!=null) 
        {
            successor.rutTien(du);
        }
        
}
}
