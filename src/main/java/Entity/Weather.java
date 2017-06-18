package Entity;

/**
 * Created by jsmolar on 6/16/17.
 */
public class Weather {

    private double temperature;
    private String description;
    private String humidity;

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getHumidity() {
        return humidity;
    }

    public void setHumidity(String humidity) {
        this.humidity = humidity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        Weather weather = (Weather) o;

        if (Double.compare(weather.getTemperature(), getTemperature()) != 0)
            return false;
        if (getDescription() != null ?
            !getDescription().equals(weather.getDescription()) :
            weather.getDescription() != null)
            return false;
        return getHumidity() != null ? getHumidity().equals(weather.getHumidity()) : weather.getHumidity() == null;

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(getTemperature());
        result = (int) (temp ^ (temp >>> 32));
        result = 31 * result + (getDescription() != null ? getDescription().hashCode() : 0);
        result = 31 * result + (getHumidity() != null ? getHumidity().hashCode() : 0);
        return result;
    }
}
