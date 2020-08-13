package _17iterator.my;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author 孟享广
 * @date 2020-08-13 4:45 下午
 * @description
 */
public class InfoColleageIterator implements Iterator {
    List<Deaprtment> deaprtments;
    int index = -1;

    public InfoColleageIterator(List<Deaprtment> deaprtments) {
        this.deaprtments = deaprtments;
    }

    @Override
    public boolean hasNext() {
        if (index >= deaprtments.size() - 1){
            return false;
        }else {
            index += 1;
            return true;
        }
    }

    @Override
    public Object next() {
        return deaprtments.get(index);
    }

    @Override
    public void remove() {

    }
}
