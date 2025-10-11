package models;

public class City {
    private Integer cityId;
    private String cityName;
    private State state;    

    public City(Integer cityId, String cityName, State state) {
        this.cityId = cityId;
        this.cityName = cityName;
        this.state = state;
    }
    
    public Integer getCityId() {
        return cityId;
    }
    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }
    public String getCityName() {
        return cityName;
    }
    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
    public State getState() {
        return state;
    }
    public void setState(State state) {
        this.state = state;
    }

    
}