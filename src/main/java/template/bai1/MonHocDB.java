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
public class MonHocDB extends EntityDB<MonHoc>{

//    @Override
//    protected MonHoc findById(int id) {
//       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//  
//       for(MonHoc m:list)
//       {
//           if(m.id == id)
//           {
//               return m;
//           }
//       }
//       return null;
//    }

    @Override
    protected int getKey(MonHoc t) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       return t.getId();
    }
    
}
