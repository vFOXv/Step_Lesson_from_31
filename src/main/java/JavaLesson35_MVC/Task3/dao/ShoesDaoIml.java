package JavaLesson35_MVC.Task3.dao;

import JavaLesson35_MVC.Task3.model.Shoes;

import java.util.*;

public class ShoesDaoIml implements GenericDAO {
    private Map<Integer, Shoes> myShoes = new TreeMap<Integer, Shoes>();
    //Integer key;

    //Set содержащий список ключей
    private Set<Integer> keys = new TreeSet<Integer>();

    @Override
    public Integer myAdd(Integer key, Shoes shoes) {
        myShoes.put(key, shoes);
        return key;
    }

    @Override
    public void myRemove(Integer key) {
        myShoes.remove(key);
    }

    @Override
    public void myChange(Integer key, Shoes shoes) {
        myShoes.put(key, shoes);
    }

    @Override
    public void myShowAll() {
        myShoes.forEach((key,value)->{
            System.out.print(key+" "+value.toString());
        });
        System.out.println();
    }

    @Override
    public Map<Integer, Shoes> getMyMap() {
        return myShoes;
    }

    @Override
    public Set getMyKey() {
        return myShoes.keySet();
    }
}
