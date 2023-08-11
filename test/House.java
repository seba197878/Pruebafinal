
// @author Veronica

public class House {
    private String street;
    private int number;
    private int rooms;

    public House(String street, int number, int rooms) {
        this.street = street;
        this.number = number;
        this.rooms = rooms;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getRooms() {
        return rooms;
    }

    public void setRooms(int rooms) {
        this.rooms = rooms;
    }

    @Override
    public String toString() {
        return "House{" + "street=" + street + ", number=" + number + ", rooms=" + rooms + '}';
    }
    
    
    
}
