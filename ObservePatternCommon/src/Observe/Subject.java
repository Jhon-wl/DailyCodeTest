package Observe;

import java.util.ArrayList;
import java.util.List;

/*
 * 目标对象，它知道观察他的观察者，并提供添加和删除观察者的接口
 * */
public class Subject {
	//定义注册的观察者列表
	private List<Observer> observers = new ArrayList<Observer>();
	//定义attach dettch notifyObservers方法
	
	//添加观察者
	public void attach(Observer observer){
		observers.add(observer);
	}
	//删除观察者
	public void dettch(Observer observer) {
		observers.remove(observer);
	}
	//定义通知方法
	public void notifyObservers() {
		for (Observer observer : observers) {
			observer.update(this);
		}
	}
}
