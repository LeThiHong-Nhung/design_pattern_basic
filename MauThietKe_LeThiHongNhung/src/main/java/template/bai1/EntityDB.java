/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package template.bai1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HONGNHUNG
 */
public abstract class EntityDB <T> {
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
    
    public int update1(T t)
    {
        /*
        T old = findById(getKey(t));
        if(old!=null)
        {
            int index list.indexOf(old);
            list.set(index,t);
            return 1;
        }
        else return 0;
        */
        
        int dem=0;
        for(int i=0;  i<list.size();i++)
        {
            if(getKey(t)==getKey(list.get(i)))
            {
                //cap nhat t vao i
                list.set(i, t);
                dem++;
            }
        }
        return dem;
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
    
    public int delete1(T t)
    {
        int dem=0;
        for(int i=0;  i<list.size();i++)
        {
            if(getKey(t)==getKey(list.get(i)))
            {
                //cap nhat t vao i
                list.remove(i);
                dem++;
            }
            i--;
        }
        return dem;
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
    
    public int deleteByKey1(int id)
    {
        int dem=0;
        T old = findById(id);
        if(old!=null)
        {
            list.remove(old);
            dem++;
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

