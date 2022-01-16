package guru.qa;

public class Apartment {
    private String address;
    private int floor;
    private double area;
    private int rooms;
    private String rent; //строкой, т.к. никаких действий со стоимостью не проводится

    public Apartment(String address, int floor, double area, int rooms, String rent) {
        this.address = address;
        this.floor = floor;
        this.area = area;
        this.rooms = rooms;
        this.rent = rent;
    }

    public void getAddress() {
        System.out.println(address);
    }

    public void getArea() {
        System.out.println(area);
    }

    public void getRooms() {
        System.out.println(rooms);
    }

    public void getRent() {
        System.out.println(rent);
    }

    public void setRent(String rent) {
        this.rent = rent;
        System.out.println("New rent price for apartment on " + this.address + " is " + rent + " a month");
    }

    public void printApartmentDescription(){
        System.out.println("This apartment is located on " + this.address + ". Apartment is on "
                + this.floor + " floor, area of apartment is " + this.area + " sq.m. There are "
                + this.rooms + " room(s) and fully equipped kitchen. The place rents for "
                + this.rent + " a month." );
    }

}
