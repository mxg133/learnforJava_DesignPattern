package _17iterator.my;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author 孟享广
 * @date 2020-08-13 5:17 下午
 * @description
 */
public class InfoCollege implements College{
    List<Deaprtment> deaprtments;

    public InfoCollege() {
        deaprtments = new ArrayList<Deaprtment>();
        addDepartment(" 信息专业1 ", " 信息专业描述1  ");
        addDepartment(" 信息专业 2 " , " 信息专业描述2  ");
        addDepartment(" 信息专业 3 ", " 信息专业描述  3 " );
    }

    @Override
    public String getname() {
        return " 信息学院 ";
    }

    @Override
    public void addDepartment(String name, String desc) {
        Deaprtment deaprtment = new Deaprtment(name, desc);
        deaprtments.add(deaprtment);
    }

    @Override
    public Iterator creatIterator() {
        return new InfoColleageIterator(deaprtments);
    }
}
