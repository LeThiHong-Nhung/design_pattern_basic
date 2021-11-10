/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package structural.composite.file;


import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HONGNHUNG
 */
public class Folder extends AbstractFile{

    List<AbstractFile> items = new ArrayList<>();
    public Folder(String ten, String ngay) {
        super(ten, ngay);
    }
    

    @Override
    String getStringTreeFolder() {
        StringBuilder builder = new StringBuilder();
        builder.append(pre)
                .append(ten);
        for(AbstractFile f : items)
        {
            f.pre = this.pre + "..";
            builder.append("\n")
                    .append(f.getStringTreeFolder());
            f.pre="";
        }
        return  builder.toString();
    }

    @Override
    void addItem(AbstractFile f) {
        if(!items.contains(f))
        {
            items.add(f);
            f.path = this.path + "\\" + f.ten;
        }
    }



    @Override
    void removeItem(AbstractFile f) {
        if(items.contains(f))
        {
            items.remove(f);
            return;
        }
        for(AbstractFile fol : items)        
            fol.removeItem(f);
        
    }
    
}
