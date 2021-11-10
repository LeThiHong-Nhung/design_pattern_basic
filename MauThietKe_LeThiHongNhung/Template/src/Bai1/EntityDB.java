/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author toila
 * @param <T>
 */
public abstract class EntityDB<T> {
    List<T> list = new ArrayList<>();
    public abstract int getKey(T t);
    protected T findById(int id){
        for(T t:list){
            if(getKey(t) == id)
                return t;
        }
        return null;
    }
    public boolean add(T t){
        if(findById(getKey(t)) == null){
            list.add(t);
            return true;
        }
        return false;
    }
    public int update(T t){
        T toupdate = findById(getKey(t));
        if(toupdate != null){
            int index = list.indexOf(toupdate);
            list.set(index, t);
            return 1;    
        }
        return 0;
    }
    public int delete(T t){
        T todelete = findById(getKey(t));
        if(todelete != null){
            list.remove(t);
            return 1;
        }
        return 0;
    }
    public int deleteByKey(int id){
        for(T t:list){
            if(getKey(t) == id){
                list.remove(t);
                return 1;
            }
        }
        return 0;
    }
    public void printInfo(){
        list.forEach((t) -> {
            System.out.println(t.toString());
        });
    }
}
