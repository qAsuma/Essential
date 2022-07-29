package Essential3;

public class Address {
    public int index;
    public String country;
    public String city;
    public String street;
    public int house;
    public int apartment;


    public Address(int index, String country, String city, String street, int house, int apartment) {
        this.index = index;
        this.country = country;
        this.city = city;
        this.street = street;
        this.house = house;
        this.apartment = apartment;
    }

    public static void main(String[] args) {
        Address address = new Address(90600, "Ukrain", "Rahiv", "Shervchenka", 154, 1);
        System.out.println(address);


    }

    public int getIndex() {
        return index;
    }

    public void setIndex() {
        this.index = index;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry() {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity() {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet() {
        this.street = street;
    }

    public int getHouse() {
        return house;
    }

    public void setHouse() {
        this.house = house;
    }

    public int getApartment() {
        return apartment;
    }

    public void setApartment() {
        this.apartment = apartment;
    }

    @Override
    public String toString() {
        return "Address{" +
                "index=" + index +
                ", country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", house=" + house +
                ", apartment=" + apartment +
                '}';
    }
}


