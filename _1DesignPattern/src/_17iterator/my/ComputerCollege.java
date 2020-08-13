package _17iterator.my;


import java.util.Iterator;

/**
 * @author 孟享广
 * @date 2020-08-13 4:55 下午
 * @description
 */
public class ComputerCollege implements College {
    Deaprtment deaprtments[];
    int numOfDepartment = 0;

    public ComputerCollege() {
        deaprtments = new Deaprtment[5];
        addDepartment("Java", "java描述");
        addDepartment("PHP", "jPHPa描述");
        addDepartment("C++",  "jC++描述");
        addDepartment("C", "C描述");
    }

    @Override
    public String getname() {

        return " 计算机学院 ";
    }

    @Override
    public void addDepartment(String name, String desc) {
        Deaprtment department = new Deaprtment(name, desc);
        deaprtments[numOfDepartment] = department;
        numOfDepartment += 1;
    }

    @Override
    public Iterator creatIterator() {
        return new ComputerCollegeIterator(deaprtments);
    }
}
