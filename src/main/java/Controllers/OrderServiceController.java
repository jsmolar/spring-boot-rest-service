package Controllers;

import java.io.StringReader;

import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonReader;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jsmolar on 6/8/17.
 */
@RestController
@RequestMapping("/services")
public class OrderServiceController {

    @RequestMapping(value = "/order", method = RequestMethod.POST)
    public String orderService(String input){
        JsonReader reader = Json.createReader(new StringReader(input));
        JsonObject obj = reader.readObject();
        String email = obj.getString("email");

        return "HI";
    }

}
