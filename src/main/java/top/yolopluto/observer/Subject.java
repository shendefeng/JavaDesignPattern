package top.yolopluto.observer;

//import java.util.Observer;

//import java.util.Observer;

/**
 * @author: yolopluto
 * @Date: created in 2024/3/7 0:36
 * @description: 主题接口，所有的主题必须实现此接口
 * @Modified By:
 */
public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObserver();
}
