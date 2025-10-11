//name, city id ,state








package controllers;

public class City{
    int city_id;
    String city_name;
    State state;

    City(int city_id, String city_name, State state){
        this.city_id = city_id;
        this.city_name = city_name;
        this.state = state;
    }
}