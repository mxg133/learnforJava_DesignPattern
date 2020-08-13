package _17iterator.my;

import java.util.Iterator;

/**
 * @author 孟享广
 * @date 2020-08-13 4:50 下午
 * @description
 */
public interface College {
    String getname();

    void addDepartment(String name, String desc);

    Iterator creatIterator();

}
