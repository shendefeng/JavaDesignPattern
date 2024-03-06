package top.yolopluto.observer;

/**
 * @author: yolopluto
 * @Date: created in 2024/3/7 0:40
 * @description: 所有的观察者需要实现此接口
 * @Modified By:
 */
public interface Observer {
    public void update(String msg);
}
