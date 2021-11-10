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
public abstract class AbstractFile {
    String path;
    String ten;
    String ngay;
    String pre = "";

    public AbstractFile(String ten, String ngay) {
        path = ten;
        this.ten = ten;
        this.ngay = ngay;
    }
    
    abstract String getStringTreeFolder();
    public String getPath()
    {
        return path;
    }
    abstract void addItem(AbstractFile f);
    abstract void removeItem(AbstractFile f);
}
