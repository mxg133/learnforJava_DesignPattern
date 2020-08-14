package _20memento.theory.my;

/**
 * @author 孟享广
 * @date 2020-08-14 12:40 下午
 * @description
 */
public class Originator {

    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Memento saveStateMemnto(){
        return new Memento(state);
    }

    public void getStateFromMemnto(Memento memento){
        state = memento.getState();
    }
}

