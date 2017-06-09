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

        if(input.getVolume() > 1000){
            return "abort";
        }

        return "success";
    }

}
