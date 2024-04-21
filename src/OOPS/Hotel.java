package OOPS;

public class Hotel {
    String name;
    String location;
    int stars;
    private static int hotelNumber;

    public Hotel(){

    }

    public Hotel(String name, String location, int stars){
        this.name = name;
        this.location = location;
        this.stars = stars;
        hotelNumber++;
    }
    public static int getHotelNumber(){
        return hotelNumber;
    }
}
