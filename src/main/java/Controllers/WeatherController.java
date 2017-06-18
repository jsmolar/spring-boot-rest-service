package Controllers;

import Entity.Weather;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by jsmolar on 6/16/17.
 */
@Controller
@RequestMapping("/weather")
public class WeatherController {

    private Weather weather = null;

    @RequestMapping(method = RequestMethod.GET)
    public String getWeather(){
        if(weather == null){
            return "weather";
        }

        //return "Temperature: " + String.valueOf(weather.getTemperature()) + "°C \n Humidity: " + weather.getHumidity() + "% \n Description: " + weather.getDescription();
        return "weather";
    }

    @RequestMapping(value = "/sendValue", method = RequestMethod.POST)
    public String setWeather(@RequestBody Weather input){
        weather = input;

        return "Sucess " + weather;
    }


}
