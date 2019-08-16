package edu.ujcv.progra2;

public class Cola<T> {//Queue FIFO

    private DynArray<T> array;

    public boolean isEmpty(){
        return true;
    }

    public T poll(){
        if(isEmpty()){
            return null;
        }
        return array.removeFirst();
    }

    public T remove(){
        return array.removeFirst();
    }

    public void add(T elment){
        array.add(elment);
    }

    public T peek(){
        return array.getIndex(0);
    }




}
