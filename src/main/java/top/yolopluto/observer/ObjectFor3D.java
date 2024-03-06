package top.yolopluto.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: yolopluto
 * @Date: created in 2024/3/7 0:41
 * @description: 3D服务号的实现类
 * @Modified By:
 */
public class ObjectFor3D implements Subject{
    private List<Observer> observers = new ArrayList<>();
    /**
     * 3D 号码的号码
     */
    private String msg;
    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        // 如果存在这个观察者，就删除
        if (observers.indexOf(o) >= 0) {
            observers.remove(o);
        }
    }

    @Override
    public void notifyObserver() {
        // 观察者只需要订阅消息，然后就会收到消息
        for (Observer observer : observers) {
            observer.update(msg);
        }
    }
    /**
     * 实现类可以实现具体的设置和获取的方法
     * 主题更新消息
     */
    public void setMsg(String msg) {
        // 更新消息，然后通知观察者
        this.msg = msg;
        notifyObserver();
    }
}
