package guru.qa;

public class Main {
    // модификатор доступа, статик, возвращаемое значение, имя, (аргументы)
    public static void main(String[] args) {
        Apartment qEastApartment = new Apartment("178-02 Hillside Ave, Jamaica, NY", 5, 54.35D, 1, "2.250$");
        Apartment w113StreetApartment = new Apartment("517 W 113th St, New York, NY", 6, 105.6D, 2, "3.500$");

        w113StreetApartment.getAddress();
        w113StreetApartment.getRooms();
        w113StreetApartment.getArea();

        qEastApartment.printApartmentDescription();
        qEastApartment.setRent("2.400$");
        qEastApartment.getRent();
        w113StreetApartment.getRent();
    }
}
