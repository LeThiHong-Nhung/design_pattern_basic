/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package structural.composite.file;



/**
 *
 * @author HONGNHUNG
 */
public class File extends AbstractFile{

    public File(String ten, String ngay) {
        super(ten, ngay);
    }

    @Override
    String getStringTreeFolder() {
        return pre + ten; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    void addItem(AbstractFile f) {
    }

    @Override
    void removeItem(AbstractFile f) {
    }
    
}
