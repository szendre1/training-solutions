package classstructuremethods;

public class Client {
    private String name;
    private Integer year;
    private String address;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public String migrate(String address) {
        this.address = address;
        System.out.println();
        System.out.println("A cím megváltozott:"+this.address);
        return(this.address);
    }

}
