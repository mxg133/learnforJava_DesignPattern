package _17iterator.my;

import java.util.ArrayList;

/**
 * @author 孟享广
 * @date 2020-08-13 5:40 下午
 * @description
 */
public class main {
    public static void main(String[] args) {
        ArrayList<College> collegeList = new ArrayList<>();

        ComputerCollege computerCollege = new ComputerCollege();
        InfoCollege infoCollege = new InfoCollege();

        collegeList.add(computerCollege);
        collegeList.add(infoCollege);

        OutPutImpl outPut = new OutPutImpl(collegeList);

        outPut.printCollege();

    }
}
