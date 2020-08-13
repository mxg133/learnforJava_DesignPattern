package _17iterator.my;

import java.util.Iterator;
import java.util.List;

/**
 * @author 孟享广
 * @date 2020-08-13 5:31 下午
 * @description
 */
public class OutPutImpl {
    List<College> collegeList;

    public OutPutImpl(List<College> collegeList) {
        this.collegeList = collegeList;
    }

    public void printCollege(){
        Iterator<College> iterator = collegeList.iterator();
        while (iterator.hasNext()){
            College college = iterator.next();
            System.out.println("---"+college.getname()+"--");
            printDepartment(college.creatIterator());
        }
    }

    public void printDepartment(Iterator iterator){
        while (iterator.hasNext()){
            Deaprtment d = (Deaprtment)iterator.next();
            System.out.println(d.getName()+d.getDesc());
        }
    }
}
