/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iterator.vidu;

/**
 *
 * @author HONGNHUNG
 */
public class ConcreteAggregate extends Aggregate{//thuc thi aggre và tạo 1 the hien của lop coniter
    
    int[] SoNguyen = {0,1,2,3,4,5,6,7,8,9};

    @Override
    public Iterator CreateIterator() {
        return new ConcreteIterator(this);
    }
    public  int Count(){
        return SoNguyen.length;
    }
    public int GetItem(int i){
        return SoNguyen[i];
    }  

}
