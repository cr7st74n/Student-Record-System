public class Address {
    private String streetAddress;
    private String city;
    private String state;
    private int zipCode;

    public Address(String streetAddress, String city, String state, int zipCode) {
        this.streetAddress = streetAddress;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    // Implement methods to set and retrieve address information.
    // Additional methods or getters/setters can be added as needed.

    public void setStreetAddress(String StreetAddress){
        this.streetAddress = StreetAddress;
    }
    public void setCity(String City){
        this.city = City;
    }
    public void setState(String State){
        this.state = State;
    }
    public void setZipCode(int  ZipCode){
        this.zipCode = ZipCode;
    }

//    Getters
    public String getStreetAddress(){
        return streetAddress;
    }
    public String getCity(){
        return city;
    }
    public String getState(){
        return state;
    }
    public int getZipCode(){
        return zipCode;
    }



}
