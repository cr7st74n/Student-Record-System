public class People {
    private int age;
    private String gender;
    private Address address;

    public People(int age, String gender, Address address) {
        this.age = age;
        this.gender = gender;
        this.address = address;
    }

    // Implement methods for setting and retrieving people-specific information (age, gender, and address).
    public void setAge(int Age){
        this.age = Age;
    }
    public void setGender(String Gender){
        this.gender = Gender;
    }
    public void setAddress(Address address){
        this.address = address;
    }

    // Additional methods or getters/setters can be added as needed.'

// Getters

    public int getAge(){
        return age;
    }
    public String getGender(){
        return gender;
    }
    public Address getAddress(){
        return address;
    }
}

