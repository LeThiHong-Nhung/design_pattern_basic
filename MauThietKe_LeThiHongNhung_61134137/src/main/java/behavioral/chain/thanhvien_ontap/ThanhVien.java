/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package behavioral.chain.thanhvien_ontap;

/**
 *
 * @author HONGNHUNG
 */
public class ThanhVien implements IThanhVien{
    int max;
    String tv;
    IThanhVien successor;

    public ThanhVien(int max, String tv) {
        this.max = max;
        this.tv = tv;
    }
    

    @Override
    public IThanhVien setSuccessor(IThanhVien tv) {
        this.successor = tv;
        return tv;
    }

    @Override
    public String phanLoai(int diem) {
        if(diem<max)
            return tv;
        else
            if(successor!=null)
                return successor.phanLoai(diem);
        return "Kim Cuong!";
    }
}
