package observer.test;

import observer.impl.CurrentConditionsObserver;
import observer.impl.ForecastObserver;
import observer.impl.WeatherData;

public class WeatherStation {
	public static void main(String[] args) {
		//实例化主题
		WeatherData weatherData=new WeatherData();
		//实例化观察者，并注册主题
		CurrentConditionsObserver observer1=new CurrentConditionsObserver(weatherData);
		ForecastObserver observer2=new ForecastObserver(weatherData);
		
		weatherData.setMeasurements(80, 70, 60.1f);
		threadSleep();
		weatherData.setMeasurements(11, 12, 13.4f);

	}
	
	public static void threadSleep(){
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
