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
public class ConcreteIterator implements Iterator{//thuc thi gd iterator; luu tru vt hien tap

    ConcreteAggregate CA;
    public ConcreteIterator(ConcreteAggregate CA) {
        this.CA = CA;
    }    
    int i;
    @Override
    public int First() {
        i = 0;
        return CA.GetItem(i);
    }
    @Override
    public int Next() {
        if(isDone() == false)
            return CA.GetItem(++i);
        return 99;
    }
    @Override
    public boolean isDone() {
        if(i >= CA.Count() -1)
            return true;
        else return false;
    }
    @Override
    public int CurentItem() {
        return CA.GetItem(i);
    }    
    
}
