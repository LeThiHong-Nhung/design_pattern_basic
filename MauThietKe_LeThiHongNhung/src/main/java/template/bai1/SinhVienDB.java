/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package template.bai1;

/**
 *
 * @author HONGNHUNG
 */
public class SinhVienDB extends EntityDB<SinhVien>{

//    @Override
//    protected SinhVien findById(int id) {
//        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//        for(SinhVien t: list)
//        {
//            if(getKey(t)==id)
//            {
//                return t;
//            }
//            
//        }
//        return null;
//    }

    @Override
    protected int getKey(SinhVien t) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return t.getId();
    }
    
}
