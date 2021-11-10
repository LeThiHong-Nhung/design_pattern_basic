/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package template.entity;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HONGNHUNG
 */
public abstract class EntityDB <T>{
    protected List<T> list = new ArrayList<>();
    protected abstract int getKey(T t);
    public T findById(int id)
    {
        for(T t: list)
        {
            if(getKey(t)==id)
            {
                return t;
            }
            
        }
        return null;
    }
    public boolean add(T t)
    {
        if(findById(getKey(t))==null)
        {
            list.add(t);
            return true;
        }
        else return false;
    }
    public int update(T t)
    {
        T old = findById(getKey(t));
        if(old!=null)
        {
            int index = list.indexOf(old);
            list.set(index,t);
            return 1;
        }
        else return 0;
    }

    public int delete(T t)
    {
        T delete = findById(getKey(t));
        if(delete!=null)
        {
            list.remove(delete);
            return 1;
        }
        else return 0;
    }
    
    public int deleteByKey(int id)
    {
        int dem=0;
        for(T t: list)
        {
            if(getKey(t)==id)
            {
                list.remove(t);
                dem++;
            }
        }
        return dem;
    }

    public void printInfo()
    {
        list.forEach((t) -> {
            System.out.println(t.toString());
        });
    }
}
