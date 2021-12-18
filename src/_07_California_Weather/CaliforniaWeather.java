package _07_California_Weather;

import java.util.HashMap;



import javax.swing.JOptionPane;


/*
 * OBJECTIVE:
 * 1. Create a program that allows the user to search for the weather
 * conditions of a given city in California. Use the example program below
 * and the Utilities class inside this project to get the temperature data
 * from a day in December 2020.
 * Example: User: Encinitas
 *          Program: Encinitas is Overcast with a tempeature of 59.01 �F
 * 
 * 2. Create a way for the user to specify the weather condition and then
 * list the cities that have those conditions.
 * Example: User: Mostly Cloudy
 *          Program: Long Beach, Pomona, Oceanside, ...
 * 
 * 3. Create a way for the user to enter a minimum and maximum temperature
 * and then list the cities that have temperatures within that range
 * Example: User: minimum temperature �F = 65.0, max temperature �F = 70.0
 *          Program: Fortana, Glendale, Escondido, Del Mar, ...
 *          
 * EXTRA:
 * Feel free to add pictures for specific weather conditions or a thermometer
 * for the temperature. Also If you want your program to get the current day's
 * temperature, you can get a free API key at: https://openweathermap.org/api 
 */

public class CaliforniaWeather {
    
    void start() {
        HashMap<String, WeatherData> weatherData = Utilities.getWeatherData();
        
        // All city keys have the first letter capitalized of each word
        
        String[] options = {"city","weather condition", "temperature"};
        
        int input = JOptionPane.showOptionDialog(null, "search for the weather conditions of a given city in California", "weather in California",
        		JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, null);

        
        
        
        if(input == 0) {
        	String input1 = JOptionPane.showInputDialog("input a city in California");
            String cityName = Utilities.capitalizeWords(input1);
            WeatherData datum = weatherData.get(cityName);
            
            if( datum == null ) {
                System.out.println("Unable to find weather data for: " + cityName);
            } else {
            	JOptionPane.showMessageDialog(null, cityName + " is " + datum.weatherSummary + " with a temperature of " + datum.temperatureF + " F");
                System.out.println(cityName + " is " + datum.weatherSummary + " with a temperature of " + datum.temperatureF + " F");
            }
        	
        }
        
        if(input == 1) {
        	String input2 = JOptionPane.showInputDialog("specify a weather condition");
            String citiesWeather = "";
            
            for(String city: weatherData.keySet()) {
            	String cityWeatherSummary = weatherData.get(city).weatherSummary;
            	if(cityWeatherSummary.contains(Utilities.capitalizeWords(input2))){
            		System.out.println(city);
            		citiesWeather = citiesWeather + city+"\n";
            	}
            }
            JOptionPane.showMessageDialog(null, citiesWeather);
        }
        
        if(input == 2) {
        	String input3 = JOptionPane.showInputDialog("enter a minimum temperature");
            double tempMin = Double.parseDouble(input3);
            String input4 = JOptionPane.showInputDialog("enter a maxiumum temperature");
            double tempMax = Double.parseDouble(input4);
            String citiesTemperature = "";
            
            for(String city: weatherData.keySet()) {
            	Double cityTemperatureF = weatherData.get(city).temperatureF;
            	if(cityTemperatureF > tempMin && cityTemperatureF < tempMax){
            		citiesTemperature = citiesTemperature + city+"\n";
            	}
            }
            JOptionPane.showMessageDialog(null, citiesTemperature);
        }


    }
}
