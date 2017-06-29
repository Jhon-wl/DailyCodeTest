package Observe;
/*
 * 这是一个观察者接口，定义一个更新的接口，给那些在目标类发生改变是被通知的对象
 * */
public interface Observer {
	/*
	 * 定义更新信息的方法
	 * */
	public void update(Subject subject);
}
