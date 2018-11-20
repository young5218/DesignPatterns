package observer.impl;

import java.util.ArrayList;
import java.util.List;

import observer.Observer;
import observer.Subject;

/**主题接口的实现类
 * @author taiyang5218
 *
 */
public class WeatherData implements Subject {

	private List<Observer> observers;
	private float temperature;
	private float humidity;
	private float pressure;

	public WeatherData() {
		observers = new ArrayList<Observer>();
	}

	@Override
	public void registerObserver(Observer o) {
		observers.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		int i = observers.indexOf(o);
		if (i >= 0) {
			observers.remove(o);
		}
	}

	@Override
	public void notifyObserver() {
		for (int i = 0; i < observers.size(); i++) {
			Observer observer = observers.get(i);
			observer.update(temperature, humidity, pressure);
		}
	}

	/**
	 * 主题状态改变，调用notifyObserver方法通知观察者
	 */
	public void measurementsChanged() {
		notifyObserver();
	}

	public void setMeasurements(float temperature, float humidity, float pressure) {
		this.temperature=temperature;
		this.humidity=humidity;
		this.pressure=pressure;
		measurementsChanged();
	}

}
