package _18observer.improve.my;

/**
 * @author 孟享广
 * @date 2020-08-13 9:29 下午
 * @description
 */
public interface Subject {
    void registerObserver(Observer observer);
    void removerObserver(Observer observer);
    void notifyObserver();

}
