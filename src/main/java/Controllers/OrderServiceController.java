package Controllers;

import Entity.ServiceOrder;
import org.springframework.web.bind.annotation.RequestBody;
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
    public String orderService(@RequestBody ServiceOrder input){

        String service = input.getService();
        double volume = input.getVolume();

        switch(service){
            case "pizza":
                return "Success: " + volume + " pizza will be delivered";
            case "party hat":
                if(volume > 1000){
                    return "Fail: Out of stock";
                } else {
                    return "Success: " + volume + " party hats will be delivered";
                }
            case "beer":
                if(volume > 500){
                    return "Fail: Out of stock";
                } else {
                    return "Success: " + volume + " beers will be delivered";
                }
            default:
                return "Fail: service does not found";

        }
    }

}
