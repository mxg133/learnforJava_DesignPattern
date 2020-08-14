package _20memento.theory.my;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 孟享广
 * @date 2020-08-14 12:57 下午
 * @description
 */
public class Carettaker {
    private List<Memento> mementoList = new ArrayList<>();

    public void add(Memento memento){
        mementoList.add(memento);
    }

    public Memento get(int index){
         return mementoList.get(index);
    }










}
