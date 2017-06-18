package Controllers;

import Entity.Weather;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
    public String getWeather(Model model){
        if(weather == null){
            model.addAttribute("temperature", "NA");
            model.addAttribute("humidity", "NA");
            model.addAttribute("description", "NA");

            return "weather";
        }

        model.addAttribute("temperature", String.valueOf(weather.getTemperature()));
        model.addAttribute("humidity", weather.getHumidity());
        model.addAttribute("description", weather.getDescription());
//        return "Temperature: " + String.valueOf(weather.getTemperature()) + "°C \n Humidity: " + weather.getHumidity() + "% \n Description: " + weather.getDescription();
        return "weather";
    }

    @RequestMapping(value = "/sendValue", method = RequestMethod.POST)
    public String setWeather(@RequestBody Weather input, Model model){
        weather = input;

        model.addAttribute("temperature", String.valueOf(weather.getTemperature()));
        model.addAttribute("humidity", weather.getHumidity());
        model.addAttribute("description", weather.getDescription());
        //        return "Temperature: " + String.valueOf(weather.getTemperature()) + "°C \n Humidity: " + weather.getHumidity() + "% \n Description: " + weather.getDescription();
        return "/weather";
    }


}
