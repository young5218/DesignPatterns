package observer;

/**主题
 * @author taiyang5218
 *
 */
public interface Subject {
	
	/**注册观察者
	 * @param o
	 */
	public void registerObserver(Observer o);
	
	/**删除观察者
	 * @param o
	 */
	public void removeObserver(Observer o);
	
	/**
	 * 当主题状态改变，通知所有观察者
	 */
	public void notifyObserver();
	

}
