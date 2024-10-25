package model;

import java.util.ArrayList;
import java.util.HashSet;

public class Generica<T> {

    private ArrayList<T> lista =new ArrayList<>();

    public void add(T object){
        lista.add(object);
    }

    public void remove(T object){
        lista.remove(object);
    }
    public void print(Integer index){
        System.out.println(lista.get(index));
    }

   /* public HashSet genToHashSet(){
        HashSet hashSet = new HashSet();
        for(T object : lista){}
    }*/

}
