package com.revature.util;

import java.lang.reflect.Array;

public class Set<T> {

    private Map<T, Object> map;

    public Set(){
        this.map = new Map<>();
    }

    public boolean add(T data){
        return this.map.put(data, data.hashCode()) == null;
    }

    public boolean contains(T data){
        return map.containsKey(data);
    }

    public boolean isEmpty(){
        return this.map.isEmpty();
    }

    public boolean remove(T data){
        this.map.remove(data);
        return true;
    }

    public int size(){
        return this.map.size();
    }

    @SuppressWarnings("unchecked")
    public T[] toArray(Class<T> clazz){
        LinkedList<T> keys = this.map.keyList();
        T[] keyArray = (T[]) Array.newInstance(clazz, size()); //size() could be this.map.size()
        for (int i = 0; i < keys.size(); i++) {
            T t = keys.pop();
            keyArray[i] = t;
        }
        return keyArray;
    }
}
