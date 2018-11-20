package observer.impl;

import observer.Observer;
import observer.Subject;

public class ForecastObserver implements Observer{
	
	private float humidity;
	private float pressure;
	private Subject weatherData;
	
	public ForecastObserver(Subject weatherData){
		this.weatherData=weatherData;
		weatherData.registerObserver(this);
	}

	@Override
	public void update(float temp, float humidity, float pressure) {
		this.humidity=humidity;
		this.pressure=pressure;
		display();
	}
	
	public void display(){
		System.out.println(toString());
	}

	@Override
	public String toString() {
		return "ForecastObserver [humidity=" + humidity + ", pressure=" + pressure + "]";
	}
	
}
