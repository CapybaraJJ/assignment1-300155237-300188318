package code_part2;

public class Test {
    public static void main(String[] args) {
        Address[] addresses = new Address[6];

        Address a1 = new Address("Queen", 48, "K1P1N2");
        addresses[0] = a1;

        Address a2 = new Address("King Edward", 800, "K1N6N5");
        addresses[1] = a2;

        Employee employee = new Employee("Falcao", 40, 15.50, addresses);
        
    }
}
    
