package observerpattern;

import java.util.ArrayList;
import java.util.List;

/**
 * 创建天气的目标类
 * Created by mr.w on 2017/6/12.
 */
public class WeatherSubject {
    //定义天气订阅者的列表
    private List<Observer> observers = new ArrayList<Observer>();

}
