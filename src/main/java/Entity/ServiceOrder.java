package Entity;

/**
 * Created by jsmolar on 6/9/17.
 */
public class ServiceOrder {

    private String contractor;
    private String service;
    private double volume;

    public String getContractor() {
        return contractor;
    }

    public void setContractor(String contractor) {
        this.contractor = contractor;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }
}
