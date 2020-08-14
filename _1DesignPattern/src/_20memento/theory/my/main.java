package _20memento.theory.my;

/**
 * @author 孟享广
 * @date 2020-08-14 1:01 下午
 * @description
 */
public class main {
    public static void main(String[] args) {
        Originator originator = new Originator();

        Carettaker carettaker = new Carettaker();

        originator.setState(" 状态 # 1 ");
        carettaker.add(originator.saveStateMemnto());

        originator.setState(" 状态2 ");
        carettaker.add(originator.saveStateMemnto());

        originator.setState(" 状态3 ");
        carettaker.add(originator.saveStateMemnto());

        System.out.println(carettaker.get(0).getState());
    }
}
