package Controllers;

import Entity.Weather;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jsmolar on 6/16/17.
 */
@RestController
@RequestMapping("/weather")
public class WeatherController {

    private Weather weather = null;

    @RequestMapping(method = RequestMethod.GET)
    public String getWeather(){
        if(weather == null){
            return "No weather data";
        }

        return String.valueOf(weather.getTemperature()) + "°C";
    }

    @RequestMapping(value = "/sendValue", method = RequestMethod.POST)
    public String setWeather(@RequestBody Weather input){
        weather = input;

        return "Sucess " + weather;
    }


}
