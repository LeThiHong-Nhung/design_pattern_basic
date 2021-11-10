/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package template.entity;

/**
 *
 * @author HONGNHUNG
 */
public class Main_Entity {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //List<SinhVien> sv = new ArrayList<>();
        
        
        EntityDB<SinhVien> sv = new SinhVienDB();
        sv.add(new SinhVien(112,"NH","23g"));
        sv.add(new SinhVien(115,"AH","23g"));
        sv.add(new SinhVien(152,"NH","23g"));
        sv.add(new SinhVien(172,"BH","23g"));
        
        sv.printInfo();
        
        
        EntityDB<MonHoc>  mh = new MonHocDB();
        mh.add(new MonHoc(345, "YT", 0));
        mh.add(new MonHoc(545, "YT", 0));
        mh.add(new MonHoc(645, "YT", 0));
        mh.add(new MonHoc(395, "YT", 0));
        
        //mh.printInfo();
        mh.update(new MonHoc(345,"GFF",5));
        mh.printInfo();
    }
    
}
