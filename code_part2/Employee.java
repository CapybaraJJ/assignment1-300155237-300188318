package code_part2;

public class Employee implements o1 {
    private String name;
    private double hours;
    private double rate;
    private Address[] address;

    public Employee(String name, double hours, double rate, Address[] adresses){
        this.name = name;
        this.hours = hours;
        this.rate = rate;
        this.address = adresses;
    }
}
