package observer.impl;

import observer.Observer;
import observer.Subject;

/**观察者接口的实现类
 * @author taiyang5218
 *
 */
public class CurrentConditionsObserver implements Observer{

	private float temperature;
	private float humidity;
	private Subject weatherData;
	
	/**观察者在实例化时，被注册到对应的主题中
	 * @param weatherData
	 */
	public CurrentConditionsObserver(Subject weatherData){
		this.weatherData=weatherData;
		weatherData.registerObserver(this);
	}
	
	@Override
	public void update(float temp, float humidity, float pressure) {
		this.temperature=temp;
		this.humidity=humidity;
		display();
	}
	
	public void display(){
		System.out.println(toString());
	}

	@Override
	public String toString() {
		return "CurrentConditionsObserver [temperature=" + temperature + ", humidity=" + humidity + "]";
	}

}
