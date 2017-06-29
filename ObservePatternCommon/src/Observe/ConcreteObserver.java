package Observe;
/*
 * 具体的观察者对象，实现更新方法，使自身的状态和目标的状态保持一致
 * */
public class ConcreteObserver implements Observer {
	//定义一个观察者的状态
	private String ObserverState;
	@Override
	public void update(Subject subject) {
		ObserverState = ((ConcreteSubject)subject).getSubjectState();
		
	}

}
