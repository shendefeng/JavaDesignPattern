package top.yolopluto.observer;

/**
 * @author: yolopluto
 * @Date: created in 2024/3/7 0:48
 * @description: 测试类
 * @Modified By:
 */
public class ObserveTest {
    public static void main(String[] args) {
        // 模拟一个3D的服务号
        ObjectFor3D subjectFor3d = new ObjectFor3D();
        // 创建一个观察者
        Observer1 observer1 = new Observer1(subjectFor3d);
        subjectFor3d.registerObserver(observer1);
        // 订阅消息发送
        subjectFor3d.setMsg("20240307的3D号码是：127");
    }
}
