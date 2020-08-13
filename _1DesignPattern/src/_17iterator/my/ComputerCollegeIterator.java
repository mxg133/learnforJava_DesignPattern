package _17iterator.my;

import java.util.Iterator;

/**
 * @author 孟享广
 * @date 2020-08-13 4:35 下午
 * @description
 */
public class ComputerCollegeIterator implements Iterator {
    Deaprtment deaprtments[];
    int position = 0;

    public ComputerCollegeIterator(Deaprtment[] deaprtments) {
        this.deaprtments = deaprtments;
    }

    @Override
    public boolean hasNext() {
        if (position >= deaprtments.length || deaprtments[position] == null){
            return false;
        }else {
            return true;
        }
    }

    @Override
    public Object next() {
        Deaprtment deaprtment = deaprtments[position];
        position += 1;
        return deaprtment;

    }

    @Override
    public void remove() {

    }
}
